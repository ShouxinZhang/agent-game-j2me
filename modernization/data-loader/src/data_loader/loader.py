from __future__ import annotations

import re
from pathlib import Path

from .models import SceneEvent, SceneEventFile, ScriptStep

SCENE_HEADER_RE = re.compile(r"^scene(?P<scene_id>\d+):$")
EVENT_HEADER_RE = re.compile(r"^event(?P<event_no>\d+):$")
EVENT_END_RE = re.compile(r"^event(?P<event_no>\d+)End$")


def _to_int(value: str, *, default: int | None = None) -> int | None:
    try:
        return int(value)
    except (TypeError, ValueError):
        return default


def _int_or_default(value: str, default: int) -> int:
    parsed = _to_int(value)
    return parsed if parsed is not None else default


def _parse_area(value: str) -> tuple[int, ...]:
    parts = [part.strip() for part in value.split(",") if part.strip()]
    out: list[int] = []
    for part in parts:
        num = _to_int(part)
        if num is not None:
            out.append(num)
    return tuple(out)


def _parse_script_line(raw_line: str, line_no: int) -> ScriptStep | None:
    line = raw_line.strip()
    if not line:
        return None

    rhs = line
    if "=" in line:
        rhs = line.split("=", 1)[1]

    pieces = [piece.strip() for piece in rhs.split(",")]
    pieces = [piece for piece in pieces if piece != ""]
    if not pieces:
        return None

    step_index = _to_int(pieces[0])
    tokens = tuple(pieces[1:] if step_index is not None else pieces)
    if not tokens:
        return None

    return ScriptStep(line_no=line_no, step_index=step_index, tokens=tokens, raw=raw_line.rstrip("\n"))


def parse_scene_event_text(text: str) -> SceneEventFile:
    lines = text.splitlines()
    cleaned = [line.strip().replace("\ufeff", "") for line in lines]

    scene_id: int | None = None
    scene_name = ""
    declared_event_amount: int | None = None
    events: list[SceneEvent] = []

    i = 0
    total = len(cleaned)
    while i < total:
        line = cleaned[i]
        i += 1
        if not line:
            continue

        scene_match = SCENE_HEADER_RE.match(line)
        if scene_match:
            scene_id = int(scene_match.group("scene_id"))
            continue

        if line.startswith("sceneName="):
            scene_name = line.split("=", 1)[1].strip()
            continue

        if line.startswith("eventAmount="):
            declared_event_amount = _to_int(line.split("=", 1)[1].strip())
            continue

        event_match = EVENT_HEADER_RE.match(line)
        if not event_match:
            continue

        event_no = int(event_match.group("event_no"))
        event_id: int | None = None
        name = ""
        enable = 1
        area: tuple[int, ...] = ()
        auto = 1
        loop = 1
        script: list[ScriptStep] = []
        extras: dict[str, str] = {}

        in_script = False
        while i < total:
            inner = cleaned[i]
            original = lines[i] if i < len(lines) else cleaned[i]
            i += 1

            if not inner:
                continue

            if in_script:
                if inner == "scriptEnd":
                    in_script = False
                    continue
                step = _parse_script_line(original, i)
                if step is not None:
                    script.append(step)
                continue

            if inner == "script:":
                in_script = True
                continue

            end_match = EVENT_END_RE.match(inner)
            if end_match and int(end_match.group("event_no")) == event_no:
                break

            if "=" not in inner:
                continue

            key, value = inner.split("=", 1)
            key = key.strip()
            value = value.strip()

            if key == "id":
                event_id = _to_int(value)
            elif key == "name":
                name = value
            elif key == "enable":
                enable = _int_or_default(value, 1)
            elif key == "area":
                area = _parse_area(value)
            elif key == "auto":
                auto = _int_or_default(value, 1)
            elif key == "loop":
                loop = _int_or_default(value, 1)
            else:
                extras[key] = value

        events.append(
            SceneEvent(
                event_no=event_no,
                event_id=event_id,
                name=name,
                enable=enable,
                area=area,
                auto=auto,
                loop=loop,
                script=tuple(script),
                extras=dict(extras),
            )
        )

    if scene_id is None:
        raise ValueError("scene header not found")

    return SceneEventFile(
        scene_id=scene_id,
        scene_name=scene_name,
        declared_event_amount=declared_event_amount,
        events=tuple(events),
    )


def load_scene_event_file(path: str | Path) -> SceneEventFile:
    p = Path(path)
    text = p.read_text(encoding="utf-8-sig")
    return parse_scene_event_text(text)


def load_scene_event_by_id(txt_root: str | Path, scene_id: int) -> SceneEventFile:
    root = Path(txt_root)
    file_path = root / f"scene{scene_id}event.txt"
    if not file_path.is_file():
        raise FileNotFoundError(f"scene event file not found: {file_path}")
    return load_scene_event_file(file_path)
