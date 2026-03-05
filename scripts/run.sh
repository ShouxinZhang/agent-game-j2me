#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
DEFAULT_GAME_JAR="$ROOT_DIR/倚天屠龙之君临天下.jar"
EMULATOR_JAR="${FREEJ2ME_JAR:-$ROOT_DIR/tools/freej2me.jar}"
GAME_JAR="${1:-$DEFAULT_GAME_JAR}"

if [[ ! -f "$EMULATOR_JAR" ]]; then
  printf 'FreeJ2ME jar not found: %s\n' "$EMULATOR_JAR" >&2
  printf 'Download freej2me.jar and put it at: %s\n' "$ROOT_DIR/tools/freej2me.jar" >&2
  printf 'Or run with env var: FREEJ2ME_JAR=/path/to/freej2me.jar %s\n' "$0" >&2
  exit 1
fi

if [[ ! -f "$GAME_JAR" ]]; then
  printf 'Game jar not found: %s\n' "$GAME_JAR" >&2
  exit 1
fi

exec java -jar "$EMULATOR_JAR" "$GAME_JAR"
