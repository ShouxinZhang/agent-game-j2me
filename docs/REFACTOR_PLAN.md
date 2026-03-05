# agent-game-j2me 重构计划（Godot 定案版）

## 1. 业务目标

本计划的目标不是“重做一款新游戏”，而是把现有内容资产迁移到现代技术栈，同时保证玩家体验和剧情推进不变。

目标拆分如下：

1. 美术资产无损：原始资源文件保持可追溯、可复用、可回退。
2. 剧情流程无损：事件触发、条件判断、任务推进与旧版本一致。
3. 可持续演进：后续支持现代 UI、跨平台发布、Agent RL 接入。

## 2. 无损定义（验收口径）

无损分为两个等级。

1. 资产无损
- 不覆盖或改写原始资源：`work/unpacked/` 下原文件保持只读来源地位。
- 新引擎优先实现读取器与兼容层，避免先做不可逆批量转换。
- 所有转换产物可重建，可由脚本重复生成。

2. 行为无损
- 同一存档与同一路线下，剧情分支、战斗结果、掉落与任务标志一致。
- 核心脚本语义一致：`换场景/对话/条件/加减道具/任务状态` 等执行结果一致。
- 允许显示层微小差异（字体、抗锯齿、帧率），但不改变玩法结果。

## 3. 技术路线（已定：Godot）

已确认路线：`Godot 客户端 + 独立规则核心`。

1. `game-core`（无 UI）
- 负责规则执行、脚本解释、状态管理、存档、战斗结算。
- 对外提供统一接口：`reset/step/get_state/load/save`。

2. `game-client-godot`
- 负责地图渲染、动画、输入、UI、音频。
- 不承载业务规则，仅消费 `game-core` 事件流和状态。

3. `data-loader`
- 负责解析 `work/unpacked/txt/*.txt` 并构建结构化模型。
- 对 `scene/event/role/enemy/item/equip` 做统一加载与校验。

4. `asset-pipeline`
- 负责 `.map/.ani/.ps` 兼容读取或可逆转换。
- 输出可复现的中间产物，避免不可逆资产污染。

5. `agent-bridge`
- 面向 RL：`reset()/step(action)`、观测封装、奖励计算与终止条件。

## 4. 原架构分析与重构映射

以下映射基于当前仓库资源与脚本结构（`work/unpacked/txt/*`）整理。

1. 场景与地图模块
- 原模块：`scene.txt` + `map/`
- 新模块：`data-loader/scene_loader` + `game-client-godot/world_renderer`

2. 事件脚本模块
- 原模块：`sceneXevent.txt`
- 新模块：`game-core/event_vm`

3. 角色/NPC 放置模块
- 原模块：`sceneXrole.txt` + `role.txt`
- 新模块：`data-loader/role_loader` + `game-client-godot/role_presenter`

4. 对话模块
- 原模块：`sceneXchat.txt`
- 新模块：`game-core/dialogue_service` + `game-client-godot/dialogue_ui`

5. 战斗模块
- 原模块：`battlepos.txt` + `enemy.txt` + `levelup.txt`
- 新模块：`game-core/battle_engine`

6. 物品与装备模块
- 原模块：`item.txt` + `equip.txt`
- 新模块：`game-core/inventory_economy`

7. 门/开关与跳转模块
- 原模块：`door.txt`（及脚本跳转指令）
- 新模块：`game-core/scene_state_machine`

8. 运行工具模块
- 原模块：`scripts/run.sh`、`scripts/unpack.sh`、`scripts/repack.sh`
- 新模块：`modernization/tools`（导入、校验、构建、回归脚本）

## 5. 分阶段执行计划

## Phase 0: 基线冻结（1 周）

产出：可复现的“旧版行为基线”。

1. 建立基线清单
- 主线关键节点（至少 20 个事件点）。
- 关键战斗（至少 10 场）和关键道具/装备获取点。

2. 录制基线证据
- 每个节点记录：场景 ID、事件 ID、对话摘要、状态快照。
- 形成 `baseline` 文档与截图/录像对照集合。

3. 通过标准
- 基线路径在当前运行环境可稳定复现。

## Phase 1: 数据模型与脚本兼容层（2 周）

产出：文本配置可被新核心读取和执行。

1. 建立统一数据模型
- 角色、敌人、物品、装备、场景、事件、门、任务标志。

2. 实现脚本解释器 V1
- 覆盖高频指令：`换场景`、`对话`、`条件判断`、`获取/扣除道具`、`走动`。

3. 通过标准
- 以 `scene1event.txt`、`scene2event.txt` 为样本，主流程可跑通。
- 建立 Godot 客户端最小联调接口（不要求完整 UI）。

## Phase 2: 战斗与成长系统迁移（2 周）

产出：战斗可闭环，成长规则一致。

1. 战斗系统
- 读取 `battlepos.txt`、`enemy.txt`，复刻回合与结算。

2. 成长与经济
- 读取 `levelup.txt`、`item.txt`、`equip.txt`，复刻升级和掉落。

3. 通过标准
- 关键战斗胜负与奖励分布在容忍范围内一致。

## Phase 3: 客户端接入（2 周）

产出：现代客户端可玩版本。

1. 地图/角色/动画渲染接入
- 对接 `map/ role/ battle/` 资源与场景跳转。

2. UI 与输入接入
- 菜单、背包、战斗 UI、对话框、按键映射。

3. 通过标准
- 从开局到至少一个完整章节可稳定游玩。

## Phase M1/M2/M3（工程里程碑）

1. M1 数据可读
- 目标：`scene1/scene2` 配置可被解析并回放关键事件。

2. M2 规则可跑
- 目标：事件、战斗、背包、成长形成无 UI 闭环。

3. M3 Godot 可玩
- 目标：Godot 前端完成首章可玩流程。

## Phase 4: 无损回归与发布（1 周）

产出：业务可验收版本 + 风险清单。

1. 回归测试
- 对照 Phase 0 基线，逐项校验剧情、战斗、道具、任务标志。

2. 缺陷分类
- P0: 阻断主线；P1: 错误数值；P2: 表现偏差。

3. 通过标准
- P0 清零，P1 可接受且有修复计划，P2 记录在案。

## 6. 模块边界与目录建议

建议新增独立模块，避免污染现有资产目录。

1. `modernization/game-core/`
2. `modernization/game-client-godot/`
3. `modernization/data-loader/`
4. `modernization/asset-pipeline/`
5. `modernization/agent-bridge/`
6. `modernization/tools/`
7. `modernization/tests/`

说明：`work/unpacked/` 作为原始内容来源，不直接放新逻辑代码。

## 7. 风险与应对

1. 风险：旧脚本存在隐式语义，文档缺失。
- 应对：先实现可观测日志，逐条对照执行轨迹。

2. 风险：资源格式解析不完整导致渲染偏差。
- 应对：先保证规则正确，再逐步提升显示一致性。

3. 风险：一次性全量重写导致工期失控。
- 应对：按章节灰度迁移，阶段性可玩可验收。

4. 风险：Godot 场景脚本承载过多规则，后续 RL 接入困难。
- 应对：业务规则仅在 `game-core`，Godot 只做表现与交互。

## 8. 验收 KPI（管理视角）

1. 主线剧情一致率 >= 95%。
2. 关键战斗一致率 >= 95%。
3. 每周至少交付一个“可玩的增量版本”。
4. 迁移后新增功能开发效率相对旧版本提升 >= 30%。

## 9. 下一步（立即可执行）

1. 固化 `scene1/scene2` 为首批兼容样本（包含事件回放脚本）。
2. 先实现 `scene1/scene2` 兼容样板，建立第一条端到端流水线。
3. 建立基线样例库，作为后续每次迭代的回归门禁。

## 10. CI 门禁建议（当前仓库待补齐）

当前仓库未发现 `.github/workflows/` 下的自动检查流程。为保障重构质量，建议最小化引入以下门禁：

1. 配置格式校验：`txt` 配置完整性与引用合法性检查。
2. 脚本回归检查：关键事件脚本回放（至少覆盖 `scene1/scene2`）。
3. 构建冒烟检查：客户端可启动、可进入首个可玩场景。

该门禁完成后，再推进大规模迁移可显著降低返工风险。
