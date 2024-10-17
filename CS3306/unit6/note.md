# unit6

- Transaction-Processing Monitors
- Transactional Workﬂows
- Main-Memory Databases
- Real-Time Transaction Systems
- Long-Duration Transactions
- Transaction Management in Multidatabases

- トランザクション処理モニタ
- トランザクションワークフロー
- メインメモリデータベース
- リアルタイムトランザクションシステム
- 長時間トランザクション
- マルチデータベースにおけるトランザクション管理

## Goal

main

- Identify and describe the basic concept of  Transaction Processing.
- Use Workﬂows as tools for planning Transaction Processes.
- Analyze and plan Transaction Processes.

ja

- トランザクション処理の基本概念を特定し、説明できる。
- トランザクション処理の計画にワークフローをツールとして使用できる。
- トランザクション処理を分析し、計画できる。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [ ] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf

Read Chapter 24: Advanced Transaction Processing. The chapter covers advanced transaction-processing concepts, including transaction-processing monitors, transactional workflows, main-memory databases, real-time databases, long duration transactions, nested transactions, and multidatabase transactions.

## Discussion Forum

In Unit 6, we are introduced to the concepts of transaction processing. Figure 24.4 (Chapter 24 of this week's reading) depicts the workflow for loan processing which shows flows for the load application and which accept or reject being the possible outcomes.

For your discussion assignment: Using a tool of your choice draw and label a workflow which depicts a student submitting an assignment to the professor and the possible outcomes.

You must post your initial response (with references) before being able to review other student’s responses.  Once you have made your first response, you will be able to reply to other student’s posts.  You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ユニット6では、トランザクション処理の概念が紹介されています。今週のリーディングの第24章にある図24.4は、ローン処理のワークフローを示しており、ローン申請の流れと、受理または拒否が結果として出る可能性があることを表しています。

ディスカッション課題では、ツールを選んでワークフローを描き、学生が教授に課題を提出する流れと、考えられる結果をラベル付けして示してください。

最初の回答（参考文献付き）を投稿するまで、他の学生の回答を確認することはできません。最初の回答を行った後、他の学生の投稿に返信することができるようになります。最低でも3つの他の学生の投稿に対して返信することが求められています。

### Japanese Discussion

導入
ワークフローは、複数のタスクを調整しながら実行する活動を指します。トランザクション処理においては、ワークフローがデータの一貫性を維持し、システムの正常な動作を確保する重要な役割を果たします。今週のリーディングに示されている図24.4は、ローン処理のワークフローを示しており、ローン申請の流れと、受理または拒否という結果がどのように導かれるかを表しています。同様に、今回の課題では、学生が課題を教授に提出する過程とその結果を描くワークフローを考察します。

ワークフローの説明
学生が教授に課題を提出する過程にはいくつかのステップが存在します。このワークフローでは、以下のような段階が含まれます：

1. 課題の提出: 学生がオンラインプラットフォームを通じて課題を提出します。
2. 課題の受領確認: 教授はシステムで課題の提出を確認します。
3. 課題のレビュー: 教授が提出された課題を確認し、評価を行います。この段階では、課題の内容に基づき、教授は承認、修正の要求、または拒否の判断を下します。
4. 結果の通知: 学生は教授からのフィードバックを受け取ります。結果として以下の3つのシナリオが考えられます

- 承認: 課題が満足いくものであれば、そのまま承認されます。
- 修正要求: 課題に修正が必要と判断された場合、学生は再提出を求められます。
- 拒否: 課題が不十分と判断された場合、提出が拒否されます。

ワークフロー図
このワークフローを視覚化するために、以下の図を使用して説明します。

ステップ1: 学生が課題を提出する。
ステップ2: 教授が課題を受領する。
ステップ3: 教授が課題を評価する（このステップで「承認」「修正要求」「拒否」のいずれかが決まる）。
ステップ4: 学生に結果が通知される。
これらのステップは、課題提出システムにおける典型的なトランザクション処理の流れに対応しており、各ステップには対応する結果があります。ワークフロー図は、オンラインツール（例：Lucidchart）を使用して描画し、各ステップと結果にラベルを付けて示すことができます。

結論
このワークフローは、学生と教授の間で行われる課題提出と評価のプロセスを効率的に管理する手段を提供します。特に、トランザクション処理の原則に基づき、各ステップでのデータの一貫性と処理結果の確定が重要な役割を果たします。このようなワークフローは、教育機関におけるデジタル化されたプロセスの例であり、効率的な情報の流れを保証します。

## Learning Journal

Database systems are in use everywhere in our society. For your Learning Journal:

- Review your week's activities and your observations.
- Discuss one example of a transaction that you engaged in within the past month and what database the data was stored in.
Your entry must be in your own words, with references, and 3-5 paragraphs long.

### Learning Journal Question

データベースシステムは、私たちの社会の至る所で使用されています。

- 今週の活動や観察したことを振り返りましょう。
- ここ1か月以内に自分が関わったトランザクションの具体例を1つ挙げ、そのデータが保存されたデータベースについて話し合ってください。
回答は自分自身の言葉で書き、参考文献を含めて、3～5段落で記述する必要があります。

### Learning Journal Memo

今週学習した内容

- トランザクション処理の基本概念を特定し、説明できる。
- トランザクション処理の計画にワークフローをツールとして使用できる。
- トランザクション処理を分析し、計画できる。

今週のテキスト

- Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.).

今週学習した内容について感じたこと

- トランザクション処理がどのような目的で設計され、どのような事象を防ごうとしているのかを把握することができた。
- トランザクション処理の計画に必要な要素を、ワークフローを利用して整理することができるようになった。
- 現在動作しているトランザクション処理を分析して、改善したものをテキストを利用して計画できるようになった。

来週学習すること

- トランザクション処理の基本概念を識別し、説明することができる。
- 高度な問い合わせと情報検索プロセスを説明することができる。
- データの分類と分析にデータマイニング技術を使用することができる。

### Japanese Learning Journal

1. 今週の活動の概要
今週は、トランザクション処理の基本概念を特定し、説明することが主な学習目標でした。また、トランザクション処理の計画におけるワークフローの活用法を学び、実際のビジネスプロセスにおけるトランザクション処理を分析し、改善するためのスキルを身に付けました。このように、トランザクション処理がデータの一貫性や効率をどのように維持するかを理解することができました。

2. トランザクション処理の理解とワークフローの活用
今週の学習を通じて、トランザクション処理がデータベースシステムにおける信頼性と効率性を確保するためにどのように設計されているかを深く理解することができました。特に、トランザクションがACID特性（Atomicity、Consistency、Isolation、Durability）を通じてデータの整合性を保つ重要性を実感しました。例えば、テキストによれば、トランザクション処理は「失敗が発生する可能性がある環境でも、ACID特性を確保するために設計されている」（Silberschatz, Korth, & Sudarshan, 2001, p. 884）とされています。
また、ワークフローを利用してトランザクション処理の計画を立てることで、複数のタスクがどのように連携し、効率的に進行するのかを可視化することができました。特に、ローン申請や注文処理など、複雑なプロセスにおいて、この手法が非常に有効であると感じました。

3. トランザクションの具体例とデータベース
ここ1か月で関わったトランザクションの具体例として、先日Amazonで商品を購入した経験があります。この購入手続きでは、私が選んだ商品がカートに追加され、支払いが完了した後、購入データがAmazonのデータベースに保存されました。Amazonは膨大な数のトランザクションを日々処理していますが、これもまたACID特性を通じてデータの一貫性を維持している一例です。このトランザクションでは、支払いが処理される前に在庫確認が行われ、成功した時点で支払いが確定されました。

4. 今週の学習に対する感想
トランザクション処理について学んだことで、ビジネスシステムがどのようにして効率とデータの整合性を確保しているかをより深く理解できました。また、ワークフローを用いることで、複雑なプロセスを整理し、より効果的に計画を立てることができるという点も実感しました。特に、Amazonのような大規模なECサイトでのトランザクション処理の重要性がよく理解できました。

5. 来週の目標と今後の課題
来週は、トランザクション処理の高度なクエリ処理やデータマイニング技術を使ったデータの分類と分析について学習する予定です。これに伴い、より複雑なワークフローやデータベース管理の詳細な概念を理解することが今後の課題となります。特に、トランザクション処理の最適化についてさらに深く学びたいと考えています。
