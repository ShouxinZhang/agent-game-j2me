#!/usr/bin/env python3
from __future__ import annotations

import argparse
import shutil
import subprocess
import sys
from pathlib import Path


def gather_java_files(root: Path) -> list[str]:
    return sorted(str(path) for path in root.rglob("*.java"))


def find_javac(module_dir: Path, explicit: str | None) -> str | None:
    if explicit:
        candidate = Path(explicit)
        return str(candidate) if candidate.is_file() else explicit

    project_root = module_dir.parents[1]
    local_candidates = [
        project_root / "tools" / "jdk-21" / "bin" / "javac",
        project_root / "tools" / "jdk" / "bin" / "javac",
    ]
    for candidate in local_candidates:
        if candidate.is_file():
            return str(candidate)
    return shutil.which("javac")


def main() -> int:
    parser = argparse.ArgumentParser(description="Compile the Java 21 reverse baseline when javac is available.")
    parser.add_argument(
        "--module",
        default=str(Path(__file__).resolve().parents[1]),
        help="Path to the reverse baseline module.",
    )
    parser.add_argument("--javac", help="Explicit javac binary path")
    args = parser.parse_args()

    module_dir = Path(args.module).resolve()
    javac_bin = find_javac(module_dir, args.javac)
    if javac_bin is None:
        print("javac is not in PATH. Install a JDK and retry.", file=sys.stderr)
        return 1

    source_roots = [
        module_dir / "stubs",
        module_dir / "src" / "manual",
    ]
    java_files: list[str] = []
    for source_root in source_roots:
        if source_root.is_dir():
            java_files.extend(gather_java_files(source_root))

    if not java_files:
        print("No Java source files found for compilation.", file=sys.stderr)
        return 1

    build_dir = module_dir / "build" / "classes"
    build_dir.mkdir(parents=True, exist_ok=True)

    cmd = [
        javac_bin,
        "-d",
        str(build_dir),
        *java_files,
    ]
    completed = subprocess.run(cmd, check=False)
    if completed.returncode != 0:
        print("javac compilation failed.", file=sys.stderr)
        return completed.returncode

    print(f"Compiled {len(java_files)} Java files into {build_dir}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
