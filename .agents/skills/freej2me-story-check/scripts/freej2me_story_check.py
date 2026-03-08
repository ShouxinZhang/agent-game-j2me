#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import shutil
import subprocess
import sys
import time
from datetime import datetime
from pathlib import Path


WINDOW_PATTERN = re.compile(
    r'^\s*(0x[0-9a-f]+)\s+"(.*)"(?:\:\s+\("(.*)"\s+"(.*)"\))?\s+(\d+)x(\d+)\+(-?\d+)\+(-?\d+)'
)
ABS_X_PATTERN = re.compile(r"Absolute upper-left X:\s+(-?\d+)")
ABS_Y_PATTERN = re.compile(r"Absolute upper-left Y:\s+(-?\d+)")
WIDTH_PATTERN = re.compile(r"Width:\s+(\d+)")
HEIGHT_PATTERN = re.compile(r"Height:\s+(\d+)")


def project_root() -> Path:
    return Path(__file__).resolve().parents[4]


def java_bin() -> str:
    root = project_root()
    for candidate in (root / "tools" / "jdk-21" / "bin" / "java", root / "tools" / "jdk" / "bin" / "java"):
        if candidate.is_file():
            return str(candidate)
    return "java"


def robot_source() -> Path:
    return Path(__file__).resolve().with_name("X11RobotDriver.java")


def run(cmd: list[str], cwd: Path | None = None) -> subprocess.CompletedProcess[str]:
    return subprocess.run(cmd, cwd=str(cwd) if cwd else None, capture_output=True, text=True, check=False)


def list_windows() -> list[dict[str, object]]:
    completed = run(["xwininfo", "-root", "-tree"])
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or "xwininfo failed")

    windows: list[dict[str, object]] = []
    for line in completed.stdout.splitlines():
        match = WINDOW_PATTERN.match(line)
        if not match:
            continue
        window_id, title, wm_class, wm_instance, width, height, pos_x, pos_y = match.groups()
        if title == "(has no name)":
            continue
        if "FreeJ2ME" not in title and "freej2me" not in title.lower():
            continue
        windows.append(
            {
                "id": window_id,
                "title": title,
                "wm_class": wm_class or "",
                "wm_instance": wm_instance or "",
                "width": int(width),
                "height": int(height),
                "x": int(pos_x),
                "y": int(pos_y),
            }
        )
    windows.sort(key=lambda item: int(item["width"]) * int(item["height"]), reverse=True)
    return windows


def choose_window(window_id: str | None) -> dict[str, object]:
    windows = list_windows()
    if window_id:
        matches = [window for window in windows if str(window["id"]).lower() == window_id.lower()]
        if not matches:
            raise RuntimeError(f"FreeJ2ME window id not found: {window_id}")
        return matches[0]
    if not windows:
        raise RuntimeError("No FreeJ2ME windows found.")
    return windows[0]


def window_geometry(window_id: str) -> dict[str, int]:
    completed = run(["xwininfo", "-id", window_id])
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or f"xwininfo failed for {window_id}")

    abs_x_match = ABS_X_PATTERN.search(completed.stdout)
    abs_y_match = ABS_Y_PATTERN.search(completed.stdout)
    width_match = WIDTH_PATTERN.search(completed.stdout)
    height_match = HEIGHT_PATTERN.search(completed.stdout)
    if not abs_x_match or not abs_y_match or not width_match or not height_match:
        raise RuntimeError(f"could not parse geometry for {window_id}")

    return {
        "x": int(abs_x_match.group(1)),
        "y": int(abs_y_match.group(1)),
        "width": int(width_match.group(1)),
        "height": int(height_match.group(1)),
    }


def output_dir(args_output_dir: str | None) -> Path:
    if args_output_dir:
        path = Path(args_output_dir)
        return path if path.is_absolute() else project_root() / path
    timestamp = datetime.now().strftime("story-check-%Y%m%d-%H%M%S")
    return project_root() / "docs" / "visual-checks" / timestamp


def capture(window_id: str, output_path: Path) -> None:
    output_path.parent.mkdir(parents=True, exist_ok=True)
    cmd = [
        "python3",
        str(project_root() / ".agents" / "skills" / "x11-window-check" / "scripts" / "x11_window_check.py"),
        "capture",
        "--id",
        window_id,
        "--output",
        str(output_path),
    ]
    completed = run(cmd, cwd=project_root())
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or completed.stdout.strip() or "capture failed")


def robot_click(x: int, y: int) -> None:
    completed = run([java_bin(), str(robot_source()), "click", str(x), str(y)], cwd=project_root())
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or completed.stdout.strip() or "robot click failed")


def robot_press(keys: list[str], delay_ms: int) -> None:
    completed = run([java_bin(), str(robot_source()), "press", str(delay_ms), *keys], cwd=project_root())
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or completed.stdout.strip() or "robot press failed")


def robot_type(text: str, delay_ms: int) -> None:
    completed = run([java_bin(), str(robot_source()), "type", str(delay_ms), text], cwd=project_root())
    if completed.returncode != 0:
        raise RuntimeError(completed.stderr.strip() or completed.stdout.strip() or "robot type failed")


def focus_window(window: dict[str, object]) -> None:
    geometry = window_geometry(str(window["id"]))
    center_x = geometry["x"] + geometry["width"] // 2
    center_y = geometry["y"] + geometry["height"] // 2
    robot_click(center_x, center_y)
    time.sleep(0.4)


def relative_point(window: dict[str, object], x: int, y: int) -> tuple[int, int]:
    geometry = window_geometry(str(window["id"]))
    return geometry["x"] + x, geometry["y"] + y


def cmd_list(args: argparse.Namespace) -> int:
    for window in list_windows():
        print(
            f"{window['id']} | {window['title']} | "
            f"{window['width']}x{window['height']}+{window['x']}+{window['y']}"
        )
    return 0


def cmd_step(args: argparse.Namespace) -> int:
    window = choose_window(args.window_id)
    out_dir = output_dir(args.output_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    focus_window(window)
    capture(str(window["id"]), out_dir / "step-00-before.png")
    robot_press(args.keys, args.delay_ms)
    time.sleep(args.wait_after)
    capture(str(window["id"]), out_dir / "step-01-after.png")
    manifest = {
        "window": window,
        "keys": args.keys,
        "delay_ms": args.delay_ms,
        "wait_after": args.wait_after,
    }
    (out_dir / "step.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(out_dir)
    return 0


def cmd_walkthrough(args: argparse.Namespace) -> int:
    window = choose_window(args.window_id)
    out_dir = output_dir(args.output_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    focus_window(window)

    # Conservative sequence for title -> start/new game -> first dialogue.
    sequence = [
        ("00-title", []),
        ("01-enter-start", ["ENTER"]),
        ("02-confirm", ["ENTER"]),
        ("03-advance", ["ENTER"]),
        ("04-advance", ["ENTER"]),
        ("05-down-enter", ["DOWN", "ENTER"]),
        ("06-advance", ["ENTER"]),
        ("07-advance", ["ENTER"]),
    ]

    capture(str(window["id"]), out_dir / "00-title.png")
    for index, (label, keys) in enumerate(sequence[1:], start=1):
        robot_press(keys, args.delay_ms)
        time.sleep(args.wait_after)
        capture(str(window["id"]), out_dir / f"{index:02d}-{label}.png")

    manifest = {
        "window": window,
        "sequence": sequence,
        "delay_ms": args.delay_ms,
        "wait_after": args.wait_after,
    }
    (out_dir / "walkthrough.json").write_text(
        json.dumps(manifest, ensure_ascii=False, indent=2) + "\n",
        encoding="utf-8",
    )
    print(out_dir)
    return 0


def cmd_click(args: argparse.Namespace) -> int:
    window = choose_window(args.window_id)
    out_dir = output_dir(args.output_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    click_x, click_y = relative_point(window, args.x, args.y)
    focus_window(window)
    if args.capture:
        capture(str(window["id"]), out_dir / "click-00-before.png")
    robot_click(click_x, click_y)
    time.sleep(args.wait_after)
    if args.capture:
        capture(str(window["id"]), out_dir / "click-01-after.png")
    manifest = {
        "window": window,
        "relative_x": args.x,
        "relative_y": args.y,
        "absolute_x": click_x,
        "absolute_y": click_y,
        "wait_after": args.wait_after,
    }
    (out_dir / "click.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(out_dir)
    return 0


def cmd_burst(args: argparse.Namespace) -> int:
    window = choose_window(args.window_id)
    out_dir = output_dir(args.output_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    focus_window(window)
    frames: list[str] = []
    for index in range(args.frames):
        path = out_dir / f"burst-{index:02d}.png"
        capture(str(window["id"]), path)
        frames.append(path.name)
        if index < args.frames - 1:
            time.sleep(args.interval_ms / 1000.0)
    manifest = {
        "window": window,
        "frames": frames,
        "interval_ms": args.interval_ms,
    }
    (out_dir / "burst.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(out_dir)
    return 0


def cmd_type(args: argparse.Namespace) -> int:
    window = choose_window(args.window_id)
    out_dir = output_dir(args.output_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    focus_window(window)
    if args.capture:
        capture(str(window["id"]), out_dir / "type-00-before.png")
    robot_type(args.text, args.delay_ms)
    if args.submit:
        robot_press(["ENTER"], args.delay_ms)
    time.sleep(args.wait_after)
    if args.capture:
        capture(str(window["id"]), out_dir / "type-01-after.png")
    manifest = {
        "window": window,
        "text": args.text,
        "delay_ms": args.delay_ms,
        "submit": args.submit,
        "wait_after": args.wait_after,
    }
    (out_dir / "type.json").write_text(json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(out_dir)
    return 0


def main() -> int:
    parser = argparse.ArgumentParser(description="Drive FreeJ2ME and capture story progression evidence.")
    subparsers = parser.add_subparsers(dest="command", required=True)

    subparsers.add_parser("list", help="List visible FreeJ2ME windows")

    parser_step = subparsers.add_parser("step", help="Focus window, press keys, and capture before/after screenshots")
    parser_step.add_argument("--window-id", help="Explicit FreeJ2ME window id")
    parser_step.add_argument("--output-dir", help="Output directory for evidence")
    parser_step.add_argument("--delay-ms", type=int, default=500, help="Delay between key presses in milliseconds")
    parser_step.add_argument("--wait-after", type=float, default=1.0, help="Seconds to wait before final screenshot")
    parser_step.add_argument("--keys", nargs="+", required=True, help="Key sequence such as ENTER DOWN ENTER")

    parser_walk = subparsers.add_parser("walkthrough", help="Run a conservative title-to-story walkthrough")
    parser_walk.add_argument("--window-id", help="Explicit FreeJ2ME window id")
    parser_walk.add_argument("--output-dir", help="Output directory for evidence")
    parser_walk.add_argument("--delay-ms", type=int, default=500, help="Delay between key presses in milliseconds")
    parser_walk.add_argument("--wait-after", type=float, default=1.0, help="Seconds to wait before each screenshot")

    parser_click = subparsers.add_parser("click", help="Click a relative point inside the FreeJ2ME window")
    parser_click.add_argument("--window-id", help="Explicit FreeJ2ME window id")
    parser_click.add_argument("--output-dir", help="Output directory for evidence")
    parser_click.add_argument("--x", type=int, required=True, help="Relative X inside the window")
    parser_click.add_argument("--y", type=int, required=True, help="Relative Y inside the window")
    parser_click.add_argument("--wait-after", type=float, default=1.0, help="Seconds to wait after clicking")
    parser_click.add_argument("--capture", action="store_true", help="Capture before/after screenshots")

    parser_burst = subparsers.add_parser("burst", help="Capture multiple screenshots in quick succession")
    parser_burst.add_argument("--window-id", help="Explicit FreeJ2ME window id")
    parser_burst.add_argument("--output-dir", help="Output directory for evidence")
    parser_burst.add_argument("--frames", type=int, default=6, help="How many frames to capture")
    parser_burst.add_argument("--interval-ms", type=int, default=120, help="Delay between frames in milliseconds")

    parser_type = subparsers.add_parser("type", help="Type text into the focused FreeJ2ME window")
    parser_type.add_argument("--window-id", help="Explicit FreeJ2ME window id")
    parser_type.add_argument("--output-dir", help="Output directory for evidence")
    parser_type.add_argument("--text", required=True, help="Text to type")
    parser_type.add_argument("--delay-ms", type=int, default=120, help="Delay between characters in milliseconds")
    parser_type.add_argument("--wait-after", type=float, default=1.0, help="Seconds to wait before final screenshot")
    parser_type.add_argument("--capture", action="store_true", help="Capture before/after screenshots")
    parser_type.add_argument("--submit", action="store_true", help="Press ENTER after typing")

    args = parser.parse_args()
    try:
        if shutil.which("xwininfo") is None:
            raise RuntimeError("xwininfo is not installed or not in PATH")
        if args.command == "list":
            return cmd_list(args)
        if args.command == "step":
            return cmd_step(args)
        if args.command == "walkthrough":
            return cmd_walkthrough(args)
        if args.command == "click":
            return cmd_click(args)
        if args.command == "burst":
            return cmd_burst(args)
        if args.command == "type":
            return cmd_type(args)
    except Exception as exc:
        print(str(exc), file=sys.stderr)
        return 1
    return 2


if __name__ == "__main__":
    raise SystemExit(main())
