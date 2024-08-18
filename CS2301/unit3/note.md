# unit3

- Limited Direct Execution
- Restricted Operations
- Switching Between Processes
- CPU Scheduling Algorithm
- 限定的な直接執行
- 操作の制限
- プロセス間の切り替え
- CPUスケジューリング・アルゴリズム

## Goal

- By the end of this Unit, you will be able to:
  - Discuss how operating systems switch between processes to maximize efficiency.
  - Design a theoretical scheduler that will work with a smart device’s CPU.
  - Explain why CFS is the preferred way to run a CPU and how it is run on Linux.
- ja
  - 効率を最大化するためにオペレーティングシステムがどのようにプロセス間を切り替えるかについて説明しなさい。
  - スマートデバイスのCPUで動作する理論的なスケジューラを設計しなさい。
  - なぜCFSがCPUを動作させるのに好ましい方法なのか、またLinuxではどのように動作するのかを説明しなさい。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

1. Arpaci-Dusseau, R. H., & Arpaci-Dusseau, A. C. (2018). Operating systems: three easy pieces (1.01 ed.). Arpaci-Dusseau Books. Retrieved June 16, 2022, from <https://pages.cs.wisc.edu/~remzi/OSTEP/>
  Read Virtualization: Chapter 6 - Direct Execution
  Chapter 7 - CPU Scheduling
    CPUのスケジューリングアルゴリズム
      FIFO: 重い処理によって軽い処理まで遅くなる可能性がある
      SJF: タイミングによってはFIFOと同じ問題がある
      STCF: 途中で新たな処理が到着しても、「完了予定時間が最短」であるものから優先して実施する
      RR(Time slicing): 全ての処理を一定時間ずつ実行することでトータルのレスポンスタイムの改善を図る。しかし、ターンアラウンドタイムを基準とすると悪い。
  Chapter 8 - Multi-level Feedback
  Chapter 9 - Lottery Scheduling.
2. CFS scheduler. (n.d.). The Linux Kernel.  <https://www.kernel.org/doc/html/latest/scheduler/sched-design-CFS.html>
  This resource explains CFS Scheduler.
3. pagidimarrybhanupriya. (2021, November 30). Comparison of different CPU scheduling algorithms in OS. GeeksforGeeks. Retrieved June 17, 2022, from <https://www.geeksforgeeks.org/comparison-of-different-cpu-scheduling-algorithms-in-os/?ref=lbp>
  Read all the CPU scheduling algorithms in this resource.

## Discussion Forum

**Discussion Assignment**

Please refer to the document: Types of CPU Scheduling algorithms and find out the best type of CPU scheduling system out of the seven mentioned in the document. Provide facts to support your claims to persuade your peers.
In your responses to your peers, compare and contrast your answer to those of your peers.

**Reference**

Saini, K. (2019, October 28). Types of CPU scheduling algorithms. OpenGenus <https://iq.opengenus.org/types-of-cpu-scheduling-algorithms/>
Your Discussion should be a minimum of 200 words in length and not more than 500 words. Please include a word count.
Use APA citations and references for the textbook and any other sources used; you should use at least 1 APA citation and reference, but you can use more if needed. Refer to the UoPeople APA Tutorials in the LRC for help with APA citations. You are required to post an initial response to the question/issue presented in the Forum and then respond to at least 3 of your classmates’ initial posts.  You should also respond to anyone who has responded to you. Don’t forget to rate the postings of your classmates according to the Rating Guidelines. Review the Discussion Forum rating guidelines to see how your classmates will be rating your post.

**ディスカッション課題**

ドキュメント「CPUスケジューリングアルゴリズムの種類」を参照し、ドキュメントに記載されている7つの中から最適なCPUスケジューリングシステムの種類を見つけてください。あなたの主張を裏付ける事実を提供し、同級生を説得しましょう。
同級生への返信では、自分の回答と同級生の回答を比較対照してください。

**参考文献**

Saini, K. (2019年10月28日). CPUスケジューリングアルゴリズムの種類. OpenGenus <https://iq.opengenus.org/types-of-cpu-scheduling-algorithms/>
あなたのディスカッションは、最低でも200語、最大でも500語である必要があります。語数を含めてください。
教科書や使用したその他のソースに対して、少なくとも1つのAPA引用と参考文献を使用する必要がありますが、必要に応じてそれ以上使用しても構いません。APA引用に関するヘルプは、LRCのUoPeople APAチュートリアルを参照してください。フォーラムで提示された質問/問題に対して最初の返信を投稿し、その後少なくとも3人のクラスメートの初回投稿に返信する必要があります。また、自分に返信した人には必ず返信してください。クラスメートの投稿を評価ガイドラインに従って評価することを忘れないでください。同級生があなたの投稿をどのように評価するかを確認するために、ディスカッションフォーラムの評価ガイドラインを見直してください。

### Japanese Discussion

最適なCPUスケジューリングアルゴリズム
CPUスケジューリングアルゴリズムの中で「最適」なシステムを決定するには、いくつかの重要な尺度を詳細に評価する必要があります：待ち時間、ターンアラウンドタイム、応答時間、スループット、CPU使用率、公平性、および複雑さ。これらの尺度はすべて、スケジューリングシステムのパフォーマンスと効率に重要な役割を果たします。これらの要素を慎重に考慮した結果、**マルチレベルフィードバックキュー（MLFQ）**アルゴリズムが最も最適な選択であると主張します。

マルチレベルフィードバックキュー（MLFQ）の評価
待ち時間: MLFQは、プロセスの動作や要求に基づいて動的に優先順位を調整することで、待ち時間を通常低く保ちます。この適応性により、短いプロセスが迅速に実行され、長いプロセスも飢餓状態になりません。

ターンアラウンドタイム: MLFQでは、短いジョブを優先しつつ、長いジョブも異なるキューを通じて進行するため、ターンアラウンドタイムは一般的に短いです。この動的な優先順位付けが、全体的なターンアラウンドタイムを最小化するのに役立ちます。

応答時間: 特にインタラクティブおよびI/Oバウンドプロセスに対して、迅速な応答時間を提供します。新しいプロセスを初期的に高優先度のキューに配置することで、迅速にCPU時間を確保します。

スループット: 短いプロセスと長いプロセスの両方を効率的に処理するため、MLFQは高いスループットを維持します。CPUがアイドル状態になることを防ぎ、コンテキストスイッチに費やされる時間を減らすことで、システムの効率を高めます。

CPU使用率: MLFQは、異なる優先度のキュー間でワークロードをバランスよく分配することで、高いCPU使用率を確保します。システムの現在の状態に適応する能力が、CPUが一貫してプロセスに従事していることを意味します。

公平性: MLFQは複雑ではありますが、プロセスの優先順位を動的に調整することで、飢餓状態を防ぎつつ公平性を確保します。CPU時間を受け取っていないプロセスが徐々に高優先度のキューに移動され、最終的に実行されるようにします。

複雑さ: MLFQはその動的な性質と複数のキューの必要性から最も複雑なスケジューリングアルゴリズムの一つですが、パフォーマンスの利点は多くの場合この複雑さを上回ります。現代のシステムはこの複雑さに対応できるため、MLFQは実際的な選択となります。

他のアルゴリズムとの比較
ラウンドロビンスケジューリング（RR）: RRはシンプルで公平性が高く、応答時間も良好ですが、特に異なる長さのプロセスが存在する環境では、スループットやCPU使用率がMLFQほど優れないことがあります。
最短ジョブ優先（SJF）および最短残り時間優先（SRTF）: これらのアルゴリズムは待ち時間とターンアラウンドタイムを最小化できますが、長いプロセスの飢餓やプロセス実行時間の予測の難しさに問題があります。
優先度スケジューリング: 効率的ではありますが、公平性の問題があり、特に低優先度のプロセスが飢餓状態になるリスクがあります。
結論
結論として、各CPUスケジューリングアルゴリズムにはそれぞれの長所と短所がありますが、**マルチレベルフィードバックキュー（MLFQ）**アルゴリズムは、主要なパフォーマンス指標全体で最もバランスが取れています。その動的な性質とさまざまなプロセス要求に適応する能力により、MLFQは現代の複雑なオペレーティングシステムに最も適した選択となります。プロセスの動作に基づいて優先順位を調整し、時間の経過とともに優先順位を変更することで、MLFQは効率的なCPU使用率、高いスループット、および公平性を確保し、優れたCPUスケジューリングアルゴリズムとなります。

## Written Assignment

**Scenario**: You work as a developer in XYZ company. You have been tasked by your manager to work on a project for one of your company’s clients based on their requirements.

**Client Details and Requirements**

**Firm Name**: U235 Nuclear Power Plant
**Client Requirement**:

We at U235 Nuclear Power Plant are very concerned about our employees well being. Considering the nature of work, we plan to give a wearable device that can keep a track of our employees’ health and relay that information to a smartphone through an app.

**Project Details**

The device is ready and the mobile app will be created by the app development team. You are working in a team that is responsible for creating an OS (you are free to assume an OS) for the wearable device.

**You have been assigned to do the following:**

Choose the method of which your company's device’s CPU will choose process precedence, using the methods mentioned in the reading assignments.

- Convey the rationale behind your choice by explaining in detail why you would use this particular method to the development team. You will pitch to convince the team that your idea is the best method for the device to utilize.

**Important Note**: Keep in mind that there is not a lot of information being processed other than relaying a lot of I/O to the smartphone and a display to the user.

You may refer to the following resource for an example of what Linux uses for scheduling as a best practice: <https://www.kernel.org/doc/html/latest/scheduler/index.html>

**Submit the assignment in MS Word or PDF file.**

**Reference:**
Linux scheduler — The linux kernel documentation. (n.d.). The Linux Kernel. <https://www.kernel.org/doc/html/latest/scheduler/index.html>

You will be assessed based on:

- Your choice(s) of the method(s) of which the device’s CPU will choose process precedence.
- Your explanation behind the rationale for your choice(s) of method(s).
- Organization and style of the essay (including APA formatting).

Submit a paper that is at least 1 page in length exclusive of the reference page, double-spaced using 12-point Times New Roman font. The paper must cite a minimum of two sources in APA format and be well-written. Check all content for grammar, spelling and be sure that you have properly cited all resources (in APA format) used. Refer to the UoPeople APA Tutorials in the LRC for help with APA citations.

**シナリオ**: あなたはXYZ会社の開発者として働いています。上司から、会社のクライアントの要求に基づいてプロジェクトを進めるように指示されました。

**クライアントの詳細と要求**

**会社名**: U235原子力発電所  
**クライアントの要求**:

私たちU235原子力発電所は、従業員の健康を非常に重要視しています。作業の性質を考慮し、従業員の健康状態を追跡し、その情報をアプリを通じてスマートフォンに送信するウェアラブルデバイスを提供する計画です。

**プロジェクトの詳細**

デバイスは準備が整っており、モバイルアプリはアプリ開発チームが作成します。あなたはウェアラブルデバイスのOS（自由にOSを仮定してよい）を作成するチームに所属しています。

**あなたに割り当てられたタスクは次のとおりです**:

読み取り課題で述べられた方法を使用して、会社のデバイスのCPUがプロセスの優先順位を選択する方法を選択してください。

- 選択した方法の理由を詳しく説明し、その方法が最適であることを開発チームに説得するためのプレゼンテーションを行ってください。

**重要な注意事項**: スマートフォンへの多くのI/Oを中継することとユーザーへの表示以外に多くの情報が処理されていないことを念頭に置いてください。

次のリソースを参照し、Linuxがスケジューリングに使用するベストプラクティスの例として利用することができます: <https://www.kernel.org/doc/html/latest/scheduler/index.html>

**MS WordまたはPDFファイルで課題を提出してください。**

**参考文献**:
Linux scheduler — The linux kernel documentation. (n.d.). The Linux Kernel. <https://www.kernel.org/doc/html/latest/scheduler/index.html>

以下の点で評価されます:

- デバイスのCPUがプロセスの優先順位を選択するために選択した方法
- 選択した方法の理由の説明
- エッセイの構成とスタイル（APAフォーマットを含む）

1ページ以上（参考文献ページを除く）、ダブルスペース、12ポイントのTimes New Romanフォントで記入してください。APAフォーマットで最低2つのソースを引用し、よく書かれていることが求められます。文法やスペルの確認を行い、使用したリソースを適切に引用していることを確認してください。APA引用の助けを得るために、UoPeopleのLRCにあるAPAチュートリアルを参照してください。

### Japanese Written Assignment

### はじめに

U235原子力発電所は、従業員の健康を非常に重要視しています。作業環境の厳しさを考慮し、従業員の健康状態を追跡し、その情報をスマートフォンアプリに送信するウェアラブルデバイスを提供することを決定しました。デバイスはすでに準備が整っており、モバイルアプリはアプリ開発チームによって作成されます。私のチームは、このウェアラブルデバイス用のオペレーティングシステム（OS）を作成する責任があります。本稿では、デバイスのCPUがプロセスの優先順位を選択する方法について説明し、この方法がプロジェクトに最適な理由を説明します。

### 方法の選択

ウェアラブルデバイスのCPUがプロセスの優先順位を決定するために、私たちはLinuxカーネルで使用される評価の高いスケジューリング手法である完全公平スケジューラ（CFS）方式を選択しました。CFSはプロセスに対して公平かつ効率的にCPU時間を割り当てることを目指しており、私たちのプロジェクトの要件に適しています。

### 詳細な説明と理由

CFSは各プロセスの仮想実行時間を維持することで動作します。各プロセスが消費したCPU時間を追跡し、すべてのプロセスが公平にCPU時間を受け取ることを保証します。スケジューラは最も少ない仮想実行時間を持つプロセスを選択して実行し、すべてのプロセス間で負荷を均等に分散させます (Mauerer, 2010)。

CFSがウェアラブルデバイスに適している主な利点は、その低遅延と高スループットです。主な機能が健康データの中継とユーザーへの情報表示を含む場合、システムの応答性が重要です。CFSはI/Oバウンドプロセスの待機時間を最小限に抑え、これによりデバイスのリアルタイム性能が向上します (Bovet & Cesati, 2005)。

さらに、CFSの設計はウェアラブルデバイスの制約にもうまく適合します。限られた処理能力とメモリリソースを考慮すると、このスケジューラのシンプルさと効率性はシステムのオーバーヘッドを最小限に抑え、デバイスの全体的な安定性と性能に寄与します (Love, 2010)。

### 実装の考慮事項

CFSをウェアラブルデバイスに実装するには、ハードウェアのリソース制約を考慮した慎重な最適化が必要です。これには、スケジューラのパラメータを調整し、I/O操作を効果的に優先することが含まれます。さらに、仮想実行時間の計算が軽量であることを確認し、デバイスのバッテリー寿命や全体的な性能に重大な影響を与えないようにする必要があります (Silberschatz, Galvin, & Gagne, 2018)。

もう一つの考慮事項は、CFSとリアルタイムの健康監視要件の統合です。これには、重要な健康アラートが直ちに処理されるように優先度ブーストを実装することが含まれ、健康追跡機能の信頼性を維持します (Tanenbaum & Bos, 2015)。

### 結論

結論として、U235原子力発電所のウェアラブルデバイスに完全公平スケジューラを採用することは、リアルタイムの健康監視と効率的なデータ中継というプロジェクトの目標に沿った戦略的な決定です。CFSの低遅延、高スループット、公平性は、このデバイスが指定された条件下で信頼性高く動作するための最適な選択肢です。このスケジューリング手法を活用することで、クライアントの要件を満たし、プロジェクト全体の成功に寄与することができます。

### 参考文献

Bovet, D. P., & Cesati, M. (2005). Understanding the Linux kernel (3rd ed.). O'Reilly Media.

Linux scheduler — The linux kernel documentation. (n.d.). The Linux Kernel. Retrieved from <https://www.kernel.org/doc/html/latest/scheduler/index.html>

Love, R. (2010). Linux kernel development (3rd ed.). Addison-Wesley.

Mauerer, W. (2010). Professional Linux kernel architecture. Wrox.

Silberschatz, A., Galvin, P. B., & Gagne, G. (2018). Operating system concepts (10th ed.). Wiley.

Tanenbaum, A. S., & Bos, H. (2015). Modern operating systems (4th ed.). Pearson.

---

このドラフトには、議論を支えるためのAPAスタイルの引用が含まれています。提出前に内容の正確性と完全性を確認してください。

## Learning Journal

Read CFS: Completely fair process scheduling in Linux and explain how CFS is run on Linux and how it is the preferred way for running a CPU efficiently.

**Reference**

Kalin, M. (2019, February 5). CFS: Completely fair process scheduling in linux. Opensource.com. <https://opensource.com/article/19/2/fair-scheduling-linux>

「CFS: Completely fair process scheduling in Linux」を読み、CFSがLinux上でどのように実行されるか、そしてCPUを効率的に実行するための推奨方法である理由を説明してください。

参考文献

Kalin, M. (2019年2月5日). CFS: Completely fair process scheduling in Linux. Opensource.com. <https://opensource.com/article/19/2/fair-scheduling-linux>

### Japanese Learning Journal

完全公平スケジューラ（CFS）は、Linuxカーネルのデフォルトのプロセススケジューラであり、実行中のプロセス間でCPU時間を公平に分配するように設計されています。これは、すべての利用可能なCPUコアにわたってワークロードをバランスさせることにより、CPU効率を最大化することを目的とした高度なスケジューリングアルゴリズムです。

**CFSがLinux上でどのように実行されるか**

CFSは「仮想ランタイム」という概念に基づいて動作し、各プロセスが公平なCPU時間を受け取ることを保証します。スケジューラはレッドブラックツリーというバランスの取れた二分探索木を保持し、各ノードがランナブルプロセスを表し、その仮想ランタイムでソートされます。プロセスをスケジュールする際、スケジューラは最も左のノード（最小の仮想ランタイムを持つプロセス）を選択し、CPU時間をあまり受け取っていないプロセスが優先されるようにします。
仮想ランタイムは、プロセスの実際のランタイムにその重みを考慮して計算されます。この重みはプロセスのnice値から導かれ、ユーザーがプロセスの優先度を示すために設定できます。低いnice値は高い優先度を意味し、その結果、仮想ランタイムの増加が少なくなります。このメカニズムにより、CFSは公平性を達成し、低優先度のプロセスが飢えることなく、高優先度のプロセスが必要なCPU時間を取得できるようにします。
CFSはまた、「スリーパーフェアネス」という機能を実装しており、ユーザー入力を待つために多くの時間を費やすインタラクティブプロセスが、スリープ状態でペナルティを受けないようにします。これらのプロセスが再びランナブルになると、仮想ランタイムが調整され、CPU時間の公平な分配が維持されるため、システム全体の応答性が向上します。

**CFSがCPUを効率的に実行するための推奨方法である理由**

1. 公平性: CFSはすべてのプロセスがその優先度と以前の使用に基づいて公平なCPU時間を受け取ることを保証するように設計されています。これにより、単一のプロセスがCPUを独占することを防ぎ、リソースのバランスの取れた分配が実現します。
2. 応答性: スリーパーフェアネス機能により、ユーザー入力を頻繁に待つインタラクティブプロセスが再びアクティブになるとすぐにスケジュールされるため、システムの応答性が向上します。これにより、特にデスクトップ環境でのユーザー体験が向上します。
3. 効率性: CFSのレッドブラックツリー構造と仮想ランタイムの計算により、プロセススケジューリングの管理が効率的に行われ、オーバーヘッドが最小限に抑えられます。ツリーのバランスが取れているため、挿入、削除、次に実行するプロセスの検索などの操作が対数時間で行われ、スケジューラの全体的な効率が向上します。
4. スケーラビリティ: CFSは複数のCPUコアにわたってスケーラブルであり、現代のマルチコアプロセッサに適しています。すべての利用可能なコアにワークロードを効果的に分散させ、単一のコアが過負荷になることなく、他のコアがアイドル状態になることを防ぎます。このバランスの取れた分散により、システム全体のパフォーマンスと効率が向上します。

結論として、Linuxの完全公平スケジューラ（CFS）は、公平性、応答性、効率性、スケーラビリティを提供する高度なプロセススケジューリングアルゴリズムです。仮想ランタイムとレッドブラックツリー構造を使用することで、CFSはすべてのプロセスが公平なCPU時間を受け取ることを保証し、現代のオペレーティングシステムでCPUを効率的に実行するための理想的な選択となっています（Kalin, 2019）。

**参考文献**

Kalin, M. (2019年2月5日). CFS: Completely fair process scheduling in Linux. Opensource.com. <https://opensource.com/article/19/2/fair-scheduling-linux>
