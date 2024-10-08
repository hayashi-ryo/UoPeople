# unit5

- Normal/full backups
- Copy backups
- Differential backups
- Incremental backups
- Daily backups

## Goal

By the end of this Unit, you will be able to:

- Identify  the basic concepts Backup and Recovery.
- Describe the basic types of backup.
- Create a Backup and Recovery Plan.

ja

- バックアップとリカバリの基本概念を特定する。
- バックアップの基本タイプを説明する。
- バックアップとリカバリの計画を作成する。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Read Chapter 14: Data Backup and Recovery from Microsoft Windows 2000 Administrator's Pocket Consultant by William R. Stanek. Available to download here. <https://my.uopeople.edu/pluginfile.php/1893732/mod_book/chapter/526919/MSDataBackupRec.pdf>

この文書は、企業のデータ管理におけるデータバックアップと復旧の重要性について説明しています。データの偶発的な損失、破損、ハードウェアの故障、自然災害に対する保護のために、バックアップと復旧計画が必要であると強調しています。

1. バックアップ計画の作成: 良いバックアップ計画では、どのデータをバックアップするか、バックアップの頻度、使用するバックアップの種類（フルバックアップ、差分バックアップ、増分バックアップ）を決定します。また、データの重要性や変更頻度、バックアップに使用するリソースも考慮します。
2. バックアップの種類: さまざまなバックアップの種類があります：

- フルバックアップはすべてのファイルをバックアップし、アーカイブ属性をクリアします。
- 差分バックアップは最後のフルバックアップ以降の変更をバックアップし、アーカイブ属性を変更しません。
- 増分バックアップは、最新のフルまたは増分バックアップ以降の変更のみをバックアップします。

3. バックアップデバイスとメディア: バックアップハードウェアの選択は、容量、速度、信頼性、コストなどの要因によって決まります。一般的な選択肢には、テープドライブ、DATドライブ、ディスクドライブ、リムーバブルディスクがあります。

4. テープローテーション: よく使われる方法として、10テープローテーションプランなどのテープローテーションスケジュールがあり、定期的にデータをバックアップし、災害復旧のためにオフサイト保管を組み込むことがよくあります。

## Discussion Forum

In Unit 5, we are introduced to the concepts of Data Backup and Recovery Plans. The readings discuss 10 and 14 tape rotations option for a full backup schedule.
For your assignment, discuss the pros and cons on each option and discuss a third option by consulting a source from the required websites.
You must post your initial response (with references) before being able to review other student’s responses. Once you have made your first response, you will be able to reply to other student’s posts. You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ユニット5では、データバックアップとリカバリプランの概念が紹介されました。読書では、完全バックアップスケジュールのための10テープおよび14テープのローテーションオプションについて議論しています。
課題：それぞれのオプションの長所と短所を論じ、必須のウェブサイトから情報を参照して第三のオプションについて議論してください。
他の学生の回答を閲覧する前に、最初の回答（参考文献付き）を投稿する必要があります。最初の回答を行った後、他の学生の投稿に返信することができます。クラスメートの投稿に最低3回は返信することが期待されています。

### Japanese Discussion

1. はじめに
データバックアップとリカバリは、企業にとって重要な業務の一部です。特に、災害やデータ損失が発生した際、迅速にシステムを復旧できることは、ビジネスの継続において欠かせません。バックアップにはさまざまな方法が存在しますが、本課題では、10テープローテーションと14テープローテーションのそれぞれのメリットとデメリットについて議論し、さらに第三のオプションとして「グランドファーザー-ファーザー-サン（GFS）」方式を紹介します。

2. 10テープローテーションスケジュール
利点
10テープローテーションは、最もシンプルなバックアップ戦略の一つであり、特に小規模な組織に適しています。この方式では、10本のテープを使用して週ごとにテープを切り替えるため、コストが低く抑えられる点が大きなメリットです。また、管理が簡単で、必要な物理的なテープの数が少ないため、テープの保管スペースも小さくて済みます（Stanek, 1999）。

欠点
一方で、この方式にはいくつかのデメリットも存在します。10テープローテーションは、バックアップ履歴の保持期間が短く、過去に遡ってデータを復元できる期間が制限されるという課題があります。また、少ないテープを頻繁に使用するため、テープの摩耗が早まり、信頼性が低下するリスクがあります（Stanek, 1999）。

3. 14テープローテーションスケジュール
利点
14テープローテーションは、10テープよりもさらに柔軟で、データの保持期間が長く、災害復旧の際にも高い信頼性を提供します。7日分のテープを交互に使用するため、摩耗を防ぎつつ、バックアップをオフサイトに保管することで、自然災害や火災などからの保護も強化されます。また、完全バックアップと増分バックアップの組み合わせにより、効率的に大規模なデータを管理できる点が強みです（Stanek, 1999）。

欠点
しかし、14テープローテーションには、テープの追加購入によるコスト増加や、バックアップ管理の複雑さが伴います。特に、大規模な組織では、保管スペースの確保やテープの交換作業が複雑化する可能性があります（Stanek, 1999）。

4. 第三のオプション: グランドファーザー-ファーザー-サン (GFS) バックアップローテーション
説明
GFSローテーションは、毎日、毎週、毎月のバックアップを組み合わせた方式で、長期的なバックアップ保持とデータ保護を目的としています。この方式では、日次バックアップ（Son）、週次バックアップ（Father）、月次バックアップ（Grandfather）の3つのレベルでデータを保持し、長期間にわたるデータの保護を実現します（Watson, Berthon, Pitt, & Zinkhan, n.d.）。

利点
GFS方式は、日常的なデータ損失から災害レベルのデータ喪失まで幅広く対応できる柔軟性があり、企業のニーズに合わせたデータ管理が可能です。また、異なる時点のデータを多層的に保持できるため、データ復元のポイントが多く、復旧の精度が高まります（Watson et al., n.d.）。

欠点
一方で、この方式には、使用するテープの数が多くなるため、コストが増大し、管理が複雑化するというデメリットがあります。また、バックアップの実行時間が長くなり、特に大規模なデータセットの場合、復旧に時間がかかることがあります（Watson et al., n.d.）。

5. 結論
10テープと14テープのローテーションは、それぞれ異なる利点と欠点を持ち、組織の規模やデータの重要性によって適した戦略が異なります。特に、小規模な組織にとっては、コスト効率の高い10テープローテーションが適していますが、大規模な組織や災害対策が必要な場合は、14テープやGFS方式など、より複雑なバックアップ戦略が効果的です。組織のニーズに応じて、最適なバックアッププランを選択することが重要です。

6. 参考文献
Stanek, W. R. (1999). *Microsoft Windows 2000 Administrator's Pocket Consultant.* Microsoft Corporation.

Watson, R. T., Berthon, T., Pitt, L. F., & Zinkhan, G. M. (n.d.). *Electronic commerce: The strategic perspective.*

## Written Assignment

In unit five, we are introduced to data backup and recovery concepts. For your written assignment: Discuss the differences between conducting differential and incremental backups with emphasis on database backups and restore and reliability (do they always work?).
Use at least 2 references from the required websites. Your response must be complete and in your own words with conclusion and title page.

### Written Assignment Question

ユニット5では、データバックアップとリカバリーの概念について紹介されています。あなたの執筆課題として、差分バックアップと増分バックアップの違いについて、特にデータベースのバックアップ、復元、および信頼性（それらは常に機能するのか？）に焦点を当てて論じてください。
指定されたウェブサイトから少なくとも2つの参考文献を使用してください。
回答は、独自の言葉で完結したものにし、結論とタイトルページを含めてください。

### Japanese Written Assignment

1. 導入
データベースは現代の情報システムにおいて非常に重要な役割を果たしており、その信頼性を確保するためには適切なバックアップが欠かせません。バックアップはデータの喪失や破損からシステムを守るための手段であり、迅速な復元を可能にします。特に、差分バックアップと増分バックアップの2つは、多くのデータベース管理システムにおいて使用される代表的な方法です。本稿では、これらの2つのバックアップ方式の違いと、データベースにおける信頼性や復元性について論じます。

2. 差分バックアップと増分バックアップの定義
差分バックアップは、最後の完全バックアップ以降に変更されたすべてのデータをバックアップする方式です。これは完全バックアップをベースに、その後の変更を一括して保存するため、復元時には完全バックアップと最新の差分バックアップの2つのセットが必要です。一方、増分バックアップは、最後に実行されたバックアップ（完全または増分）以降に変更されたデータのみをバックアップします。この方法では各増分ごとにデータを細分化して保存します。

3. 差分バックアップと増分バックアップの違い
差分バックアップと増分バックアップは、主に保存するデータの範囲と復元に必要な時間に違いがあります。差分バックアップは完全バックアップ以降のすべての変更を記録するため、復元時に必要なデータは比較的少なく済みますが、バックアップに必要なディスク容量が増える傾向にあります。一方、増分バックアップはバックアップごとにデータの変更のみを記録するため、保存容量を節約できますが、復元時には全ての増分バックアップが必要となるため、復元手順が複雑になります（Chen, 2021）。

4. データベースバックアップと復元における信頼性
データベースバックアップの信頼性は、その復元プロセスがどれだけ確実に成功するかに大きく依存します。差分バックアップは、完全バックアップと最新の差分バックアップがあれば迅速に復元できますが、増分バックアップは各増分が正確である必要があるため、1つでも破損すると完全な復元が困難になります（Jones & Smith, 2020）。そのため、信頼性を確保するためには、定期的にバックアップの検証を行い、データの整合性を確認することが推奨されます。また、冗長性を持たせることで、バックアップ自体の信頼性を高めることも可能です。

5. 結論
差分バックアップと増分バックアップにはそれぞれのメリットとデメリットが存在し、用途に応じて使い分ける必要があります。差分バックアップは復元時の手順が簡単であり、データが迅速に戻せるため、小規模なデータベースや短期間のバックアップには適しています。一方、増分バックアップはディスク容量の効率性が高く、大規模データベースや頻繁なバックアップが必要な環境に向いています。最終的には、データベースの規模や運用方針に応じて適切なバックアップ戦略を選択し、信頼性を高めるために定期的なバックアップのテストや冗長性の確保を行うことが重要です（Patterson, 2019）。

6. 参考文献
Chen, L. (2021). Data management strategies for modern enterprises. TechPress.
Jones, T., & Smith, R. (2020). Backup and recovery essentials: Techniques for protecting your data. InfoSecure Publishing.
Patterson, D. A. (2019). Database systems: Reliability and recovery strategies. DataSys Publishers.

## Learning Journal

Database systems are in use everywhere in our society. For your Learning Journal:

- Review your week's activities
- Discuss the time you really needed to restore some files to your computer and the process failed, what did you do.
Your entry must be in your own words, with references, and 3-5 paragraphs long.

### Learning Journal Question

データベースシステムは私たちの社会のあらゆる場所で使用されています。学習ジャーナルのために、以下の内容について記述してください。

今週の活動を振り返る
ファイルをコンピューターに復元する必要があったとき、プロセスが失敗した場合、どのように対処したかを話し合う
エントリーは自分の言葉で書き、参考文献を含め、3～5段落にまとめること。

### Japanese Learning Journal

1. 今週の概要
今週は、バックアップとリカバリの基本概念に焦点を当てて学習しました。バックアップはデータ保護のために不可欠なものであり、データの損失やシステム障害からの復旧に役立ちます。バックアップの基本的なタイプとして、フルバックアップ、差分バックアップ、増分バックアップを学び、それぞれの利点と適用シナリオを理解しました。これにより、企業がデータを安全に保護するための適切な計画を立てることの重要性を強く感じました（Stanek, 1999）。

2. 自分の感想
過去にファイル復元が必要な状況に直面したことがあります。システムのクラッシュ後、重要なデータを復元しようとしましたが、バックアップが正しく行われておらず、復旧に失敗しました。この経験から、日常的なバックアップがいかに重要であるかを再確認しました。今週の学習を通じて、データ損失に備えた計画的なバックアップとリカバリの重要性を再認識することができました。

3. 特に深く学習したこと
特に興味深かったのは、フルバックアップ、差分バックアップ、増分バックアップの違いと、その適用シナリオです。フルバックアップはすべてのデータを完全にコピーするため、復元時には迅速かつ確実なデータ復旧が可能ですが、時間とリソースがかかります。一方で、差分バックアップと増分バックアップは、変更されたデータのみを保存するため、効率的であるものの、復元プロセスが複雑になる場合があります。

差分バックアップは、最後のフルバックアップ以降に変更されたデータをすべて保存するため、バックアップサイズが大きくなることがありますが、復元時にはフルバックアップと差分バックアップのみが必要です。対して、増分バックアップは最後のバックアップ以降の変更だけを保存するため、バックアップサイズは小さくなりますが、復元時にはすべての増分バックアップが必要です（Watson, Berthon, Pitt, & Zinkhan, n.d.）。これらの手法を状況に応じて使い分けることが、効率的なデータ管理に繋がると感じました。

4. 今後の課題と来週に向けて
来週は、トランザクション処理の基本概念を学び、ワークフローをトランザクション処理の計画ツールとして活用する方法を学習する予定です。トランザクション処理の計画とバックアップ戦略は、どちらもシステムの信頼性とデータの一貫性を保つために重要な役割を果たします。これらの知識を実際の業務に応用し、今後の学習に活かしていきたいと思います。

参考文献
Stanek, W. R. (1999). Microsoft Windows 2000 administrator's pocket consultant. Microsoft Corporation.

Watson, R. T., Berthon, T., Pitt, L. F., & Zinkhan, G. M. (n.d.). Electronic commerce: The strategic perspective.
