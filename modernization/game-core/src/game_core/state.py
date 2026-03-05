from __future__ import annotations

from dataclasses import dataclass, field


@dataclass(slots=True)
class GameState:
    """Minimal core state for event replay."""

    current_scene_id: int
    occurred_events: set[int] = field(default_factory=set)
    inventory: dict[int, int] = field(default_factory=dict)
    money: int = 0
    transitions: list[tuple[int, int]] = field(default_factory=list)
    messages: list[str] = field(default_factory=list)
    dialogues: list[str] = field(default_factory=list)
    action_trace: list[str] = field(default_factory=list)
    unknown_commands: list[str] = field(default_factory=list)
    terminated: bool = False
