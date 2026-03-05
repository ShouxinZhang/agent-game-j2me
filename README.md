# agent-game-j2me

在 Ubuntu 上游玩和研究这个 J2ME 游戏（支持解包和重打包）。

## 目录说明

- `倚天屠龙之君临天下.jar`: 原始游戏包
- `scripts/setup_ubuntu.sh`: 安装基础依赖（Java/unzip/zip）
- `scripts/run.sh`: 使用 FreeJ2ME 启动游戏
- `scripts/unpack.sh`: 解包 jar 到目录
- `scripts/repack.sh`: 将目录重新打包为 jar
- `work/`: 默认工作目录（解包输出和重打包结果）

## 1. Ubuntu 安装依赖

```bash
cd /home/wudizhe001/Documents/GitHub/agent-game-j2me
./scripts/setup_ubuntu.sh
```

## 2. 下载 FreeJ2ME 模拟器

J2ME 游戏需要模拟器，推荐 FreeJ2ME。

1. 打开 releases 页面：
	`https://github.com/hex007/freej2me/releases`
2. 下载 `freej2me.jar`
3. 放到以下路径（推荐）：

```bash
mkdir -p tools
cp ~/Downloads/freej2me.jar tools/freej2me.jar
```

## 3. 运行游戏

```bash
./scripts/run.sh
```

如果你的 `freej2me.jar` 不在 `tools/`，可以这样运行：

```bash
FREEJ2ME_JAR=/path/to/freej2me.jar ./scripts/run.sh
```

如果要运行重打包后的版本：

```bash
./scripts/run.sh ./work/mod.jar
```

## 4. 解包并修改

```bash
./scripts/unpack.sh
```

默认会解包到 `work/unpacked/`。你可以在里面修改资源和反编译后替换文件。

## 5. 重打包

```bash
./scripts/repack.sh
```

默认输出 `work/mod.jar`。

## 常用流程

```bash
./scripts/unpack.sh
# 修改 work/unpacked 里的文件
./scripts/repack.sh
./scripts/run.sh ./work/mod.jar
```

## 备注

- 游戏清单信息：`CLDC-1.0` + `MIDP-2.0`。
- 原始仓库不含 Java 源码，代码修改通常需要反编译 class 后再做二次构建。

