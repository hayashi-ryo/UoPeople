# unit3

- Bandwidth and maximum data rate
- Guided Media
- Unguided Media
- Satellite Communication
- Digital Multiplexing and Modulation
- Ethernet

## Goal

- Learning Objects
  - Describe the differences and evolution of the mobile phone technology generations
  - Analyze and correct a message with a single bit error by use of Hamming code
  - Give an example of a multiple sender hidden-node problem in wireless communications
  - Explain when to use Error Correcting Codes instead of Error Detection and Retransmission
- ja
  - 携帯電話技術の世代の違いと進化について説明できる。
  - ハミングコードを使用して、シングルビットエラーのメッセージを解析し、訂正することができる。
  - 無線通信における多重送信者隠れノード問題の例を挙げることができる
  - 誤り検出と再送信の代わりに誤り訂正符号を使用する場合について説明できる

## Task

- [X] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

- Dordal, P. (2023). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827226/mod_book/chapter/484148/ComputerNetworksText.pdf?time=1701076389874>
  - Section 3 – Other LANs
    - Read 3.6 Adventures in Radioland – 3.7 Wi-Fi
    - Optional reading: 3.8 WiMAX and LTE – 3.10 Epilog.
  - Section 4 – Links
    - Read 4.1 Encoding and Framing.
    - Optional reading: 4.2 Time-Division Multiplexing.
  - Section 5 – Packets
    - Read 5.1 Packet Delay – 5.5 Epilog.
- Medhi, D., & Ramasamy, K. (2017).  Network routing : Algorithms, protocols, and architectures. Elsevier Science & Technology. ProQuest Ebook Central (Access through LIRN)
  - Read 1.10: Public Switched Telephone Network
- Peterson, L., & Davie, B. (2019). Computer networks: A systems approach. <https://open.umn.edu/opentextbooks/textbooks/771> licensed under CC BY 4.0.
  - Read 2.7: Wireless Networks.

## Discussion Forum

Research on the Internet and discuss the following:
Mobile Telephones have evolved in a number of ways, from 1G to 4G. Compare them in terms of Standards used and Features. The submissions should be to the point and precise.

携帯電話の通信技術は過去数十年にわたって進化してきました。各世代は、速度の向上・遅延の低減・接続性の改善など通信技術の大きや飛躍を表しています。以下に、各世代の規格と特徴を比較します。

1G
技術: アナログ通信
特徴: 1Gは1980年代に導入された初めての携帯電話システムで、アナログ音声通話のみを提供していました。データサービスは存在せず、音声通話の質は現代の基準では低いものでした。
速度: 約2.4kbps

2G
技術: デジタル通信（GSM、CDMA）
特徴: 1990年代に導入された2G技術は、アナログからデジタルへの重要な転換を表しています。これにより、テキストメッセージ（SMS）や画像メッセージ（MMS）の送信が可能になり、音声通話の質が向上しました。
速度: 最大64kbps

3G
技術: UMTS、CDMA2000
特徴: 2000年代初頭に導入された3Gは、モバイルインターネットアクセス、ビデオ通話、モバイルTVなどのデータ伝送サービスを提供しました。これにより、スマートフォンの使用が拡大しました。
速度: 最大数Mbps（理論上は最大21Mbps）

4G
技術: LTE、WiMAX
特徴: 2010年前後に導入された4Gは、主にデータ通信速度の向上に焦点を当てています。HDビデオストリーミング、高速インターネットアクセス、高度なゲーム体験などが可能になりました。
速度: 100Mbpsから1Gbps

## Written Assignment

Answer the following questions in your own words:

1. What do you understand by The Hidden Node Problem? Describe 2 different spatial configurations which exemplify this issue.

隠れノード問題とは、無線ネットワーク通信で起こる特有の問題です。この問題は、ネットワーク内のあるノードが、他のノードの送信を検出できない状況を指します。これにより、通信の衝突が発生しやすくなり、ネットワークの効率が低下します。
隠れノード問題を示す2つの異なる空間配置の例を挙げます。
線形配置: この配置では、ノードA、B、Cが一直線上に配置されています。AとCは直接通信できない距離にあり、Bが中間に位置しています。AとBは互いに通信でき、BとCも互いに通信できますが、AとCは直接通信できないため、AがBに送信している間にCがBに送信を開始すると、BではAとCの送信が衝突する可能性があります。この場合、AとCが互いに存在を知らずに同時にBに送信を試みることが隠れノード問題を引き起こします。
円形配置: この配置では、ノードが円形に配置されており、あるノードが円の反対側にいるノードの送信を直接検出できない場合があります。例えば、ノードA、B、Cがそれぞれ円周上に等間隔で配置されているとします。AがBに送信しているとき、CもBに送信を開始するかもしれません。しかし、AとCは互いの送信を直接検出できないため、Bでの送信衝突のリスクが生じ、これが隠れノード問題を示します。
これらの問題を緩和するために、無線ネットワークではRTS/CTS（Request to Send/Clear to Send）メカニズムなどの手法が用いられます。これにより、ネットワーク内の全ノードが互いの送信を検出し、通信の衝突を避けることが可能になります。
304

2. What is the 4B/5B encoding for the 3-byte (ASCII) string “Sun”?

4B/5Bエンコーディングは、データ通信で使用される符号化方式の一つで、4ビットのデータを5ビットのコードに変換します。これにより、信号の同期を保ちやすくし、伝送エラーを減らすことができます。ASCII文字列「Sun」を3バイトのデータとして4B/5Bエンコーディングに変換するには、まず文字列をバイナリ形式に変換し、その後、各4ビットごとに対応する5ビットのコードに変換します。
ASCIIコードで「S」は83（十進数）、「u」は117（十進数）、そして「n」は110（十進数）です。これらをバイナリ形式に変換し、その後4B/5Bエンコーディングを適用します。以下のステップで計算を行います。
ASCII文字列「Sun」のバイナリ表現は次のとおりです：
「S」: 01010011
「u」: 01110101
「n」: 01101110
116

3. What is the 16-bit internet checksum for the 3-byte binary message 00110001 00110010 00110011?

このプロセスでは、まず全てのバイト（または2バイトのワード）を合計し、オーバーフローが発生した場合は、オーバーフロー分をラップアラウンドして再度加算します。最後に、合計のビット単位の反転を取ることでチェックサムを得ます。この計算を行うためには、まず3バイトのバイナリメッセージを16ビットのワードに分割し、これらを合計してチェックサムを計算します。
3バイトバイナリメッセージ「00110001 00110010 00110011」の16ビットインターネットチェックサムは、十進数で39885、バイナリで「1001101111001101」となります。このチェックサムは、メッセージの正確性を確認するために受信側で使用されます。

4. Suppose a message is 11011000. What is the CRC checksum using the polynomial corresponding to 1011 to give a 3-bit answer? (Show the solution steps, not just the answer).

CRC（巡回冗長検査）チェックサムの計算は、データ伝送エラーを検出するための強力な方法です。この問題では、メッセージ「11011000」と多項式「1011」を使用して3ビットのCRCチェックサムを計算します。計算プロセスは、多項式除算に似ており、バイナリで行われます。ここでは、具体的なステップを通じてCRCチェックサムを計算します。
メッセージ「11011000」に対して多項式「1011」を使用して計算したCRCチェックサムは、「011」となります。この計算プロセスでは、メッセージに多項式の長さ-1だけ0を追加し（この場合は2ビット）、その後、バイナリ除算（XOR演算を使用）を行い、最終的な余りをチェックサムとして得ます。このチェックサムは、データの正確性を検証するために使用されます。 ​​
119
5. What is Time Domain Reflectometry?

時間領域反射計測法（Time Domain Reflectometry, TDR）は、ケーブルや導体の不具合や特性を検出するために使用される一手法です。この技術では、ケーブルに電気信号を送信し、その反射波を分析することで、ケーブルの長さ、断線の位置、接続不良、ケーブルのインピーダンス変化などを特定します。
TDRの原理はレーダー技術に似ています。特定のパルスをケーブルに送信し、ケーブル内で反射されたパルスを受信します。反射は、ケーブルの損傷、終端の不一致、その他の異常によって引き起こされます。反射されたパルスの時間遅延と振幅を測定することで、異常の位置と性質を特定できます。
TDRは非破壊検査であり、ケーブルが埋設されている場合やアクセスが困難な場合でも使用できます。電話線、同軸ケーブル、電力ケーブルなど、さまざまなタイプのケーブルの診断に有効です。TDRは、ケーブルの維持管理や故障診断において、貴重なツールとなっています。
155

## Learning Journal

Give any two reasons why networks might use Error Correcting Codes instead of Error Detection and Retransmission.

エラー訂正符号をエラー検出および再送信の代わりに使用する理由はいくつかありますが、主な2つの理由は以下の通りです。

1. 効率性：エラー訂正符号を使用すると、エラーが検出された場合にデータを再送信する必要がなくなります。これにより、通信の遅延が減少し、特に遅延が重要なアプリケーションや、再送によるオーバーヘッドが許容できない場合（例えば、リアルタイム通信や帯域幅が限られている環境）において、ネットワークの効率が向上します。

2. 信頼性：特定のタイプのエラー訂正符号は、複数のエラーを正確に訂正できるため、エラー検出と再送信のみを使用する場合に比べて、通信の信頼性を高めることができます。これは、特にエラーが頻繁に発生する
