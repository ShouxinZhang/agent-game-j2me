from __future__ import annotations

from pathlib import Path

from data_loader.loader import load_scene_event_by_id
from game_core.event_vm import execute_event
from game_core.state import GameState


TXT_ROOT = Path(__file__).resolve().parents[2] / "work" / "unpacked" / "txt"


def test_scene1_event1_changes_scene() -> None:
    scene1 = load_scene_event_by_id(TXT_ROOT, 1)
    event = scene1.get_event(1)

    state = GameState(current_scene_id=1)
    execute_event(event, state)

    assert state.current_scene_id == 2
    assert state.transitions == [(2, 1)]


def test_scene2_event1_blocked_without_event_305() -> None:
    scene2 = load_scene_event_by_id(TXT_ROOT, 2)
    event = scene2.get_event(1)

    state = GameState(current_scene_id=2)
    execute_event(event, state)

    assert state.current_scene_id == 2
    assert state.transitions == []
    assert state.terminated is True


def test_scene2_event1_allows_exit_after_event_305() -> None:
    scene2 = load_scene_event_by_id(TXT_ROOT, 2)
    event = scene2.get_event(1)

    state = GameState(current_scene_id=2, occurred_events={305})
    execute_event(event, state)

    assert state.current_scene_id == 1
    assert state.transitions == [(1, 1)]
