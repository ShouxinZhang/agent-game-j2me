#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import shutil
import subprocess
import sys
from datetime import datetime
from pathlib import Path


WINDOW_PATTERN = re.compile(
    r'^\s*(0x[0-9a-f]+)\s+"(.*)"(?:\:\s+\("(.*)"\s+"(.*)"\))?\s+(\d+)x(\d+)\+(-?\d+)\+(-?\d+)'
)


def project_root() -> Path:
    return Path(__file__).resolve().parents[4]


def run_capture(cmd: list[str]) -> subprocess.CompletedProcess[str]:
    return subprocess.run(cmd, capture_output=True, text=True, check=False)


def list_windows() -> list[dict[str, object]]:
    completed = run_capture(["xwininfo", "-root", "-tree"])
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
    return windows


def require_tool(name: str) -> None:
    if shutil.which(name) is None:
        raise RuntimeError(f"{name} is not installed or not in PATH")


def default_output_path() -> Path:
    timestamp = datetime.now().strftime("%Y%m%d-%H%M%S")
    out_dir = project_root() / "docs" / "visual-checks" / timestamp
    out_dir.mkdir(parents=True, exist_ok=True)
    return out_dir / "capture.png"


def write_metadata(path: Path, data: dict[str, object]) -> None:
    meta_path = path.with_suffix(path.suffix + ".json")
    meta_path.write_text(json.dumps(data, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")


def cmd_list(args: argparse.Namespace) -> int:
    require_tool("xwininfo")
    windows = list_windows()
    if not windows:
        print("No visible named windows found.")
        return 0

    for window in windows:
        print(
            f"{window['id']} | {window['title']} | "
            f"{window['width']}x{window['height']}+{window['x']}+{window['y']}"
        )
    return 0


def cmd_capture(args: argparse.Namespace) -> int:
    require_tool("xwininfo")
    require_tool("import")

    windows = list_windows()
    if args.id:
        matches = [window for window in windows if str(window["id"]).lower() == args.id.lower()]
    else:
        matches = [window for window in windows if args.title in str(window["title"])]
    if not matches:
        if args.id:
            print(f'No window matches id "{args.id}".', file=sys.stderr)
        else:
            print(f'No window title contains "{args.title}".', file=sys.stderr)
        return 1
    if len(matches) > 1:
        selector = args.id if args.id else args.title
        print(f'Multiple windows match "{selector}". Use a more specific selector.', file=sys.stderr)
        for window in matches:
            print(f"- {window['id']} | {window['title']}", file=sys.stderr)
        return 1

    window = matches[0]
    output = Path(args.output) if args.output else default_output_path()
    if not output.is_absolute():
        output = project_root() / output
    output.parent.mkdir(parents=True, exist_ok=True)

    completed = run_capture(["import", "-window", str(window["id"]), str(output)])
    if completed.returncode != 0:
        print(completed.stderr.strip() or "import failed", file=sys.stderr)
        return 1

    metadata = {
        "captured_at": datetime.now().isoformat(),
        "display": subprocess.run(
            ["bash", "-lc", 'printf "%s" "${DISPLAY:-}"'],
            capture_output=True,
            text=True,
            check=False,
        ).stdout,
        "window": window,
        "image_path": output.relative_to(project_root()).as_posix()
        if output.is_relative_to(project_root())
        else str(output),
    }
    write_metadata(output, metadata)
    print(output)
    return 0


def main() -> int:
    parser = argparse.ArgumentParser(description="List and capture X11 windows for visual checks.")
    subparsers = parser.add_subparsers(dest="command", required=True)

    subparsers.add_parser("list", help="List visible named windows")

    parser_capture = subparsers.add_parser("capture", help="Capture a single window by title")
    parser_capture.add_argument("--title", help="Substring of the target window title")
    parser_capture.add_argument("--id", help="Exact X11 window id, e.g. 0x800868")
    parser_capture.add_argument("--output", help="PNG output path; defaults to docs/visual-checks/<timestamp>/capture.png")

    args = parser.parse_args()
    if args.command == "list":
        return cmd_list(args)
    if args.command == "capture":
        if not args.title and not args.id:
            print("capture requires --title or --id", file=sys.stderr)
            return 2
        return cmd_capture(args)
    return 2


if __name__ == "__main__":
    raise SystemExit(main())
