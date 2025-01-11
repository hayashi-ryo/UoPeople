# unit2

- Need for Windows and Mac Operating Systems
- Concurrency
- Parallel Computing

## Goal

main

- Explain parallel computing and identify the best OS for parallel computing.
- Explain the technical differences between Windows and Mac operating systems with the help of use cases.
- Analyze the need for concurrency while designing an operating system.

ja

- 並列コンピューティングについて説明し、並列コンピューティングに最適なOSを特定する。
- ユースケースを参考に、WindowsとMacのOSの技術的な違いを説明する。
- オペレーティングシステムの設計時に、同時実行の必要性を分析する。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Introduction

Have you ever wondered why do we need an operating system in the first place?  Operating systems weren’t always needed for computing; many earlier systems didn’t have or could not run them.  Later, the need arose to have a controlling software that can give permission, handle security, and handle multiple operations/applications while also handling multiple users.  In this unit, we will look at parallel computing and concurrency as they relate to different operating systems and dive into a brief history of each operating system, and you will see a pathway to what you commonly use nowadays in your coding and IT work.

そもそも、なぜオペレーティングシステムが必要なのか疑問に思ったことはありますか？ コンピューティングには、常にオペレーティングシステムが必要だったわけではありません。初期の多くのシステムにはオペレーティングシステムが搭載されていなかったり、搭載されていても実行できなかったりしました。その後、複数のユーザーを処理しながら、許可を与えたり、セキュリティを処理したり、複数の操作やアプリケーションを処理したりできる制御ソフトウェアが必要になりました。 このユニットでは、異なるオペレーティングシステムに関連する並列コンピューティングと並行処理について見ていき、各オペレーティングシステムの簡単な歴史を掘り下げていきます。そして、あなたが現在、コーディングやIT業務で一般的に使用しているものへの道筋がわかるでしょう。

## Reading Assignment

1. A brief history of Unix. (2020, September 2). How-To Geek. <https://www.howtogeek.com/devops/a-brief-history-of-unix/>
  Read this article to learn about Unix operating systems.
2. Arpaci-Dusseau, R. H., & Arpaci-Dusseau, A. C. (2018). Operating systems: Three easy pieces (1.01 ed.). Arpaci-Dusseau Books. Retrieved December 12, 2022. <https://pages.cs.wisc.edu/~remzi/OSTEP/threads-intro.pdf>
  Read Chapter 26: Concurrency: An Introduction.
3. Complete history of Mac OS. (2022, November 23). History of Computer. <https://history-computer.com/technology/complete-history-of-mac-os/>
  Read this article to learn about Mac OS operating systems.
  MacOSとWindowsOSの大きな違い
    MacOSはApple独自のデバイスで動作し、そのデバイスに対して最適化されている。
    WindowsOSはさまざまな企業が設計したデバイス上で動作し、特定のデバイスに対する最適化は行われていない。
4. universedecoder. (2021, June 4). Introduction to parallel computing. GeeksforGeeks. Retrieved December 27, 2022. <https://www.geeksforgeeks.org/introduction-to-parallel-computing/>
  Read this article to get an overview of parallel computing.
5. Patrick, McClanahan. Introduction to Concurrency. San Joaquin Delta College. LibreTexts Engineering. <https://eng.libretexts.org/Courses/Delta_College/Operating_System%3A_The_Basics/05%3A_Process_Synchronization/5.1%3A_Introduction_to_Concurrency>
  Read this article to learn about the pros and cons of concurrency in computing.
6. Ward, K. (2022, September 1). A brief history of Microsoft Windows. Lifewire. <https://www.lifewire.com/brief-history-of-microsoft-windows-3507078>
  Read this article to learn about the history of Microsoft Windows operating systems.

## Discussion Forum

The purpose of this discussion is to examine the technical differences between the two popular operating systems of Windows and Mac, including their pros and cons. The goal is to understand the unique features and capabilities of each system and to consider whether there is a need for both of them depending on different situations.

Instructions:

- Begin by reading the relevant reading assignments and researching the technical differences between Windows and Mac operating systems. Consider factors such as hardware compatibility, system performance, security features, and user interface.
- Write a post that summarizes your findings and provides a comparison of the technical differences between the two operating systems.
- In your post, address the following questions:
  - What are the main technical differences between Windows and Mac operating systems?
  - What are the pros and cons of each system?
  - Is there a need for both Windows and Mac operating systems depending on different situations? Why or why not?
- In your responses to your classmates' posts, expand on their points and provide additional insights or examples to support your points.
Your discussion post must be a minimum of 200 words.

### Japanese Discussion

WindowsとMacの技術的な違いと必要性について

1. 導入
WindowsとMacは、世界中で広く使用されている2つの主要なオペレーティングシステムです。それぞれ異なる強みと特徴を持ち、利用者のニーズや環境によって適切な選択が求められます。本投稿では、これら2つのシステムの主な技術的な違いを比較し、それぞれの長所と短所を分析します。また、特定の状況に応じて両システムが必要かどうかについても考察します。本分析には以下の資料を活用しました：How-To Geekの記事「A brief history of Unix」（2020）、History of Computerの記事「Complete history of Mac OS」（2022）、およびLifewireの記事「A brief history of Microsoft Windows」（2022）。

2. WindowsとMacの主な技術的な違い
ハードウェアの互換性
Windowsは、さまざまなメーカーによって設計された幅広いデバイスで動作可能であり、ゲーミングPCやエントリーレベルのデバイスまで対応しています。一方、MacはApple製のデバイスに特化して設計されており、ハードウェアとソフトウェアの統合により、非常に高い最適化が実現されています（History of Computer, 2022）。この違いは、Windowsがコスト効率や選択肢の広さを提供し、Macがパフォーマンスと安定性を重視していることを反映しています。

システム性能
Windowsは、幅広い用途で高い柔軟性を持ち、大規模なソフトウェアライブラリやゲームへの対応力が特徴です。一方、Macは独自のハードウェア設計とmacOSの最適化により、画像処理や映像編集といったクリエイティブ分野で特に優れた性能を発揮します（Lifewire, 2022）。

セキュリティ機能
Windowsは、その市場シェアの大きさからマルウェアの主要なターゲットになりやすいですが、最新バージョンではWindows DefenderやBitLockerといった強力なセキュリティツールを搭載しています。一方、MacはUnixベースのアーキテクチャを採用しており、ウイルス感染のリスクが低い設計となっています（How-To Geek, 2020）。

ユーザーインターフェース
Windowsはカスタマイズ性が高く、ユーザーが自分好みの設定を行いやすい特徴があります。一方、MacはApple独自の統一されたデザインが特徴であり、操作の一貫性が直感的で、特に初心者やクリエイティブユーザーにとって使いやすいです。

3. WindowsとMacの長所と短所
Windowsの長所と短所
Windowsの主な長所は以下の通りです：

幅広いハードウェアの互換性 - さまざまなメーカーのデバイスで利用可能で、カスタマイズが容易。
ソフトウェア互換性の高さ - ゲームやビジネス用ソフトウェアの多くがWindowsに最適化されている。
手頃な価格帯の選択肢 - エントリーレベルのPCからハイエンドPCまで対応可能。
短所としては、セキュリティリスクが高い点、システムアップデートが煩雑な場合がある点が挙げられます。

Macの長所と短所
Macの強みは次の通りです：

Appleデバイスとのシームレスな連携 - iPhoneやiPadとの統合がスムーズ。
堅牢なセキュリティ - Unixベースの設計により、ウイルス感染のリスクが低い。
デザインとクリエイティブ分野への適性 - 映像編集やデザイン業務で最適な性能を発揮。
一方、短所としては、価格が高いことや、ハードウェアの選択肢が限られていることが挙げられます。

4. 両OSが必要とされる状況
個人の使用目的
ゲームやエンターテイメントを重視する場合、Windowsが適しています。一方、画像編集やデザイン業務を行うユーザーにはMacが推奨されます。たとえば、Adobe Creative SuiteはMacで特にスムーズに動作します。

組織や職場
Windowsは、多様なハードウェアで動作する能力が必要な企業や政府機関に適しています。一方、Macは、セキュリティやデザインが重視される職場や、Apple製品に依存するワークフローを持つ職場で選ばれることが多いです。

教育や研究環境
特定の教育分野において、両OSが必要となるケースがあります。たとえば、プログラミングやシステム管理の教育にはWindowsが、クリエイティブな分野の教育にはMacが利用されています。

5. 結論
WindowsとMacは、それぞれが異なる強みを持つ優れたオペレーティングシステムです。特定の状況や使用目的に応じて適切な選択を行うことが重要です。本投稿では、両システムの違いを考察することで、それぞれの利点を理解しました。ディスカッションを通じて、他の視点を取り入れることでさらなる洞察を得たいと考えています。

参考文献
How-To Geek. (2020, September 2). A brief history of Unix. Retrieved from <https://www.howtogeek.com/devops/a-brief-history-of-unix/>
History of Computer. (2022, November 23). Complete history of Mac OS. Retrieved from <https://history-computer.com/technology/complete-history-of-mac-os/>
Lifewire. (2022, September 1). A brief history of Microsoft Windows. Retrieved from <https://www.lifewire.com/brief-history-of-microsoft-windows-3507078>

## Written Assignment

As a senior developer at a software company, you have been asked to write a training document for junior developers on parallel computing. Your company is looking to introduce parallel computing techniques in various projects, and the junior developers need to understand the basics before they can start working on these projects.

Task:
Write a training document that explains the concept of parallel computing and how it works to a layperson. In your document, you should also explain the use of parallel computing in at least two different work environments and identify the operating system that you believe would be best suited for a workplace that relies heavily on parallel computing. Justify your answer.

You will be assessed on:

- Your explanation of parallel computing, including its fundamental principles, and how it works using appropriate examples to help the reader understand.
- Your discussion of at least two different work environments where parallel computing is used, and the detailed and accurate examples of how it is applied in each environment.
- Your identification and justification of the operating system that you believe would be best suited for a workplace that relies heavily on parallel computing.
- Organization and style of the essay (including APA formatting).

Submit a paper that is at least 2 pages in length exclusive of the reference page, double-spaced using 12-point Times New Roman font. The paper must cite a minimum of two sources in APA format and be well-written. Check all content for grammar, spelling and be sure that you have properly cited all resources (in APA format) used. For assistance with APA formatting, view the Learning Resource Center: Academic Writing.

### Japanese Written Assignment

1. はじめに
並列コンピューティングは、現代のソフトウェア開発において重要な役割を果たしており、大規模で複雑なデータセットを効率的に処理することを可能にします。このトレーニング資料は、ジュニア開発者が並列コンピューティングの基本概念とその応用を理解するためのガイドとして作成されました。この基礎を理解することで、開発者はパフォーマンスとスケーラビリティを向上させる並列処理に依存するプロジェクトに効果的に貢献できるようになります。

2. 並列コンピューティングとは何か？
並列コンピューティングとは、計算問題をより効率的に解決するために、複数のタスクを同時に実行する技術を指します。タスクを順番に処理する逐次コンピューティングとは異なり、並列コンピューティングでは問題を小さなサブタスクに分割し、それらを同時に処理します。このアプローチにより、実行時間が大幅に短縮され、データ集約型や高性能なアプリケーションに適しています (Foster, 1995)。

並列コンピューティングを身近な例で説明すると、レストランのキッチンでの料理準備が挙げられます。複数のシェフが同時に野菜を切ったり、調理したり、盛り付けをしたりすることで、食事の準備が迅速に進みます。同様に、コンピューティングでもタスクを複数のプロセッサやコアに分散させ、それぞれが全体の作業の一部を処理します。例えば、行列の掛け算では、並列アルゴリズムを使用して結果の行列の各要素を同時に計算することができます。

並列コンピューティングの効果的な動作は、次の3つの基本原則に基づいています：

分割（Decomposition）: 問題を小さなタスクに分割する。
並行性（Concurrency）: タスクを同時に実行する。
同期（Synchronization）: 正確な結果を保証するためにタスクを調整する (Rauber & Rünger, 2010)。
3. 並列コンピューティングの利用例
3.1 利用例 1: 科学研究
科学研究では、大規模なデータセットを処理したり、複雑なシミュレーションを実行したりする際に並列コンピューティングがよく利用されます。例えば、天気予報モデルでは、並列コンピューティングを用いて複数の地域の大気状況を同時にシミュレーションします。それぞれのプロセッサが特定の地理的エリアを担当し、迅速かつ正確な予測を可能にします。また、ゲノム解析では並列アルゴリズムを使用してDNA配列を分析し、遺伝的変異や健康リスクをより迅速に特定しています (Barney, n.d.)。

3.2 利用例 2: 金融業界
金融業界では、リアルタイム分析やリスク管理のために並列コンピューティングが欠かせません。例えば、高頻度取引システムでは、大量の市場データを同時に処理し、ミリ秒単位で利益を生む取引機会を特定します。また、銀行ではモンテカルロシミュレーションを実行し、並列処理によって何千もの市場シナリオを生成してリスクを評価しています (Rauber & Rünger, 2010)。

4. 並列コンピューティングに最適なオペレーティングシステム
並列コンピューティングに大きく依存する職場に最適なオペレーティングシステムはLinuxです。その理由は以下の通りです：

柔軟性とカスタマイズ性
Linuxはオープンソースであり、必要に応じてシステムレベルやカーネルレベルの最適化が可能です。例えば、並列コンピューティングに特化したディストリビューション（例: CentOS StreamやRocky Linux）は、特定のフレームワークやハードウェアに合わせて調整できます (Foster, 1995)。

並列コンピューティングフレームワークとの互換性
LinuxはOpenMPやMPI（Message Passing Interface）など、並列コンピューティング用の主要なフレームワークを広範にサポートしています。これにより、大規模な並列処理を効率的に実行することができます (Barney, n.d.)。

高いリソース管理性能
Linuxは優れたプロセッサ、メモリ、I/Oリソースの管理機能を持ち、大規模な並列ワークロードを効果的に処理します。この性能により、科学研究や金融業界の高性能計算環境において広く採用されています (Rauber & Rünger, 2010)。

5. おわりに
並列コンピューティングは、計算効率とスケーラビリティを向上させる重要な技術であり、さまざまな業界で大きな役割を果たしています。その原理と応用を理解することで、ジュニア開発者はこの技術の重要性を深く認識し、これを活用するプロジェクトに効果的に貢献できるようになります。Linuxは、その柔軟性、並列処理フレームワークとの互換性、リソース管理機能により、並列コンピューティングを多用する環境において理想的なオペレーティングシステムです。

6. 参考文献
Foster, I. (1995). Designing and building parallel programs: Concepts and tools for parallel software engineering. Addison-Wesley.
Rauber, T., & Rünger, G. (2010). Parallel programming: For multicore and cluster systems. Springer.
Barney, B. (n.d.). Introduction to parallel computing. Lawrence Livermore National Laboratory. Retrieved from <https://computing.llnl.gov/tutorials/parallel_comp/>.

## Learning Journal

Imagine you are designing an operating system for a company. Read Introduction to Concurrency <https://eng.libretexts.org/Courses/Delta_College/Operating_System%3A_The_Basics/05%3A_Process_Synchronization/5.1%3A_Introduction_to_Concurrency> , and answer the following questions:

1. Explain what your operating system would be used for and what components it would utilize, such as a GUI or command line interface, etc.
2. Would you give this OS a concurrency ability or not?
3. What would be the need to include/not include concurrency?
4. What would be the advantage (if any) of letting/not letting an OS run concurrently?
The Learning Journal entry should be a minimum of 500 words and not more than 750 words. Use APA citations and references if you use ideas from the readings or other sources.

Reference:
Patrick, McClanahan. Introduction to Concurrency. San Joaquin Delta College. LibreTexts Engineering.

あなたがある会社向けのオペレーティングシステムを設計すると仮定してください。「Introduction to Concurrency」（<https://eng.libretexts.org/Courses/Delta_College/Operating_System%3A_The_Basics/05%3A_Process_Synchronization/5.1%3A_Introduction_to_Concurrency）を読み、以下の質問に回答してください。>

1. あなたのオペレーティングシステムは何のために使われ、どのようなコンポーネント（GUIやコマンドラインインターフェースなど）を利用する予定ですか？
2. このOSに並行性（Concurrency）の能力を持たせますか？持たせませんか？
3. 並行性を含める/含めない必要性は何ですか？
4. OSを並行実行させる/させないことの利点は何ですか？（もしあれば）
学習ジャーナルのエントリー
回答は500～750語で記述してください。読んだ資料やその他の情報源からアイデアを使用する場合は、APA形式の引用と参考文献を含めてください。

参考文献
Patrick, McClanahan. Introduction to Concurrency. San Joaquin Delta College. LibreTexts Engineering.

### Japanese Learning Journal

1. 導入（Introduction）
セキュリティが重視される業界、特に金融機関や医療機関では、機密性の高いデータを保護するために特別な設計が必要です。このような状況下で使用されるオペレーティングシステム（OS）は、データの安全性と信頼性を最優先にし、内部および外部の脅威に対して十分に耐性を持つ必要があります。本稿では、セキュリティ重視のOSを設計する際の目的と構成要素、並行性の有無、およびそれに関連する利点を考察します。

2. OSの用途と構成要素（What the OS Would Be Used For and Its Components）
セキュリティ重視のOSは、主に次の用途で使用されます：

- 金融機関でのトランザクション処理とアカウント情報の管理。
- 医療機関での患者データの保存、共有、およびアクセス制御。
このOSには、以下の構成要素を採用します：
- ユーザーインターフェース（UI）: GUIとCLIの両方を提供し、管理者にはコマンドラインを、一般ユーザーには直感的なGUIを使用可能にします。
- セキュリティモジュール: データ暗号化、ユーザー認証、ファイアウォールを統合。
- アクセス制御: ロールベースアクセス制御（RBAC）を実装し、ユーザーごとに権限を細かく設定。
これらの機能により、システム全体の安全性と使いやすさを両立させます。Silberschatz et al. (2020) は、セキュリティモジュールの統合が堅牢なシステム設計の基盤であると強調しています。

3. 並行性を持たせるか否か（Including Concurrency or Not）

このOSには並行性を持たせる設計を採用します。その理由は以下の通りです：

- 複数タスクの効率的な処理: 金融トランザクションや医療記録の更新など、複数のリクエストが同時に発生するシナリオに対応するため。
- 応答性の向上: 並行性により、リソースを最大限に活用してユーザー体験を向上させる。たとえば、バックグラウンドでのログ記録とリアルタイムのリクエスト処理を同時に行うことが可能です。

4. 並行性を含める必要性（The Need to Include Concurrency）
並行性を含める必要性は、以下のニーズに基づいています：

- リアルタイム性: 並行性があることで、セキュリティスキャンやバックアップ作業をリアルタイムのユーザー操作と並行して実行できます。
- 効率的なリソース使用: マルチプロセッサ環境で複数のプロセスを同時に処理することで、ハードウェアの性能を最大限に引き出します。
Stallings (2018) は、並行性を活用することでリソース管理が効率化され、特に多ユーザーシステムにおいてパフォーマンスが大幅に向上すると述べています。一方で、並行性の実装にはデッドロックの回避やプロセス間通信の同期など、追加の設計課題が発生しますが、それ以上の利点が得られるため必要と判断します。

5. 並行実行の利点（Advantages of Letting the OS Run Concurrently）
並行実行を許可することの主な利点は次の通りです：

- パフォーマンスの向上: 並行性により、複数のユーザーリクエストを効率的に処理できます。たとえば、医療機関では複数の診療データが同時に処理されるシナリオがあります。
- 障害耐性: 一部のプロセスが失敗しても、並行性によって他のプロセスが継続的に稼働するため、システムの可用性が向上します。
ただし、複雑さが増すため、適切な同期機構やリソース管理が不可欠です。

6. 結論（Conclusion）
セキュリティ重視のOSは、高い安全性と効率性を両立するために設計されます。このOSはGUIとCLIを併用し、暗号化や認証といったセキュリティモジュールを統合しつつ、並行性を活用して複数のタスクを効率的に処理します。並行性の実装により得られる利点は、企業や医療機関における実運用上の課題を解決する上で大きな役割を果たします。今後、この設計を基にさらなる拡張性を確保し、新たなセキュリティ課題に対応する予定です。

7. 参考文献（References）
Patrick, McClanahan. Introduction to Concurrency. (n.d.) San Joaquin Delta College. LibreTexts Engineering.
Silberschatz, A., Galvin, P. B., & Gagne, G. (2020). Operating system concepts (10th ed.). Wiley.
Stallings, W. (2018). Operating systems: Internals and design principles (9th ed.). Pearson.
