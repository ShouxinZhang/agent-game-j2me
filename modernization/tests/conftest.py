from __future__ import annotations

import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
DATA_LOADER_SRC = ROOT / "modernization" / "data-loader" / "src"
GAME_CORE_SRC = ROOT / "modernization" / "game-core" / "src"

sys.path.insert(0, str(DATA_LOADER_SRC))
sys.path.insert(0, str(GAME_CORE_SRC))
