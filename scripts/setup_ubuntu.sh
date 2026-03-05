#!/usr/bin/env bash
set -euo pipefail

# Install base tools required for running and repacking the J2ME game on Ubuntu.
sudo apt update
sudo apt install -y default-jre unzip zip

echo
printf 'Done. Next step: download FreeJ2ME (freej2me.jar) and place it at %s\n' "$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)/tools/freej2me.jar"
printf 'Or set FREEJ2ME_JAR to the downloaded jar path.\n'
