#!/usr/bin/env python3
from __future__ import annotations

import argparse
import shutil
import subprocess
import sys
from datetime import datetime
from pathlib import Path


ENTRY_CLASSES = ("GameMIDlet.class", "XConnection.class", "XMessage.class")


def project_root(module_dir: Path) -> Path:
    return module_dir.parents[1]


def find_java(root: Path) -> str | None:
    local_candidates = [
        root / "tools" / "jdk-21" / "bin" / "java",
        root / "tools" / "jdk" / "bin" / "java",
    ]
    for candidate in local_candidates:
        if candidate.is_file():
            return str(candidate)
    return shutil.which("java")


def backup_generated_dir(generated_dir: Path, backup_root: Path) -> None:
    if not generated_dir.exists():
        return
    if not any(generated_dir.rglob("*")):
        return
    backup_dir = backup_root / datetime.now().strftime("%Y%m%d-%H%M%S")
    backup_dir.mkdir(parents=True, exist_ok=True)
    shutil.copytree(generated_dir, backup_dir / "generated", dirs_exist_ok=True)


def main() -> int:
    parser = argparse.ArgumentParser(description="Decompile the entry chain into src/generated using CFR.")
    parser.add_argument(
        "--module",
        default=str(Path(__file__).resolve().parents[1]),
        help="Path to the reverse baseline module.",
    )
    args = parser.parse_args()

    module_dir = Path(args.module).resolve()
    root = project_root(module_dir)
    cfr_jar = root / "tools" / "cfr.jar"
    java_bin = find_java(root)
    if java_bin is None:
        print("java is not in PATH.", file=sys.stderr)
        return 1
    if not cfr_jar.is_file():
        print(f"CFR jar not found at {cfr_jar}.", file=sys.stderr)
        return 1

    inputs_dir = module_dir / "inputs" / "classes"
    generated_dir = module_dir / "src" / "generated"
    backups_dir = module_dir / "backups"
    generated_dir.mkdir(parents=True, exist_ok=True)
    backups_dir.mkdir(parents=True, exist_ok=True)
    backup_generated_dir(generated_dir, backups_dir)

    status = 0
    for class_name in ENTRY_CLASSES:
        class_path = inputs_dir / class_name
        if not class_path.is_file():
            print(f"Missing class input: {class_path}", file=sys.stderr)
            status = 1
            continue
        cmd = [
            java_bin,
            "-jar",
            str(cfr_jar),
            str(class_path),
            "--outputdir",
            str(generated_dir),
        ]
        completed = subprocess.run(cmd, check=False)
        if completed.returncode != 0:
            print(f"Failed to decompile {class_name}", file=sys.stderr)
            status = 1

    if status == 0:
        print(f"Decompiled entry chain into {generated_dir}")
    return status


if __name__ == "__main__":
    raise SystemExit(main())
