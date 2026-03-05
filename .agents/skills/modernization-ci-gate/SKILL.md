---
name: modernization-ci-gate
description: 'modernization 模块的最小 CI 门禁技能：配置样本校验 + 事件回放冒烟 + 自动化测试。'
---

# Modernization CI Gate

该技能用于在重构期对 `modernization/` 进行最小化质量门禁，优先保障：

1. `scene1/scene2` 配置可解析；
2. 核心事件脚本可回放；
3. 自动化测试可通过。

## 命令

统一入口：

```bash
python3 .agents/skills/modernization-ci-gate/scripts/modernization_ci_gate.py
```

## 门禁内容

1. 配置样本校验：`modernization/tools/validate_scene_samples.py`
2. 事件回放冒烟：`modernization/tools/replay_scene_sample.py --scene 1 --event 1`
3. 自动化测试：`pytest -q modernization/tests`

## 使用场景

1. 每次修改 `modernization/` 代码后执行一次。
2. 作为后续接入 GitHub Actions 的命令基础。
