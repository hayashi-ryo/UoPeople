#!/bin/sh

# 呼び出し方
# gitCommit.sh "コミットメッセージ"

# set -x

echo ""
echo "##################"
echo "### git commit ###"
echo "##################"
echo ""

if [ $# -ne 1 ]; then
  echo "パラメータ個数ERROR"
  # ERROR
  exit 1
fi

commitMessage=$1
echo "commitMessage:" $commitMessage
git add .
git commit -m \'"$commitMessage"\'

echo ""
echo "#######################"
echo "### commit complete ###"
echo "#######################"
echo ""
