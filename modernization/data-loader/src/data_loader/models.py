from __future__ import annotations

from dataclasses import dataclass, field
from typing import Any


@dataclass(slots=True, frozen=True)
class ScriptStep:
    """One script line after normalization."""

    line_no: int
    step_index: int | None
    tokens: tuple[str, ...]
    raw: str


@dataclass(slots=True, frozen=True)
class SceneEvent:
    """Event definition under a scene block."""

    event_no: int
    event_id: int | None
    name: str
    enable: int
    area: tuple[int, ...]
    auto: int
    loop: int
    script: tuple[ScriptStep, ...]
    extras: dict[str, Any] = field(default_factory=dict)


@dataclass(slots=True, frozen=True)
class SceneEventFile:
    """Parsed event file for one scene (e.g., scene1event.txt)."""

    scene_id: int
    scene_name: str
    declared_event_amount: int | None
    events: tuple[SceneEvent, ...]

    def get_event(self, event_no: int) -> SceneEvent:
        for event in self.events:
            if event.event_no == event_no:
                return event
        raise KeyError(f"event {event_no} not found in scene {self.scene_id}")
