---
name: java-quality-gate
description: 'J2ME Java 21 逆向重构门禁技能。统一检查 java/javac/CFR、反编译输入、基线源码结构与编译可行性。'
---

# Java Quality Gate Skill

这个技能用于给 `reverse/java21-baseline` 提供最小可复验门禁，保证逆向工作有统一入口，而不是散落在临时命令里。

## 何时使用

1. 逆向源码初次建立后，确认基线结构是否完整。
2. 补充手工修复源码或 J2ME 编译桩后，执行本地质量门禁。
3. 提交持续逆向结果前，确认工具链和目标模块健康。

## 命令

### 1) 默认检查基线模块

```bash
python3 .agents/skills/java-quality-gate/scripts/java_gate.py
```

### 2) 指定目标模块

```bash
python3 .agents/skills/java-quality-gate/scripts/java_gate.py --module reverse/java21-baseline
```

## 检查内容

- `java` 是否存在
- `javac` 是否存在
- `tools/cfr.jar` 是否存在
- 目标模块目录、原始 class 输入、手工源码目录、J2ME 桩目录是否存在
- 若 `javac` 存在，则执行一次基线编译检查

说明：
- 本技能只做检查，不自动下载 JDK 或反编译器。
- 若 `javac` 或 `tools/cfr.jar` 缺失，会明确失败并给出落位要求。
