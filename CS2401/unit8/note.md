# unit8

- Topics:
  - Software Reengineering, Software Documentation

## Goal

- By the end of this Unit, you will be able to:
  - Learn Reverse Engineering
  - Learn about program modularization
  - Understand, in details, about software documentation
  - Create software document

## Task

- [x] Reading assignment
- [ ] Learning Journalっf
- [x] Take Self-Quiz

## Reading Assignment

- Sommerville, Ian. (2000). Software Reengineering. [Software Re-Engineering](https://my.uopeople.edu/pluginfile.php/1771153/mod_book/chapter/455697/SWReeng.pdf)
  - Software Re-Engineering :
    - レガシーシステムを再実装し、より保守をしやすいシステムとすることを目的とする
    - レガシーシステムの問題点
      - 大量のコードが存在する
      - メインフレーム前提で動作する
    - 維持コストが高い場合に価値のあるソリューションになる
    - 必要なアクティビティ
      - ソースコードの変換
      - リバースエンジリアリング
      - 構造の改善
      - モジュール化
      - データのリエンジニアリング
    - 28.1 Source code translation
      - ソースコードの大部分を自動翻訳できる場合に実施可能
      - 完全なものは難しく、どこかで人の手が必要になる
    - 28.2 Reverse engineering
    - 28.3 Program structure improvement
    - 28.4 Program modularisation
    - 28.5 Data re-engineering
- Sommerville, I. (2010). Chapter 30 Documentation © Ian Sommerville 2010 1 30 Documentation Objectives. <https://ifs.host.cs.st-andrews.ac.uk/Books/SE9/WebChapters/PDF/Ch_30%20Documentation.pdf>
  - ‌Software Documentation:
    - 作成が必要な文書は多岐にわたるが、大きくプロセス文書と製品ドキュメントに分けられる
    - 30.1 Process documentation
    - 30.2 Product documentation
    - 30.3 Document quality
    - 30.4 Document production

## Discussion Forum

## Written Assignment

## Learning Journal

今週のユニットで学習を行ったテーマとしては、リエンジニアリングとソフトウェアドキュメンテーションの分野が特に重要だと感じたため、これらの分野に関する私の理解を説明する。

1. リエンジニアリング
ソフトウェアのリエンジニアリングはで一番重要なことは、現在動作しているシステムをより保守のしやすい形へ再実装することである。この背景には、利用している製品の保守期限や言語有識者の不足、OSのアップグレードなど多岐にわたる要因が考えられる。これらの要因によって発生するリエンジニアリングは基本的に大規模で大変なものになりがちだと考える。UNIX上にCOBOLで実装されたアプリケーションを動作させているシステムを、Linuxアーキテクチャへマイグレーションするプロジェクトへ参加した経験があり、この対応は非常に厳しい対応であった。私自身の経験や学習を通じてリエンジニアリングに大事なポイントとしては、できるだけ自動的に実施することはもちろんだが、どのようなテストプロセスを経るのか、そして問題が発生した時の対応はどのように行うのかを明確にしておくことだと考える。
2. ソフトウェアドキュメンテーション
ソフトウェアに関するドキュメントとしては、大きくProcess documentationとProduct documentationの二つが存在する。これらの文書はどちらもプロジェクトには欠かせないものであるが重要なポイントとしては、必要な情報を含む文書をどのように陳腐化させずに維持し続けるのかという点である。プログラムに注力するあまりドキュメントは後回しとなり、実態と乖離した文書になることは常である。これらの状態を防ぐためにプロジェクトとしてどの程度の文書をどのようなプロセスで維持し続けのかが重要である。
CS2401コースは今回のユニットで最終週であり、後はGraded-testを残すのみである。今週を使って今までのユニットの復習を行い、ベストな結果を得たいと思う。
