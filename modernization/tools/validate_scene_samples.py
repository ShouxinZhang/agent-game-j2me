#!/usr/bin/env python3
from __future__ import annotations

import sys
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parents[2]
DATA_LOADER_SRC = PROJECT_ROOT / "modernization" / "data-loader" / "src"
GAME_TXT_ROOT = PROJECT_ROOT / "work" / "unpacked" / "txt"

sys.path.insert(0, str(DATA_LOADER_SRC))

from data_loader.loader import load_scene_event_by_id  # noqa: E402


EXPECTED_EVENTS = {1: 24, 2: 9}


def main() -> int:
    for scene_id, expected_count in EXPECTED_EVENTS.items():
        parsed = load_scene_event_by_id(GAME_TXT_ROOT, scene_id)
        declared = parsed.declared_event_amount
        actual = len(parsed.events)

        if declared != expected_count:
            print(
                f"[FAIL] scene{scene_id} declared eventAmount mismatch: expected {expected_count}, got {declared}",
                file=sys.stderr,
            )
            return 1

        if actual <= 0:
            print(f"[FAIL] scene{scene_id} parsed event block is empty", file=sys.stderr)
            return 1

        print(
            f"[OK] scene{scene_id}: declared eventAmount={declared}, parsed blocks={actual}",
        )

    print("[OK] scene sample validation completed")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
