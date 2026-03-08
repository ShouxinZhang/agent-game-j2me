#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import subprocess
import sys
import time
from datetime import datetime
from pathlib import Path


WINDOW_PATTERN = re.compile(
    r'^\s*(0x[0-9a-f]+)\s+"(.*)"(?:\:\s+\("(.*)"\s+"(.*)"\))?\s+(\d+)x(\d+)\+(-?\d+)\+(-?\d+)'
)


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


def focus_window(window: dict[str, object]) -> None:
    center_x = int(window["x"]) + int(window["width"]) // 2
    center_y = int(window["y"]) + int(window["height"]) // 2
    robot_click(center_x, center_y)
    time.sleep(0.4)


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

    args = parser.parse_args()
    try:
        if args.command == "list":
            return cmd_list(args)
        if args.command == "step":
            return cmd_step(args)
        if args.command == "walkthrough":
            return cmd_walkthrough(args)
    except Exception as exc:
        print(str(exc), file=sys.stderr)
        return 1
    return 2


if __name__ == "__main__":
    raise SystemExit(main())
