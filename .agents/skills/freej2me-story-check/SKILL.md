---
name: freej2me-story-check
description: 'FreeJ2ME 剧情推进与可视化验证技能。可聚焦模拟器窗口、发送键位、连续截图，并验证是否进入标题后的简单剧情。'
---

# FreeJ2ME Story Check Skill

这个技能用于验证游戏不只是“能启动”，而是已经能在 FreeJ2ME 中推进标题后的简单流程，并留下连续视觉证据。

## 何时使用

1. 需要确认标题界面可以进入新游戏或开场剧情。
2. 需要复验键位映射是否正确。
3. 需要留下可审阅的剧情推进截图序列。

## 前提

- `tools/freej2me.jar` 已可运行
- `tools/jdk-21/bin/java` 可用，或系统 PATH 中有 `java`
- X11 会话可用

## 命令

### 1) 列出 FreeJ2ME 窗口

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py list
```

### 2) 单步按键并截图

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py step \
  --window-id 0x800868 \
  --keys ENTER ENTER
```

### 3) 尝试标题后简单剧情

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py walkthrough \
  --window-id 0x800868
```

说明：
- `walkthrough` 默认会点击窗口中心聚焦，然后执行一组保守的推进键位，并在每一步后截图。
- 输出默认落在 `docs/visual-checks/story-check-<timestamp>/`。
