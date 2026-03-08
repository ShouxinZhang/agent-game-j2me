---
name: story-route-map
description: '解析 J2ME 游戏剧情路线、关键任务节点与结局条件，并把运行日志翻译成可机读的当前推进状态。'
---

# Story Route Map Skill

这个技能用于把 `work/unpacked/txt/` 下的剧情文本、任务文本和场景事件文本整理成一份可机读的路线图，并结合 FreeJ2ME 的控制台日志判断当前推进到哪里。

## 何时使用

1. 需要判断整条主线的任务链和关键场景切换。
2. 需要提取结局触发条件、关键战斗、关键技能/道具门槛。
3. 需要把运行日志翻译成“当前场景 / 最近事件 / 最近战斗 / 是否触发结局”的状态摘要。

## 命令

### 1) 构建剧情路线图

```bash
python3 .agents/skills/story-route-map/scripts/story_route_map.py build
```

默认输出：
- `docs/story-route-map/route-map.json`
- `docs/story-route-map/route-map.md`

### 2) 从运行日志解析当前推进状态

```bash
python3 .agents/skills/story-route-map/scripts/story_route_map.py parse-log \
  --log docs/runtime/game-session.log
```

默认输出：
- `docs/story-route-map/runtime-state.json`

### 3) 打印终局链摘要

```bash
python3 .agents/skills/story-route-map/scripts/story_route_map.py final-chain
```

### 4) 试验性补丁：把初始档跳到终局结局场景

```bash
python3 .agents/skills/story-route-map/scripts/story_route_map.py patch-end2 \
  --slot rms/倚天屠龙之君临天下/yitiantulong1
```

### 5) 检查存档结构

```bash
python3 .agents/skills/story-route-map/scripts/story_route_map.py inspect-save \
  --slot rms/倚天屠龙之君临天下/yitiantulong1
```

说明：
- `build` 只读 `work/unpacked/txt/`，不会改动原始资源。
- `parse-log` 只依赖运行日志，不要求已经有存档。
- `patch-end2` 会先自动备份目标存档，再按 FreeJ2ME RMS record 格式做结构化补丁。
- `inspect-save` 会解析 RMS 容器头、payload 当前场景、已完成事件和主角坐标，便于定位剧情卡点。
- 这个技能是后续 GUI 自动推进和终局验收的业务底图。
