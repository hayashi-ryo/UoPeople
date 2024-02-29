# unit4

- IPv4 Internet Protocol
- Interfaces
- Special addresses
- Fragmentation
- Classless IP delivery algorithm
- IPv4 subnets
- Address Resolution Protocol
- IPv6 Internet Protocol
- IPv6 addresses
- IPv6 multicast
- IPv6 Extension Headers
- IPv6 Neighbor Discovery

## Goal

- Learning Outcomes:
  - Describe the differences between Address Resolution Protocol and Reverse Address Resolution Protocol
  - Analyze various IPv4 subnet partitions based on the a.b.c.d/k IP address notation
  - Calculate payload size of an Ethernet frame carrying an IPv4 or IPv6 packet
  - Explain the operation of newer ARP request implementations
- 学習成果
  - アドレス解決プロトコルと逆アドレス解決プロトコルの違いを説明する
  - a.b.c.d/kのIPアドレス表記に基づく、さまざまなIPv4サブネットパーティションの分析
  - IPv4またはIPv6パケットを伝送するイーサネットフレームのペイロードサイズを計算できる
  - 新しいARPリクエスト実装の動作を説明する

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

- Dordal, P. (2019). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827233/mod_book/chapter/484157/ComputerNetworksText.pdf>
  - Section 1 – An Overview of Networks
    - Read 1.10 IP Internet Protocol
  - Section 7 – IP Version 4
    - Read the introduction
    - Read 7.1 The IPv4 Header  – 7.6 IPv4 Subnets
    - Read 7.9 Address Resolution Protocol (ARP)
  - Section 8 – IP Version 6
    - Read the introduction
    - Read 8.1 The IPv6 Header – 8.6 Neighbor Discovery, but NOTE: 8.6.4 Security and Neighbor Discovery is optional reading.

## Discussion Forum

IPv4’s ARP and IPv6’s Neighbor Solicitation both map an address from one space to another. In this respect they are similar. However, there are several differences. In what major ways do they differ?

Ipv4とIPv6のネイバー・ソリューションは、どちらもネットワーク上でデバイス間のアドレス解決を行うためのプロトコルです。しかし、いくつかの違いがあります。今回の投稿では4つの違いについて議論します。

1. プロトコルの機能と目的
ARPは、IPv4のアドレスを対応するMACアドレスにマッピングするために利用されます。これは、IPネットワーク層と物理ネットワークそうの接続を可能にするためです。一方でネイバー・ソリシテーションは、IPv6の一部であるICMPv6プロトコルの機能として実装されており、IPv6アドレスをMACアドレスにマッピングするだけではなく、ネットワーク上の他のアドレスの存在確認、アドレスの重複検出、パラメータの発見など、より幅広い機能が実装されています。
2. プロトコルの違い
ARPは専用のプロトコルであり、IPv4のみで使用されます。ARPリクエストはブロードキャストされ、対応するデバイスからのARPリプライによってMACアドレスが提供されます。ネイバー・ソリシテーションは、ICMPV6メッセージの一種として実装され、特定のターゲットアドレスに対してユニキャストまたはマルチキャストされ、ネットワーク上の特定のデバイスまたはデバイスグループに対して送信されます。
3. セキュリティ
ARPはセキュリティ機能を提供しないため、ARPスプーフィングなどの攻撃に対して脆弱です。一方で、ネイバー・ソリシテーションはセキュリティを強化するためにセキュア・ネイバー・ディスカバリ（SEND）という拡張機能を使用することができます。SENDは公開鍵基盤（PKI）を使用して、メッセージの発信元の認証とデータの完全性を保証します。
4. アドレス解決のプロセス
ARPでは、要求されたIPv4アドレスに対応するMACアドレスを知るために、ネットワーク上のすべてのデバイスに対してブロードキャストメッセージが送信されます。ネイバー・ソリシテーションでは、特定のIPv6アドレスまたはマルチキャストアドレスに対してメッセージが送信され、より効率的なアドレス解決プロセスを提供します。
これらの違いは、IPv6がIPv4に比べて多くの改善と拡張機能を提供していることを示しています。IPv6の設計は、より大きなアドレス空間、改善されたセキュリティ、ネットワークの効率性とスケーラビリティの向上を目指しています。

## Written Assignment

1. For each IPv4 network prefix given (with length), identify which of the subsequent IPv4 addresses are part of the same subnet.
(a). 10.0.130.0/23: 10.0.130.23, 10.0.129.1, 10.0.131.12, 10.0.132.7
(b). 10.0.132.0/22: 10.0.130.23, 10.0.135.1, 10.0.134.12, 10.0.136.7
(c). 10.0.64.0/18: 10.0.65.13, 10.0.32.4, 10.0.127.3, 10.0.128.4
(d). 10.0.168.0/21: 10.0.166.1, 10.0.170.3, 10.0.174.5, 10.0.177.7
(e). 10.0.0.64/26: 10.0.0.125, 10.0.0.66, 10.0.0.130, 10.0.0.62

この問題に回答するために、それぞれのIPv4アドレスが指定されたネットワークプレフィックスに属するかを判断する必要がある。そのために、ネットワークアドレスが示す範囲を特定することで判断することが可能です。
(a)10.0.130.0/23: このネットワークアドレスは10.0.130.1～10.0.131.255の範囲を示します。よって、
サブネットに属する: 10.0.130.23, 10.0.131.12
属さない: 10.0.129.1, 10.0.132.7
(b)10.0.132.0/22: このネットワークアドレスは10.0.132.1 ～ 10.0.135.254の範囲を示します。よって、
サブネットに属する: 10.0.135.1, 10.0.134.12
属さない: 10.0.130.23, 10.0.136.7
(c)10.0.64.0/18: このネットワークアドレスは10.0.64.1 ～ 10.0.127.255の範囲を示します。よって、
サブネットに属する: 10.0.65.13, 10.0.127.3
属さない: 10.0.32.4, 10.0.128.4
(d)10.0.168.0/21: このネットワークアドレスは10.0.168.1 ～ 10.0.175.255の範囲を示します。よって、
サブネットに属する: 10.0.170.3, 10.0.174.5
属さない: 10.0.166.1, 10.0.177.7
(e)10.0.0.64/26: このネットワークアドレスは10.0.0.1 ～ 10.0.7.255の範囲を示します。よって、
サブネットに属する: 10.0.0.125, 10.0.0.66, 10.0.0.130, 10.0.0.62
属さない: なし

2. Convert the following subnet masks to /k notation, and vice-versa:
サブネットマスクを"/k"表記に変換するには、サブネットマスクの1のビット数を数えます。逆に、"/k"表記からサブネットマスクに変換するには、指定されたビット数の1の後に0を配置します。
(a). 255.255.240.0　-> /20
(b). 255.255.248.0 -> /21
(c). 255.255.255.192 -> 26
(d). /20 -> 255.255.240.0
(e). /22 -> 255.255.252.0
(f). /27 -> 255.255.255.224

3. Suppose an Ethernet packet represents a TCP acknowledgment; that is, the packet contains an IPv4 header with no options and a 20-byte TCP header but nothing else. Is the IPv4 packet here smaller than the Ethernet minimum packet size, and, if so, by how much? What if the packet is IPv6 with no extension headers?

イーサネットフレームの最小サイズは64バイトであり、これにはイーサネットヘッダ（14バイト）、ペイロード（最小46バイト）、そしてフレームチェックシーケンス（FCS）4バイトが含まれます。ペイロード部分はデータとパディングの合計で、最小46バイトでなければなりません。ペイロードが46バイト未満の場合は、パディングによって46バイトに増やされます。
IPv4ヘッダの標準サイズは20バイト、TCPヘッダも20バイトです。IPv4パケットにオプションがなく、TCPヘッダのみが含まれている場合、ペイロードの合計サイズは40バイトになります。
したがって、イーサネットの最小ペイロード要件（46バイト）と比較すると、このIPv4パケットは最小サイズより6バイト小さいことになります。この差分を埋めるために、イーサネットフレームには6バイトのパディングが必要です。
IPv6の場合、ヘッダのサイズは40バイトです。もしIPv6パケットが拡張ヘッダなしで、同じく20バイトのTCPヘッダを持つとすると、ペイロードの合計サイズは60バイトになります。これはイーサネットの最小ペイロード要件にはまだ足りず、6バイトのパディングが必要です。
要約すると、IPv4およびIPv6パケットはいずれもイーサネットの最小パケットサイズより小さく、それぞれ6バイトのパディングが必要です。

4. In newer implementations, repeat ARP queries about a timed out entry are first sent unicast, in order to reduce broadcast traffic. What would have to happen to create a situation where the repeated unicast query for a given IP address fails, but a follow-up broadcast query for that same IP address succeeds?

新しい実装におけるARPクエリの挙動に関して、タイムアウトしたエントリに対するユニキャストARPクエリが失敗し、その後のブロードキャストARPクエリが成功する状況を作り出すには、特定のネットワーク条件や設定が影響している可能性があります。以下に、そのような状況を生み出す可能性のあるシナリオを示します。

1. キャッシュの無効化または期限切れ: 対象のIPアドレスに関連付けられたMACアドレスがARPキャッシュから削除されたか、期限が切れている場合、デバイスはこの情報を再度取得する必要があります。ユニキャストクエリがターゲットに届かない、あるいはターゲットが応答しない（例えば、電源が切れている、ネットワークから切断されている等）場合、ブロードキャストクエリによってより広範囲にクエリを送ることで、応答を得られる可能性があります。

2. セキュリティポリシーまたはファイアウォールの設定: ネットワーク内のセキュリティポリシーまたはファイアウォールがユニキャストトラフィックを制限している場合、特定のユニキャストARPリクエストがブロックされる可能性があります。これにより、ユニキャストクエリが失敗し、ブロードキャストクエリはそのような制約の影響を受けずに成功することがあります。

3. ネットワーク構成の変更: ネットワークの構成変更が原因で、ユニキャストクエリが対象デバイスに届かなくなる場合があります。例えば、スイッチのポートセキュリティ設定が変更され、特定のMACアドレスからのトラフィックのみを許可するようになった場合、ユニキャストARPクエリがブロックされる可能性があります。その後、ブロードキャストクエリがネットワーク全体に送信され、ターゲットデバイスが応答することで成功します。

4. ネットワークの障害または不安定性: ネットワークの一時的な障害や不安定性により、ユニキャストARPクエリが正常に配信されない場合があります。その後、ネットワーク状態が改善された時にブロードキャストクエリが成功する可能性があります。

## Learning Journal

1. How are you finding the course?
CS2204のコースを通して通信技術について学習を行っていますが、今のところ大きな問題もなく進めることができています。理由として、今の自分の仕事ですでに学習していた内容や資格取得のために行った勉強の範囲と重なる部分があるためです。とはいえ、今回のように体系立てた学習はあまりして来なかたため、興味を持って進めることができています。
一点だけ問題があるとすれば、週によって仕事の分量に差がありUoPeopleの学習に時間を取ることができない可能性がある点です。今のところUoPの時間を大きく削られるような状況とはなっていませんが、3月中に一度時間を取ることが難しい場面が考えられるので、事前にユニットの学習を進めるなどしておく必要があると考えています。

2. What are the problems that you are facing?
一つ目の質問とも重複しますが、今のところ大きな問題には直面していません。時間を取ることが難しいと想定される週についてはあらかじめ準備をしておくことで対応したいと思います。

3. Are you able to keep up? Are you making use of the Course/Classroom Forum?
コースの課題は予定通り出すことができています。また、内容についても今のところ大きな問題もなく理解することができています。理解が難しいと考える画面では、コースフォーラムで助けを求めようと思います。
