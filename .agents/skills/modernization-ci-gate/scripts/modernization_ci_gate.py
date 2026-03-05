#!/usr/bin/env python3
from __future__ import annotations

import subprocess
import sys
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parents[4]


def _run(cmd: list[str]) -> int:
    print(f"[RUN] {' '.join(cmd)}")
    completed = subprocess.run(cmd, cwd=str(PROJECT_ROOT), check=False)
    if completed.returncode != 0:
        print(f"[FAIL] {' '.join(cmd)}", file=sys.stderr)
    return completed.returncode


def main() -> int:
    checks: list[list[str]] = [
        ["python3", "modernization/tools/validate_scene_samples.py"],
        ["python3", "modernization/tools/replay_scene_sample.py", "--scene", "1", "--event", "1"],
        ["pytest", "-q", "modernization/tests"],
    ]

    for check in checks:
        if _run(check) != 0:
            return 1

    print("[OK] modernization CI gate passed")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
