# unit7

- TCP Header
- TCP Connection Establishment
- TCP state diagram
- Path MTU Discovery
- TCP Sliding Windows
- Nagle Algorithm
- Keep Alive
- TCP Timers
- Basics of TCP Congestion Management
- Slow Start

## Goal

- Learning Outcomes:
  - Describe the TCP states during and after simultaneous connection termination
  - Explain the need for maximum TCP packet lifetime in a large network
  - Identify one disadvantage of the TCP Nagle algorithm in a congested network
  - Diagnose the causes for TCP connections lingering in FIN_WAIT_x states
- 学習成果
  - 同時接続終了時および終了後のTCP状態について説明できる。
  - 大規模ネットワークにおけるTCPパケットの最大寿命の必要性を説明する
  - 輻輳したネットワークにおけるTCP Nagleアルゴリズムの欠点を1つ特定する
  - TCPコネクションがFIN_WAIT_x状態で長引く原因を診断する

## Task

- [ ] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Dordal, P. (2019). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827252/mod_book/chapter/484182/ComputerNetworksText.pdf>
  - Section 12 – TCP Transport
    - Read the introduction
    - Read 12.1 The End-to-End Principle – 12.5 TCP Offloading
    - Read 12.7 TCP state diagram - 12.21 TCP Timers
    - Optional readings: 12.6 TCP simplex-talk, 12.22 Variants and Alternatives and 12.23 Epilog
  - Section 13 – TCP Reno and Congestion Management
    - Read the introduction
    - Read 13.1 Basics of TCP Congestion Management and 13.2 Slow Start
    - Optional readings: 13.3 TCP Tahoe and Fast Retransmit – 13.11 Epilog

## Discussion Forum

Simultaneous TCP connection initiations are rare, but simultaneous connection termination is relatively common. How do two TCP nodes negotiate the simultaneous sending of FIN packets to one another? Draw the ladder diagram, and label the states on each side. Which node goes into TIMEWAIT state?

同時に接続終了要求を送信する状況における各ノードの状態遷移について、RFC 793 "Transmission Control Protocol"で説明されれていることを参考に説明します。

1. Node AとNode Bは、それぞれ接続を終了するために、ほぼ同じタイミングで相手に対してFINパケットを送信します。
2. Node AとNode BはFINパケットを送信した後は、自身をFIN_WAIT_1状態へ移行します。
3. Node AとNode Bはそれぞれ相手からのFINパケットを受信します。FINパケットを受信したことを確認すると、ACKパケットを返信します。この時点でどちらのノードもFIN_WAIT_2状態に移行します。
4. ACKパケットを受信した後、各ノードはTIME_WAIT状態に移行します。TIME_WAIT状態は、ネットワーク上で遅延している可能性のあるパケットが全て処理されることを待つためのものです。この状態は通常、2倍のMaximum Segment Lifetime (MSL)時間継続する。
5. CLOSEDに移行する。

ラダーダイアグラムで表現すると以下のようになる。

IMAGE

## Written Assignment

1. Why does the maximum packet lifetime have to be large enough to ensure that not only the packet but also its acknowledgments have disappeared?
2. Give one potential disadvantage when Nagle's algorithm is used on a badly congested network.
3. Give two examples of cases where TCP sends data-less packets on an established connection (which is not being torn down).
4. Exercise 5.0 from section 12.24 of the textbook:
   1. Suppose you see multiple TCP connections on your workstation in state FIN_WAIT_1. What is likely going on? Whose fault is it?
   2. What might be going on if you see connections languishing in state FIN_WAIT_2?

ans

1. パケットの最大寿命を十分に長く設定する必要があるのは、パケットの消失だけではなく、その確認応答(ACK)もネットワークから消えていることを保証するために必要です。これによって、パケットが目的地に到達し、正常に処理されたことが確認されるまでに間、ネットワーク内に残存する可能性のあるパケットの複製や遅延が生じることを防ぐことができます。
2. ナグルアルゴリズムとは、複数の小さなメッセージを一つの大きなパケットにまとめて送信することでネットワークのオーバーヘッドを削減することを目的としたものです(Dordal, 2019)。しかし、混在したネットワークでナグルアルゴリズムを使用すると、小さなパケットの送信が大きなパケットとして送信されるためにネットワークの遅延が増加する可能性があります、これにより、リアルタイム性が求められるアプリケーションのパフォーマンスが低下する可能性があります。
3. TCPがデータのないパケットを送信する例として(a)確認応答(ACK)パケットの送信、(b)ウィンドウ更新パケットの送信があります。これらは、データ転送が行われていない状態でも、接続の維持やフロー制御、輻輳制御のために送信されます。
4.1 TCP接続がFIN_WAIT_1の状態にある場合、ワークステーションが接続の終了を相手に通知し、その確認応答を待っている状況が考えられます。この状態がネットワーク内に大量に存在する場合は、相手がACKを遅延させている、またはネットワーク上でパケットの損失が発生している可能性が考えられます。
4.2 TCP接続がFIN_WAIT_2状態にある場合、ワークステーションが相手からの接続終了の通知を待っている状態です。この状況は、相手がなんらかの理由で接続を正常に終了することができない、もしくはネットワーク上で遅延が発生し終了通知が遅れていることを示しています。

## Learning Journal

What TCP message will be generated for an incoming SYN request for which there is no matching LISTENING port? What error will be given to the application that requested the connection?

受信したSYNリクエストにマッチするLISTENINGポートが存在しない場合、TCPはRST(リセット)メッセージを発行し、送信元に対して接続を拒否したことを通知します。これにより、接続を試みた側はポートが空いていない、もしくはそのポートでのLISTENが行われていないことを認識します。
接続を要求し拒否されたアプリケーションには、一般的に「Connection refused」などのメッセージが返されます。このエラーは、アプリケーションがリモートサーバーの特定のポートに接続しようとしたが、そのポートがアクティブにリッスンされていないことを示します。
