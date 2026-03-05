#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import sys
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parents[2]
DATA_LOADER_SRC = PROJECT_ROOT / "modernization" / "data-loader" / "src"
GAME_CORE_SRC = PROJECT_ROOT / "modernization" / "game-core" / "src"
TXT_ROOT = PROJECT_ROOT / "work" / "unpacked" / "txt"

sys.path.insert(0, str(DATA_LOADER_SRC))
sys.path.insert(0, str(GAME_CORE_SRC))

from data_loader.loader import load_scene_event_by_id  # noqa: E402
from game_core.event_vm import execute_event  # noqa: E402
from game_core.state import GameState  # noqa: E402


def _parse_csv_ints(raw: str) -> set[int]:
    if not raw.strip():
        return set()
    out: set[int] = set()
    for part in raw.split(","):
        part = part.strip()
        if not part:
            continue
        try:
            out.add(int(part))
        except ValueError:
            continue
    return out


def main() -> int:
    parser = argparse.ArgumentParser(description="Replay one scene event using the minimal event VM")
    parser.add_argument("--scene", type=int, required=True, help="Scene ID, e.g. 1")
    parser.add_argument("--event", type=int, required=True, help="Event number in the scene file")
    parser.add_argument(
        "--occurred-events",
        default="",
        help="Comma separated event IDs to preload, e.g. '305,702'",
    )
    parser.add_argument("--money", type=int, default=0, help="Initial money")
    args = parser.parse_args()

    scene = load_scene_event_by_id(TXT_ROOT, args.scene)
    event = scene.get_event(args.event)
    state = GameState(
        current_scene_id=args.scene,
        occurred_events=_parse_csv_ints(args.occurred_events),
        money=args.money,
    )
    execute_event(event, state)

    payload = {
        "scene": args.scene,
        "event": args.event,
        "to_scene": state.current_scene_id,
        "transitions": state.transitions,
        "dialogues": state.dialogues,
        "messages": state.messages,
        "money": state.money,
        "terminated": state.terminated,
        "unknown_commands": state.unknown_commands,
    }
    print(json.dumps(payload, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
