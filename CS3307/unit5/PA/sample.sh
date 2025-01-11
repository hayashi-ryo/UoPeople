#!/bin/bash

# ファイルの保存先ディレクトリ
TARGET_DIR="/path/to/target/folder"
# ダウンロード元URL
FILE_URL="https://my.uopeople.edu/pluginfile.php/1927856/mod_workshop/instructauthors/Sample-Spreadsheet-1000-rows.csv"
# 保存するファイル名
FILE_NAME="Spreadsheet-1000-rows.csv"

# ダウンロード用ディレクトリが存在しない場合、作成する
if [ ! -d "$TARGET_DIR" ]; then
    echo "Target directory does not exist. Creating directory..."
    mkdir -p "$TARGET_DIR"
fi

# ファイルをダウンロード
echo "Downloading file from $FILE_URL..."
wget -q -O "$TARGET_DIR/$FILE_NAME" "$FILE_URL"
if [ $? -ne 0 ]; then
    echo "Error: Failed to download the file."
    exit 1
fi

# ダウンロード完了メッセージ
echo "File downloaded successfully to $TARGET_DIR/$FILE_NAME"

# 整理されたファイルの確認
if [ -f "$TARGET_DIR/$FILE_NAME" ]; then
    echo "File is successfully saved in the target directory."
else
    echo "Error: File not found in the target directory."
    exit 1
fi
