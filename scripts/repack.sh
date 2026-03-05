#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IN_DIR="${1:-$ROOT_DIR/work/unpacked}"
OUT_JAR="${2:-$ROOT_DIR/work/mod.jar}"

if [[ ! -d "$IN_DIR" ]]; then
  printf 'Input directory not found: %s\n' "$IN_DIR" >&2
  exit 1
fi

mkdir -p "$(dirname "$OUT_JAR")"
OUT_JAR_ABS="$(cd "$(dirname "$OUT_JAR")" && pwd)/$(basename "$OUT_JAR")"
rm -f "$OUT_JAR_ABS"

(
  cd "$IN_DIR"
  zip -q -r "$OUT_JAR_ABS" .
)

printf 'Repacked jar: %s\n' "$OUT_JAR_ABS"
