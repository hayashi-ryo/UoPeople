# unit8

- The Domain Name System
- Electronic mail
- The Hyper-Text Transfer Protocol
- Code-Execution Intrusion
- Stack Buffer Overflow
- Heap Buffer Overflow
- Network Intrusion Detection

## Goal

- Learning Outcomes
  - Examine cryptographic standards for secure network communication.
  - Explain the impact of using UDP for DNS requests when packets get lost.
  - Identify the need for MIME headers for web pages.
  - Describe a Linux C code protection against stack buffer overflow attacks.
- 学習成果
  - 安全なネットワーク通信のための暗号化標準を調べる
  - DNSリクエストにUDPを使用した場合にパケットが失われた場合の影響を説明することができる
  - WebページのMIMEヘッダの必要性を理解する
  - スタックバッファオーバーフロー攻撃に対するLinux Cコードの保護について説明できる

## Task

- [ ] Reading assignment
- [ ] Peer Assessment
- [ ] Discussion Forum
  - [ ] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz
- [ ] Take Review-Quiz
- [ ] Complete and Submit the CS 2204 Course Evaluation

## Reading Assignment

- Bonaventure, O. (2011). Computer networking: Principles, protocols and practice. The Saylor Foundation. This book is licensed under Creative Commons Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0). Download the pdf.<https://my.uopeople.edu/pluginfile.php/1827258/mod_book/chapter/484189/Computer-Networking-Principles-Bonaventure-%20Chapter%203.pdf?time=1616177962628>
  - Chapter 3 – The Application Layer
    - Read the introduction
    - Read 3.2 Application-level protocols
    - Optional readings: 3.1 Principles, 3.3 Writing simple networked applications, and 3.4 **Summary**
- Dordal, P. (2019). An introduction to computer networks. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1827258/mod_book/chapter/484189/ComputerNetworksText.pdf>
  - Section 22 – Security
    - Read the introduction
    - Read 22.1 Code-Execution Intrusion - 22.4 Network Intrusion Detection, but NOTE: 2.22.2 An Actual Stack-Overflow Example is optional reading
    - Optional readings: 22.5 Cryptographic Goals – 22.12 RSA Key Examples

## Discussion Forum

Choose ONE of the below security topics from chapter 22 of the Dordal (2019) course text. Research the topic, then provide a summary of the technology and how it works. Please use one additional outside source from the Internet to support your findings.

1. Network Intrusion Detection
2. Secure Shell (SSH)
3. Transport Layer Security(TLS)
4. Public Key Encryption

## Written Assignment

Nothing

## Learning Journal

This assignment will assess your proficiency on the impact of using DNS and need for MIME headers.
There are two parts to this assignment. And you are required to attempt both of them.

Part 1
John and Anthony are two branch managers of a financial organization. John has a message, M1, to be communicated to Anthony. For a secure communication, John wants to send message M2 to Anthony (without revealing M1 immediately) that can be used later to verify that John knew M1 at the time M2 was sent. During this later veriﬁcation, John may reveal M1 itself.  
a. Suppose John simply sends M2 = hash(M1). Explain how Anthony can quickly recover M1.
b. There are some possibilities of attacks when John uses a simple hash function. How can John construct M2 using a secure-hash function, avoiding the problem of those attacks? Hint: as part of the later veriﬁcation, John can supply additional information to Anthony.

Part 2
While working as an IT security manager.

1. Identify and explain the appropriate error control mechanism used, if:
  a. The encoded data has some redundant information for recovering from the errors during communication.  
  b. The encoded data has some redundant information for detection of some corrupted blocks which needs to be retransmitted.  
2. Why should you prefix the MIME headers while sending the web pages?
3. You received complaints from a number of employees that some spam messages are being sent by an employee's computer and you found the complaints correct. What is the reason for this type of attack?
4. Voice over IP (VOIP) is used by your organization for the teleconferencing system by utilizing the UDP for data transmission. What will happen if the UDP Data grams are out of order?
