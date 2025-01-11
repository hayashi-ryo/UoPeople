# unit7

- Control Networking
- System Utilities
- Monitor Processes

## Goal

main

- Identify the system utilities of an operating system and explain using examples.
- Describe the steps with commands used to manipulate and control the networking functions in the Unix operating system.
- Monitor and manage processes.

ja

- オペレーティングシステムのシステムユーティリティを特定し、例を挙げて説明する。
- Unixのネットワーク機能を操作および制御するために使用するコマンドの手順を説明する
- プロセスの監視と管理。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

1. [How to monitor and manage processes on Linux.](https://www.arubacloud.com/tutorial/how-to-monitor-and-manage-processes-on-linux.aspx) (2021, January 22). aruba Cloud.
  This article helps in understanding how to monitor and manage processes on Linux.
2. [macOS: Access disk utility.](https://support-en.wd.com/app/error/error_id/1/session/L2F2LzEvdGltZS8xNzM1MjIzNDcwL2dlbi8xNzM1MjIzNDcwL3NpZC9mVV9iMG9wSGtqSmxJUVRQWURZR1QlN0UzdmlLUFJFbDYwd1VGZHo5bkVtWThtbEQlN0V1c1hMeVV2SlJ4c1Z3Q1ZnN19QSW5JMjNrZTZLZnJiTERGNFRDMXRzekNmX3FSTGRmRXdUUTFySmNlYUh0aFE1S0JoclpROWR3JTIxJTIx) (2022, October 5). Western Digital.
  This article guides you on how to open disk utility on Mac from Spotlight or application window.
3. markruss., foxmsft., MarioHewardt., pzhlkj6612., lukekim., hecongy., analyze-v., VSC-Service-Account., & markrussinovich. (2022, October 27). [Process monitor v3.92.](https://learn.microsoft.com/en-us/sysinternals/downloads/procmon) Microsoft Learn.
  This article helps understand the monitoring processes on Windows.
4. markruss., foxmsft., kapsiR., lukekim., markrussinovich., & kwadrat. (2023, January 26). [Sysinternals utilities index.](https://learn.microsoft.com/en-us/sysinternals/downloads/) Microsoft Learn.
  This article helps with learning system utilities in Windows.
5. Sandeep. (2023, January 27). [Linux networking commands with examples.](https://mindmajix.com/linux-networking-commands-best-examples) MindMajix.
  This article helps learn the basic Linux networking commands along with a detailed explanation on each
6. Shotts, W. (2019). [Ch 16 Networking.](https://my.uopeople.edu/pluginfile.php/57436/mod_book/chapter/330385/TLCL-19.01.pdf) In The linux command line (5th ed., pp. 201-216). No Starch Press.
  Read Chapter 16 on Networking to learn how to examine and monitor a network.
7. Stieben, D. (2021, December 30). [How to use Ubuntu disk utility for better HDD/SSD management.](https://www.makeuseof.com/tag/manage-ubuntu-hdd-disk-utility/) MUO.
  This article helps in understanding the usage of disk management utility on Ubuntu.
8. [View information about Mac processes in activity monitor.](https://support.apple.com/en-in/guide/activity-monitor/actmntr1001/mac#:~:text=Table%20of%20Contents-,View%20information%20about%20Mac%20processes%20in%20Activity%20Monitor,-Processes%20are%20programs) (n.d.). In Activity monitor user guide (macOS Ventura 13). Apple Support.
  This article helps in understanding how to monitor and manage processes on Mac OS version macOS Ventura 13.

## Discussion Forum

Identify what utilities in an operating system are most useful to you. If you don’t know of any, look them up in your system and/or refer to the required readings. Click on or access some of these utilities and explore them.
Pick any three of them and then take a screenshot of each one and explain each utility as if you were trying to sell them to a customer, the customer being the other students in the course. You will explain and post each of these utilities listed above and post it to the discussion board.
In your responses to your peers, compare and contrast your answer to those of your peers.

オペレーティングシステムにおけるユーティリティのうち、自分にとって最も役立つものを特定してください。
もし具体的なユーティリティがわからない場合は、自分のシステムで調べるか、必須の教材を参照してください。これらのユーティリティのいくつかをクリックまたはアクセスして探究してください。
その中から任意の3つを選び、それぞれのスクリーンショットを撮影してください。そして、他のコースの学生にそのユーティリティを売り込むつもりで、それぞれを説明してください。
上記のユーティリティの説明とスクリーンショットをディスカッションボードに投稿してください。
クラスメートへの返信では、自分の回答とクラスメートの回答を比較し、対照してください。

### Japanese Discussion

#### 導入

オペレーティングシステムには、システムのパフォーマンスやリソース管理をサポートするさまざまなユーティリティツールが用意されています。これらのツールは、日常的なシステムの最適化や問題のトラブルシューティングに欠かせません。
今回紹介する3つのツールは、Linuxのtopとdf、そしてWindowsのProcess Monitorです。それぞれが異なる分野での効率的な管理を可能にする強力なツールであり、どのように役立つかを以下で詳しく説明します。

#### Linux: top - リアルタイムプロセス管理ツール

`top`はtopはLinuxシステムで動作中のプロセスやリソース使用状況をリアルタイムで表示するツールです。特に、CPUやメモリの使用率が高いプロセスを迅速に特定するのに役立ちます。
**主な特徴**

- 動的な更新による最新情報の取得。
- CPU、メモリ、プロセス状態などの視覚的表示。
- プロセスの停止や優先度の変更が可能。

**実用例**
システム運用時、CPU使用率やメモリ使用率の推移とともにtopを使用することで、高負荷プロセスを特定し処理の改善やタイムアウト設定など、適切な対策を講じることができる

Figure 1 topのインターフェース

#### Linux: df - ディスク使用状況確認ツール

`df`は、ファイルシステムごとのディスク使用量と空き容量を表示することができるツールです。ディスク容量が枯渇することはシステム運用上重大な問題を引き起こすリスクがあるため、ディスク容量の定期的な監視のために役立ちます。
**主な特徴**

- 各ファイルシステムの使用量と空き容量を表示。
- 人間が読みやすい形式（-hオプション）で出力可能。

**実用例**
新しいソフトウェアをインストールする際に、十分なディスク容量があるかを確認できます。また、ディスク容量が限界に近づいている場合、不要なファイルを削除する計画を立てることができます。
Figure 2: dfコマンドの出力例

#### Windows: Process Monitor - 高度なプロセス監視ツール

Process Monitorは、Windows向けの高度なプロセス監視ツールです。ファイルシステム、レジストリ、ネットワークアクティビティを含む詳細なデータをリアルタイムで取得でき、トラブルシューティングに特化しています。
**主な特徴**

- 高度なフィルタリング機能で特定のプロセスに焦点を絞れる。
- ファイルアクセスやレジストリ操作などの詳細なアクティビティを監視可能。
- システムの異常やエラーの原因を迅速に特定。

**実用例**
特定のアプリケーションがクラッシュする原因を調査する際に使用します。エラーが発生した時刻のログを確認することで、問題を解決するためのヒントを得ることができます。

#### 比較と結論

topは、プロセス管理とリソース監視に優れたツールであり、システムパフォーマンスを迅速に評価できます。一方、dfはストレージ管理に特化しており、ディスク容量を適切に管理するための基本的な情報を提供します。最後に、Process MonitorはWindowsシステムの詳細なトラブルシューティングにおいて欠かせないツールです。
これらのツールを活用することで、システム管理の効率を飛躍的に向上させることができます。目的に応じて適切なツールを選択し、活用してみてください。

#### 参考文献

markruss., foxmsft., MarioHewardt., pzhlkj6612., lukekim., hecongy., analyze-v., VSC-Service-Account., & markrussinovich. (2022, October 27). [Process monitor v3.92.](https://learn.microsoft.com/en-us/sysinternals/downloads/procmon) Microsoft Learn.

## Written Assignment

Your company has recently acquired a new client who requires IT administration service for their Unix-based operating system from your company. In order to do so, new network administrators in your company need to be trained in the networking functions of the Unix operating system.
Your manager wants you to create a technical document that will help the new network administrators to do the above. He wants you to include the following:

- A detail on the steps followed to manipulate and control the networking functions of the Unix operating system.
- Explanation of any three commands that are used to manipulate the networking functions.
- Your peers will evaluate your work using the Written Assignment Unit 7 Rubric for this assignment.
Submit the complete assignment in an MS Word or PDF file.

You will be assessed for:

- Your description of the steps needed to manipulate and control the networking functions of the Unix operating system.
- Your explanation of any three commands that are used to manipulate the networking functions.
Organization and style of the essay (including APA formatting).

あなたの会社は最近、新しいクライアントを獲得しました。このクライアントは、UnixベースのオペレーティングシステムのIT管理サービスをあなたの会社に依頼しています。これに対応するために、会社内の新しいネットワーク管理者を対象に、Unixオペレーティングシステムのネットワーク機能についてのトレーニングを行う必要があります。
あなたのマネージャーは、新しいネットワーク管理者が上記を遂行できるようにするための技術文書を作成するよう求めています。この文書には以下の内容を含める必要があります：

- Unixオペレーティングシステムのネットワーク機能を操作・管理するために従うべき手順の詳細。
- ネットワーク機能を操作するために使用されるコマンドのうち、3つのコマンドの説明。
- この課題のために、ユニット7の書面課題評価基準（Written Assignment Unit 7 Rubric）を使用して同僚があなたの作業を評価します。
完成した課題をMS WordまたはPDFファイルで提出してください。
評価されるポイントは以下の通りです：

- Unixオペレーティングシステムのネットワーク機能を操作・管理するために必要な手順の説明。
- ネットワーク機能を操作するための3つのコマンドの説明。
- エッセイの構成とスタイル（APA形式を含む）。

### Japanese Written Assignment

導入
現代のIT環境において、Unixベースのオペレーティングシステムはネットワーク機能の管理において重要な役割を果たしています。本書では、新任のネットワーク管理者がこれらの機能を効果的に操作・管理するための基本的なガイドを提供します。ネットワークインターフェースの設定に関する主要な手順を概説し、ネットワーク管理およびトラブルシューティングの基盤となる3つの重要なコマンド（ifconfig、traceroute、ss）について解説します。

ネットワーク機能を操作・管理する手順
ネットワークインターフェースの設定
ネットワークインターフェースは、Unixベースのシステムにおける通信の基盤です。管理者は ifconfig コマンドを使用してネットワークインターフェースを確認および設定できます。例えば、特定のインターフェース（例：eth0）を有効化するには、ifconfig eth0 up コマンドを実行します（Sandeep, 2023）。また、IPアドレスやサブネットマスク、ゲートウェイを指定することで、静的なIPアドレスを設定することも可能です。

ネットワーク接続の確認
適切な接続を確認するためには、ping のような基本ツールや、ルーティングパスを確認する traceroute を活用します。これらのツールは、ホストが到達可能であるかどうか、またルート上のどの部分がボトルネックとなっているかを確認する際に役立ちます（Sandeep, 2023）。

ネットワーク接続の監視
管理者は、ネットワークトラフィックや開いているポートを継続的に監視する必要があります。ss コマンドは、アクティブな接続を一覧表示し、不正アクセスやサービスの誤設定などの異常を特定するための強力な方法を提供します。

ネットワーク機能操作に使用される3つのコマンドの説明
ifconfig
ifconfig コマンドは、ネットワークインターフェースを設定および管理するためのレガシーツールです。主な機能には、インターフェースのIPアドレスの確認、特定のインターフェースの有効化や無効化、基本的なネットワーク問題のトラブルシューティングが含まれます。

具体的な利用例：

IPアドレスを確認するには、ifconfig を直接実行します。出力には、各インターフェースの状態、IPアドレス、サブネットマスクが含まれます。
ネットワークインターフェースを無効化する場合は、ifconfig eth0 down を使用します。これにより、eth0 インターフェースが無効化されます。
新しいIPアドレスを割り当てるには、ifconfig eth0 192.168.1.100 netmask 255.255.255.0 を実行します（Sandeep, 2023）。
traceroute
traceroute コマンドは、パケットが目的地に到達するまでの経路を特定するのに不可欠です。このツールは、接続の問題を診断し、特定のルーターやノードが原因で遅延が発生しているかどうかを調査する際に特に有用です。

具体的な利用例：

ホストまでのルートを確認するには、traceroute example.com を実行します。これにより、各ホップ（中継地点）のIPアドレスと遅延時間が表示されます。
ネットワークの特定セグメントで問題が発生している場合、遅延が大きい箇所を特定し、トラブルシューティングの対象を絞り込むことができます（Sandeep, 2023）。
ss
ss コマンドは、従来の netstat コマンドのモダンな代替として知られています。このコマンドは、ソケット統計情報を詳細に提供し、アクティブな接続やリスニング中のポート、プロトコル使用状況を確認することができます。

具体的な利用例：

開いているすべてのTCPポートを表示するには、ss -t を使用します。
サーバーのリスニング状態を確認するためには、ss -l を実行します。このコマンドにより、どのサービスがどのポートで待ち受けているかを特定できます。
異常な接続を調査する際には、ss -a を使ってすべてのアクティブな接続をリストアップし、特定のIPやポートをフィルタリングします（Sandeep, 2023）。
結論
本書では、Unixベースのオペレーティングシステムにおけるネットワーク機能の設定および監視に必要な手順を強調しました。ifconfig、traceroute、ss のようなコマンドを理解し、効果的に使用することで、新任の管理者が堅牢なネットワーク管理を実現し、問題を効率的に解決できるようになります。これらの基本スキルは、さらなる高度なネットワーク管理の習得に向けた土台となります。

参考文献
Sandeep. (2023, January 27). Linux networking commands with examples. MindMajix. Retrieved from <https://mindmajix.com/linux-networking-commands-best-examples>

## Learning Journal

For this assignment, you have to monitor your processes on your system. Identify the applications/processes that are taking up most of your system memory. Which applications/processes are safe to be turned off? Turn off a process that would be non-vital to the system. You may need to conduct your own research for information on what not to turn off if you are not familiar with the common processes of an operating system.
Write a document that describes your process of discovery and report your findings including how the performance of the system is increased. Supplement your findings with adequate screenshots.
Submit the assignment in an MS Word file.
Review the following articles on the detail of managing processes:

- If you are Linux/Unix user review: ‘[How to monitor and manage processes on Linux](https://www.arubacloud.com/tutorial/how-to-monitor-and-manage-processes-on-linux.aspx)’ on managing processes in a Linux/Unix system.
- If you are a MacOS user refer to ’[View information about Mac processes in activity monitor](https://support.apple.com/en-in/guide/activity-monitor/actmntr1001/mac#:~:text=Table%20of%20Contents-,View%20information%20about%20Mac%20processes%20in%20Activity%20Monitor,-Processes%20are%20programs)’.
- If you are a Windows user, will need to read ‘[Process Monitor v3.92](https://learn.microsoft.com/en-us/sysinternals/downloads/procmon)’ for details.
The Learning Journal entry should be a minimum of 500 words. Use APA citations and references if you use ideas from the readings or other sources.

Reference:

- How to monitor and manage processes on Linux. (2021, January 22). aruba Cloud. <https://www.arubacloud.com/tutorial/how-to-monitor-and-manage-processes-on-linux.aspx>
- markruss., foxmsft., MarioHewardt., pzhlkj6612., lukekim., hecongy., analyze-v., VSC-Service-Account., & markrussinovich. (2022, October 27). Process monitor v3.92. Microsoft Learn. <https://learn.microsoft.com/en-us/sysinternals/downloads/procmon>
- View information about Mac processes in activity monitor. (n.d.). In Activity monitor user guide (macOS Ventura 13). Apple Support. <https://support.apple.com/en-in/guide/activity-monitor/actmntr1001/mac#:~:text=Table%20of%20Contents-,View%20information%20about%20Mac%20processes%20in%20Activity%20Monitor,-Processes%20are%20programs>

### Japanese Learning Journal Quesion

この課題では、システム上のプロセスを監視する必要があります。システムメモリを最も多く使用しているアプリケーション/プロセスを特定してください。その中で、安全に停止できるアプリケーション/プロセスはどれかを判断してください。システムにとって重要でないプロセスを1つ停止してください。オペレーティングシステムの一般的なプロセスに詳しくない場合、何を停止してはいけないかについての情報を調査する必要があります。

発見のプロセスを説明し、結果を報告する文書を作成してください。その際、システムのパフォーマンスがどのように向上したかを含めてください。また、適切なスクリーンショットで結果を補足してください。

課題はMS Wordファイル形式で提出してください。

以下の記事を参考にして、プロセス管理の詳細を確認してください：

Linux/Unixユーザーの場合：Linuxでのプロセスの監視と管理方法 を確認してください。
MacOSユーザーの場合：アクティビティモニタでMacのプロセス情報を表示する を参照してください。
Windowsユーザーの場合：Process Monitor v3.92 を参照してください。
学習ジャーナルの記述は500語以上で記載してください。リーディングやその他のソースのアイデアを使用する場合は、APA形式で引用と参照を行ってください。

参考文献：

How to monitor and manage processes on Linux. (2021, January 22). aruba Cloud. <https://www.arubacloud.com/tutorial/how-to-monitor-and-manage-processes-on-linux.aspx>
markruss., foxmsft., MarioHewardt., pzhlkj6612., lukekim., hecongy., analyze-v., VSC-Service-Account., & markrussinovich. (2022, October 27). Process monitor v3.92. Microsoft Learn. <https://learn.microsoft.com/en-us/sysinternals/downloads/procmon>
View information about Mac processes in activity monitor. (n.d.). In Activity monitor user guide (macOS Ventura 13). Apple Support. <https://support.apple.com/en-in/guide/activity-monitor/actmntr1001/mac#:~:text=Table%20of%20Contents-,View%20information%20about%20Mac%20processes%20in%20Activity%20Monitor,-Processes%20are%20programs>

### Japanese Learning Journal

#### はじめに

本課題では、MacOSのアクティビティモニタを使用して、システム上で稼働しているプロセスを監視し、システムメモリを最も消費しているプロセスを特定しました。さらに、システムにとって重要ではないプロセスを停止し、パフォーマンス改善の効果を確認しました。プロセス管理は、システムパフォーマンスを最適化し、リソースの無駄を防ぐための重要なスキルです。MacOSではアクティビティモニタが標準ツールとして提供されており、簡単にプロセスを管理できます。

#### プロセスの監視と特定の方法

アクティビティモニタは、MacOS上のプロセスを監視し、リソース使用状況をリアルタイムで確認できる便利なツールです。以下の手順でプロセスを監視し、重要プロセスと非重要プロセスを区別しました：

1. アクティビティモニタの起動
Finderの「アプリケーション」フォルダ内の「ユーティリティ」からアクティビティモニタを開きました。

2. メモリ使用量の確認
アクティビティモニタの「メモリ」タブを選択し、プロセスをメモリ使用量の降順で並べ替えました。これにより、システムメモリを最も多く使用しているプロセスを特定しました。

3. プロセスの役割の区別
プロセスを停止する前に、その役割や重要性を判断する必要がありました。具体的には以下の観点で区別しました：

1. メモリ使用量の観点
メモリ使用量が高いプロセス（例：Code Helper (Renderer), Google Chrome Helperなど）は、システムリソースに大きな影響を与えるため優先的に確認しました。一方、メモリ使用量が低いプロセスはシステムへの負荷が少なく、停止の必要性は低いと判断しました。
2. プロセスの役割
プロセスを以下の2つに分類しました：

- システムコアプロセス
mds_storesやWindowServerなど、MacOSの基本動作に関わるプロセスは停止してはいけない重要プロセスです。これらはシステム全体の動作に必要不可欠なため、停止対象から除外しました。
- アプリケーション関連プロセス
CodeやGoogle Chrome、DeepLなど、ユーザー（私）が直接利用しているプロセスについては、現在使用しているかどうかを確認しました。使用中でない場合は、停止しても問題がないと判断し、停止候補としました。たとえば、バックグラウンドで動作しているGoogle Chrome Helperのプロセスが、利用していないタブや拡張機能に関連している場合、それを停止することでシステムリソースの最適化が可能です。

3. 使用頻度と緊急性
現在使用していないプロセス（例：DeepL Translatorのプロセス）が明確であれば、それを停止することでメモリリソースを解放しました。

4. リサーチによる確認
不明なプロセスについては、プロセス名を検索し、その役割を確認しました。これにより、停止することの影響を事前に把握するよう努めました。

このような観点を考慮しながら、停止対象のプロセスを慎重に選定しました。これにより、システム動作に悪影響を与えずにパフォーマンスの向上を目指すことができました。

#### プロセスの停止

停止対象として選んだのは、不要なバックグラウンドプロセスである「Mail」で、現在使用していないメールアカウントが同期中でした。このプロセスを停止する手順は以下の通りです：

1. アクティビティモニタの一覧から「Mail」を選択。
2. ウィンドウ右上の「×」アイコンをクリック。
3. ポップアップで「終了」を選択し、プロセスを停止。
プロセスを停止した後、他のシステム機能に影響がないことを確認しました。

#### 結果と考察

プロセス停止後、以下のような改善が見られました：

- メモリ使用量の変化
停止前後のメモリ使用量を比較した結果、使用率が約5%減少しました。特に、複数のアプリケーションを同時に使用する際のシステム応答性が向上しました。

- パフォーマンスの向上
プロセス停止後、SafariやXcodeなどのリソース集約型アプリケーションの動作がスムーズになりました。

- 視覚的証拠
実際のプロセス監視と停止の様子を示すスクリーンショットを撮影し、レポートに添付しました。

これらの結果から、システムメモリの効率的な管理が、日常的な作業効率を向上させることを確認しました。

#### 結論

今回の課題を通じて、アクティビティモニタを使用したプロセス監視と管理の重要性を学びました。プロセスの特定と停止により、システムリソースの最適化が可能であることを実感しました。この経験を通じて、MacOSにおけるプロセス管理スキルをさらに向上させるための基礎が築けました。
