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

- [ ] Reading assignment
- [ ] Peer Assessment
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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

## Written Assignment

1. For each IPv4 network prefix given (with length), identify which of the subsequent IPv4 addresses are part of the same subnet.
(a). 10.0.130.0/23: 10.0.130.23, 10.0.129.1, 10.0.131.12, 10.0.132.7
(b). 10.0.132.0/22: 10.0.130.23, 10.0.135.1, 10.0.134.12, 10.0.136.7
(c). 10.0.64.0/18: 10.0.65.13, 10.0.32.4, 10.0.127.3, 10.0.128.4
(d). 10.0.168.0/21: 10.0.166.1, 10.0.170.3, 10.0.174.5, 10.0.177.7
(e). 10.0.0.64/26: 10.0.0.125, 10.0.0.66, 10.0.0.130, 10.0.0.62

2. Convert the following subnet masks to /k notation, and vice-versa:
(a). 255.255.240.0
(b). 255.255.248.0
(c). 255.255.255.192
(d). /20
(e). /22
(f). /27

3. Suppose an Ethernet packet represents a TCP acknowledgment; that is, the packet contains an IPv4 header with no options and a 20-byte TCP header but nothing else. Is the IPv4 packet here smaller than the Ethernet minimum packet size, and, if so, by how much? What if the packet is IPv6 with no extension headers?

4. In newer implementations, repeat ARP queries about a timed out entry are first sent unicast, in order to reduce broadcast traffic. What would have to happen to create a situation where the repeated unicast query for a given IP address fails, but a follow-up broadcast query for that same IP address succeeds?

## Learning Journal

1. How are you finding the course?
2. What are the problems that you are facing?
3. Are you able to keep up? Are you making use of the Course/Classroom Forum?
