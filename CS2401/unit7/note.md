# unit7

- Indirect Communication : Publisher-Subscriber
- More Patterns
- Information Security

## Goal

- By the end of this Unit, you will be able to:
  - Understand Design patterns by Publisher-Subscriber pattern example
  - Learn about different kinds of patterns like command, state, decorator, proxy
  - Learn about Cryptography and other information security techniques

## Task

- [x] Peer assessment
- [ ] Reading assignment
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Learning Journal
- [ ] Take Self-Quiz
- [ ] Take Graded-Quiz

## Reading Assignment

- Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>
  - Chapter 5 Design with Patterns
    - デザインパターンは開発者が一般的に利用するソフトウェア設計の便利な方法
    - 類似の問題からレシピを再利用すること
    - 効果的な設計方法を見つけだすことはソフトウェアエンジニアングの重大なテーマ
    - 同じ名前をつけていくことが困難であるため、類似の解決策が複数存在することがある
  - 5.1 Indirect Communication : Publisher-Subscriber
    - ソフトウェア間の間接的な通信を実装するために利用される
      - 基本的にオブジェクトが呼び出し先の情報をあまり知らない場合(よく秘匿された状態)の時に利用する
    - パブリッシャー
      - イベントスースを知っていて、情報を通知する責任がある
    - サブスクライバ
      - どのような情報が欲しいのかを知り、受信イベントを処理する責任がある
      - パブリッシャへの登録・解除の責任がある
    - 5.1.1  Applications of Publisher-Subscriber
    - 5.1.2 Control Flow
    - 5.1.3  Pub-Sub Pattern Initialization
  - 5.2 More Patterns
    - 5.2.1  Command
      - ユーザのアクションがロールバックできることがエレガントな実装パターン
    - 5.2.2  Decorator
      - 主要オブジェクトに対する非必須どうあを追加するために利用する
    - 5.2.3  State
    - 5.2.4  Proxy
  - 5.5   Information Security
    - 5.5.1  Symmetric and Public Key Cryptosystems
    - 5.5.2  Cryptographic Algorithms
    - 5.5.4  Program Security

## Discussion Forum

Consider the online auction site described in Problem 2.31 (Chapter 2, Page no 165). Suppose you want to employ the Publish-Subscribe (also known as Observer) design pattern in your design solution for Problem 2.31. Which classes should implement the Publisher interface? Which classes should implement the Subscriber interface? Explain your answer. (Note: You can introduce new classes or additional methods on the existing classes if you feel it necessary for solution.).
問題 2.31 (第 2 章 165 ページ) で説明したオンライン・オークション・サイトを考えてみましょう。問題 2.31 の解決策として、Publish-Subscribe (Observer とも呼ばれる) デザイン・パターンを採用したいとします。どのクラスが、Publisher インターフェースを実装する必要がありますか? Subscriber インターフェースを実装するクラスはどれですか? 答えを説明してください。(注意: 解答のために必要であれば、新しいクラスや既存のクラスに追加のメソッドを導入してもかまいません)。

## Written Assignment

## Learning Journal
