#!/usr/bin/env python3
from __future__ import annotations

import argparse
import shutil
import subprocess
import sys
from pathlib import Path


def project_root() -> Path:
    return Path(__file__).resolve().parents[4]


def find_tool(root: Path, name: str) -> str | None:
    local_candidates = [
        root / "tools" / "jdk-21" / "bin" / name,
        root / "tools" / "jdk" / "bin" / name,
    ]
    for candidate in local_candidates:
        if candidate.is_file():
            return str(candidate)
    return shutil.which(name)


def run(cmd: list[str], cwd: Path) -> int:
    completed = subprocess.run(cmd, cwd=str(cwd), check=False)
    return completed.returncode


def fail(message: str) -> int:
    print(message, file=sys.stderr)
    return 1


def main() -> int:
    parser = argparse.ArgumentParser(description="Run Java 21 reverse baseline quality gates.")
    parser.add_argument(
        "--module",
        default="reverse/java21-baseline",
        help="Target reverse baseline module relative to project root.",
    )
    args = parser.parse_args()

    root = project_root()
    module_dir = root / args.module
    required_paths = {
        "module": module_dir,
        "class input": module_dir / "inputs" / "classes",
        "manual source": module_dir / "src" / "manual",
        "generated source": module_dir / "src" / "generated",
        "j2me stubs": module_dir / "stubs",
        "compile script": module_dir / "scripts" / "compile_baseline.py",
    }

    print(f"Java gate target: {module_dir}")

    java_bin = find_tool(root, "java")
    javac_bin = find_tool(root, "javac")
    cfr_jar = root / "tools" / "cfr.jar"

    status = 0

    if java_bin:
        print(f"[ok] java: {java_bin}")
    else:
        status = 1
        print("[missing] java is not in PATH", file=sys.stderr)

    if javac_bin:
        print(f"[ok] javac: {javac_bin}")
    else:
        status = 1
        print("[missing] javac is not in PATH", file=sys.stderr)

    if cfr_jar.is_file():
        print(f"[ok] cfr: {cfr_jar}")
    else:
        status = 1
        print(
            f"[missing] CFR jar not found at {cfr_jar}. Place the decompiler at tools/cfr.jar.",
            file=sys.stderr,
        )

    for label, path in required_paths.items():
        if path.exists():
            print(f"[ok] {label}: {path}")
        else:
            status = 1
            print(f"[missing] {label}: {path}", file=sys.stderr)

    if status != 0:
        print("Java gate failed before compile stage.", file=sys.stderr)
        return 1

    print("Running baseline compile check...")
    compile_status = run(
        [
            "python3",
            str(required_paths["compile script"]),
            "--module",
            str(module_dir),
            "--javac",
            str(javac_bin),
        ],
        cwd=root,
    )
    if compile_status != 0:
        print("Baseline compile check failed.", file=sys.stderr)
        return 1

    print("Java gate passed.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
