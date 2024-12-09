# Pythonでバイナリファイルを作成
filename = "sample.bin"

# バイナリデータの例
data = bytearray([
    0x48, 0x65, 0x6C, 0x6C, 0x6F,  # "Hello"に対応するバイトデータ
    0x00, 0xFF, 0xAA, 0x55,        # 任意のバイトデータ
    0x42, 0x69, 0x6E, 0x61, 0x72,  # "Binar"に対応するバイトデータ
    0x79                            # "y"
])

# ファイルに書き込む
with open(filename, "wb") as f:
    f.write(data)

print(f"{filename} が作成されました。")
