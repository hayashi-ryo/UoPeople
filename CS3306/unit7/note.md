# unit7

- Application Development and Administration
- Advanced Querying and Information Retrieval
- Advanced Data Types and New Applications

## Goal

By the end of this Unit, you will be able to:

- Identify and describe the basic concepts of transaction processing.
- Describe advanced querying and information retrieval processes.
- Use Data Mining technics for classifying and analyzing data

ja

- トランザクション処理の基本概念を特定し、説明できる。
- 高度な問い合わせと情報検索プロセスを説明できる。
- データマイニング技術を用いてデータを分類・分析できる。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf

Read Chapters 21, 22, and 23.

Chapter 21 covers application development and administration,

この章では、データベースシステムにおけるアプリケーション開発と管理に焦点を当てています。特に、ウェブとデータベースのインターフェースに関する技術、パフォーマンス向上のためのチューニング手法、標準化の重要性について解説しています。

1. ウェブとデータベースのインターフェース
ウェブインターフェースは、ユーザーがブラウザを介してデータベースにアクセスするための重要な手段となっており、特に電子商取引や情報サービスで広く利用されています。HTMLフォームやサーバサイドスクリプティングを用いた動的なWebページ生成の利点、クエリ結果のキャッシング技術などが紹介されています。

2. パフォーマンスチューニング
システムのパフォーマンス向上には、ハードウェア、データベースパラメータ、スキーマ設計など多くの要素が関わります。特にボトルネックの特定と解消が重要であり、CPU、ディスクI/O、ロック管理などのリソース利用を最適化することが推奨されています。また、トランザクションのバッチ処理やインデックスのチューニングもパフォーマンス改善に有効です。

3. 標準化
データベースアプリケーション開発では、SQLやODBC、JDBCなどの標準が重要な役割を果たしています。これらの標準は、クライアントとデータベースシステム間の相互運用性を確保するために使用され、特に分散システムや複数のデータソースを扱う場合に有用です。

Chapter 22 covers advanced querying and information retrieval,

第22章では、データベースシステムにおける高度なクエリ処理と情報検索について解説しています。特に、ビジネスにおける意思決定支援システム、OLAP（オンライン分析処理）、データマイニング、情報検索に焦点を当てています。

1. 意思決定支援システム
企業が蓄積する膨大なデータを分析し、効果的なビジネス判断を行うための手法が説明されています。SQLだけでは表現できない複雑なクエリに対処するために、SQLの拡張機能やデータウェアハウスが活用されます。

2. OLAPとデータ分析
OLAPは、膨大なデータを即時に分析し、結果を提供するためのツールです。複雑な集計処理やクロス集計、データキューブを使った多次元分析が重要なトピックとして取り上げられています。

3. データマイニング
データマイニングでは、大規模なデータベースから自動的に有用なパターンや規則を発見する技術が紹介されています。予測モデルや分類、クラスター分析、連想ルールの発見などが具体例として説明されています。

4. 情報検索
非構造化データ（特にテキストデータ）を効率的に検索する方法について説明されています。キーワード検索やドキュメントの関連性分析、インデックス作成の手法が情報検索システムの基盤となります。

Chapter 23 covers advanced data types and new applications.
第23章では、データベースシステムにおける高度なデータ型と新しいアプリケーションについて解説されています。特に、時系列データ、空間データ、マルチメディアデータ、モバイルデータベースの4つの新しいデータタイプに焦点を当てています。

1. 時系列データ
多くのデータベースは現在の状態のみを扱うのに対し、時系列データベースは過去の状態も記録します。これにより、履歴管理や分析が可能になります。例えば、患者の医療履歴やセンサーの過去のデータなどがこれに含まれます。

2. 空間データ
空間データには、地図データやCADデータが含まれ、地理的な位置や設計情報を扱います。これらのデータを効率的に管理するために、データベースシステムには特別なインデックス構造（例：Rツリー）が必要です。

3. マルチメディアデータ
画像、音声、動画などのデータを扱うマルチメディアデータベースは、従来のファイルシステムよりも大規模データ管理に適しています。これらのデータはしばしばリアルタイムでの連続したデータ提供が求められます。

4. モバイルデータベース
モバイルコンピューティングの普及に伴い、移動中でも使用できるデータベースのニーズが高まっています。これにより、モバイルホストが一時的にネットワークから切断されても操作が可能なデータベースが必要になります。

## Discussion Forum

In Unit 7, we are introduced to the concepts of advanced database topics. For your discussion assignment: Define and discuss the advantages and disadvantages of materialized views in databases.

You must post your initial response (with references) before being able to review other student’s responses.  Once you have made your first response, you will be able to reply to other student’s posts.  You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ユニット7では、高度なデータベースのトピックについて紹介されています。今回のディスカッション課題では、データベースにおけるマテリアライズドビューの利点と欠点を定義し、議論してください。

まずは、自分の初回の投稿（参考文献を含めること）を行ってください。その後、他の学生の投稿を確認することができます。初回の投稿を行った後、他の学生の投稿に返信することが可能となります。最低3つの返信を行うことが求められています。

### Japanese Discussion

## Written Assignment

In unit seven, we are introduced to advanced database topics. For your written assignment: Using figure 22.6 classification tree construct a similar tree depicting each class of grades from the course grading scale from A to F.  Identify the classification of your preferred class grade on your grade tree.

Your response must be complete and in your own words with conclusion.

### Written Assignment Question

ユニット7では、データベースの高度なトピックが紹介されます。

今回の筆記課題では、図22.6の分類ツリーを使用して、コースの成績評価スケール（AからFまでの各成績）を示すツリーを構築してください。また、あなたが好む成績の分類をそのツリー上で特定してください。

回答は、自分自身の言葉で完結させ、結論を含めてください。

この質問に基づいて、回答を作成する際には成績評価スケールの各クラスをツリー形式で視覚的に表し、好む成績を明示した上で、その理由や結論に言及することが求められます。

### Japanese Written Assignment

導入
この課題の目的は、コースの成績評価スケール（A+からFまで）を使って、学習時間と学習効率に基づく分類ツリーを構築し、成績をどのように予測できるかを示すことです。分類ツリーは、データを効率的に分割し、最終的に各グループに適切なクラスを割り当てる手法であり、成績評価システムを視覚化するための重要なツールです。今回の課題では、週ごとの学習時間と学習効率を基準にして、成績を予測するための分類ツリーを作成し、可視化していきます。

成績の分類ツリーの構築
Silberschatzらのテキストによれば、図22.6では学歴と収入を基にした分類ツリーが紹介されています。同様に、今回は「週の学習時間」と「学習効率」を基にして成績を分類するツリーを構築します。このツリーは、学習時間を「20時間以上」「10時間から20時間」「10時間未満」の3つに分け、それぞれのカテゴリ内で「非常に効率的」「効率的」「平均的」「非効率的」の4つの効率性レベルに基づいて成績を予測します。これにより、A+からFまでの成績がどのようにツリー上で分岐するかを視覚的に表現することができます。

図1 分類ツリー
図1では、学習時間と学習効率に基づいて成績がどのように分岐するかを示しています。学習時間が多いほど高成績を得やすい一方、学習効率も成績向上に大きく影響を与えることがこの図からわかります。例えば、学習時間が少なくても非常に効率的に学習している場合はB+やA-の成績が期待される一方、学習時間が多くても非効率的な場合はC+やB-に留まることがあります。

希望する成績の特定
この分類ツリーによると、Aを取得するためには週に10〜20時間以上の学習時間を確保し、少なくとも「効率的」な学習を行うことが必要です。もし「非常に効率的」に学習できれば、学習時間が20時間に満たなくてもAやA-の成績が期待できます。このツリーを基に、私は目標達成に向けて具体的な学習スケジュールを策定し、週に少なくとも15時間を効率的に使うように計画しています。

結論
今回の課題で作成した成績分類ツリーを通じて、学習時間と学習効率が成績に与える影響を具体的に理解することができました。特に、学習時間が多くても効率性が低い場合には期待される成績に達しない可能性がある一方、効率的な学習を行うことで、学習時間が少なくても良好な成績を得ることができることが示されました。この分類ツリーは、学習の質と量のバランスを考慮して学習計画を策定する際に重要なツールとなります。

参考文献
Silberschatz, A., Korth, H. F., & Sudarshan, S. (2001). Database system concepts (4th ed.). McGraw-Hill.

## Learning Journal

Database systems are in use everywhere in our society. For your Learning Journal:

- Discuss the week's activities and your observations
- Discuss the role of the data warehouse in business intelligence
Your entry must be in your own words, with references, and 3-5 paragraphs long.

### Learning Journal Question

今週学習した内容

- トランザクション処理の基本概念を特定し、説明できる。
- 高度な問い合わせと情報検索プロセスを説明できる。
- データマイニング技術を用いてデータを分類・分析できる。

今週学習した内容について感じたこと

- トランザクション処理の基本概念については、業務上知ることが必要であったため、以前学習したことがあった。その内容についてより深く理解することができた。
- データマイニング技術については、今回初めて学習を行った。データを分類するために様々な構造を利用することは、データマイニング技術を理解する上で非常に基本的な技術であった。
  - Written Assignmentでは分類ツリーを構築するために分類を考慮することができ、非常によく理解できたと考えている。

来週学習すること

- クラウドコンピューティングの基本概念を特定し、説明すること。
- クラウドコンピューティングとモバイルアプリケーション開発におけるデータベースの影響を分析し、議論すること。
- クラウドコンピューティングの利点と欠点を比較し、議論すること。
- 最終テストに向けたReview-Quizの実施

### Japanese Learning Journal
