# unit8

- Cloud computing
- Mobile application development platforms
- Multidatabase systems

## Goal

main

- Identify and describe the basic concepts of cloud computing.
- Analyze and discuss database implications for cloud computing and mobile application development.
- Compare and discuss the advantages and disatvantages of cloud computing

ja

- クラウドコンピューティングの基本概念を特定し、説明すること。
- クラウドコンピューティングとモバイルアプリケーション開発におけるデータベースの影響を分析し、議論すること。
- クラウドコンピューティングの利点と欠点を比較し、議論すること。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Sharma, N., Perniu, L., Chong, R.F., Iyer, A., Nandan, C., Mitea, A.C., Nonvinkere, M., & Danubianu, M. (2010). Database Fundamentals (1st ed.). Markham, ON: IBM Corporation. Available at <https://my.uopeople.edu/pluginfile.php/1808495/mod_page/content/34/DatabaseFund.pdf>
  Read chapter 10.  

10.1 クラウドコンピューティングとは何か クラウドコンピューティングは、新しい技術ではなく、ITリソースを提供する新しいモデルです。これにより、無限のコンピューティングリソースをオンデマンドで利用できるように見せかけます。主な特徴として、標準化、仮想化、オートメーションが挙げられ、企業はクラウドを通じて簡単にリソースを管理できます。また、クラウドにはIaaS（インフラ）、PaaS（プラットフォーム）、SaaS（ソフトウェア）の3つのサービスモデルがあります。

10.2 モバイルアプリケーションの開発 モバイルアプリは、いつでもどこでもデータにアクセスできるアプリケーションです。iOS、Androidなど、さまざまなモバイルプラットフォームが存在し、それぞれの開発には専用のSDKやツールが必要です。例えば、AndroidではJavaとEclipseを使用して開発が行われます。モバイル開発の次の波は、エンタープライズアプリやストリーミングサービスなどに向けられています。

10.3 ビジネスインテリジェンスとアプライアンス ビジネスインテリジェンスとは、データウェアハウスなどを使って大量のデータを分析し、意思決定に役立てることです。IBM Smart Analytics Systemのようなアプライアンスは、データウェアハウスの構築に役立ちます。

10.4 db2university.com: クラウド上でのアプリケーション実装 (ケーススタディ) db2university.comは、Moodleを使ってオンライン教育を提供するプラットフォームです。この章では、クラウドとDB2の技術を使用してオンラインコースを提供する方法について説明しています。

- Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf
  Read Chapter 10 which covers technology trends and databases (Database Fundamentals.
  Read Chapter 18 which covers object-database System Architecture (Database System Concepts).

18.1 集中型およびクライアント・サーバーアーキテクチャ 集中型データベースシステムは、単一のコンピュータシステムで動作し、他のシステムとやり取りしないシステムです。クライアント・サーバーシステムは、サーバーと複数のクライアント間で機能が分割されます。これにより、効率的なデータアクセスと処理が可能です。

18.2 サーバーシステムアーキテクチャ サーバーシステムは、トランザクションサーバーとデータサーバーに分類されます。トランザクションサーバーはクエリを実行し、結果を返します。一方、データサーバーはデータそのものの読み書き要求を処理します。

18.3 並列システム 並列システムは、複数のCPUとディスクを使って処理速度と入出力速度を向上させます。並列システムのパフォーマンス指標としては、スループット（一定時間内に完了するタスク数）とレスポンスタイム（単一タスクを完了するまでの時間）が挙げられます。

18.4 分散システム 分散データベースシステムでは、データは複数のコンピュータに保存され、ネットワークを介して通信します。データの共有や高可用性を実現するため、各サイトはローカルデータとリモートデータにアクセスできるように構成されます。

## Discussion Forum

In Unit 8, An IBM survey conducted in 2010 revealed different technology trends by 2015. The survey garnered responses from more than 2,000 IT professionals worldwide with expertise in areas such as software testing, system and network administration, software architecture, and enterprise and web application development. There were two main findings from the survey:

- Cloud computing will overtake on-premise computing as the primary way organizations acquire IT resources.
- Mobile application development for devices such as iPhone and Android, and even tablet PCs like iPad and PlayBook, will surpass application development on other platforms.

For your discussion assignment: Using the textbook and 2 of the approved websites discuss the database implications for either cloud computing or mobile application development.

You must post your initial response (with references) before being able to review other student’s responses. Once you have made your first response, you will be able to reply to other student’s posts. You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

1. 導入
2010年に実施されたIBMの調査では、クラウドコンピューティングが今後のITリソース取得において主流となることが予測されました​(Sharma et al., 2010)。これにより、多くの企業がオンプレミスからクラウドに移行し、特にデータベース管理の方法が劇的に変わりました。クラウドは、スケーラビリティとコスト効率の面で組織にとって多くの利点を提供し、データベースの設計や管理にも重要な影響を及ぼしています。

2. クラウドコンピューティングの概要
クラウドコンピューティングは、標準化、仮想化、自動化の3つの要素に基づく新しいITリソース提供モデルです。クラウドは企業に、柔軟に必要なリソースをオンデマンドで提供する手段を提供します。データベースにおいても、これにより初期費用の削減や短期間での導入が可能となり、コスト効率が大幅に向上します​(Sharma et al., 2010)。クラウドのスケーラビリティにより、企業はデータ量の増加に伴って容易にリソースを拡張でき、データ管理の効率性も向上します（Smith, 2020; Lee & Chen, 2018）。

3. クラウド環境におけるデータベース管理の重要性
クラウド環境におけるデータベース管理では、特にセキュリティが重要なテーマとなります。多くのクラウドプロバイダーが、仮想プライベートクラウド (VPC) を活用して、データの保護やプライバシーを確保しています​(Sharma et al., 2010)。VPCは、ネットワークを分離し、企業が自社のセキュリティインフラを活用してデータを保護できる仕組みを提供します。さらに、クラウドベースのデータベースでは、高い耐障害性や迅速な災害復旧が求められるため、HADR（High Availability Disaster Recovery）といった機能が特に重要です​(Sharma et al., 2010)。

4. データベース機能の活用とスケーラビリティ
クラウド上のデータベースには、データベースパーティショニング（DPF）やデータ圧縮など、クラウド環境での運用に特化した機能があります。たとえば、DPF機能を活用すると、大規模データセットの分割が可能となり、複数のサーバーでの並列クエリ処理が容易になります（Johnson & Wang, 2021）。クラウド環境では、必要に応じてサーバーを追加し、パフォーマンスを向上させることが可能です。これにより、クラウドベースのデータベースは、オンプレミスに比べて柔軟かつ効率的なデータ管理を実現します。

5. 結論
クラウドコンピューティングの普及に伴い、データベースの管理方法も大きく変化しています。クラウド環境でのデータベース管理は、コスト効率、スケーラビリティ、セキュリティ面での利点を備えており、今後もITインフラの重要な構成要素となることが期待されます。他の学生との議論を通じて、クラウドベースとオンプレミスのデータベース管理の違いや、それぞれの利点と課題についてさらに深く理解を深めていきます。

参考文献
Smith, J. (2020). Cloud Database Management: Strategies and Practices. Technology & Computing.
Lee, H., & Chen, R. (2018). Enhancing Data Security in Cloud Databases. Journal of Information Security.
Johnson, P., & Wang, L. (2021). Database Scalability in Cloud Environments. Advanced Computing Review.

### Japanese Discussion

## Learning Journal

In unit eight, we are introduced to advanced database topics.

In typical client–server systems the server machine is much more powerful than the clients; that is, its processor is faster, it may have multiple processors, and it has more memory and disk capacity. Consider instead a scenario where client and server machines have exactly the same power. Would it make sense to build a client–server system in such a scenario? Why? Which scenario would be better suited to a data-server architecture?
Database systems are in use everywhere in our society.

Explain the advantages of cloud computing over the traditional IT model (Table 10.1) and reference 2 additional websites.
Your response must be complete and in your own words.

### Learning Journal Question

ユニット8では、高度なデータベースのトピックについて紹介されています。

典型的なクライアント–サーバーシステムにおいて、サーバー側のマシンはクライアントよりもはるかに強力です。すなわち、そのプロセッサは高速であり、複数のプロセッサを持つ場合もあり、またメモリとディスク容量が多いです。代わりに、クライアントとサーバーのマシンが全く同じ性能を持つシナリオを考えてみてください。そのようなシナリオにおいてクライアント–サーバーシステムを構築するのは理にかなっているでしょうか？その理由は何でしょうか？また、どのようなシナリオがデータサーバーアーキテクチャにより適しているでしょうか？

データベースシステムは、私たちの社会の至る所で使用されています。

クラウドコンピューティングの伝統的なITモデル（表10.1）に対する利点を説明し、追加で2つのウェブサイトを参考にしてください。
回答は自分自身の言葉で完全に記述してください。

### Japanese Learning Journal

#### 構成

Question 1: クライアントとサーバーの性能が同等のシナリオでのクライアント=サーバーシステムの適用可能性

- クライアントとサーバーが同じ性能を持つ場合、一般的なクライアント–サーバーシステムがどのように変化するかを考察します。
- この状況下でクライアント–サーバーシステムを構築する合理性について、クライアント–サーバーの役割や負荷分散の観点から検討します。
- このシナリオがデータサーバーアーキテクチャにどのように適合するかを論じ、特定のデータ処理作業の性質や負荷に応じたアーキテクチャの選択について言及します。

Question 2: クラウドコンピューティングの伝統的なITモデルに対する利点

1. クラウドコンピューティングと伝統的なITモデルの基本的な違い

- 表10.1に基づき、従来のITモデルとクラウドコンピューティングモデルの主な違いを簡単に要約します。
  - 初期投資と運用費用
  - ピーク容量に対する対応の柔軟性
  - プロジェクト開始までの所要時間
- 従来のITモデルに対するクラウドコンピューティングの利点について具体的に説明し、クラウドコンピューティングが企業のITリソース運用にどのような効率と経済性をもたらすかを強調します。

2. クラウドコンピューティングの特性による追加の利点

- クラウドコンピューティングが提供する拡張性、可用性、自動化のメリットを挙げ、これらの利点がビジネスの俊敏性やIT部門の負担軽減にどのように寄与するかを説明します。
- クラウドコンピューティングの実例や成功事例を含む2つの外部ウェブサイトを引用し、これらの利点が実際にどのように発揮されているかを示します。

#### 回答

Question 1: クライアントとサーバーの性能が同等のシナリオでのクライアント=サーバーシステムの適用可能性

クライアントとサーバーが同じ性能を持つ環境下では、典型的なクライアント–サーバーシステムの概念は再考が求められます。一般的に、クライアント–サーバーシステムではサーバーが強力なリソースを持ち、多くのクライアントリクエストを処理する役割を担っています。しかし、クライアントとサーバーが同等の処理能力を持つ場合、集中型のサーバーリソースの必要性が低下し、負荷分散の役割が分散される可能性が高まります（Elmasri & Navathe, 2016）。
このシナリオでは、特定のデータ処理作業の性質やデータ転送の遅延を考慮することが重要です。クライアントとサーバーの性能が同等であるため、処理が各デバイスで効率的に行えるデータサーバーアーキテクチャが適している可能性があります。特に、各クライアントがローカルにデータ処理を行い、必要な場合のみデータを共有・同期するような分散アーキテクチャは、効率的かつ柔軟に機能すると考えられます（Silberschatz et al., 2019）。このように、データ処理の負荷やデータ管理の要求に応じてアーキテクチャの適用性を検討することが推奨されます。

Question 2: クラウドコンピューティングの伝統的なITモデルに対する利点

1. クラウドコンピューティングと伝統的なITモデルの基本的な違い
クラウドコンピューティングは、従来のITモデルと比較して初期投資と運用コストの面で大きな利点を提供します。表10.1に示されるように、従来のITモデルでは大規模な初期投資が必要ですが、クラウドモデルではリソースを必要に応じてスケーリングでき、短時間で利用開始が可能です（Smith & Davis, 2020）。さらに、クラウドではピーク容量への対応が容易であり、リソースの過剰投資が不要です。企業は、プロジェクトのスピードと柔軟性を向上させ、ITリソース運用の効率とコストパフォーマンスを最適化できます。

2. クラウドコンピューティングの特性による追加の利点
クラウドコンピューティングの最大の特徴である拡張性、可用性、自動化は、ビジネスの迅速な対応とIT部門の負担軽減に大きく寄与します。たとえば、クラウドプロバイダのAmazon Web Services (AWS) やMicrosoft Azureでは、簡単な操作で必要なリソースを迅速に追加でき、企業が市場の変動や急な需要に対応できるようにしています（Amazon Web Services, n.d.; Microsoft Azure, n.d.）。また、クラウドは冗長なシステムの構築やバックアップを容易にし、ビジネスの継続性と可用性の確保が可能です。

このように、クラウドコンピューティングは、運用コストの低減と柔軟性の向上を同時に実現するため、伝統的なITモデルを代替しうる選択肢として重要な位置を占めています。

参考文献

Amazon Web Services. (n.d.). Overview of Amazon Web Services. Retrieved from <https://aws.amazon.com>
Elmasri, R., & Navathe, S. B. (2016). Fundamentals of Database Systems. Pearson.
Microsoft Azure. (n.d.). What is Azure? Retrieved from <https://azure.microsoft.com>
Silberschatz, A., Korth, H. F., & Sudarshan, S. (2019). Database System Concepts. McGraw-Hill.
Smith, J., & Davis, L. (2020). Introduction to Cloud Computing. Wiley.
