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
    for candidate in (root / "tools" / "jdk-21" / "bin" / name, root / "tools" / "jdk" / "bin" / name):
        if candidate.is_file():
            return str(candidate)
    return shutil.which(name)


def gather_java_files(source_dir: Path) -> list[str]:
    return sorted(str(path) for path in source_dir.rglob("*.java"))


def run(cmd: list[str], cwd: Path) -> int:
    return subprocess.run(cmd, cwd=str(cwd), check=False).returncode


def main() -> int:
    parser = argparse.ArgumentParser(description="Build the local AWT FreeJ2ME jar and optionally sync it to tools/freej2me.jar.")
    parser.add_argument("--module", default="tools/freej2me-src", help="FreeJ2ME source module relative to project root")
    parser.add_argument("--skip-sync", action="store_true", help="Do not copy the built jar to tools/freej2me.jar")
    args = parser.parse_args()

    root = project_root()
    module_dir = root / args.module
    required_paths = {
        "module": module_dir,
        "source": module_dir / "src",
        "resources": module_dir / "resources",
        "meta": module_dir / "META-INF",
        "manifest": module_dir / "build" / "manifest-awt.mf",
    }

    print(f"FreeJ2ME build target: {module_dir}")

    status = 0
    for label, path in required_paths.items():
        if path.exists():
            print(f"[ok] {label}: {path}")
        else:
            print(f"[missing] {label}: {path}", file=sys.stderr)
            status = 1

    javac_bin = find_tool(root, "javac")
    jar_bin = find_tool(root, "jar")
    if javac_bin:
        print(f"[ok] javac: {javac_bin}")
    else:
        print("[missing] javac is not available", file=sys.stderr)
        status = 1
    if jar_bin:
        print(f"[ok] jar: {jar_bin}")
    else:
        print("[missing] jar is not available", file=sys.stderr)
        status = 1

    if status != 0:
        print("FreeJ2ME build gate failed before compile stage.", file=sys.stderr)
        return 1

    java_files = gather_java_files(required_paths["source"])
    if not java_files:
        print("No Java source files found for FreeJ2ME.", file=sys.stderr)
        return 1

    build_classes = module_dir / "build" / "classes"
    build_classes.mkdir(parents=True, exist_ok=True)
    build_jar = module_dir / "build" / "freej2me.jar"

    print("Compiling FreeJ2ME sources...")
    if run([str(javac_bin), "-d", str(build_classes), *java_files], cwd=module_dir) != 0:
        print("FreeJ2ME javac compilation failed.", file=sys.stderr)
        return 1

    print("Packaging AWT jar...")
    jar_cmd = [
        str(jar_bin),
        "--create",
        "--file",
        str(build_jar),
        "--manifest",
        str(required_paths["manifest"]),
        "-C",
        str(build_classes),
        ".",
        "-C",
        str(required_paths["resources"]),
        ".",
        "-C",
        str(required_paths["meta"]),
        ".",
    ]
    if run(jar_cmd, cwd=module_dir) != 0:
        print("FreeJ2ME jar packaging failed.", file=sys.stderr)
        return 1

    print(f"[ok] built jar: {build_jar}")

    if not args.skip_sync:
        target = root / "tools" / "freej2me.jar"
        shutil.copyfile(build_jar, target)
        print(f"[ok] synced jar: {target}")

    print("FreeJ2ME build gate passed.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
