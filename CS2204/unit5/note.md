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
- [ ] Peer Assessment
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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

## Written Assignment

Q1. A router has the following CIDR entries in the routing table:
For each of the following IP addresses, what does the router do if a packet with that address arrives?

1. 135.46.63.10
2. 135.46.57.14
3. 135.46.52.2
4. 192.53.40.7
5. 192.53.56.7

Q2. A Large number of consecutive IP address are available starting at 198.16.0.0. Suppose four organizations, A, B, C, D request 4000, 2000, 4000, and 8000 addresses, respectively. For each of these organizations, give:

1. the first IP address assigned
2. the last IP address assigned
3. the mask in the w.x.y.z/s notation

Q3. A router R has the following distance-vector table:
R now receives the following report from R1 (the cost of the R–R1 link is 1):
<dest: A, cost: 1>, <dest: B, cost: 1>, <dest: C, cost: 4>, <dest: D, cost: 4>.
Give R’s updated table after it processes R1’s report. For each entry, give a brief explanation.

## Learning Journal

What is the fundamental difference between a Layer 2 switch and a Layer 3 router?
