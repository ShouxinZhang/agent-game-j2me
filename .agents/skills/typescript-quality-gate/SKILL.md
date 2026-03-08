---
name: typescript-quality-gate
description: '通用 TypeScript 开发门禁技能。统一检查 Node/npm、安装依赖并执行 tsc，无缝服务新的 TS 叶子模块。'
---

# TypeScript Quality Gate Skill

这个技能用于给仓库里的 TypeScript 叶子模块提供最小可复验门禁，避免新模块只有临时命令、没有统一检查入口。

## 何时使用

1. 新建 TypeScript 叶子模块后，需要确认依赖和 `tsc` 能正常工作。
2. 修改 TypeScript 模块后，需要在提交前做一次统一本地预检。
3. 需要给未来的 CI 补齐一个可直接复用的检查入口。

## 命令

### 1) 首次安装依赖并执行门禁

```bash
python3 .agents/skills/typescript-quality-gate/scripts/typescript_gate.py \
  --module .agents/skills/codex-worker-review-loop \
  --install
```

### 2) 已安装依赖后执行门禁

```bash
python3 .agents/skills/typescript-quality-gate/scripts/typescript_gate.py \
  --module .agents/skills/codex-worker-review-loop
```

## 检查内容

- `node`、`npm` 是否可用
- 目标模块是否存在 `package.json`
- 目标模块是否存在 `tsconfig.json`
- 若传入 `--install`，是否能成功安装依赖
- 是否能通过 `npm run typecheck`
- 若定义了 `test` 脚本且未显式跳过，是否能通过 `npm test`

说明：
- 当前门禁面向叶子 TypeScript 模块，不会扫描整个仓库。
- `--install` 只作用在指定模块目录，避免高层目录被污染。
