#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
GAME_JAR="${1:-$ROOT_DIR/倚天屠龙之君临天下.jar}"
OUT_DIR="${2:-$ROOT_DIR/work/unpacked}"

if [[ ! -f "$GAME_JAR" ]]; then
  printf 'Game jar not found: %s\n' "$GAME_JAR" >&2
  exit 1
fi

rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"
unzip -q -o "$GAME_JAR" -d "$OUT_DIR"

printf 'Unpacked:\n'
printf '  input : %s\n' "$GAME_JAR"
printf '  output: %s\n' "$OUT_DIR"
