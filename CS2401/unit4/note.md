# unit4

- Analysis: Building the Domain Model
  - Identifying Concepts
  - Concept Associations and Attributes
  - Domain Analysis
  - Contracts: Preconditions and Post conditions
- Design: Assigning Responsibilities
  - Design Principles for Assigning Responsibilities
  - Class Diagram
  - Why Software Engineering Is Difficult

## Goal

- By the end of this Unit, you will be able to:
  - Identify concepts of building a domain model
  - Understand the principles of domain analysis
  - Learn to create design responsibilities
  - Understand cohesion and coupling

## Task

- [x] Reading assignment
- [x] Peer assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

- Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>
  - 2.5 Analysis: Building the Domain Model
    - 2.5.1 Identifying concepts
    - 2.5.2 Concept Associations and Attributes
    - 2.5.3 Domain Analysis
    - 2.5.4 Contracts : Preconditions and Post conditions
  - 2.6 Design : Assigning Responsibilities
    - 2.6.1 Design Principles for assigning responsibilities
      - オブジェクト設計の基本指針
        - 知っている人がタスクを行うべきである
        - 通信の責任を重くしない
    - 2.6.2 Class Diagrams
    - 2.4.5, 2.6.3 - Why Software Engineering is difficult.

## Discussion Forum

Explain why it is important to model the context of a system that is being developed. Give two examples of possible errors that could arise if software engineers do not understand the system context.

システムコンテキストをモデル化することは、ソフトウェア開発者がシステムが外部環境や内部要素同士がどのような相互依存となるかを特定し、システムの要件を明確にすることに役立ちます。その結果、開発中のシステムが満たすべき要求を満たし、制約となる外部環境を満たした上で動作するように設計を進めることが可能になります。
もし、システムのコンテキスト化を行わない場合に発生する可能性のあるエラーの例を説明します。

1. システムの全ての要件を満たすことができない
システム開発に必要な要件は開発者にとってわかりやすいものだけではありません。システムのコンテキストをモデル化することで明確になる場合も多く存在します。もし要件を見逃した状態で設計・製造を行なった場合、ビジネスを適切に解決するシステムを開発することができず、工数の拡大や納期を守ることが難しい状態になる場合があります。
2. 環境制約を踏まえたシステム設計ができない
システム開発の対象範囲だけを意識すると、顧客が利用するビジネス全体にとって最適なシステムではないものが出来上がる可能性が高いです。例えば、すでに利用している他のシステムの互換性がなかったり、すでにシステム化している範囲を再度システム化してしまう事象が発生します。

結論として、外部環境や制約を含めたビジネス全体を意識したシステムを開発するためにはコンテキストのモデル化は必要不可欠なものであり、モデル化を実施しない場合ビジネスを適切に解決することができないシステムを開発してしまう可能性があります。

## Written Assignment

## Learning Journal

- 事前準備
  - GRASPパターンについて
    - General(汎用),Responsibility(責任),Assignment(割り当て),Software(ソフトウェア),Patterns(パターン)
      - 責任には2種類ある
        - Doing Responsibilitity
          - 作成や計算など何かを実施すること
          - オブジェクトのアクションを開始すること
          - 関連オブジェクトの状態をコントロールすること
        - knowing Responsibility
          - カプセル化されたオブジェクトのデータを知ること
          - オブジェクトの状態を知ること
          - オブジェクトがどのような値が計算できるが知ること
    - 全ての設計目標
      - 変化のためのデザイン
      - 理解しやすいデザイン
      - 分業しやすいデザイン
      - 再利用しやすいデザイン
    - GRASPとは全般的な責任分担ソフトウェアパターン
      - GRASPによって、オブジェクト設計や説明可能なk方法のデザインパターンを認識することができる
      - 設計原則
        - LOW REPRESENTATIONAL GAP
          - 問題に対してシステムソリューションにおけるオブジェクトを作成する
          - ドメインクラスに対して対応するリレーションシップを作成する
        - LOW COUPLING
          - モジュールはできるだけ他のモジュールに依存しないようにする
            - コンテキストの理解が不要で、メンテナンスコストが低い（変更のための設計）
          - $$ 低結合の原則は全ての設計において留意すべき重大な原則 $$
          - 結合する場合も、実装ではなくインターフェースと結合することを意識する
      - HIGH COHESION
        - モジュールは小さな責任範囲を持つべき
        - CouplingとCohesionは良いトレードオフの範囲を見つける必要がある
      - INFORMATION EXPERT
        - タスクのために必要な情報を持っているクラスに責任を割り当てる
