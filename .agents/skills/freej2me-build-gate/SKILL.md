---
name: freej2me-build-gate
description: 'FreeJ2ME 本地构建门禁技能。统一检查 JDK 工具链、编译 tools/freej2me-src，并同步产出到 tools/freej2me.jar。'
---

# FreeJ2ME Build Gate

这个技能用于给 `tools/freej2me-src` 提供本地可复验的构建门禁，避免 GUI 修复只能靠临时命令验证。

## 何时使用

1. 修改 `tools/freej2me-src` 后，需要确认模拟器源码仍可编译。
2. 需要把新的构建产物同步到仓库使用的 `tools/freej2me.jar`。
3. 提交 FreeJ2ME 相关修复前，需要做一次统一本地预检。

## 命令

### 1) 默认构建并同步到 tools/freej2me.jar

```bash
python3 .agents/skills/freej2me-build-gate/scripts/freej2me_build_gate.py
```

### 2) 只构建 tools/freej2me-src/build/freej2me.jar，不同步

```bash
python3 .agents/skills/freej2me-build-gate/scripts/freej2me_build_gate.py --skip-sync
```

## 检查内容

- `tools/freej2me-src`、`src/`、`resources/`、`META-INF/`、`build/manifest-awt.mf` 是否存在
- 本地 `javac`、`jar` 是否可用
- 是否能成功编译全部 FreeJ2ME Java 源码
- 是否能产出 `build/freej2me.jar`
- 默认是否成功同步到 `tools/freej2me.jar`

说明：
- 当前门禁面向 AWT 版 `freej2me.jar`。
- 不依赖 `ant`，直接使用仓库内 JDK 21 工具链。
