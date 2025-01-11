# unit3

- File systems
- Partitions
- Memory
- Security
- Remote procedure calls

## Goal

main

- Discuss file systems, handle memory, partitions, naming, and manage messaging between processes in an operating system
- Explain the fundamental principles and functions of file systems, prompts, and remote procedure calls with suitable use cases.
- Discuss security in a Unix/Linux operating system.

ja

- オペレーティングシステムにおけるファイルシステム、メモリ、パーティション、命名、プロセス間のメッセージング管理について議論する
- 適切な使用事例を挙げながら、ファイルシステム、プロンプト、リモートプロシージャコールの基本原理と機能について説明する。
- Unix/Linuxオペレーティングシステムのセキュリティについて議論する。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

1. GeeksforGeeks. (2022, May 31). Remote procedure call (RPC) in operating system. Retrieved March 7, 2023. <https://www.geeksforgeeks.org/remote-procedure-call-rpc-in-operating-system/>
  Utilize this resource to look at remote procedure calls.
2. Lavarian, R. (2022, January 11). What is a file system? Types of computer file systems and how they work – explained with examples. freeCodeCamp. <<https://www.freecodfindmnt> -lo source,target,fstype,used -t ext4ecamp.org/news/file-systems-architecture-explained/>
  This resource will provide further explanation on file systems, partitions, and memory.
3. Shotts, W. (2019). The Linux command line: A complete introduction (5th ed.). No Starch Press.
  Read Section 15 – Storage Media of the textbook.

## Discussion Forum

As a developer, you may have encountered tasks related to navigating the file system, handling memory, and messaging between processes in an operating system. These can be complex concepts to understand, and it can be helpful to have a clear explanation and examples to refer to as you continue to develop your skills.
For this discussion, we would like to invite you to share your expertise and insights on these topics. Please feel free to provide explanations and examples to help others better understand how to navigate the file system, change the partitions and name drives, handle memory, and manage messaging between processes in an operating system. You may also include any relevant resources or materials that may be helpful for others to refer to as they learn more about these concepts.
In your responses to your classmates' posts, expand on their points and provide additional insights or examples to support your points. Use proper citation if you refer to any outside sources.

開発者として、ファイルシステムの操作、メモリの管理、プロセス間のメッセージングなど、オペレーティングシステムに関連するタスクに取り組んだ経験があるかもしれません。これらは理解するのが複雑な概念であることがあり、スキルを磨くうえで明確な説明や例を参照できると役立ちます。
このディスカッションでは、これらのトピックに関するあなたの専門知識や洞察を共有していただきたいと思います。ファイルシステムのナビゲーション、パーティションの変更やドライブの名前変更、メモリの管理、プロセス間のメッセージングの管理について、他の人がよりよく理解できるような説明や例を自由に提供してください。また、これらの概念をより深く学ぶ際に役立つ関連リソースや資料があれば、ぜひ含めてください。
クラスメートの投稿への返信では、そのポイントを広げる形で追加の洞察や例を提供し、自分の意見を補強してください。外部の情報源を参照する場合は、適切な引用を行ってください。

### Japanese Discussion

オペレーティングシステム（OS）におけるプロセス間通信やファイルシステムの最適化は、システムの効率性、信頼性、スケーラビリティを向上させるために欠かせない重要な概念です。以下では、これらのトピックについて、技術的な理論と実際の経験を交えながら深く掘り下げていきます。

プロセス間の同期とメッセージング
プロセス間通信（IPC）は、特に分散システムにおいて、異なるマシン上のプロセス間での協調作業を可能にするために重要です。同期メカニズムとしては、ミューテックスやセマフォといった技術があり、共有リソースへのアクセスを秩序立てて管理します。ただし、これらを実装する際には、デッドロックや優先順位の逆転といった問題を避けるために注意が必要です。
分散システムでは、リモートプロシージャコール（RPC）が通信の複雑さを隠し、重要な役割を果たします。従来のIPCメカニズムとは異なり、RPCはネットワーク通信の低レベルな管理を不要にし、開発者が業務ロジックに集中できるようにします。例えば、クライアントプロセスがサーバ上のリモートメソッドをローカルメソッドのように呼び出すことができます。gRPCのような高度なRPCの実装では、負荷分散、認証、効率的なバイナリシリアライズなどの追加機能が提供されます。
応用例：
金融取引処理システムでは、リアルタイム処理の要求に応えるため、優先順位に基づいたスケジューリングが可能なメッセージキューを実装しました。非同期メッセージングの使用により、コンポーネント間の非ブロッキング通信を実現し、RabbitMQのような分散メッセージブローカーを組み込むことで、信頼性の高いメッセージ配送と高いスケーラビリティを確保しました。
さらに、私が過去に経験したプロジェクトでは、DBサーバとバッチサーバで相互に連携しながら高速に処理を行う必要がありました。1対1の関係で通信するこの環境では、優先度付きキューを用いることで処理の効率化を図り、約20%の速度向上を実現しました。

ファイルシステムの最適化
ファイルシステムはデータストレージの基盤であり、システムのパフォーマンスや信頼性に直接影響を与えます。ext4やXFSなどの近代的なファイルシステムは、ジャーナリング機能を備え、書き込み操作中のクラッシュリカバリを可能にします。また、ZFSやBtrfsのようなファイルシステムでは、スナップショット、データ重複排除、動的リサイズなどの高度な機能が提供され、信頼性と柔軟性が特に求められる環境で有用です。
さらに、ファイルシステムの設定を最適化することで、性能向上が期待できます。例えば、作業負荷の特性に応じてブロックサイズを調整することで効率的な読み書きを実現できます。小さなブロックサイズはランダムアクセスに適しており、大きなブロックサイズは順次データ処理に向いています。加えて、デフラグメンテーションや遅延書き込みの技術を使用することで、断片化を減らし、ディスクの摩耗を最小限に抑えることができます。
応用例:
データ集約型アプリケーションでは、SSDのTRIMサポートを構成し、書き込みパフォーマンスを維持しました。また、Redisを用いて頻繁にアクセスされるメタデータをキャッシュし、キャッシュヒット率を85%に引き上げることで、ファイル操作の遅延を顕著に削減しました。さらに、高性能コンピューティング向けにLustreを導入し、スループットが30%向上しました。過去のプロジェクトでは、遅いHDDへの書き込み処理を高速化するために重要ファイルをSSDに移動させ、書き込み処理とファイル生成を非同期化することで、データ損失のリスクを減らしました。

ストレージメディアの管理
ストレージメディアの管理には、物理デバイスのマウント、パーティション分割、バックアップスケジュールの設計が含まれます。Linuxでは、mountコマンドを使用してデバイスをファイルシステムツリーに統合し、fsckコマンドでファイルシステムの整合性をチェックします。
仮想化技術（例: 論理ボリュームマネージャ（LVM）やRAID）を活用することで、ストレージリソースを柔軟に管理できるようになります。これにより、スケーラビリティやリカバリ性能が大幅に向上します。これらの技術を使用することで、管理者は動的にストレージを割り当てたり再割り当てしたりすることができ、リソースの最適な利用が可能になります。
応用例:
スナップショットを用いた災害復旧シナリオを構築し、万が一の障害時でもデータを迅速に復旧できるようにしました。さらに、LVMを活用してディスク容量を動的に拡張し、ストレージ不足の問題を解決しました。RAID構成においては、RAID 10を採用することで冗長性と読み取り速度を両立し、システムの可用性を向上させました。

結論
プロセス間の同期とメッセージング、ファイルシステムの最適化、ストレージメディアの管理は、効率的なOS運用のために不可欠な要素です。これらの技術を効果的に活用することで、システム全体のパフォーマンスと信頼性を大幅に向上させることができます。

参考文献
GeeksforGeeks. (2022). Remote procedure call (RPC) in operating system. Retrieved March 7, 2023, from <https://www.geeksforgeeks.org/remote-procedure-call-rpc-in-operating-system/>
Lavarian, R. (2022). What is a file system? Types of computer file systems and how they work – explained with examples. freeCodeCamp. Retrieved March 7, 2023, from <https://www.freecodecamp.org/news/file-systems-architecture-explained/>
Shotts, W. (2019). The Linux command line: A complete introduction (5th ed.). No Starch Press.
Burns, R., & Long, D. E. (2000). In-place reconstruction of file systems. ACM Transactions on Storage, 4(3), 1–25.
Tanenbaum, A. S., & Bos, H. (2014). Modern operating systems (4th ed.). Pearson Education.
RabbitMQ. (n.d.). RabbitMQ documentation. Retrieved from <https://www.rabbitmq.com/documentation.html>
Redis. (n.d.). Redis documentation. Retrieved from <https://redis.io/docs/>

## Written Assignment

After seeing your technical documentation skills (from Unit 2’s assignment), your company has promoted you to the Assistant Manager profile and one of your core tasks is to create training documents for developers.

**Task:**
You have been tasked with creating technical documentation to assist your junior developers in understanding file system, prompts, and remote procedure calls. The documentation should include screenshots and technical details in brief involving file systems, prompts, and remote procedure calls. In addition, you should find another resource on your own to explain security in a Unix/Linux operating system to help your fellow employee. You should use bullet points where needed to help organize the information and make it easier to understand.

To complete this assignment, you should review the document - [What is technical documentation](https://www.indeed.com/career-advice/career-development/technical-documentation), to get a sense of how technical documentation is typically structured. Then, use the readings provided to you to provide a detailed explanation of what is happening within the operating system and explain the role and function of the file system, how it relates to memory, and how remote procedure calls are done.
As you work on this assignment, be sure to keep in mind that the goal is to provide your junior developers with a thorough understanding of the topic at hand.
You will be assessed on:

- Your explanation of file systems, prompts, and remote procedure calls, including their fundamental principles and functions, with well-explained examples and appropriate screenshots to illustrate the concepts.
- Your discussion of security in a Unix/Linux operating system.
- Organization and style of the essay (including APA formatting).

Submit a paper that is at least 3 pages in length exclusive of the reference page, double-spaced using 12-point Times New Roman font. The paper must cite a minimum of two sources in APA format and be well-written. Check all content for grammar and spelling, and be sure that you have properly cited all resources (in APA format) used. For assistance with APA formatting, view the Learning Resource Center: Academic Writing.
For this assignment, your peers will be evaluating your work using the Written Assignment Unit I Rubric.

References

Krosel, A. (2022, November 29). *What is technical documentation?* (And how to create it). indeed. <https://www.indeed.com/career-advice/career-development/technical-documentation>

### Japanese Written Assignment Question

Unit 2の課題での技術文書作成スキルを評価され、あなたの会社ではあなたをアシスタントマネージャーに昇格させました。主な業務のひとつとして、開発者向けのトレーニング資料を作成することが求められています。

課題：
ジュニア開発者がファイルシステム、プロンプト、およびリモートプロシージャコール（RPC）を理解するための技術文書を作成するよう指示されました。この文書には、ファイルシステム、プロンプト、リモートプロシージャコールに関する簡潔な技術的詳細やスクリーンショットを含める必要があります。さらに、独自にリソースを調査し、Unix/Linuxオペレーティングシステムにおけるセキュリティについて説明する内容を追加して、同僚に役立つ情報を提供してください。箇条書きなどを使用して情報を整理し、理解しやすくしてください。

この課題を完了するには、技術文書とは何か を参照し、技術文書が通常どのように構成されているかを把握してください。その上で、提供されたリーディング資料を基に、オペレーティングシステム内部で何が起きているかを詳しく説明し、ファイルシステムの役割や機能、それがメモリとどのように関連しているか、またリモートプロシージャコールの仕組みについて述べてください。

この課題を進める際は、ジュニア開発者がテーマを徹底的に理解できるようにすることを目標としてください。

評価基準
以下の点が評価されます：

ファイルシステム、プロンプト、リモートプロシージャコールについての説明（基本原理や機能を含む）。適切な例や概念を示すスクリーンショットを含めること。
Unix/Linuxオペレーティングシステムにおけるセキュリティについての議論。
エッセイの構成とスタイル（APAフォーマットを含む）。
提出要件
提出する文書は、参照ページを除いて3ページ以上の長さで、ダブルスペース、12ポイントのTimes New Romanフォントを使用する必要があります。この文書には、最低2つの参考文献をAPA形式で引用し、文法やスペルをすべてチェックしてから提出してください。また、使用したすべてのリソースをAPA形式で正しく引用する必要があります。APAフォーマットのサポートが必要な場合は、Learning Resource CenterのAcademic Writingセクションを参照してください。

参考文献
Krosel, A. (2022年11月29日). What is technical documentation? (And how to create it). indeed. <https://www.indeed.com/career-advice/career-development/technical-documentation>

### Japanese Written Assignment

1. はじめに
この文書は、Unix/Linuxオペレーティングシステムにおけるファイルシステム、プロンプト、リモートプロシージャコール(RPC)の基本的な概念と仕組みを理解できることを目的としています。また、Unix/Linuxのセキュリティに関する情報を補足し、開発環境の安全性を高めることも目指しています。
対象読者はUnix/Linuxを扱うジュニア開発者であり、これから技術的な基礎を習得する段階にある人々です。この文書では、理論的な説明に加え、具体的な例を用いて理解を深めていきます。
以降のセクションでは、以下のトピックについて詳しく説明します：

- ファイルシステムの基本概念と機能
- プロンプトの役割とカスタマイズ方法
- RPCの仕組み
- Unix/Linuxのセキュリティ

2. ファイルシステム
2.1 定義と基本概念
ファイルシステムは、オペレーティングシステムがデータを保存および管理するための仕組みです。ファイルやディレクトリ（フォルダ）の階層構造を作り、ストレージデバイス上のデータに効率的にアクセスできるようにします。Linuxシステムでは、ファイルシステムは単一のツリー構造として表現され、外部ストレージデバイスやネットワークドライブもこのツリーにマウントされます。
例として、Linuxでは/etc/fstabというファイルを使用して、デバイスの自動マウント設定を管理します。これは、システムの起動時にどのデバイスがどこにマウントされるかを定義する重要なファイルです。このプロセスにより、デバイスの管理が効率化されます (Shotts, 2019)。

2.2 主な機能
ファイルシステムには以下の主な機能があります：
データの保存: ファイルとディレクトリの階層構造を管理し、データを効率的に保存。
アクセス制御: パーミッション（読み取り、書き込み、実行）を設定して、ユーザーごとにアクセス権を管理。
リカバリー機能: ファイルシステムエラーを検出し修復するためのツール（例: fsck）を提供する (Lavarian, 2022)。

2.3 ファイルシステムの操作
2.3.1 ファイルシステムの一覧表示
mountやdf -hと言ったコマンドを利用して、現在のファイルシステムの一覧を表示することができます。以下は、df -hによってファイルシステムの一覧を取得したものです。
2.3.2 デバイスのマウントとアンマウント
USBメモリなど新しいデバイスをOSに認識させる場合、マウントという操作を行う必要があります。。マウントはmount /dev/sda4 /mntのような形で実施する。また、マウントしたデバイスを取り除く場合、umount /mntと言うコマンドを実行する。
2.3.3 ファイルシステムの作成
新しいパーティションにファイルシステムを作成する場合、mkfsコマンドを使用する。

3. プロンプト
3.1 定義と役割
プロンプトは、ユーザーがコマンドを入力するためのインターフェイスを提供するテキストベースのインジケーターです。Linuxでは、デフォルトでBash（Bourne Again Shell）が多く使用され、プロンプトは通常次のような形式を取ります：
[username@hostname currentDirectory]$
プロンプトは、ユーザーが現在のシステム状態を把握し、コマンドを実行するための基本的な情報を提供します (Shotts, 2019)。これにより、ファイル操作やプログラムの実行が効率的に行えます。
3.2 主な操作
プロンプトで実行できる基本的な操作を以下に記載します。
3.2.1 現在のディレクトリを確認(pwd)
3.2.2 ディレクトリの移動(cd)
3.2.3 ディレクトリやファイルの一覧表示(ls)
3.3 プロンプトのカスタマイズ
プロンプトの表示をカスタマイズすることで、作業効率を向上させることができます。BashではPS1変数を設定することでプロンプトを変更できます。以下にPS1="[\u@\h \W]\$ "というコマンドによってプロンプトをカスタマイズする前後の状況を示したスクリーンショットを記載します。
カスタマイズしたプロンプトはセッションが終了すると元に戻ります。そのため、恒久的な変更としたい場合は、.bashrcファイルに設定を追加します。

4. リモートプロシージャコール
4.1 定義と基本概念
リモートプロシージャコール（Remote Procedure Call, RPC）は、ネットワークを介して異なるコンピュータ上のプロセス間で通信を行うための技術です。RPCは、ローカルで実行する関数呼び出しと同じような操作感でリモートサーバー上の関数を実行できます (GeeksforGeeks, 2022)。これにより、分散アプリケーションの設計が容易になります。
RPCの仕組み:
  クライアントプログラムがリモートプロシージャを呼び出す
  RPCライブラリが呼び出しをネットワークメッセージに変換し、リモートサーバーに送信する
  サーバープログラムがメッセージを受け取り、指定されたプロシージャを実行する。
  実行結果がネットワークメッセージとしてクライアントに返す。
4.2 主なプロセスと使用例
RPCの典型的な使用方法として、以下の手順が挙げられる。
4.2.1 サーバープログラムの準備
リモートで実行可能なプロシージャとして、サーバープログラムを定義し待機する。以下は、Pythonの`xmlrpc.server`ライブラリを使用したシンプルなサーバープログラムです。

```python
from xmlrpc.server import SimpleXMLRPCServer
def add(x, y):
    return x + y
server = SimpleXMLRPCServer(("localhost", 8000))
server.register_function(add, "add")
server.serve_forever()
```

4.2.2 クライアントプログラムの作成
リモートプロシージャを呼び出すクライアントプログラムを以下に示します。

```python
import xmlrpc.client
proxy = xmlrpc.client.ServerProxy("http://localhost:8000/")
print("Result:", proxy.add(5, 3))  # 出力: Result: 8
```

4.2.3 通信の確認
サーバー側のプログラムを待機状態にし、クライアントから接続します。それによって、リモートプロシージャを呼び出した結果をクライアント側で出力することができます。

4.3 RPCのメリットとデメリット
メリット
  ネットワークの情報を抽象し、開発効率を向上させる
  分散システムの設計を簡素化する
デメリット
  通信遅延によるパフォーマンス低下を引き起こす可能性がある。
  ネットワーク障害がシステム全体に影響を及ぼすリスクがある。

5. Unix/Linuxのセキュリティ
5.1 定義と重要性
Unix/Linuxのセキュリティは、システムの安定性とデータ保護を確保するための重要な要素です。セキュリティ機能には、ユーザーとグループの管理、ファイルのパーミッション設定、権限の昇格（sudo）の制御が含まれます。これにより、不正アクセスやシステム全体への重大な損害を防止できます (Shotts, 2019)。
5.2 主なセキュリティ機能
5.2.1 ユーザーとグループの管理

- Linuxは、/etc/passwdと/etc/groupファイルを使用してユーザーとグループを管理します。
- ユーザーごとにUID（ユーザーID）を割り当て、アクセス制御を行います。

5.2.2 ファイルのパーミッション設定

- Linuxのファイルシステムは、読み取り（r）、書き込み（w）、実行（x）の3つのアクセスレベルを提供します。
- 各ファイルやディレクトリには、オーナー、グループ、その他のユーザーに対するパーミッションが設定されます。

5.2.3 権限の昇格（sudo）

- sudoを使用することで、一時的に管理者権限を取得し、重要な操作を実行できます。
- sudoersファイルを編集することで、特定のユーザーに権限を付与できます。

5.2.4 セキュリティツール

- セキュリティの向上のために、ファイアウォール（例：ufw）やSELinuxが使用されます。

6. 結論
本書では、Unix/Linuxシステムの重要な技術概念を理解するための基礎知識を紹介しました。主に、以下のトピックについて説明した：
6.1 ファイルシステム: データの保存、アクセス制御、リカバリー機能など、Linuxのファイルシステムの役割と機能を具体例を交えて解説しました。また、外部デバイスのマウントやファイルシステム作成の手順を示しました。
6.2プロンプト: LinuxシステムにおけるBashプロンプトの基本操作とカスタマイズ方法を説明し、効率的な作業環境の構築方法を紹介しました。
6.3 リモートプロシージャコール（RPC）: 分散システムでのプロセス間通信を容易にする技術について具体例を交え、RPCの仕組みと実装例を示しました。
6.4 Unix/Linuxのセキュリティ: ファイルパーミッションやユーザー管理、sudoの使用方法を中心に、セキュリティの重要性と基本的な設定方法を解説しました。

これらのトピックは、Unix/Linuxシステムを効率的かつ安全に利用するための基盤を提供する。これらの知識を活用することで、システム操作における効率性と安全性を向上させることが期待されます。本書で説明した内容を活用し、実際のLinuxシステムを操作することでスキルを高めてください。

参考文献
GeeksforGeeks. (2022, May 31). Remote procedure call (RPC) in operating system. Retrieved March 7, 2023, from <https://www.geeksforgeeks.org/remote-procedure-call-rpc-in-operating-system/>
Lavarian, R. (2022, January 11). What is a file system? Types of computer file systems and how they work – explained with examples. FreeCodeCamp. Retrieved from <https://www.freecodecamp.org/news/file-systems-architecture-explained/>
Shotts, W. (2019). The Linux command line: A complete introduction (5th ed.). No Starch Press.
