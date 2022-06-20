# 参考サイト
# https://qiita.com/jhorikawa_err/items/fb9c03c0982c29c5b6d5
# ベースイメージ:タグ名
FROM python:3.9
USER root

# 環境設定
RUN apt-get update
RUN apt-get -y install locales && \
    localedef -f UTF-8 -i ja_JP ja_JP.UTF-8
ENV LANG ja_JP.UTF-8
ENV LANGUAGE ja_JP:ja
ENV LC_ALL ja_JP.UTF-8
ENV TZ JST-9
ENV TERM xterm

# pipインストール
RUN apt-get install -y vim less
RUN pip install --upgrade pip
RUN pip install --upgrade setuptools

RUN python -m pip install jupyterlab

# コンテナのworkディレクトリを作成する
WORKDIR /work
# COPY requirements.txt ./
# RUN pip install --no-cache-dir -r requirements.txt
# COPY . .
# コンテナのリッスンポート番号
EXPOSE 9999

# コマンド実行
# CMD [ "python", "./your-daemon-or-script.py" ]