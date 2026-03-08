# java21-baseline

这个叶子模块承载 J2ME 游戏的 Java 21 逆向基线，不直接修改 `work/unpacked` 原始输入。

## 目录

- `inputs/classes/`: 从 `work/unpacked/*.class` 复制来的基线输入
- `src/generated/`: 反编译产物目录
- `src/manual/`: 手工修复和入口链骨架源码
- `stubs/`: J2ME / Wireless Messaging 最小编译桩
- `scripts/`: 反编译、编译和备份脚本

## 入口

```bash
python3 .agents/skills/java-quality-gate/scripts/java_gate.py --module reverse/java21-baseline
```
