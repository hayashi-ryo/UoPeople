# java練習

javaの開発・勉強を行うために、docker環境の構築を行う

## 構成概要

- イメージ
  - docker環境にopenjdkを導入する
- フォルダ構成

``` dir
java
├──docker
│   └──Dockerfile
├──docker-compose.yml
└──server
    └──src
        └──samples
            ├──mylib
            └──selfleatn
```

## 実施内容

### 環境構築

1. dockerイメージのビルド
   `docker-compose`
2. docker起動
   `docker-compose up -d`
3. dockerJVM環境へアクセス
   `docker-compose exec java bash`
4. 作業実施
