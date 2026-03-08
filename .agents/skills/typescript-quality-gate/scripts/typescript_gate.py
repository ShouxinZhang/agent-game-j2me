#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import shutil
import subprocess
import sys
from pathlib import Path


REPO_ROOT = Path(__file__).resolve().parents[4]


def run(cmd: list[str], cwd: Path) -> None:
    print(f"[gate] {' '.join(cmd)}")
    subprocess.run(cmd, cwd=cwd, check=True)


def ensure_binary(name: str) -> None:
    if shutil.which(name) is None:
        raise SystemExit(f"missing required binary: {name}")


def main() -> int:
    parser = argparse.ArgumentParser(description="Run TypeScript quality checks for one module.")
    parser.add_argument(
        "--module",
        required=True,
        help="Module path relative to repo root, for example .agents/skills/codex-worker-review-loop",
    )
    parser.add_argument(
        "--install",
        action="store_true",
        help="Run npm install before typecheck. Use on first run or after dependency changes.",
    )
    parser.add_argument(
        "--skip-test",
        action="store_true",
        help="Skip npm test even if the module defines it.",
    )
    args = parser.parse_args()

    ensure_binary("node")
    ensure_binary("npm")

    module_dir = (REPO_ROOT / args.module).resolve()
    try:
        module_dir.relative_to(REPO_ROOT)
    except ValueError as exc:
        raise SystemExit("module must stay inside the repository") from exc

    package_json = module_dir / "package.json"
    tsconfig_json = module_dir / "tsconfig.json"
    if not package_json.is_file():
        raise SystemExit(f"missing package.json: {package_json}")
    if not tsconfig_json.is_file():
        raise SystemExit(f"missing tsconfig.json: {tsconfig_json}")

    if args.install:
        run(["npm", "install"], cwd=module_dir)

    package_data = json.loads(package_json.read_text(encoding="utf-8"))
    scripts = package_data.get("scripts", {})

    if "typecheck" not in scripts:
        raise SystemExit(f"missing npm script 'typecheck' in {package_json}")

    run(["npm", "run", "typecheck"], cwd=module_dir)

    if not args.skip_test and "test" in scripts:
        run(["npm", "test"], cwd=module_dir)

    print(f"[gate] module passed: {module_dir.relative_to(REPO_ROOT)}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
