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
- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

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
      - イベントソースを知っていて、情報を通知する責任がある
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

問題2.31の前提:
あなたは、販売、入札、購入サービスを備えたオンライン・オークション・サイトを開発しなければなりません。購入サービスでは、ユーザーが商品を見つけ、入札し、購入し、代金を支払うことができるようにします。システムのユースケース図は以下のようになります：
シンプルなシステムを想定しているが、オークションの有効期限など、追加機能を追加することも可能である。その他の機能として、出荷ステータスを追跡できるようにするために、出荷代理店に関与することもできる。システムのクラス図を図 2-48 に示す。セラーが最高入札額を受諾し、そのアイテムだけのオークションをクローズするとき、ItemInfo は「予約済み」とマークされると仮定する。終了する前に、売り手は入札がどの程度活発かを確認し、入札を終了する前にもう少し待つかどうかを決めたいかもしれない。支払いが処理されると、その特定のItemInfoはItemsCatalogから削除されます。ユースケースCloseAuctionでは、売り手は指定されたアイテムの既存の入札をレビューし、最も高い入札を選択し、最も高い入札に関連する買い手に決定を通知します（これがユースケースCloseAuctionと買い手の間の "参加 "リンクの理由です）。選択されたアイテムに対して複数の入札があったとします。このユースケースについて、以下に示す相互作用図を完成させてください。支払いの処理は含めないでください（このユースケースについては、問題 2.8 を参照してください）。(注：問題を解くために必要であれば、図 2-48 に新しいクラスを導入したり、既存のクラスを修正したりしてもよい)。

- Publisherの前提
  - Knowing Responsibilities:
    - Knows event source(s)
    - Knows interested obj’s (subscribers) Doing Responsibilities:
    - Registers/Unregisters subscribers • Notifies the subscribers of events
  - 責任を知る：
    - イベント・ソースを知っている
    - 興味のあるオブジェクト（サブスクライバ）を知っている：
    - サブスクライバーを登録する／登録解除する - イベントをサブスクライバーに通知する

オークションで必要なメッセージとしては二つのメッセージが考えられる。
・売り手に対して新しい入札情報を通知する。
・買い手に対して自分が入札したオークションのステータス情報を通知する。

ここで、Marsicによればパブリッシャの前提は以下のように説明される。(Marsic, 2012)
Knows event source(s)
Knows interested obj’s (subscribers) Doing Responsibilities:
Registers/Unregisters subscribers • Notifies the subscribers of events

以上の条件から、パブリッシャーインターフェースとサブスクライバーインターフェースを実装するクラス二つを説明する

ItemInfo(Publisher)→BuyerInfo(Subscriber)
ItemInfoクラスのisReservedフラグがtrueになったら、サブスクライバに向けてメッセージを発出する。発出されたメッセージはBuyerInfoクラスが受け取り、売り手が新しい入札が入ったことを確認する。
BidsList(Publisher)→SellerInfo(Subscriber)
BidsListクラスは新しいBidオブジェクトがリストに追加された場合にメッセージを発出する。発出されたメッセージは→SellerInfoクラスが受け取り、商品の買い手に対してオークションのステータス情報を通知する。

現時点の実装では、商品説明文の変更や期間の変更などに対応することができないが、今回のインターフェースの実装ではこのような機能追加対応についても問題なく対応することができる。

References:
Marsic, I. (2012). Software engineering. Rutgers Unversity. <https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>

## Written Assignment

## Learning Journal

今週のユニットでは、一つのデザインパターンとしてPublisher-SubscriberパターンやCommandパターンなどについて学習しました。正直なところ今まで体系的に学習したことがなかった分野であったため時間をかけて学習を進めて行った。特に気になった事項について私の理解を説明していく。
Publisher-Subscriberパターンは、メッセージングによって間接的な通信を実現する方式です。ソフトウェアの通信をメッセージで実施する方法は、コンテナ等によるマイクロサービスアーキテクチャやwebAPIによる通信もPublisher-Subscriberの方式を進化させている内容のようにも感じた。また、Publisher-Subscriber方式を採用・実装する方針として"どのような責任をPublisherに負わせるか"や"どのようなイベントを待つクラスをSubscriberとして実装するか"など非常に実践的な内容について学習を行うことができた。Discussionで問題に取り組んだように、テキストの練習問題は最終テストに向けて学習を進めていきたい。
このクラスも来週で終了であるため、今週までのユニットで学習した内容の復習を行いこのクラスで学習した内容についてより定着させていきたい。
