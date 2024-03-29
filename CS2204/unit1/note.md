# unit1

- Uses of Networks
- LAN, WAN, VPN, Wireless Networks, Internet
- Protocol Hierarchies, Design Issues, Connectionless and Connection-Oriented services
- Reference Models OSI and TCP/IP
- Connection-Oriented network ATM
- Ethernet
- Wireless LANs
- Standardization

## Goal

- Learning Objective:
  - Compare Ethernet and Asynchronous Transfer Mode
  - Distinguish between connection-oriented and connectionless services
  - Identify design related issues when defining a network protocol
- ja
  - イーサネットと非同期転送モードの比較
  - コネクション型サービスとコネクションレス型サービスの区別
  - ネットワーク・プロトコルを定義する際の設計に関する問題を特定する

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- 1. Dordal, P. (2019). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827216/mod_book/chapter/484132/ComputerNetworksText.pdf>
  - Section 1 – An Overview of Networks
    - Read 1.1 Layers – 1.9 LANS and Ethernet
    - Read 1.15 – IETF and OSI
  - Section 3 – Other  -  LANs
    - Read 3.1 Virtual Private Networks – 3.5 Asynchronous Transfer Mode: ATM
    - Read 3.7 Wi-Fi Introduction (3.7.1 onwards is optional reading for this unit)
- 2. a7thson. (2003, January 2). Connection-oriented and connectionless services. everything2.  <http://everything2.com/index.pl?node_id=1409718>
- 3. (n.d.). Computer networks. Read Section 1.3 Network Software. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827216/mod_book/chapter/484132/Networks%203.pdf?time=1588616613482>

## Discussion Forum

Compare ATM (Asynchronous Transfer Mode) and ETHERNET on the following aspects:
Bandwidth
Scalability
Interoperability
Quality of Service
Note any areas where you may want or need some further explanation.  Ask questions of your fellow classmates.

ATM（非同期転送モード）とETHERNETを以下の側面から比較してください：
帯域幅
拡張性
相互運用性
サービス品質
さらに説明が必要な部分があれば、メモしてください。 クラスメートに質問すること。

クラスメートの皆さんこんにちは、今回の質問に対する私の見解を説明します。
まずは、ATM(非同期転送モード)とイーサネットを簡単に説明します。
ATM(非同期転送モード)
ATMは主に高速通信を目的としたネットワーク技術です。53バイトの固定長セルを使用してデータを転送し、音声・ビデオ・データ通信の統合を可能にすることを目的として設計されました。。ATMは、その設計により高いレベルのQoS（Quality of Service：品質保証）を提供し、特にリアルタイムアプリケーションや高帯域幅を必要とするアプリケーションに適しています。ATMネットワークは、広域ネットワーク（WAN）やキャリアネットワークでの使用が想定されており、帯域幅の確保やトラフィック管理に優れた能力を持っています。

イーサネット
イーサネットは、ローカルエリアネットワーク（LAN）技術の一つで、1970年代に開発されたものです。パケットスイッチング技術を使用してデータを転送し、オフィスビルやキャンパスなど、比較的狭い範囲のネットワーク構築に広く用いられています。イーサネットはその簡易さ、柔軟性、低コストから、世界中で最も普及しているネットワーク技術の一つです。速度のバリエーションも広がっており、初期の10Mbpsから、1Gbps（ギガビットイーサネット）、さらには10Gbpsを超える速度を提供する製品もあります。イーサネットは拡張性が高く、小規模なホームネットワークから大規模な企業ネットワークまで対応可能です。

次に、4つの観点で比較します。

帯域幅
ATM：ATMは固定長のセル（53バイト）を使用してデータを転送します。この方式は、高帯域幅のアプリケーションに適しており、特に音声やビデオなどのリアルタイムデータの転送に有利です。ATMネットワークは、PVC（Permanent Virtual Circuits：恒久的仮想回線）やSVC（Switched Virtual Circuits：交換仮想回線）を使用して、事前に定義された帯域幅を保証することができます。
イーサネット：イーサネットは変動するフレームサイズを使用し、一般に低コストで広く普及しています。ギガビットイーサネット（1Gbps）、10ギガビットイーサネット（10Gbps）など、さまざまな速度で利用可能です。ただし、帯域幅は物理的なメディアやネットワークの混雑状態に依存するため、ATMのように事前に定義された帯域幅を保証することは難しいです。

拡張性
ATM：ATMは高度にスケーラブルであり、小規模なオフィスネットワークから広域ネットワーク（WAN）まで幅広く対応できます。特に、品質保証やサービスレベルアグリーメント（SLA）を必要とするアプリケーションで優れた性能を発揮します。
イーサネット：イーサネットも非常に拡張性が高く、簡単に大規模ネットワークへと拡大することができます。特にデータセンターや企業ネットワークでの使用に適していますが、ATMのような厳格な品質保証を提供することは難しい場合があります。

相互運用性
ATM：ATMは特定のプロトコルと技術に依存しており、他のネットワーク技術との相互運用性には制限があります。ATMネットワークを他のタイプのネットワークと組み合わせるには、追加のインターフェースやプロトコル変換が必要になることがあります。
イーサネット：イーサネットは業界標準であり、広く普及しているため、多くのネットワークデバイスやシステムと容易に相互運用できます。これにより、異なるベンダーの機器を使用したネットワークの構築が容易になります。

品質保証
ATM：ATMは、音声やビデオ通信などのリアルタイムアプリケーションに必要な厳格なQoSを提供する設計になっています。ATMは、データの優先順位付け、トラフィック管理、帯域幅の保証など、高度なQoS機能をサポートしています。
イーサネット：イーサネットもQoS機能を提供しますが、ATMほど高度ではありません。イーサネットベースのネットワークでは、QoSを実装するために追加のプロトコルや機器が必要になることがあります。

ATM（Asynchronous Transfer Mode：非同期転送モード）とイーサネットを比較すると、以下のような違いがあります。

帯域幅
ATM：ATMは固定長のセル（53バイト）を使用してデータを転送します。この方式は、高帯域幅のアプリケーションに適しており、特に音声やビデオなどのリアルタイムデータの転送に有利です。ATMネットワークは、PVC（Permanent Virtual Circuits：恒久的仮想回線）やSVC（Switched Virtual Circuits：交換仮想回線）を使用して、事前に定義された帯域幅を保証することができます。
イーサネット：イーサネットは変動するフレームサイズを使用し、一般に低コストで広く普及しています。ギガビットイーサネット（1Gbps）、10ギガビットイーサネット（10Gbps）など、さまざまな速度で利用可能です。ただし、帯域幅は物理的なメディアやネットワークの混雑状態に依存するため、ATMのように事前に定義された帯域幅を保証することは難しいです。
拡張性
ATM：ATMは高度にスケーラブルであり、小規模なオフィスネットワークから広域ネットワーク（WAN）まで幅広く対応できます。特に、品質保証やサービスレベルアグリーメント（SLA）を必要とするアプリケーションで優れた性能を発揮します。
イーサネット：イーサネットも非常に拡張性が高く、簡単に大規模ネットワークへと拡大することができます。特にデータセンターや企業ネットワークでの使用に適していますが、ATMのような厳格な品質保証を提供することは難しい場合があります。
相互運用性
ATM：ATMは特定のプロトコルと技術に依存しており、他のネットワーク技術との相互運用性には制限があります。ATMネットワークを他のタイプのネットワークと組み合わせるには、追加のインターフェースやプロトコル変換が必要になることがあります。
イーサネット：イーサネットは業界標準であり、広く普及しているため、多くのネットワークデバイスやシステムと容易に相互運用できます。これにより、異なるベンダーの機器を使用したネットワークの構築が容易になります。
品質保証（Quality of Service：QoS）
ATM：ATMは、音声やビデオ通信などのリアルタイムアプリケーションに必要な厳格なQoSを提供する設計になっています。ATMは、データの優先順位付け、トラフィック管理、帯域幅の保証など、高度なQoS機能をサポートしています。
イーサネット：イーサネットもQoS機能を提供しますが、ATMほど高度ではありません。イーサネットベースのネットワークでは、QoSを実装するために追加のプロトコルや機器が必要になることがあります。

総合的に、ATMとイーサネットはそれぞれ異なる用途と要件に適しています。ATMはリアルタイムデータ転送と厳格なQoSを必要とする環境で優れていますが、イーサネットは柔軟性、拡張性、コスト効率において広く選ばれています。

## Written Assignment

Written Assignment
Networks are designed in a number of ways, based on the geographical area, the technology used, user group specific, application-based, etc. But we can roughly categorize the communication networks in 2 broad categories, based on transmission: Connection-Oriented and Connectionless.

Please discuss the two categories. Your comments should include the following:

Point by point comparison of their advantages and disadvantages (at least 3 advantages and 3 disadvantages)
Point by point comparison of the design issues for both
Your preference among the two and a suggestion to resolve any one of its design-related problem.
Paper Guidelines

2-3 pages in length, in your own words, properly cite any outside resources.  Use 1" margins and Times Roman Font, 12-point, or something comparable.   The paper should be well organized with proper grammar and spelling.

序論
現代の通信ネットワークは、さまざまな技術とアプローチを組み合わせて構築されています。これらのネットワークは、地理的範囲、使用される技術、特定のユーザーグループ、または特定のアプリケーションに基づいて設計されることがあります。通信ネットワークを理解する上で重要なのは、それらが大きく二つのカテゴリーに分けられることです：接続指向ネットワークと非接続指向ネットワーク。これらのカテゴリーは、データ伝送とネットワークの基本的な哲学において根本的に異なります。接続指向ネットワークは、通信を開始する前に明確な接続パスを確立します。一方、非接続指向ネットワークでは、データパケットは独立しており、予め設定されたパスなしで送信されます。この文書では、これら二つのカテゴリーの利点と欠点、設計上の問題点を比較し、非接続指向ネットワークに対する個人的な好みとその設計関連の問題を解決するための提案を提示します。

本論

**1. Point by point comparison of their advantages and disadvantages (at least 3 advantages and 3 disadvantages)**

接続指向ネットワーク
利点
信頼性: 接続指向ネットワークは、データが目的地に到達する前に通信路を確立します。これにより、データの順序が保たれ、失われることがないため、高い信頼性を提供します。
エラー制御: 伝送エラーが発生した場合、再送やエラー修正のメカニズムが容易に実装できるため、エラーの影響を最小限に抑えることができます。
フロー制御: 送信者と受信者間でデータの流れを調整し、受信者が処理できる以上のデータでオーバーフローすることを防ぎます。
欠点
遅延: 通信を開始する前に接続を確立する必要があり、これにより遅延が発生する場合があります。
オーバーヘッド: 接続の確立、維持、終了には追加のオーバーヘッドが発生し、特に小さなデータパケットを送信する場合には非効率になり得ます。
柔軟性の欠如: 一度確立されると、接続パスが固定されるため、ネットワークの変更や障害への対応が難しくなることがあります。

非接続指向ネットワーク
利点
柔軟性: データパケットは独立しており、最適な経路を動的に選択できるため、ネットワークの変更や障害に柔軟に対応できます。
効率: 接続の確立や維持のオーバーヘッドがないため、小さなデータパケットの送信に適しています。
スケーラビリティ: 接続を管理する必要がないため、大量のデータパケットを効率的に処理する能力が向上します。
欠点
信頼性の欠如: データパケットは独立しており、順序が保証されないため、高い信頼性を要するアプリケーションには適していません。
エラー制御とフロー制御の複雑性: 各パケットが独立しているため、エラー制御とフロー制御を実装することがより複雑になります。
データの順序付け: パケットが異なる経路で送信されるため、受信側での再組み立てや順序付けが必要になる場合があり、これには追加の処理が必要です。

これらの比較から、それぞれのネットワークタイプが異なるアプリケーションやユーザーのニーズに応じて利点と欠点を持つことがわかります。

**2. Point by point comparison of the design issues for both**

接続指向ネットワークの設計上の問題点
スケーラビリティ: 接続指向ネットワークは、接続の確立、維持、終了に関連するリソースを必要とします。大規模なシステムでは、これらのリソース要求が急速に増加し、スケーラビリティに影響を与える可能性があります。
リソース割り当て: 各接続に対して適切な帯域幅や処理能力を割り当てることは、ネットワークのパフォーマンスと効率に直接影響します。これらのリソースを動的に管理することは複雑で、不適切な管理はネットワークのコンジェスチョンやパフォーマンスの低下を引き起こす可能性があります。
接続の確立と維持: 接続の確立には時間がかかり、ネットワークの遅延に影響を及ぼす可能性があります。また、接続を維持するためには、継続的なハートビートや状態チェックが必要であり、これが追加のオーバーヘッドを生じさせます。

非接続指向ネットワークの設計上の問題点
信頼性とデータ整合性: 非接続指向ネットワークでは、各データパケットが独立しているため、信頼性やデータの順序を保証する追加のメカニズムが必要です。これにより、エラー検出や再送のための複雑さが増し、設計と実装が難しくなります。
エンドツーエンドのパフォーマンスの管理: データパケットが異なる経路を通る可能性があるため、エンドツーエンドの遅延やパフォーマンスの予測が難しくなります。これは、リアルタイム通信や高い信頼性が求められるアプリケーションにとって特に問題となります。
セキュリティ: 非接続指向ネットワークでは、各パケットが独立しているため、パケットの改ざんやスニッフィングに対するセキュリティ対策が複雑になります。エンドツーエンドの暗号化や認証メカニズムを適切に設計し、実装する必要があります。

これらの設計上の問題点は、ネットワークを設計する際に考慮すべき重要な要素です。それぞれのアプローチには、特有の課題があり、これらの課題に対処するためには、適切な設計戦略と実装技術が必要です。

**3. Your preference among the two and a suggestion to resolve any one of its design-related problem.**

非接続指向ネットワークを選ぶ理由は、その柔軟性、効率性、およびスケーラビリティにあります。特に、インターネットのような大規模で複雑なネットワーク環境において、データパケットが最適な経路を動的に選択できる能力は大きな利点です。非接続指向ネットワークは、リソースの割り当てやネットワークの管理に関して、接続指向ネットワークに比べて柔軟性が高く、迅速なデータ伝送を可能にします。しかし、信頼性とデータ整合性の保証という点では課題があります。

提案する解決策: エンドツーエンドの信頼性向上
非接続指向ネットワークの設計関連の問題の中で、特に信頼性とデータ整合性の保証は重要です。この問題を解決するために、以下の提案を行います。

セグメント化と再送制御プロトコルの強化
セグメント化: 大きなデータセットを小さなセグメントに分割し、各セグメントに一意のシーケンス番号を割り当てることで、受信側での再組み立てと順序の保証を容易にします。これにより、データの一部が失われた場合でも、失われたセグメントのみを特定して再送要求を行うことができます。

再送制御: データ送信時にタイムアウトと確認応答（ACK）を用いた再送制御メカニズムを強化します。受信側から特定のセグメントの受信確認がない場合、送信側は自動的にそのセグメントを再送します。また、不要な再送を避けるために、動的なタイムアウト調整アルゴリズムを採用し、ネットワークの状態に応じてタイムアウト期間を調整します。

エンドツーエンドの暗号化と認証
セキュリティの強化: データのプライバシーとセキュリティを確保するために、エンドツーエンドの暗号化を採用します。また、送受信両方のエンドポイントでの認証メカニズムを強化することで、データの完全性と送信元の検証を保証します。
これらの提案により、非接続指向ネットワークの信頼性とデータ整合性を大幅に向上させることができます。セグメント化と再送制御プロトコルの強化によって、データの順序付けと完全性の問題を解決し、エンドツーエンドの暗号化と認証によって、セキュリティの向上を図ることが可能です。これにより、非接続指向ネットワークは、高い信頼性とセキュリティを必要とするアプリケーションにも適用できるようになります。

結論

この議論を通じて、接続指向ネットワークと非接続指向ネットワークの両方が独自の利点と欠点を持ち、異なるアプリケーションやユーザーのニーズに応じて選択されるべきであることが明らかになりました。接続指向ネットワークはその信頼性とデータ整合性によって際立っていますが、非接続指向ネットワークは柔軟性、効率、およびスケーラビリティの面で優れています。非接続指向ネットワークに対する提案は、信頼性とデータ整合性の問題に対処し、これらのネットワークがさらに広範なアプリケーションで効果的に利用されるための道を開くことを目指しています。最終的に、選択されるネットワークタイプは、特定の状況と要件に最適なバランスを提供するものであるべきです。今後、技術の進化とともに、これらのネットワーク設計の課題を解決し、両方のアプローチの利点を組み合わせる新しい方法が開発されることが期待されます。

## Learning Journal

While designing a network protocol or setting up a network there are various issues related to the design of the protocol that needs to be addressed like Addressing, Error Control, Flow Control,etc. Make a journal entry for the following question:

What are the design related issues (any two) that needs to be addressed while defining a protocol?

Pick any two issues and, In Your Own Words, very briefly (2-3 statements each) state how can these affect the network, if not taken care of at the time of design.

プロトコルを定義する際に対処すべき設計の問題として、「アドレッシング」と「フローコントロール」を取り上げます。
アドレッシングに関しては、ネットワーク内でデバイスが互いに識別し、通信を行うためには、一意のアドレスを持つことが不可欠です。アドレッシングが適切に設計されていない場合、データパケットが間違った宛先に送信される可能性があり、ネットワークの効率が低下し、通信の遅延やデータの損失が発生する可能性があります。
フローコントロールについては、送信者と受信者間のデータ転送速度を調整することで、ネットワークの混雑を防ぎ、データの損失を最小限に抑えるために重要です。フローコントロールが適切に取り扱われない場合、ネットワークの過負荷が発生し、パフォーマンスが著しく低下する可能性があります。これは、受信者が受信するよりも速くデータが送信される場合に特に顕著です。
