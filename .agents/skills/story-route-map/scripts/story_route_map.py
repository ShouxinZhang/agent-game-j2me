#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import shutil
import struct
from dataclasses import dataclass
from datetime import datetime
from pathlib import Path
from typing import Iterable


TASK_RE = re.compile(r"^task(\d+)=(.*)$")
SECTION_RE = re.compile(r"^(scene\d+|phase(?:All|\d+)|event\d+):$")
KV_RE = re.compile(r"^([^=]+)=(.*)$")
LOG_SCENE_RE = re.compile(r"读取/txt/scene(\d+)event\.txt")
LOG_EVENT_RE = re.compile(r"执行事件:(.+)")
LOG_SAVE_RE = re.compile(r"(save rmsName|load storeName)=(.+)")
LOG_END_RE = re.compile(r"游戏结局")


@dataclass
class Action:
    step: str
    kind: str
    args: list[str]


@dataclass
class SaveOffsets:
    phase_offset: int
    scene_offset: int
    short_arr_f_count_offset: int
    short_arr_f_data_offset: int
    short_arr_f_data_end: int
    role_tail_offsets: list[dict[str, int]]
    live_back_scene_offset: int
    live_back_pos_offset: int
    flag_offset: int
    name_offset: int


@dataclass
class ParsedSave:
    raw: bytes
    payload: bytes
    header_prefix: bytes
    phase: int
    scene: int
    play_music: int
    short_arr_f: list[int]
    role_tails: list[dict[str, int]]
    live_back_scene: int
    live_back_pos: int
    flag: bool
    name: str
    offsets: SaveOffsets


def project_root() -> Path:
    return Path(__file__).resolve().parents[4]


def txt_dir() -> Path:
    return project_root() / "work" / "unpacked" / "txt"


def docs_dir() -> Path:
    return project_root() / "docs" / "story-route-map"


def backup_dir() -> Path:
    return project_root() / "docs" / "backups" / "runtime-experiments"


def read_text(path: Path) -> str:
    return path.read_text(encoding="utf-8-sig")


def parse_tasks(path: Path) -> list[dict[str, object]]:
    tasks: list[dict[str, object]] = []
    for line in read_text(path).splitlines():
        stripped = line.strip()
        match = TASK_RE.match(stripped)
        if not match:
            continue
        task_id = int(match.group(1))
        text = match.group(2).strip()
        hint = ""
        if "[提示：" in text and text.endswith("]"):
            body, hint_part = text.split("[提示：", 1)
            text = body.strip()
            hint = hint_part[:-1].strip()
        tasks.append({"id": task_id, "text": text, "hint": hint})
    return tasks


def parse_story(path: Path) -> dict[str, str]:
    content = read_text(path)
    blocks: dict[str, str] = {}
    for name in ("startStory", "end1Story", "end2Story"):
        start = f"{name}:"
        end = f"{name}End"
        if start not in content or end not in content:
            continue
        blocks[name] = content.split(start, 1)[1].split(end, 1)[0].strip()
    return blocks


def parse_script_lines(lines: Iterable[str]) -> list[Action]:
    actions: list[Action] = []
    for raw in lines:
        line = raw.strip()
        if not line or line.startswith("//"):
            continue
        if line.startswith("=") or re.match(r"^\d+=", line):
            _, payload = line.split("=", 1)
            parts = [part.strip() for part in payload.split(",") if part.strip()]
            if len(parts) < 2:
                continue
            actions.append(Action(step=parts[0], kind=parts[1], args=parts[2:]))
    return actions


def parse_scene_file(path: Path) -> dict[str, object]:
    lines = read_text(path).splitlines()
    scene_id = int(path.stem.replace("scene", "").replace("event", ""))
    scene_name = ""
    phases: dict[str, list[dict[str, object]]] = {}

    current_phase = ""
    current_event: dict[str, object] | None = None
    collecting_script = False
    script_lines: list[str] = []

    def flush_event() -> None:
        nonlocal current_event, script_lines, collecting_script
        if current_event is None:
            return
        current_event["actions"] = [
            {"step": action.step, "kind": action.kind, "args": action.args}
            for action in parse_script_lines(script_lines)
        ]
        phases.setdefault(current_phase or "phaseAll", []).append(current_event)
        current_event = None
        script_lines = []
        collecting_script = False

    for raw_line in lines:
        line = raw_line.strip()
        if not line:
            continue
        if line.startswith("sceneName="):
            scene_name = line.split("=", 1)[1].strip()
            continue
        section_match = SECTION_RE.match(line)
        if section_match:
            label = section_match.group(1)
            if label.startswith("phase"):
                flush_event()
                current_phase = label
            elif label.startswith("event"):
                flush_event()
                current_event = {"slot": label, "id": None, "name": "", "area": [], "actions": []}
            continue
        if current_event is None:
            continue
        if line == "script:":
            collecting_script = True
            script_lines = []
            continue
        if line == "scriptEnd":
            collecting_script = False
            continue
        if collecting_script:
            script_lines.append(line)
            continue
        kv_match = KV_RE.match(line)
        if not kv_match:
            continue
        key = kv_match.group(1).strip()
        value = kv_match.group(2).strip()
        if key == "id":
            current_event["id"] = int(value)
        elif key == "name":
            current_event["name"] = value
        elif key == "area":
            current_event["area"] = [int(part) for part in value.split(",") if part]

    flush_event()
    return {"scene_id": scene_id, "scene_name": scene_name, "phases": phases}


def summarize_route(tasks: list[dict[str, object]], scenes: list[dict[str, object]]) -> dict[str, object]:
    task_changes: list[dict[str, object]] = []
    endings: list[dict[str, object]] = []
    final_chain: list[dict[str, object]] = []

    for scene in scenes:
        for phase_name, events in scene["phases"].items():
            for event in events:
                event_ref = {
                    "scene_id": scene["scene_id"],
                    "scene_name": scene["scene_name"],
                    "phase": phase_name,
                    "event_id": event["id"],
                    "event_name": event["name"],
                }
                for action in event["actions"]:
                    kind = action["kind"]
                    args = action["args"]
                    if kind in {"加入任务", "移除任务"} and args:
                        task_id = int(args[0])
                        task_changes.append({**event_ref, "change": kind, "task_id": task_id})
                    if kind in {"游戏结局", "游戏结局1"}:
                        endings.append({**event_ref, "ending_arg": args})

                    is_final_scene = scene["scene_id"] in {55, 58}
                    is_final_action = kind in {"战斗", "获取技能", "换场景", "更新阶段", "提示信息", "游戏结局"}
                    if is_final_scene and is_final_action:
                        final_chain.append(
                            {
                                **event_ref,
                                "kind": kind,
                                "args": args,
                            }
                        )

    task_lookup = {task["id"]: task for task in tasks}
    main_task_flow: list[dict[str, object]] = []
    for change in task_changes:
        task_id = change["task_id"]
        task = task_lookup.get(task_id, {"text": "", "hint": ""})
        main_task_flow.append(
            {
                **change,
                "task_text": task["text"],
                "task_hint": task["hint"],
            }
        )

    return {
        "tasks": tasks,
        "task_changes": main_task_flow,
        "endings": endings,
        "final_chain": final_chain,
    }


def route_markdown(story: dict[str, str], summary: dict[str, object]) -> str:
    lines = ["# Story Route Map", ""]
    lines.append("## Endings")
    lines.append("")
    if "end1Story" in story:
        lines.append(f"- `end1Story`: {story['end1Story'].splitlines()[0].strip()}")
    if "end2Story" in story:
        lines.append(f"- `end2Story`: {story['end2Story'].splitlines()[0].strip()}")
    lines.append("")
    lines.append("## Main Tasks")
    lines.append("")
    for task in summary["tasks"]:
        hint = f" | 提示: {task['hint']}" if task["hint"] else ""
        lines.append(f"- `task{task['id']}` {task['text']}{hint}")
    lines.append("")
    lines.append("## Final Chain")
    lines.append("")
    for item in summary["final_chain"]:
        event_id = item["event_id"] if item["event_id"] is not None else "none"
        args = ", ".join(item["args"])
        lines.append(
            f"- `scene{item['scene_id']}` `{item['phase']}` `event {event_id}` "
            f"`{item['kind']}` {args}"
        )
    return "\n".join(lines) + "\n"


def parse_runtime_log(path: Path) -> dict[str, object]:
    current_scene: int | None = None
    events: list[str] = []
    endings: list[str] = []
    stores: list[str] = []

    for raw in path.read_text(encoding="utf-8").splitlines():
        line = raw.strip()
        if not line:
            continue
        scene_match = LOG_SCENE_RE.search(line)
        if scene_match:
            current_scene = int(scene_match.group(1))
        event_match = LOG_EVENT_RE.search(line)
        if event_match:
            events.append(event_match.group(1))
        save_match = LOG_SAVE_RE.search(line)
        if save_match:
            stores.append(save_match.group(2))
        if LOG_END_RE.search(line):
            endings.append(line)

    return {
        "current_scene": current_scene,
        "recent_events": events[-20:],
        "saw_ending": bool(endings),
        "ending_lines": endings[-10:],
        "stores": stores[-10:],
    }


def backup_file(path: Path) -> Path:
    stamp = datetime.now().strftime("%Y%m%d-%H%M%S")
    out_dir = backup_dir() / stamp
    out_dir.mkdir(parents=True, exist_ok=True)
    target = out_dir / path.name
    shutil.copy2(path, target)
    return target


def _read_ubyte(data: bytes, offset: int) -> tuple[int, int]:
    return data[offset], offset + 1


def _read_byte(data: bytes, offset: int) -> tuple[int, int]:
    value = struct.unpack_from(">b", data, offset)[0]
    return value, offset + 1


def _read_short(data: bytes, offset: int) -> tuple[int, int]:
    value = struct.unpack_from(">h", data, offset)[0]
    return value, offset + 2


def _read_bool(data: bytes, offset: int) -> tuple[bool, int]:
    return data[offset] != 0, offset + 1


def _read_utf(data: bytes, offset: int) -> tuple[str, int]:
    size = struct.unpack_from(">H", data, offset)[0]
    start = offset + 2
    end = start + size
    return data[start:end].decode("utf-8"), end


def _split_record_store(raw: bytes) -> tuple[bytes, bytes]:
    if len(raw) < 8:
        raise RuntimeError("RMS file is too short to contain a record")
    record_count = int.from_bytes(raw[4:6], "big")
    if record_count < 1:
        raise RuntimeError("RMS file does not contain any records")
    payload_len = int.from_bytes(raw[6:8], "big")
    end = 8 + payload_len
    if len(raw) < end:
        raise RuntimeError("RMS payload is truncated")
    return raw[:6], raw[8:end]


def parse_save_slot(path: Path) -> ParsedSave:
    raw = path.read_bytes()
    header_prefix, payload = _split_record_store(raw)
    offset = 0

    phase, offset = _read_ubyte(payload, offset)
    scene, offset = _read_ubyte(payload, offset)
    play_music, offset = _read_ubyte(payload, offset)

    length, offset = _read_ubyte(payload, offset)
    offset += length

    for _ in range(2):
        length, offset = _read_ubyte(payload, offset)
        offset += 2 * length

    short_arr_f_count_offset = offset
    length, offset = _read_ubyte(payload, offset)
    short_arr_f_data_offset = offset
    short_arr_f = [struct.unpack_from(">h", payload, offset + 2 * index)[0] for index in range(length)]
    offset += 2 * length
    short_arr_f_data_end = offset

    for _ in range(2):
        length, offset = _read_ubyte(payload, offset)
        offset += 2 * length

    for _ in range(2):
        length, offset = _read_ubyte(payload, offset)
        offset += length

    length, offset = _read_ubyte(payload, offset)
    offset += length

    length, offset = _read_ubyte(payload, offset)
    offset += 3 * length

    length, offset = _read_ubyte(payload, offset)
    for _ in range(length):
        nested_len, offset = _read_ubyte(payload, offset)
        offset += 2 * nested_len

    _, offset = _read_bool(payload, offset)

    for _ in range(8):
        group_len, offset = _read_short(payload, offset)
        for _ in range(group_len):
            present, offset = _read_ubyte(payload, offset)
            if present <= 0:
                continue
            _, offset = _read_ubyte(payload, offset)
            active, offset = _read_bool(payload, offset)
            if active:
                offset += 2
                offset += 21 * 2

    offset += 4
    role_count, offset = _read_ubyte(payload, offset)
    role_tails: list[dict[str, int]] = []
    for _ in range(role_count):
        offset += 1
        int_count, offset = _read_ubyte(payload, offset)
        offset += 4 * int_count
        offset += 4

        item_count, offset = _read_ubyte(payload, offset)
        for _ in range(item_count):
            offset += 1
            offset += 4
            offset += 14 * 2

        equip_count, offset = _read_short(payload, offset)
        for _ in range(equip_count):
            present, offset = _read_ubyte(payload, offset)
            if present <= 0:
                continue
            offset += 1
            active, offset = _read_bool(payload, offset)
            if active:
                offset += 2
                offset += 21 * 2

        role_tail = {
            "x_offset": offset,
            "y_offset": offset + 2,
            "dir_offset": offset + 4,
            "state_offset": offset + 5,
            "extra_offset": offset + 6,
            "x": struct.unpack_from(">h", payload, offset)[0],
            "y": struct.unpack_from(">h", payload, offset + 2)[0],
            "dir": payload[offset + 4],
            "state": payload[offset + 5],
            "extra": struct.unpack_from(">h", payload, offset + 6)[0],
        }
        role_tails.append(role_tail)
        offset += 8

    live_back_scene_offset = offset
    live_back_scene, offset = _read_short(payload, offset)
    live_back_pos_offset = offset
    live_back_pos, offset = _read_ubyte(payload, offset)
    flag_offset = offset
    flag, offset = _read_bool(payload, offset)
    name_offset = offset
    name, offset = _read_utf(payload, offset)

    offsets = SaveOffsets(
        phase_offset=0,
        scene_offset=1,
        short_arr_f_count_offset=short_arr_f_count_offset,
        short_arr_f_data_offset=short_arr_f_data_offset,
        short_arr_f_data_end=short_arr_f_data_end,
        role_tail_offsets=role_tails,
        live_back_scene_offset=live_back_scene_offset,
        live_back_pos_offset=live_back_pos_offset,
        flag_offset=flag_offset,
        name_offset=name_offset,
    )

    return ParsedSave(
        raw=raw,
        payload=payload,
        header_prefix=header_prefix,
        phase=phase,
        scene=scene,
        play_music=play_music,
        short_arr_f=short_arr_f,
        role_tails=role_tails,
        live_back_scene=live_back_scene,
        live_back_pos=live_back_pos,
        flag=flag,
        name=name,
        offsets=offsets,
    )


def build_record_store(header_prefix: bytes, payload: bytes) -> bytes:
    return header_prefix + len(payload).to_bytes(2, "big") + payload


def inspect_save(path: Path) -> dict[str, object]:
    slot_path = path if path.is_absolute() else project_root() / path
    if not slot_path.is_file():
        raise FileNotFoundError(f"slot not found: {slot_path}")

    parsed = parse_save_slot(slot_path)
    return {
        "slot": str(slot_path),
        "payload_length": len(parsed.payload),
        "phase": parsed.phase,
        "scene": parsed.scene,
        "play_music": parsed.play_music,
        "completed_events": parsed.short_arr_f,
        "role_tails": [
            {
                "x": role["x"],
                "y": role["y"],
                "dir": role["dir"],
                "state": role["state"],
                "extra": role["extra"],
            }
            for role in parsed.role_tails
        ],
        "live_back_scene": parsed.live_back_scene,
        "live_back_pos": parsed.live_back_pos,
        "flag": parsed.flag,
        "name": parsed.name,
    }


def patch_end2_save(path: Path) -> tuple[Path, Path]:
    slot_path = path if path.is_absolute() else project_root() / path
    if not slot_path.is_file():
        raise FileNotFoundError(f"slot not found: {slot_path}")

    backup_path = backup_file(slot_path)
    parsed = parse_save_slot(slot_path)
    payload = bytearray(parsed.payload)

    payload[parsed.offsets.phase_offset] = 2
    payload[parsed.offsets.scene_offset] = 30

    completed = list(parsed.short_arr_f)
    if 6805 not in completed:
        completed.append(6805)

    rebuilt = bytearray()
    rebuilt += payload[: parsed.offsets.short_arr_f_count_offset]
    rebuilt.append(len(completed))
    for event_id in completed:
        rebuilt += int(event_id).to_bytes(2, "big", signed=True)
    rebuilt += payload[parsed.offsets.short_arr_f_data_end :]
    payload = rebuilt

    reparsed = parse_save_slot_bytes(parsed.header_prefix, bytes(payload))
    if reparsed.role_tails:
        first_role = reparsed.role_tails[0]
        payload[first_role["x_offset"] : first_role["x_offset"] + 2] = (160).to_bytes(2, "big", signed=True)
        payload[first_role["y_offset"] : first_role["y_offset"] + 2] = (60).to_bytes(2, "big", signed=True)

    reparsed = parse_save_slot_bytes(parsed.header_prefix, bytes(payload))
    payload[reparsed.offsets.live_back_scene_offset : reparsed.offsets.live_back_scene_offset + 2] = (
        30
    ).to_bytes(2, "big", signed=True)
    payload[reparsed.offsets.live_back_pos_offset] = 2

    slot_path.write_bytes(build_record_store(parsed.header_prefix, bytes(payload)))
    return slot_path, backup_path


def parse_save_slot_bytes(header_prefix: bytes, payload: bytes) -> ParsedSave:
    temp = build_record_store(header_prefix, payload)
    temp_path = project_root() / "docs" / "backups" / "runtime-experiments" / ".tmp-slot-inspect"
    temp_path.parent.mkdir(parents=True, exist_ok=True)
    temp_path.write_bytes(temp)
    try:
        return parse_save_slot(temp_path)
    finally:
        temp_path.unlink(missing_ok=True)


def cmd_build(_: argparse.Namespace) -> int:
    out_dir = docs_dir()
    out_dir.mkdir(parents=True, exist_ok=True)

    tasks = parse_tasks(txt_dir() / "task.txt")
    story = parse_story(txt_dir() / "story.txt")
    scenes = [parse_scene_file(path) for path in sorted(txt_dir().glob("scene*event.txt"))]
    summary = summarize_route(tasks, scenes)

    route_json = {
        "story": story,
        "summary": summary,
    }
    (out_dir / "route-map.json").write_text(
        json.dumps(route_json, ensure_ascii=False, indent=2) + "\n",
        encoding="utf-8",
    )
    (out_dir / "route-map.md").write_text(route_markdown(story, summary), encoding="utf-8")
    print(out_dir / "route-map.json")
    print(out_dir / "route-map.md")
    return 0


def cmd_parse_log(args: argparse.Namespace) -> int:
    out_dir = docs_dir()
    out_dir.mkdir(parents=True, exist_ok=True)
    state = parse_runtime_log(Path(args.log))
    output = Path(args.output) if args.output else out_dir / "runtime-state.json"
    if not output.is_absolute():
        output = project_root() / output
    output.parent.mkdir(parents=True, exist_ok=True)
    output.write_text(json.dumps(state, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(output)
    return 0


def cmd_final_chain(_: argparse.Namespace) -> int:
    tasks = parse_tasks(txt_dir() / "task.txt")
    scenes = [parse_scene_file(path) for path in sorted(txt_dir().glob("scene*event.txt"))]
    summary = summarize_route(tasks, scenes)
    for item in summary["final_chain"]:
        event_id = item["event_id"] if item["event_id"] is not None else "none"
        args = ", ".join(item["args"])
        print(
            f"scene{item['scene_id']} {item['phase']} event={event_id} "
            f"{item['kind']} {args}"
        )
    return 0


def cmd_patch_end2(args: argparse.Namespace) -> int:
    slot_path, backup_path = patch_end2_save(Path(args.slot))
    print(slot_path)
    print(backup_path)
    return 0


def cmd_inspect_save(args: argparse.Namespace) -> int:
    result = inspect_save(Path(args.slot))
    output = Path(args.output) if args.output else docs_dir() / "save-inspect.json"
    if not output.is_absolute():
        output = project_root() / output
    output.parent.mkdir(parents=True, exist_ok=True)
    output.write_text(json.dumps(result, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(output)
    return 0


def main() -> int:
    parser = argparse.ArgumentParser(description="Build a machine-readable story route map and parse runtime logs.")
    subparsers = parser.add_subparsers(dest="command", required=True)

    subparsers.add_parser("build", help="Parse task/story/scene files and export route map")

    parse_log = subparsers.add_parser("parse-log", help="Parse a FreeJ2ME runtime log into current story state")
    parse_log.add_argument("--log", required=True, help="Path to captured runtime log")
    parse_log.add_argument("--output", help="Optional output json path")

    subparsers.add_parser("final-chain", help="Print extracted endgame action chain")

    patch_end2 = subparsers.add_parser("patch-end2", help="Patch a save slot toward the end2 ending trigger")
    patch_end2.add_argument("--slot", required=True, help="Path to save slot file such as rms/.../yitiantulong1")

    inspect_slot = subparsers.add_parser("inspect-save", help="Inspect a FreeJ2ME RMS save slot payload")
    inspect_slot.add_argument("--slot", required=True, help="Path to save slot file such as rms/.../yitiantulong1")
    inspect_slot.add_argument("--output", help="Optional json output path")

    args = parser.parse_args()
    if args.command == "build":
        return cmd_build(args)
    if args.command == "parse-log":
        return cmd_parse_log(args)
    if args.command == "final-chain":
        return cmd_final_chain(args)
    if args.command == "patch-end2":
        return cmd_patch_end2(args)
    if args.command == "inspect-save":
        return cmd_inspect_save(args)
    return 2


if __name__ == "__main__":
    raise SystemExit(main())
