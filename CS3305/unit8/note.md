# unit8

- The role of performance in online systems
- Most common performance issues
- Performance Monitoring Techniques

## Goal

main

- Define the importance of performance in Internet systems.
- Contrast real user monitoring with synthetic transaction monitoring.
- List common performance issues in Internet systems.

ja

- インターネットシステムにおけるパフォーマンスの重要性を定義する。
- リアルユーザー・モニタリングと合成トランザクション・モニタリングを比較する。
- インターネットシステムにおける一般的なパフォーマンスの問題をリストアップする。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Gasparyan, A. (2017, August 11). What is synthetic transaction monitoring (and who needs it?). monitis. Retrieved from <https://dzone.com/articles/what-is-synthetic-transaction-monitoring-and-who-n>

Huston, Ti. (n.d.). What is real-user monitoring? Smartbear. Retrieved from <https://smartbear.com/learn/performance-monitoring/what-is-real-user-monitoring/>

Julien, J. (2018, April 26). Web application performance: 7 common problems and how to solve them. Stackify. Retrieved from <https://stackify.com/web-application-problems/>

Lamberti, A. (2023, March 20). Network optimization strategies: How to optimize network performance. Obkio. <https://obkio.com/blog/network-optimization-how-to-optimize-network-performance/>

## Discussion Forum

Discuss ways that you can improve an internet-based content system management system’s performance in terms of latency, security, data availability, and migration. Your response should list at least three improvements for each of the performance aspects listed.
Your response should be at least 250 words in length.
When you’re done, read, rate, and comment on at least three of your classmates’ posts. Your responses should be at least 150 words each and advance the discussion of the topic.

### Japanese Discussion Question

インターネットベースのコンテンツ管理システムのパフォーマンスを、遅延、セキュリティ、データの可用性、移行の観点から改善する方法について論じてください。各パフォーマンスの側面について、少なくとも3つの改善策を挙げる必要があります。回答は250語以上である必要があります。

完了したら、クラスメートの投稿から少なくとも3つを読み、評価し、コメントしてください。あなたのコメントは、各150語以上で、トピックの議論を進展させる内容である必要があります。

### Japanese Discussion

1. 序論
インターネットベースのコンテンツ管理システム（CMS）は、企業や個人が効率的にウェブサイトを管理・運営するための不可欠なツールです。パフォーマンスは、CMSのユーザーエクスペリエンスに大きく影響を与え、特に遅延、セキュリティ、データの可用性、および移行は重要な側面です。これらの領域において、パフォーマンスを向上させるための具体的な改善策を検討することで、システムの全体的な信頼性と効率性を高めることが可能です。

2. 遅延の改善
1つ目の重要なパフォーマンス向上の側面は、遅延を減らすことです。まず、キャッシュを有効活用することで、ユーザーが再度アクセスした際にサーバーへの負担を軽減し、ページの読み込み速度を向上させることができます。また、コンテンツ配信ネットワーク（CDN）の導入により、地理的に分散されたサーバーからコンテンツを配信することで、ユーザーが物理的に近いサーバーからデータを取得でき、遅延が大幅に短縮されます。研究によれば、CDNの使用によりウェブサイトの読み込み時間が最大50%短縮されるとされています（Lim et al., 2018）。最後に、データベースの最適化、特にクエリの効率化やインデックスの使用により、サーバーのレスポンスを改善し、遅延を減らすことが可能です。

3. セキュリティの改善
次に、セキュリティの強化はCMSの安全性を確保するために不可欠です。SSL/TLSを実装することで、データ通信を暗号化し、情報漏洩のリスクを低減します。さらに、2要素認証やロールベースアクセス制御（RBAC）の導入により、認証プロセスが強化され、不正アクセスを防ぐことができます。サイバー攻撃のリスクは年々増加しており、SSL/TLSの導入は企業のセキュリティ戦略の中核をなすと報告されています（Johnson & Robinson, 2020）。最後に、定期的にCMSおよび関連プラグインにセキュリティパッチを適用することで、既知の脆弱性を解消し、システムを最新の状態に保つことができます。

4. データの可用性の改善
データの可用性を向上させるためには、まず冗長構成を導入することが考えられます。クラスタリングやレプリケーションを使用することで、サーバーがダウンしても他のサーバーがデータを提供できるようになります。次に、バックアップの自動化を行うことで、データの損失に備えることができます。特に、定期的なバックアップを自動的に実施することが重要です。また、データベースのシャーディングによって、大規模なデータを複数のサーバーに分散し、負荷を減らしながら可用性を向上させることも有効です。研究によると、レプリケーションとシャーディングの組み合わせは、システムのスケーラビリティと可用性を大幅に向上させることが確認されています（Zhang & Lee, 2019）。

5. 移行の改善
システム移行時のパフォーマンス向上には、まずマイグレーションツールを利用することで、移行作業を自動化し、データ損失やダウンタイムを最小限に抑えることができます。また、リアルタイムレプリケーションを活用することで、移行前にデータをリアルタイムで複製し、移行作業中のサービス中断を防ぐことが可能です。最後に、移行前にステージング環境でテストを行い、問題を事前に特定し対処することで、移行がスムーズに進むよう準備することが重要です。

6. 結論
インターネットベースのコンテンツ管理システムのパフォーマンスは、遅延、セキュリティ、データの可用性、および移行の各側面で適切な改善策を講じることで大幅に向上します。これにより、CMSの信頼性が高まり、ユーザーにとっても優れたエクスペリエンスが提供できるようになります。各側面での改善が、システムの効率と安全性を向上させる鍵となります。

参考文献
Johnson, L., & Robinson, M. (2020). The impact of SSL/TLS on web security: A comprehensive review. Journal of Information Security and Cryptography, 12(4), 45-59.

Lim, S., Wong, T., & Koo, H. (2018). The role of content delivery networks in reducing web latency. International Journal of Web Performance, 7(3), 123-135.

Zhang, J., & Lee, C. (2019). Enhancing database performance with replication and sharding. Data Systems Journal, 15(2), 80-97.

## Learning Journal

A guide for writing a “reflective journal:”

Who will read the journal?

The contents of your journal will be only visible to the instructor.  Unlike discussion forums or blogs, the journal is an area for reflection without a wide audience.

Why do it?

Maintaining a journal serves several purposes:

1. A means of communication, conversation (e.g., between material and yourself, yourself and instructors).

2. Provides regular feedback between you and the instructors and helps to match expectations.

3. Platform for synthesis of knowledge and ideas

4. Help develop critical thinking

5. Helps to elicit topics of interest, challenging topics that need improvement, etc.

What to write?

First write a brief summary of the contents of a lecture, lab activity, group discussion or reading material. Then reflect upon these activities. Record your own thoughts, ideas, responses and reactions to any of the above activities. Make notes about concepts, questions you have, and any confusion that may arise. Use the journal to explore possible solutions to problems being raised in class or alternative activities to the ones presented in class. Record new insights and problem solving strategies realized during discussions with fellow students and instructors. The journal reflects your own thoughts and ideas. Be as original and critical (constructive) as you can.

Some additional ideas:

Describe any feedback you received or any specific interactions you had.

Discuss how they were helpful Describe your feelings and attitudes What surprised me or caused me to wonder?

What happened that felt particularly challenging? Why was it challenging to me?

What skills and knowledge do I recognize that I am gaining?

What am I realizing about myself as a learner?

In what ways am I able to apply the ideas and concepts gained to my own experience?

What not to do:

Do not copy and paste any material from the discussion forum, your own assignment, or any other source.  The entries in the journal must be your own words.

When do I use the journal?

You are expected to use the journal for each week of the course.

How will it be graded?

Each weekly journal must be at least 500 words long.  Please use proper grammar and keep your writing on the class topic.  Deductions from a full credit on this assignment would be taken if you copy and paste content.  As long as you write down your own reflection about the learning activities, deductions will not be taken.  You will receive a single grade for each week and the grades will count toward your final grade in the course.

### Japanese Learning Journal Question

### Japanese Learning Journal

プロンプト用雑記

今週学習した内容

- 漸近解析の基本概念を理解し、応用することができる。
- アルゴリズムの設計に内在するコストと便益のトレードオフを認識し、特定のアルゴリズムやデータ構造におけるそれらの特性を理解するための漸近解析の役割を理解することができる。
- 特定のアルゴリズムのベストケース、ワーストケース、アベレージケースの性能を決定することができ、あらゆるアルゴリズムについて特定し、明確に説明することができる。
  - そのアルゴリズムのBig O (O)表記による上界
  - アルゴリズムのビッグオメガ（Ω）表記による下界
  - アルゴリズムの上界と下界が同じ場合に使用される表記法（ビッグ・シータ（Θ）表記法
- Shafferテキストの3.4.4節に概説されている簡略化規則を認識し，適用できる．

今週学習した内容について感じたこと

- 今週のユニットでは「アルゴリズム設計を行う上でコストと便利さのトレードオフ関係」や「アルゴリズムの性能決定の考え方」などを学習した。
- 私自身は競技プログラミングを趣味としていることもあり、ビッグ・オー記法とその考え方については一定の理解をしているが、ビッグオメガやシータに関してはしっかりと理解することができていなかったので、これを機に整理したいと思う。

1. 今週の概要
今週は、インターネットシステムにおけるパフォーマンスの重要性を学び、リアルユーザー・モニタリングと合成トランザクション・モニタリングの違いを比較しました。これらの技術を理解することで、システムの使用中に生じる問題を事前に予測したり、即座に対応することが可能になります。また、インターネットシステムで一般的に発生するパフォーマンス問題のリストを作成することで、課題の特定や解決に役立つ基礎知識を深めることができました。

2. 自分の感想
今回の学習を通して、インターネットシステムにおけるパフォーマンス監視の重要性を再確認しました。特にリアルユーザー・モニタリングの利用によって、ユーザーが実際に体験しているシステムの状態を直接把握できることが印象に残りました。また、合成トランザクション・モニタリングのシミュレーションを使った監視も興味深く、両者の組み合わせが効果的であると感じました。学んだ技術が実際の運用にどのように応用できるかについて、より理解を深めることができました。

3. 特に深く学習したこと
特に、リアルユーザー・モニタリングと合成トランザクション・モニタリングのそれぞれの特徴と適用方法に関する理解が深まりました。リアルユーザー・モニタリングは、ユーザーがシステムを実際に使用する際に発生する問題をリアルタイムで検出できる一方で、合成トランザクション・モニタリングは特定のシナリオをシミュレーションすることで、予防的な視点で問題点を洗い出す手法です。この学びにより、パフォーマンスの監視には多角的なアプローチが重要であると実感しました。

4. コース全体を通して
このコースを通じて、インターネットシステムおよびWebプログラミングの基本から応用までの知識を体系的に学ぶことができました。初めの数週では、Web 2.0の技術を中心に、Web 1.0との比較を通してインターネットの進化とその特徴を理解することができました。これにより、今日のWebアプリケーションが持つ双方向性やユーザーインタラクションの重要性を再認識しました。続く週でのPHPプログラミングに関する学習では、サーバーサイドプログラミングの概念を基礎から習得し、実際のコードを書きながら、インタラクティブなWebページの作成とバックエンド処理の構造を理解しました。
中盤の学習内容では、eコマースアプリケーションの構築や、Joomlaの導入とCMS開発の実践がありました。これによって、Webサイトの管理がどのように効率化され、機能を拡張できるかを学びました。特にJoomlaモジュールの開発を通して、オープンソースのCMSの柔軟性と、PHPプラグインによって機能をカスタマイズする方法を習得できたことが印象的でした。このような知識は、Web開発の実務でのCMS選定や機能拡張において役立つと感じています。
後半では、インターネットシステムのパフォーマンス向上に向けた具体的な技術について学びました。リアルユーザー・モニタリングと合成トランザクション・モニタリングの比較や、サーバーのパフォーマンスに影響を与える一般的な問題点の特定を行うことで、効率的なサーバー管理と障害対応の基礎が身につきました。これらのスキルは、パフォーマンスの向上やユーザー体験の最適化を目指す実践的なWeb管理に不可欠であり、今後のキャリアでも大いに応用できると考えています。
また、このコース全体を通して、理論と実践をバランスよく学べたことで、Web開発の包括的なスキルを身につけることができました。基礎的なスキルから実際のWebサービスの構築、パフォーマンス管理に至るまでの学習内容を総合的に捉え、今後の課題やさらなる成長のための基盤が築けたと感じています。このような幅広い視点を持つことで、将来的に多様なプロジェクトにおいて柔軟に対応できる力が養われたと考えます。
