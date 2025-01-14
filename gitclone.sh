#!/bin/sh

# 呼び出し方
# sh gitCommit.sh [branch-name]
# param1: branch-name
#   作成するブランチ名を指定する

# 引数チェック
if [ "$#" -ne 1 ]; then
  echo "エラー: 引数としてbranchの名前を指定してください。"
  exit 1
fi

# 変数設定
cloneURL=https://github.com/hayashi-ryo/UoPeople.git
masterBranchName="UoPeople"
branchName=$1

# clone
echo ${cloneURL}
git clone --filter=blob:none --no-checkout ${cloneURL} ${branchName}-branch
cd ${branchName}-branch
pwd

# sparse-checkoutの設定
git sparse-checkout set
# UoPとSophiaによって処理を分岐
options=("UoPeople" "Sophia")
select option in "${options[@]}"; do
  case $REPLY in
    1) # UoPeopleのブランチを作成する
      git sparse-checkout add template
      git sparse-checkout add ${branchName} 
      git read-tree -mu HEAD
      break
      ;;
    2) # Sophiaのブランチを作成する
      git sparse-checkout add Sophia/template
      git sparse-checkout add Sophia/${branchName}
      git read-tree -mu HEAD
      cd Sophia
      break
      ;;
    *)
      echo "無効な選択です。1から2の数字を入力してください。"
      ;;
  esac
done


git checkout -b ${branchName}
cp -r template ${branchName}

