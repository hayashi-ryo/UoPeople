# unit2

- Requirements Engineering
- Functional and Non functional Requirements
- Software Architecture

## Goal

- By the end of this Unit, you will be able to:
  - Understand Software Requirements
  - Define functional and non functional requirements
  - Understand the Software Architecture
  - Create software requirement specifications

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>
  - Chapter 2: Object-Oriented Software Engineering
    - 2.2  Requirements Engineering
      - Requirements engineeringはビジネスの背景・顧客が真に望むもの・エンドユーザの求めるもの・ビジネスにどのような影響を与えるかを測るもの。
      - 一番最初に問題の定義から開始する
      - 設計者や開発者は機能を効果的に実装するか、を重要視する
      - 顧客はコストやスケジュールを重要視する
      - 要件記述書は顧客が開発を希望するシステムの能力を正確に記述することを意図する
    - 2.3  Software Architecture

## Discussion Forum

- From your point of view, describe the strengths and weaknesses of users during the requirements elicitation activity. Describe also the strengths and weaknesses of developers during the requirements elicitation activity.
- 要件抽出活動におけるユーザ・開発者の長所と短所を説明します。説明にあたりユーザと開発者の立場についても明確にします。
  - ユーザ
    - システムを直接利用して、ビジネスに価値を生みだすために何らかの作業を実施する人のこと
    - 強み
      - 解決したい問題を一番理解している
      - システムを実際に利用する場合の実現性うや使いやすさについてを把握し、修正案を定時できる
      - システムが解決したいドメインだけではなく、取り巻く環境全体を含めた知識を持っている
    - 弱み
      - 技術的な理解が弱い
      - 達成したい目標について、システム化するための明確な目標を出すことが苦手である
      - 利用者や担当業務によってシステムに対する偏見がある場合がある
  - 開発者
    - ユーザが解決したい問題を対話によって理解し、システムやソフトウェアの開発を行う人のこと
      - 強み
        - 技術的な理解が深く、システムの実現可能性や実装について会話ができる
        - 要件を分析し、システムが技術的負債とならないか判断できる
        - 要件に応じて代替となる解決案を提案できる
      - 弱み
        - ドメインに関する知識が限られている
        - 技術的実現性に焦点を当てすぎる可能性がある
        - ユーザとのコミュニケーションがうまくできず、重要な要件の見落としやずれが発生する場合がある

## Written Assignment

Consider the following nonfunctional requirements and determine which of them can be verified and which cannot. Write acceptance tests for each requirement or explain why it is not testable.

“The user interface must be user-friendly and easy to use.”
“The number of mouse clicks the user needs to perform when navigating to any window of the system’s user interface must be less than 10.”
“The user interface of the new system must be simple enough so that any user can use it with a minimum training.”
“The maximum latency from the moment the user clicks a hyperlink in a web page until the rendering of the new web page starts is 1 second over a broadband connection.”
“In case of failure, the system must be easy to recover and must suffer minimum loss of important data.”

“The user interface must be user-friendly and easy to use.”
  要件が主観的ではあるが検証は可能である。受け入れテストとしてユーザが実際にシステムを利用し、アンケートなどを通じてフィードバックを受ける形で実施する。
“The number of mouse clicks the user needs to perform when navigating to any window of the system’s user interface must be less than 10.”
  検証可能である。受け入れテストとしてシステムを利用する一覧の作業を実施し、タスク実行にかかるクリック数を記録する。記録したクリック数と要件の比較を実施する。
“The user interface of the new system must be simple enough so that any user can use it with a minimum training.”
  要件が主観的ではあるが検証は可能である。受け入れテストとしてユーザが実際にシステムを利用し、新プリなものであるかをアンケートなどを通じてフィードバックを受ける形で実施する。
“The maximum latency from the moment the user clicks a hyperlink in a web page until the rendering of the new web page starts is 1 second over a broadband connection.”
  検証可能である。webページを実際に開く際にかかる時間を記録し、要件との比較を実施する。
“In case of failure, the system must be easy to recover and must suffer minimum loss of important data.”
  検証は実施不可能である。実際のシステムで想定された障害を発生させ、システム復旧時間やデータ損失を計測することは難しい場合が多い。実施する場合は、設計情報などからシミュレーションとして実施する形となる想定だ。

“The user interface must be user-friendly and easy to use.”
  Although the requirements are subjective, verification is possible. Acceptance testing is conducted in the form of users actually using the system and receiving feedback through questionnaires, etc.
“The number of mouse clicks the user needs to perform when navigating to any window of the system’s user interface must be less than 10.”
  Verifiable. Perform a list of tasks that will use the system as an acceptance test and record the number of clicks required to execute the task. Compare the number of clicks recorded with the requirements.
“The user interface of the new system must be simple enough so that any user can use it with a minimum training.”
  Although the requirements are subjective, they can be verified. Acceptance testing is conducted by having users actually use the system and receiving feedback through questionnaires and other means to determine whether the system is new and complete.
“The maximum latency from the moment the user clicks a hyperlink in a web page until the rendering of the new web page starts is 1 second over a broadband connection.”
  Verifiable; record the time it takes to actually open a web page and compare it to the requirements.
“In case of failure, the system must be easy to recover and must suffer minimum loss of important data.”
  Verification is not feasible. In many cases, it is difficult to measure system recovery time and data loss by causing failures that are assumed to occur in actual systems. If this is done, it is assumed that it will be done as a simulation based on design information.

## Learning Journal

今週のユニットでは、要求分析フェーズにおけるタスクやソフトウェアアーキテクチャに関する事項について学んだ。特に重要な学びがあった要求分析について私の理解を説明します。
要求分析では、解決したい課題・問題を解決するための方法を具体化するために、「どのようなアーキテクチャを実装するか」「機能としてどのようなものを具備するか」などを詳細化します。このフェーズで重要なのは「ユーザ」と「開発者」という二つのステークホルダーが存在することです。このようなステークホルダーが存在することで、現実の問題を解決するためのシステムの仕様を決めることができます。
しかし、ユーザと開発者はそれぞれできる一番気にする部分が違います。そのため、システム開発を
円滑に行うために適切なコミュニケーションが必要です。
