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
- [ ] Peer Assessment
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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

## Written Assignment

1. Why does the maximum packet lifetime have to be large enough to ensure that not only the packet but also its acknowledgments have disappeared?
2. Give one potential disadvantage when Nagle's algorithm is used on a badly congested network.
3. Give two examples of cases where TCP sends data-less packets on an established connection (which is not being torn down).
4. Exercise 5.0 from section 12.24 of the textbook:
   1. Suppose you see multiple TCP connections on your workstation in state FIN_WAIT_1. What is likely going on? Whose fault is it?
   2. What might be going on if you see connections languishing in state FIN_WAIT_2?

## Learning Journal

What TCP message will be generated for an incoming SYN request for which there is no matching LISTENING port? What error will be given to the application that requested the connection?
