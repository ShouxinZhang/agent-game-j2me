from __future__ import annotations

from dataclasses import dataclass

from data_loader.models import SceneEvent

from .state import GameState


@dataclass(slots=True, frozen=True)
class _OpSpec:
    name: str
    argc: int


CONDITION_SPECS: dict[str, _OpSpec] = {
    "已发生事件": _OpSpec("已发生事件", 1),
    "未发生事件": _OpSpec("未发生事件", 1),
    "有道具": _OpSpec("有道具", 1),
    "无道具": _OpSpec("无道具", 1),
}

ACTION_SPECS: dict[str, _OpSpec] = {
    "换场景": _OpSpec("换场景", 2),
    "对话": _OpSpec("对话", -1),
    "提示信息": _OpSpec("提示信息", -1),
    "结束脚本": _OpSpec("结束脚本", 0),
    "扣除道具": _OpSpec("扣除道具", 2),
    "获取道具": _OpSpec("获取道具", 2),
    "获取装备": _OpSpec("获取装备", 1),
    "改变金钱": _OpSpec("改变金钱", 1),
    "去除事件": _OpSpec("去除事件", 1),
    "走动": _OpSpec("走动", -1),
    "转向": _OpSpec("转向", 1),
    "加入任务": _OpSpec("加入任务", 1),
    "清除BOSS": _OpSpec("清除BOSS", 1),
    "离开队伍": _OpSpec("离开队伍", 1),
    "复活角色": _OpSpec("复活角色", 1),
    "更新阶段": _OpSpec("更新阶段", 1),
    "船变人": _OpSpec("船变人", 0),
    "船变人1": _OpSpec("船变人1", 3),
    "人变船1": _OpSpec("人变船1", 2),
    "去掉船": _OpSpec("去掉船", 1),
    "加上船": _OpSpec("加上船", 1),
    "对话中选择": _OpSpec("对话中选择", -1),
    "选择了": _OpSpec("选择了", -1),
}


def _as_int(value: str, default: int = 0) -> int:
    try:
        return int(value)
    except ValueError:
        return default


def _inventory_count(state: GameState, item_id: int) -> int:
    return max(state.inventory.get(item_id, 0), 0)


def _eval_condition(cmd: str, args: list[str], state: GameState) -> bool:
    if cmd == "已发生事件":
        return _as_int(args[0]) in state.occurred_events
    if cmd == "未发生事件":
        return _as_int(args[0]) not in state.occurred_events
    if cmd == "有道具":
        return _inventory_count(state, _as_int(args[0])) > 0
    if cmd == "无道具":
        return _inventory_count(state, _as_int(args[0])) <= 0
    return False


def _apply_action(cmd: str, args: list[str], state: GameState) -> None:
    state.action_trace.append(cmd)

    if cmd == "换场景":
        scene_id = _as_int(args[0])
        spawn = _as_int(args[1]) if len(args) > 1 else 0
        state.current_scene_id = scene_id
        state.transitions.append((scene_id, spawn))
        return

    if cmd == "对话":
        if not args:
            return
        text = ",".join(args[1:]) if len(args) > 1 else args[0]
        if text:
            state.dialogues.append(text)
        return

    if cmd == "提示信息":
        if args:
            state.messages.append(",".join(args))
        return

    if cmd == "结束脚本":
        state.terminated = True
        return

    if cmd == "扣除道具":
        if len(args) >= 2:
            item_id = _as_int(args[0])
            count = max(_as_int(args[1]), 0)
            left = _inventory_count(state, item_id) - count
            state.inventory[item_id] = max(left, 0)
        return

    if cmd == "获取道具":
        if len(args) >= 2:
            item_id = _as_int(args[0])
            count = max(_as_int(args[1]), 0)
            state.inventory[item_id] = _inventory_count(state, item_id) + count
        return

    if cmd == "获取装备":
        if args:
            equip_id = _as_int(args[0])
            state.inventory[equip_id] = _inventory_count(state, equip_id) + 1
        return

    if cmd == "改变金钱":
        if args:
            state.money += _as_int(args[0])
        return

    if cmd == "去除事件" and args:
        state.occurred_events.discard(_as_int(args[0]))
        return


def _split_conditions(tokens: tuple[str, ...]) -> tuple[list[tuple[str, list[str]]], list[str]]:
    conditions: list[tuple[str, list[str]]] = []
    i = 0
    raw = list(tokens)

    while i < len(raw):
        token = raw[i]
        if token == "继承条件":
            i += 1
            continue

        spec = CONDITION_SPECS.get(token)
        if spec is None:
            break

        end = i + 1 + spec.argc
        if end > len(raw):
            break

        args = raw[i + 1 : end]
        conditions.append((token, args))
        i = end

    return conditions, raw[i:]


def _apply_actions(tokens: list[str], state: GameState) -> None:
    i = 0
    while i < len(tokens) and not state.terminated:
        cmd = tokens[i]
        if cmd == "继承条件":
            i += 1
            continue

        spec = ACTION_SPECS.get(cmd)
        if spec is None:
            state.unknown_commands.append(cmd)
            i += 1
            continue

        if spec.argc == -1:
            args = tokens[i + 1 :]
            _apply_action(cmd, args, state)
            break

        end = i + 1 + spec.argc
        if end > len(tokens):
            state.unknown_commands.append(cmd)
            break

        args = tokens[i + 1 : end]
        _apply_action(cmd, args, state)
        i = end


def execute_event(event: SceneEvent, state: GameState) -> GameState:
    state.terminated = False

    for step in event.script:
        if state.terminated:
            break

        conditions, action_tokens = _split_conditions(step.tokens)
        if not action_tokens:
            continue

        if conditions and not all(_eval_condition(cmd, args, state) for cmd, args in conditions):
            continue

        _apply_actions(action_tokens, state)

    return state
