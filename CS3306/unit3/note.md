# unit3

- Building and maintaining applications
- Administering database systems

## Goal

main

- Analyze issues in building applications.
- Describe processes for administering database systems.
- Apply knowledge to the Electronic commerce (E-commerce) field

ja

- アプリケーション構築における問題を分析する。
- データベースシステムの管理プロセスを記述する。
- 電子商取引(Eコマース)分野に知識を応用する

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at <https://my.uopeople.edu/pluginfile.php/1893722/mod_book/chapter/526903/Database%20System%20Concepts%204th%20Edition%20By%20Silberschatz-Korth-Sudarshan.pdf>

Read Chapter 21; it covers a number of issues in building and maintaining applications and administering database systems.
The chapter first outlines how to implement user interfaces, in particular Web-based interfaces. Other issues such as performance tuning (to improve application speed), standards issues in electronic websites.

## Discussion Forum

In Unit 3, we discussed the concepts of Database systems.
For your discussion assignment:
List three ways in which caching can be used to speed up Web server performance.
You must post your initial response (with references) before being able to review other student’s responses. Once you have made your first response, you will be able to reply to other student’s posts. You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ユニット3では、データベースシステムの概念について学びました。

ディスカッション課題として以下の質問に答えてください： Webサーバーのパフォーマンスを向上させるために、キャッシュを利用する3つの方法を挙げてください。

最初の回答（参考文献を含む）を投稿した後で、他の学生の回答を見ることができます。最初の回答を行った後、他の学生の投稿に返信できるようになります。最低でも3つの他の学生の投稿に対して返信することが求められます。

### Japanese Discussion

クラスメートの皆さん、こんにちは。今回の質問に対する私の理解を説明します。

1. 序論
キャッシングとは、データやリクエストの結果を一時的に保存し、次回以降の同様のリクエストに対して迅速に応答する技術です。これにより、Webサーバーの処理負荷を軽減し、パフォーマンスを向上させることができます。特に、データベースシステムやWebアプリケーションでは、キャッシュを効果的に利用することで、応答時間の短縮やサーバーのスループット向上が実現できます（Gupta & Kumar, 2016）。

2. キャッシュの活用法
ブラウザキャッシュ
ブラウザキャッシュは、クライアント側でキャッシュを保存することで、同じWebページやリソースを再度サーバーから取得する必要をなくす方法です。たとえば、画像やスタイルシートなどの静的リソースをキャッシュすることで、次回のアクセス時にデータの再取得を省略でき、サーバーへのリクエスト数を減らし、全体的な負荷を軽減します。

データベースキャッシュ
データベースキャッシュは、サーバー側で頻繁にアクセスされるデータやクエリ結果をメモリにキャッシュする方法です。これにより、同じクエリが繰り返し実行される場合、データベースへのアクセスを避け、キャッシュされた結果を直接返すことで、クエリ処理の速度が大幅に向上します（Alam et al., 2018）。この方法は、特に読み取り中心のアプリケーションで効果的です。

コンテンツデリバリネットワーク（CDN）キャッシュ
CDNキャッシュは、物理的に分散したサーバーで静的コンテンツをキャッシュし、ユーザーの地理的な位置に応じて最も近いサーバーからコンテンツを提供する方法です。これにより、データ伝送の遅延を減少させ、ユーザーに高速な応答を提供します（Wang et al., 2020）。特に、グローバルにアクセスされる大規模なWebサービスでは、CDNを利用することでトラフィックを分散し、サーバーの負荷を大幅に軽減することが可能です。

3. キャッシュの課題と注意点
キャッシュは強力なパフォーマンス向上手段ですが、いくつかの課題もあります。たとえば、キャッシュの更新が適切に行われないと、古いデータが表示され続ける可能性があり、ユーザーに誤った情報を提供してしまうリスクがあります。また、キャッシュの無効化や期限切れのタイミングを適切に設定しないと、パフォーマンス向上の恩恵を十分に得ることができません。

4. 結論
キャッシュ技術を適切に使用することで、Webサーバーのパフォーマンスは劇的に向上します。ブラウザキャッシュ、データベースキャッシュ、CDNキャッシュなど、さまざまなキャッシュ戦略を組み合わせることで、ユーザーに対してより迅速で効率的なサービスを提供でき、サーバーの負荷を分散させることが可能です。ただし、キャッシュの管理には注意が必要で、適切な更新や無効化のタイミングを設定することが重要です。

参考文献
Alam, M., Chowdhury, M., & Islam, M. (2018). Performance evaluation of database caching strategies in web applications. International Journal of Computer Applications, 182(42), 1-8. <https://doi.org/10.5120/ijca2018907551>
Gupta, A., & Kumar, R. (2016). A review on improving web performance through caching techniques. International Journal of Computer Applications, 146(4), 5-9. <https://doi.org/10.5120/ijca2016909873>
Wang, Z., Yin, L., & Zhang, Y. (2020). CDN caching and load balancing in cloud-based web services: A performance perspective. IEEE Transactions on Cloud Computing, 8(2), 438-450. <https://doi.org/10.1109/TCC.2019.2924612>

## Learning Journal

Database systems are in use everywhere in our society. Discuss how they are used in E-Commerce and demonstrate with some sites you have accessed lately and for what purpose.
Your entry must be in your own words, with references, and 3-5 paragraphs long.

### Learning Journal Question

データベースシステムは、私たちの社会のあらゆる場所で使用されています。Eコマースでどのように使用されているかを議論し、最近アクセスしたいくつかのサイトとその目的を示してください。回答は自分の言葉で書き、参考文献をつけて、3～5段落にまとめてください。

### Japanese Learning Journal

1. 導入
データベースシステムは、Eコマースにおけるデータ管理の基盤として不可欠な役割を果たしています。現代のオンラインショッピングでは、膨大な量の顧客情報や商品データを効率的に処理し、リアルタイムで提供することが求められます。データベースを活用することで、Eコマースサイトは取引情報の管理、在庫管理、顧客の購買履歴の追跡を行い、効率的かつ安全にサービスを提供しています。最近の研究でも、データベースシステムはEコマースの成長において重要な要素であることが指摘されています (Chaffey, 2019)。

2. ショッピングカートや在庫管理
Eコマースにおいて、データベースは顧客のショッピングカートや商品の在庫情報をリアルタイムで管理します。例えば、Amazonのような大規模なオンラインショップでは、顧客がカートに追加した商品情報がすべてデータベースに保存され、どの顧客がどの商品を購入する予定なのかが即座に追跡されます。また、在庫の状況もデータベースを通じてリアルタイムで更新され、顧客に在庫切れの商品を誤って販売するリスクを軽減しています (Laudon & Traver, 2020)。私は最近、楽天市場を利用して電子機器を購入しましたが、これもショッピングカート機能を通じてスムーズに行われました。こうしたシステムが、Eコマースサイトでの効率的な購入体験を支えています。

3. 顧客情報管理とセキュリティ
データベースシステムは、顧客の個人情報や購入履歴の管理にも利用されています。Eコマースサイトは、顧客が一度入力した情報（名前、住所、支払い情報など）をデータベースに保存し、再度の購入時に効率的に取り出すことができます。このように、顧客データの安全かつ効率的な管理が行われる一方で、セキュリティ対策も非常に重要です。最近の研究では、データの暗号化やアクセス制御が、顧客のプライバシー保護において重要な役割を果たしていることが示されています (Stair & Reynolds, 2018)。例えば、クレジットカード情報や住所などのセンシティブな情報は、データベース上で暗号化され、外部からの不正アクセスを防ぐために多層のセキュリティが施されています。最近アクセスしたサイトの中では、PayPalを使った支払いが可能なEtsyで、こうした安全なデータ管理の恩恵を受けた例があります。

4. マーケティングとパーソナライズ
データベースは、Eコマースサイトにおけるマーケティングやパーソナライズにも大きく寄与しています。データベースを活用することで、顧客の過去の購入履歴や閲覧履歴をもとに、個々のユーザーに最適化された広告や商品提案を行うことが可能です。たとえば、YouTubeでは、私が検索した商品や閲覧した動画に基づいて、興味に合わせた広告が表示されます。これは、データベースがユーザーごとの行動履歴を分析し、最適な広告を提供しているからです (Turban et al., 2021)。Eコマースサイトがこうしたパーソナライズされたサービスを提供することで、顧客の購入意欲を高め、売上を向上させる効果が期待されます。

5. 結論
データベースシステムは、Eコマースの中核を成す技術であり、取引情報の管理、顧客データのセキュリティ、そしてパーソナライズされたマーケティングに不可欠です。今後も、データベース技術の進化により、より高度なパーソナライズやデータ管理が期待されており、Eコマースはさらに利便性と安全性が向上するでしょう。データベースの役割がますます重要になる中、消費者としてもその恩恵を感じる機会が増えていくでしょう。

参考文献 (References)
Chaffey, D. (2019). Digital business and e-commerce management: Strategy, implementation and practice (7th ed.). Pearson.
Laudon, K. C., & Traver, C. G. (2020). E-commerce 2020-2021: Business, technology and society (16th ed.). Pearson.
Stair, R., & Reynolds, G. (2018). Principles of information systems (13th ed.). Cengage Learning.
Turban, E., King, D., Lee, J. K., Liang, T. P., & Turban, D. C. (2021). Electronic commerce 2021: A managerial and social networks perspective (10th ed.). Springer.
