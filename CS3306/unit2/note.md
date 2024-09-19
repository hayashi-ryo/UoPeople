# unit2

States of transactions
Concurrency Control
Recovery System

## Goal

- By the end of this Unit, you will be able to:
  - Describe the basic concepts of transaction processing.
  - Identify and concurrency control techniques.  
  - Classify and apply recovery management component of a database

- ja
  - トランザクション処理の基本概念を説明する
  - 同時実行制御技術を特定する  
  - データベースのリカバリ管理コンポーネントを分類し、適用する

## Task

- [ ] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf <https://my.uopeople.edu/pluginfile.php/1893717/mod_book/chapter/526895/Database%20System%20Concepts%204th%20Edition%20By%20Silberschatz-Korth-Sudarshan.pdf>

Read Chapters 15, 16, and 17- Transaction processing.

## Discussion Forum

For your discussion assignment: Name the five states of transactions and use an example to discuss.

You must post your initial response (with references) before being able to review other student’s responses.  Once you have made your first response, you will be able to reply to other student’s posts.  You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ディスカッション課題のために： トランザクションの5つの状態を挙げ、それぞれの状態を説明するための例を使って議論してください。

あなたは他の学生の回答を確認する前に、最初の投稿（参考文献付き）を提出する必要があります。最初の投稿をした後、他の学生の投稿に返信することができるようになります。最低でも3回、クラスメートの投稿に返信することが求められています。
この質問に対する回答を準備する際、トランザクションの5つの状態についての詳細や具体例を説明しましょう。

### Japanese Discussion

データベース管理システム（DBMS）において、トランザクションは一連のデータベース操作を1つのまとまった単位として実行するプロセスです。トランザクションの成功または失敗に応じてデータベースの整合性を保つことが、システムの信頼性において非常に重要です。トランザクションはACID特性（Atomicity、Consistency、Isolation、Durability）に基づき、データが一貫した状態で保たれるように設計されています。トランザクションは進行中に異なる状態を経るため、これらの状態を理解することがDBMSの動作を把握する上で欠かせません。本稿では、トランザクションの5つの状態を例を用いて説明します。

トランザクションの5つの状態

1. Active（アクティブ）
トランザクションが開始され、実行中の状態です。この段階では、トランザクション内の各操作が順次行われており、全ての操作が完了していません。例えば、銀行の振込操作が開始されたとき、ユーザーが金額や送金先を入力し、振込を実行するためのプロセスが進行中である状態がこれに当たります。トランザクションはまだ実行中であるため、この段階では何も確定されていません。

2. Partially Committed（部分的コミット）
トランザクションのすべての操作が実行されたが、まだコミット処理が完了していない状態です。この状態では、トランザクションの操作は終了していますが、結果が確定されるためにはさらに確認が必要です。例として、銀行の振込操作で全ての処理が正常に行われ、金額や残高の変更が準備されている状態が挙げられます。ただし、この時点では、トランザクションが確定されておらず、まだデータベースに反映されていません。

3. Committed（コミット）
トランザクションが正常に完了し、その結果がデータベースに反映され、他のトランザクションにも影響を与える状態です。トランザクションの全ての操作が成功し、データベースに保存されるため、この状態では変更が恒久的になります。振込が無事に完了し、ユーザーの口座残高が更新された後、この新しい残高が他のユーザーやシステムにも見えるようになった場合、この状態がコミットされた状態です。

4. Failed（失敗）
トランザクションが異常終了し、すべての操作が実行されない状態です。この状態は、トランザクションの一部または全ての操作が失敗したときに発生します。例えば、銀行の振込操作中にネットワーク障害が発生し、送金プロセスが途中で停止してしまった場合、このトランザクションは失敗状態となります。失敗状態に陥ったトランザクションは、データベースに一切の変更を加えることなく終了します。

5. Aborted（中止）
トランザクションが中止され、データベースが元の状態に戻される状態です。トランザクションが失敗した後、データベースはロールバックされ、トランザクションの実行前の状態に復元されます。たとえば、振込中に問題が発生して振込が失敗した場合、システムは残高の変更を取り消し、振込を行う前の状態に戻します。これによりデータベースの整合性が保たれます。

トランザクション管理の重要性
これらの5つの状態は、データベースシステムの整合性と信頼性を保つために非常に重要です。特にACID特性との関連で考えると、トランザクションが一貫して適切に実行されることで、データベースが一貫性を保ち、同時に発生する他のトランザクションとも整合性を保つことができます。また、失敗や中止に対するロールバック処理によって、システムが異常時でも正しい状態に復帰できることが保証されます。

結論
トランザクションの5つの状態（Active、Partially Committed、Committed、Failed、Aborted）を理解することで、データベースの整合性や信頼性を保つために必要な仕組みを理解することができます。トランザクションは、データベースの運用において不可欠な要素であり、その適切な管理によって、システムが安全かつ確実に動作することが可能となります。

参考文献:
Silberschatz, A., Korth, H. F., & Sudarshan, S. (2019). Database System Concepts (7th ed.). McGraw-Hill Education.
Elmasri, R., & Navathe, S. B. (2016). Fundamentals of Database Systems (7th ed.). Pearson.

## Written Assignment

For your written assignment: When a detection algorithm determines that a deadlock exists, the system must recover from the deadlock. The most common solution is to roll back one or more transactions to break the deadlock.  List the three actions that need to be taken using figure 16.19 to discuss.

Your response must be complete and in your own words with conclusion and title page.

References:

(Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (4th ed.). New York, NY: McGraw-Hill. Available at Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf)

### Written Assignment Question

デッドロック検出アルゴリズムがデッドロックの存在を検出した場合、システムはデッドロックから回復する必要があります。最も一般的な解決策は、デッドロックを解消するために、1つまたは複数のトランザクションをロールバックすることです。図16.19を使用して、取られるべき3つのアクションをリストし、説明してください。
あなたの回答は、独自の言葉で完全に記述され、結論と表紙が含まれている必要があります。

### Japanese Written Assignment

データベースシステムにおけるデッドロックは、複数のトランザクションが相互にリソースを要求し合い、永遠に待機する状態を指します。この状況は、トランザクションの処理が停止し、システム全体のパフォーマンスに重大な影響を与えます。デッドロックを検出した際には、迅速に解消しなければなりません。本稿では、デッドロック検出アルゴリズムがデッドロックを確認した後に行うべき3つのアクションについて、図16.19を参照しながら解説します。

デッドロックの検出
デッドロックの検出は、wait-for graph を用いることで行われます。図16.19に示されるように、トランザクションT26、T27、T28は互いにリソースを待機しており、これらのトランザクションはデッドロック状態に陥っています。このようなグラフにおいてサイクルが確認されると、デッドロックが発生したことがわかります。デッドロックを解消するためには、トランザクションのいずれかをロールバックし、他のトランザクションを進行させる必要があります。

デッドロック回復のための3つのアクション

1. ロールバックするトランザクションの選択
デッドロックが検出された際、まず最初に行うべきアクションは、どのトランザクションをロールバックするかを決定することです。図16.19では、T26、T27、T28がサイクルを形成してデッドロック状態にあります。この場合、システムはこれらのトランザクションの中から、最もコストの少ないトランザクションを選んでロールバックします。通常、ロールバックするトランザクションとして、実行時間が短いトランザクションや、あまりリソースを使用していないトランザクションが選ばれます。たとえば、T27が他のトランザクションに比べて若いため、ロールバックされる候補となるでしょう。

2. 選択されたトランザクションのロールバック
次に、選ばれたトランザクションのロールバックを実行します。このプロセスでは、トランザクションが行った操作が全て元に戻され、リソースが解放されます。例えば、T27をロールバックした場合、T27が保持していたリソースが解放されるため、他のトランザクションであるT28が進行できるようになります。ロールバックは、データの整合性を維持しつつ、システムを正常な状態に戻すための重要なステップです。

3. 他のトランザクションの再スタート
ロールバックが完了した後、デッドロックから解放された他のトランザクションは再スタートされます。T26やT28は、T27がリソースを解放した後、再度実行を開始し、システムは通常の処理に戻ります。この再スタートにより、システム全体のパフォーマンスが回復し、リソースが効率的に管理されるようになります。

結論
デッドロックの検出と回復は、データベースシステムの安定性とパフォーマンスを維持するために不可欠です。デッドロックが検出された場合、ロールバックするトランザクションの選択、ロールバックの実行、そして他のトランザクションの再スタートという3つのアクションが必要です。これらのアクションを適切に実施することで、システムはデッドロックから回復し、トランザクションが再び正常に処理されるようになります。今後は、デッドロックの発生を防ぐために、トランザクションの設計段階で適切なロック管理を行うことが重要です。

参考文献
Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001). Database System Concepts (第4版). New York, NY: McGraw-Hill.

## Learning Journal

Database systems are in use everywhere in our society. Discuss one example of Microsoft backup and recovery software from one of the websites or one you have used before. Your entry must be in your own words, and with a minimum of three paragraphs.

### Learning Journal Question

データベースシステムは、私たちの社会のあらゆる場所で利用されています。ウェブサイトの1つから、またはこれまでに使用したことのあるMicrosoftのバックアップおよびリカバリソフトウェアの例について1つ述べてください。回答は自身の言葉で書かれ、最低3つの段落で構成される必要があります。

### Japanese Learning Journal

今回のテーマに沿って、私は過去の業務で利用したWindows Server Backupを例に挙げ、バックアップおよびリカバリのソフトウェアについて説明します。

Windows Server Backupの概要
Windows Server Backupは、Microsoftが提供する標準的なバックアップソフトウェアで、主にWindows Serverに組み込まれたツールとして使用されます。このソフトウェアは、ファイル、フォルダ、さらにはシステム全体のバックアップを作成し、データ保護の基本的なニーズを満たすために設計されています。バックアップはローカルディスク、外付けディスク、またはネットワークドライブに保存することができ、定期的なスケジュール設定も簡単に行えます (Microsoft, n.d.)。小規模な企業やシンプルなバックアップニーズを持つ環境では、追加コストが発生しないため、コスト効率の面でも優れています。

業務での利用体験
私の業務では、Windows Server Backupを利用して定期的なバックアップを実行し、重要なデータの保護を図ってきました。特に、サーバーのファイルやフォルダのバックアップが簡単にできる点が非常に役立ちました。スケジュール機能により、毎週自動的にバックアップが作成されるように設定し、手動での介入を減らすことができました。ある時、サーバーが障害を起こした際には、迅速にバックアップデータを用いてシステムをリカバリし、業務のダウンタイムを最小限に抑えることができました。この経験から、Windows Server Backupは中小企業にとって非常に信頼性の高いソリューションだと感じました。

利点と課題
Windows Server Backupの最大の利点は、Windows Serverに標準搭載されているため、特別なライセンスや追加費用を必要としない点です。また、簡単に使用できるインターフェースとスケジューリング機能があるため、技術的なスキルが高くないスタッフでも容易にバックアッププロセスを管理できます。しかし、課題としては、クラウドベースのバックアップ機能が標準で搭載されていない点が挙げられます。クラウドへの自動バックアップを希望する場合は、Azure Backupなどのクラウド対応ソリューションを別途導入する必要があります (Microsoft, n.d.)。そのため、より高度なバックアップ戦略が必要な大規模企業では、追加のツールとの併用が求められることがあります。

参考文献
Microsoft. (n.d.). Windows Server Backup Overview. Retrieved from <https://docs.microsoft.com/en-us/windows-server/administration/windows-server-backup/windows-server-backup-overview>
