---
name: x11-window-check
description: 'X11 窗口截图取证技能。可枚举窗口、按标题匹配抓取 PNG，并输出元数据供 GUI 可视化自检。'
---

# X11 Window Check Skill

这个技能用于在当前 X11 桌面会话里，对窗口做可复验的截图取证，支撑 FreeJ2ME 和后续工具界面的视觉检查。

## 何时使用

1. 运行 FreeJ2ME 后，需要确认窗口是否真正出现。
2. 自动化步骤完成后，需要抓取窗口证据供 agent 自检。
3. 需要保存一份可追溯的 GUI 现场快照。

## 命令

### 1) 列出当前可见窗口

```bash
python3 .agents/skills/x11-window-check/scripts/x11_window_check.py list
```

### 2) 按标题抓取窗口

```bash
python3 .agents/skills/x11-window-check/scripts/x11_window_check.py capture --title "FreeJ2ME"
```

### 3) 指定输出文件

```bash
python3 .agents/skills/x11-window-check/scripts/x11_window_check.py capture \
  --title "FreeJ2ME" \
  --output docs/visual-checks/freej2me.png
```

### 4) 按窗口 ID 精确抓取

```bash
python3 .agents/skills/x11-window-check/scripts/x11_window_check.py capture \
  --id 0x800868 \
  --output docs/visual-checks/freej2me.png
```

## 依赖

- `xwininfo`
- `import` 或 `xwd`
- ImageMagick（当前实现优先使用 `import`）

说明：
- 默认输出到 `docs/visual-checks/<timestamp>/`。
- 本技能只做抓图和元数据记录，不自动判断业务是否成功。
