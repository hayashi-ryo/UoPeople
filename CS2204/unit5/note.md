# unit5

- Distance-Vector Routing-Update Algorithm
- Distance-Vector Slow-Convergence Problem
- Loop-Free Distance Vector Algorithms
- Link-State Routing-Update Algorithm
- Classless Internet Domain Routing: CIDR
- Hierarchical Routing
- Provider-Based Routing
- Border Gateway Protocol

- 距離ベクトル経路更新アルゴリズム
- 距離ベクトルの遅行収束問題
- ループのない距離ベクトル・アルゴリズム
- リンク状態ルーティング更新アルゴリズム
- クラスレス・インターネット・ドメイン・ルーティング CIDR
- 階層型ルーティング
- プロバイダーベースルーティング
- ボーダー・ゲートウェイ・プロトコル

## Goal

- Learning Outcomes:
  - Describe the Distance Vector routing-update problems solved by Link State routing-update.
  - Determine IPv4 routing decisions based on CIDR type routing table entries
  - Calculate IPv4 address allocations based on sub-netting of a large address block
  - Explain the difference between a Layer 2 switch and a Layer 3 router
- ja
  - リンクステートルーティングアップデートによって解決されるディスタンスベクトルルーティングアップデートの問題を説明する。
  - CIDRタイプのルーティングテーブルエントリに基づいてIPv4ルーティング決定を決定する
  - 大きなアドレスブロックのサブネットに基づいてIPv4アドレス割り当てを計算する
  - レイヤ2スイッチとレイヤ3ルータの違いを説明する

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

- Dordal, P. (2019). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827239/mod_book/chapter/484165/ComputerNetworksText.pdf>
  - Section 9 – Routing-Update Algorithms
    - Read the introduction
    - Read 9.1 Distance-Vector Routing-Update Algorithm – 9.7 Epilog
  - Section 10 – Large-scale IP Routing
    - Read the introducti   - on
    - Read 10.1 Classless Internet Domain Routing  – 10.6.5 BGP Path attributes
    - Optional reading: 10.6.6 BGP and Traffic Engineering – 10.6.8 Examples of BGP Instability

## Discussion Forum

Distance Vector Routing was replaced with Link State Routing mainly because of two primary problems. What are they? Name them and elaborate briefly.

Distance Vector RoutingがLink State Routingに置き換えられた主な2つの問題点は以下の通りです。

1. ループの発生: Distance Vector Routingでは、更新情報が非同期に伝播するため、一時的に情報が古いルーターが新しい情報を持つルーターから情報を受け取り、結果としてルーティングループが発生する可能性があります。これは、特にネットワークトポロジーに変更が頻繁に発生する環境で問題となります。

2. 収束性の遅さ: Distance Vector Routingは、変更があった場合に全ルーターがその変更を認識して最適な経路を再計算するまでに時間がかかることがあります。大規模なネットワークでは、この収束にかかる時間が問題となる場合があります。特に、障害が発生した際に迅速な回復が求められる場合にこの遅延は顕著になります。

これらの問題を解決するために、Link State Routingが採用されました。Link State Routingでは、各ルーターがネットワークの全体像を持ち、独立して最適な経路を計算するため、ループの問題が解消され、収束も速くなります。また、ネットワークの状態が変化した場合には、変更があった部分のみを迅速に伝播することができるため、より効率的なルーティングが可能になります。

## Written Assignment

Q1. A router has the following CIDR entries in the routing table:
For each of the following IP addresses, what does the router do if a packet with that address arrives?

ルータの宛先を調べるためには、ネットワークアドレスを示すビット数が大きいものからアドレス範囲を確認することが必要です。No1~5について確認する前に、それぞれのアドレスレンジを確認します。

| Address/Mask | Next Hop | Address Range |
| ---- | ---- | ---- |
| 135.46.56.0/22 | Intercface 0 | 135.46.56.1～135.46.59.254 |
| 135.46.60.0/22 | Intercface 1 | 135.46.60.1～135.46.63.254 |
| 192.53.40.0/23 | Router 1 | 192.53.40.1～192.53.41.254 |
| Default | Router 2 | - |

この結果を利用してそれぞれのアドレスがどこへ到達するか確認します。

1. 135.46.63.10
135.46.60.0/22のアドレスレンジに含まれるため、Interface 1へ到達する。
2. 135.46.57.14
135.46.56.0/22のアドレスレンジに含まれるため、Interface 0へ到達する。
3. 135.46.52.2
どのアドレスレンジにも含まれないため、DelaultであるRouter 2へ到達する。
4. 192.53.40.7
192.53.40.0/23のアドレスレンジに含まれるため、Router 1へ到達する。
5. 192.53.56.7
どのアドレスレンジにも含まれないため、DelaultであるRouter 2へ到達する。

Q2. A Large number of consecutive IP address are available starting at 198.16.0.0. Suppose four organizations, A, B, C, D request 4000, 2000, 4000, and 8000 addresses, respectively. For each of these organizations, give:

1. the first IP address assigned
2. the last IP address assigned
3. the mask in the w.x.y.z/s notation

IPアドレスは2の冪乗のブロックで割り当てられます。そのため、4つの組織にはA:4,096、B:2048、C:4096、D:8192のIPアドレスが割り当てられます。この条件を利用して、それぞれの組織に対応する回答は以下のようになります。

組織A
最初のIPアドレス: 198.16.0.0
最後のIPアドレス: 198.16.15.255
マスクアドレス: 198.16.0.0/20
組織B
最初のIPアドレス: 198.16.16.0
最後のIPアドレス: 198.16.23.255
マスクアドレス: 198.16.16.0/21
組織C
最初のIPアドレス: 198.16.24.0
最後のIPアドレス: 198.16.31.255
マスクアドレス: 198.16.24.0/20
組織D
最初のIPアドレス: 198.16.32.0
最後のIPアドレス: 198.16.63.255
マスクアドレス: 198.16.32.0/19

Q3. A router R has the following distance-vector table:
R now receives the following report from R1 (the cost of the R–R1 link is 1):
<dest: A, cost: 1>, <dest: B, cost: 1>, <dest: C, cost: 4>, <dest: D, cost: 4>.
Give R’s updated table after it processes R1’s report. For each entry, give a brief explanation.

ルータはR1から受け取ったレポートから新しい距離ベクターテーブルを作成します。各目的地に対する新しいコストを計算するには、R1からの報告で提供された各目的地までのコストに、RからR1までのリンクコストを加算します。R-R1リンクのコストは1なので、R1からの報告に基づいて各目的地までの新しいコストは以下のようになります。
Aへの新しいコスト: 1 + 1 = 2
Bへの新しいコスト: 1 + 1 = 2
Cへの新しいコスト: 4 + 1 = 5
Dへの新しいコスト: 4 + 1 = 5
次に、これらの新しいコストを既存の距離ベクターテーブルのコストと比較します。
Aへのコストは変わらず2です。次のホップはR1のままです。
Bへのコストは3から2に更新され、より低いコストとなりました。次のホップはR1に更新されます。
Cへのコストは更新後も4で変わらず、次のホップはR1のままです。
Dへのコストは5から5に更新され、変わりませんが、報告によるとR1を経由したルートが存在するため、次のホップがR1に変更される可能性がありますが、このケースでは具体的な指示がないため、デフォルトのルーティングポリシーに従うことになります。
結論として、Rの距離ベクターテーブルは以下のように更新されます（変更があった場合のみ記載）。
Bのコストが3から2に更新され、次のホップがR1に変更されます。

## Learning Journal

What is the fundamental difference between a Layer 2 switch and a Layer 3 router?

Layer 2スイッチとLayer 3ルーターの根本的な違いは、それぞれが動作するネットワーク層にあります。Layer 2スイッチはデータリンク層（OSIモデルの第2層）で動作し、MACアドレスを使用してローカルエリアネットワーク（LAN）内でデータパケットを転送します。これにより、デバイス間の通信が効率化され、ネットワークのパフォーマンスが向上します。Layer 2スイッチは主にLAN内のデバイス間でのデータ転送を管理するために使用されます。
一方、Layer 3ルーターはネットワーク層（OSIモデルの第3層）で動作し、IPアドレスを使用して異なるネットワーク間でデータパケットをルーティングします。これにより、異なるネットワークやLAN間、あるいはインターネット全体での通信が可能になります。Layer 3ルーターは、異なるネットワークセグメント間の通信を可能にするために重要であり、データパケットが目的地に到達するための最適なパスを決定する役割を持っています。
要するに、Layer 2スイッチはネットワーク内のデバイス間の通信を促進するのに対し、Layer 3ルーターは異なるネットワーク間でのデータ転送と通信を可能にするために使用されます。
