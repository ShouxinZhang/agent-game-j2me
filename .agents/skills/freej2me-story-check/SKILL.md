---
name: freej2me-story-check
description: 'FreeJ2ME 剧情推进与可视化验证技能。可聚焦模拟器窗口、发送键位、连续截图，并验证是否进入标题后的简单剧情。'
---

# FreeJ2ME Story Check Skill

这个技能用于验证游戏不只是“能启动”，而是已经能在 FreeJ2ME 中推进标题后的简单流程，并留下连续视觉证据。

## 强制工作流

处理 GUI 问题时，必须把画面证据放在代码推断前面，严格按下面顺序执行：

1. 先保证只有一个目标 FreeJ2ME 窗口，避免多窗口焦点串扰。
2. 先截图，再阅读 GUI 画面本身，判断当前页面文案、按钮、焦点和可执行动作。
3. 再读取键位映射或已知快捷键，确认应该发出的按键。
4. 每次只执行一个最小动作，例如一次 `ENTER`、一次点击、一次文本输入。
5. 每个动作后必须重新截图，再次阅读 GUI，确认是否进入了预期页面。
6. 若画面与预期不符，先回到截图分析，不允许连续凭猜测发送多步按键。

说明：
- 这是一个 visual-first 技能，不允许先根据反编译状态机或历史经验臆测路径。
- 遇到“一闪而过”类问题时，优先使用 `burst` 连拍保留现场，再分析页面切换。
- 做业务验证时，要优先相信当前 GUI 画面，而不是之前回合里的操作假设。

## 何时使用

1. 需要确认标题界面可以进入新游戏或开场剧情。
2. 需要复验键位映射是否正确。
3. 需要留下可审阅的剧情推进截图序列。
4. 需要用多模态方式确认某个 GUI 页面是否真的出现过。

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

### 3) 相对坐标点击并截图

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py click \
  --window-id 0x800868 \
  --x 120 \
  --y 280 \
  --capture
```

### 4) 连续截图抓瞬时问题

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py burst \
  --window-id 0x800868 \
  --frames 8 \
  --interval-ms 100
```

### 5) 输入文本并截图

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py type \
  --window-id 0x800868 \
  --text abc \
  --capture
```

### 6) 尝试标题后简单剧情

```bash
python3 .agents/skills/freej2me-story-check/scripts/freej2me_story_check.py walkthrough \
  --window-id 0x800868
```

说明：
- `walkthrough` 默认会点击窗口中心聚焦，然后执行一组保守的推进键位，并在每一步后截图。
- `click` 使用窗口内相对坐标，适合验证 GUI 焦点和命中区域。
- `burst` 适合抓“界面一闪而过”这类瞬时问题。
- `type` 当前主要用于桌面键盘字符输入验证。
- 输出默认落在 `docs/visual-checks/story-check-<timestamp>/`。
