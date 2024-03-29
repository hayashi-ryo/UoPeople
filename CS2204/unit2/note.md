# unit2

- Bandwidth and maximum data rate
- Guided Media
- Unguided Media
- Satellite Communication
- Digital Multiplexing and Modulation
- Ethernet

## Goal

- Describe the term “crosstalk” with respect to wire pairs.
- Examine reasons for the use of different frequencies in up and down downlinks satellite communications.
- Differentiate between Circuit Switching and Packet Switching techniques.
- Explain advantages of CRC checksum placement in the frame trailer versus in the frame header.

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Dordal, P. (2023). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827221/mod_book/chapter/484140/ComputerNetworksText.pdf?time=1701076327609>
  - Read 1.1: Layers - 1.5: Topology
  - Section 2 – Ethernet
    - Read 2.1 10-Mbps Classic Ethernet – 2.6 Virtual LAN (VLAN).  Note: sections 2.1.11.1 and 2.1.11.2 are optional and can be skipped.
      - すべてのパケットは物理層ではブロードキャストして送信されているように見え、理論的には他のすべてのノードから観察することができる。
      - しかし、論理的にはほとんどのパケットはポイントトゥポイントで通信されているように見える
- Murthy, C.S.V. (2009). Data communication and networking. Global Media. ProQuest Ebook Central. (Access through the LIRN) <https://proxy.lirn.net/MuseProxyID=mp02/MuseSessionID=0004aih/MuseProtocol=https/MuseHost=ebookcentral.proquest.com/MusePath/lib/univ-people-ebooks/detail.action?docID=3011330>
  - Read Chapter 7: Transmission Media
  - Read 4.3: Analog Signals - 4.4: Digital Signals
  - Read 8.1: Multiplexing - 8.2: Types of Multiplexing
  - Read Chapter 14: Switching
  - Read Pg.160: Satellite Communication (Optional Reading)

## Discussion Forum

What are the various problems that could arise in Non-Return to Zero (NRZ) encoding if a continuous stream of 0s or 1s is sent?
Instead of writing an essay, try writing in bulleted form, briefly explaining what you understand from the findings.

クラスメートの皆さんこんにちは。今回のテーマに対する私の理解を説明します。
Non-Return to Zoro(NRZ)エンコーディングで連続する0または1が送信される場合に発生する可能性のあるさまざまな問題は以下の通りです。

同期の喪失: NRZでは、連続する同じビット値の長いストリームがあると、受信側がビット境界を正確に識別できなくなる可能性があります。これにより、データストリームの同期が失われる可能性があります。
クロック回復の問題: 送信されるデータからクロック信号を回復することが難しくなり、受信機が送信機のタイミングを正確に同期できなくなります。
電力消費の増加: 1が連続して送信される場合、線上の電圧レベルが連続して高いままになることがあり、これにより電力消費が増加する可能性があります。
ベースラインワンダー: 長時間にわたって一方の信号レベルのみが維持されると、受信機の基準電圧レベルが変動し、誤ったビット判定を引き起こす可能性があります。
信号品質の劣化: 長い 0 または 1 のシーケンスは、信号の品質を低下させる可能性があり、結果としてビットエラー率が増加する可能性があります。

これらの問題から、実際の通信システムにてNRZエンコーディングを採用する場合、問題を緩和するための追加的な技術(データストリームに周期的な同期シグナルを挿入する、差動符号化を使用する、など)を実施する必要があると考えられます。

## Written Assignment

- Answer the following:

1. What is crosstalk? How is it minimized in case of a twisted pair of wire?
2. Why are two separate frequencies used for uplink and downlink transmission in case of satellite communication?
3. Differentiate between the 2 switching techniques (Circuit Switching and Packet Switching).(4 differences)
4. What is the answer to Exercise 2.7 from Section 2 of our textbook with this change: the 4th transmission (B sends to D) does not occur?

Answer

1. What is crosstalk? How is it minimized in case of a twisted pair of wire?
クロストークとは、通信ケーブルや回路などで隣接する伝送路間で信号が干渉しあう現象を指します。これにより、一つの回路の信号や別の回路に不要な影響を及ぼし、データ転送の品質が低下する可能性があります。
ねじれ対線の場合、クロストークは主に物理的な配置と電気的特性によって最小限に抑えられます。ねじれ対線は日本の電線を密接にねじり合わせることによって構成されており、このねじりが干渉の影響を相殺します。ねじれにより、各対の一部が干渉源に近づく間、他の部分が遠ざかるため、通過する信号における干渉の影響が平均化されます。また、ねじれの密度を変えることで、特定の周波数の干渉を減少させることが可能です、さらに、保護層を施すことで外部からの干渉を防ぐことができ、クロストークの低減に寄与します。
129

2. Why are two separate frequencies used for uplink and downlink transmission in case of satellite communication?
衛星通信において、上りリンクと下りリンクで二つの別々の周波数が使用される理由を4点説明します。

- 1. 干渉の回避: 同じ周波数を使用すると、送信信号と受信信号の間で干渉が生じる可能性があります。これは、衛星が同時に信号を受信し送信する場合、特に問題が生じます。異なる周波数を使用することで、干渉を効果的に回避できます。
- 2. 帯域幅の最適化: 上りリンクと下りリンクで異なる周波数帯を使用することで、各リンクの帯域幅をより柔軟に調整できます。例えば、多くの場合、下りリンクではより高いデータ速度が必要とされるため、より広い帯域幅を割り当てることができます。
- 3. システムの設計と管理の柔軟化: 2つの異なる周波数を使用することで、衛星と地上ステーションのシステム設計においてより大きな柔軟性が得られます。これにより、特定の通信要件や規制に合わせて、システムをより簡単に調整することが可能になります。
- 4. 利用可能な周波数スペクトラムの効率的な利用: 異なる周波数を使用することで、利用可能な周波数スペクトラムをより効率的に使用し、通信サービスの品質と容量を向上させることができます。これは、限られた周波数資源を最大限に活用するために特に重要です。
184

3. Differentiate between the 2 switching techniques (Circuit Switching and Packet Switching).(4 differences)
回路交換とパケット交換の2つのスイッチング技術は、データ通信における根本的な違いを持っています。以下に主な4つの違いを挙げます。
接続の設定:
帯域幅の利用:
遅延と信頼性:
適用例:
これらの違いにより、回路交換とパケット交換はそれぞれ異なる通信ニーズに適しています。回路交換は安定した通信が必要な場面で有利ですが、パケット交換は柔軟性と効率性が求められるデータ通信に適しています。

接続の設定:

回路交換: 通信が開始される前に、送信元と受信先の間に物理的な通信路（回路）が確立されます。この回路は通信セッション中、専用に割り当てられ、他のデータ転送には使用されません。
パケット交換: データはパケットという小さな単位に分割され、各パケットは独立して送信されます。通信路の確立は必要なく、パケットはネットワーク内の異なる経路を経由して目的地に到達することができます。
帯域幅の利用:

回路交換: 通信セッション中、確立された回路の帯域幅は専用に使用されますが、データが送信されていないときは無駄になります。
パケット交換: パケットは必要に応じて送信されるため、ネットワークの帯域幅を効率的に利用できます。複数の通信が同じ物理メディアを共有することが可能です。
遅延と信頼性:

回路交換: 一度接続が確立されると、遅延は比較的少なく、一定の通信品質が保証されます。しかし、接続の確立には時間がかかることがあります。
パケット交換: 各パケットが異なる経路を経由するため、遅延やパケットの順序が変わる可能性がありますが、高度なエラー検出と再送により信頼性が確保されます。また、パケットのルーティングは柔軟で、障害があっても迂回経路を選択できます。
適用例:

回路交換: 電話ネットワークなど、遅延が許容できないリアルタイム通信に適しています。
パケット交換: インターネットなど、データ通信に広く使用されており、さまざまなタイプのデータを効率的に送信することができます。
239

4. What is the answer to Exercise 2.7 from Section 2 of our textbook with this change: the 4th transmission (B sends to D) does not occur?
まとめると、それぞれのスイッチが認識している宛先は表のようになる。
117

## Learning Journal

CRC or Cyclic Redundancy Check is an error control method used in Ethernet where a checksum is computed and appended to the data frame being sent across the channel.
Please explain briefly, in your own words.
why is the CRC put in the trailer rather than in the header of the frame?

CRCがフレームのヘッダーではなく、トレーラーに配置される理由を説明します。
データフレームが送信される際、送信側はフレーム全体の内容を元にCRC値を計算します。このCRC値は、フレームの整合性と正確性の検証のために利用されます。もしCRCをフレームのヘッダーに配置する場合、CRC値を計算後にフレームの内容を追加する必要があります。この方法では、フレームの内容が決定される前にCRC値を計算する必要があり、効率が悪くなります。
対照的に、CRCをフレームのトレーラーに追加することで、フレームのすべての内容が確定した後にCRC値を計算し、その値をフレームに追加することができます、これにより、送信されるデータの整合性と正確性を効果的に保証しつつ、データフレームの生成と送信プロセスを効率化できます。また、受信側ではフレームを受け取った後、最後に追加されたCRC値を用いてデータの検証を行うことができます。これは、データ通信においてエラーがないことを確認し、必要に応じてエラー訂正を行うために重要なプロセスです。
