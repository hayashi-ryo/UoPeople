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
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Review-Quiz
- [x] Complete and Submit the CS 2204 Course Evaluation

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

クラスメイトの皆さんこんにちは、今回のテーマについて、私は2. Secure Shell(SSH)について調査したのでその結果を共有します。
SSH(Secure Shell)は、ネットワーク上で安全にリモートマシンに接続するためのプロトコルとツールセットです。SSHは、暗号化された通信を提供し、ユーザーがリモートマシンに対して安全に操作を行うことを可能にします。以下は、RFC 4254 "The Secure Shell (SSH) Connection Protocol"を参考に調査した内容です。

技術的概要
SSHは以下の4つの技術的な特徴を持ちます。

1. 暗号化: SSHは、公開鍵暗号方式や対象鍵暗号方式などの暗号技術を使用して通信を暗号化します。これにより、データが盗聴されることを防ぎ、セキュリティを確保します。
2. 認証: SSHサーバは、クライアントが正当なユーザであることを確認するために、パスワードや公開鍵による認証を行います。これにより、不正なアクセスを防止します。
3. セッション管理: SSHは、ユーザがリモートマシンに接続している間、セッションの確立および管理を行います。セッション内では、コマンドやファイルの転送などが行われます。
4. ポート転送: SSHは、ローカルマシンとリモートマシンの間のポート転送をサポートしています。これにより、セキュリティ上の理由からリモートマシンに直接アクセスできない場合でも、安全な通信チャネルを介してサービスにアクセスできます。

動作概要
SSHは、以下の流れで接続を行います。

1. 接続の確立: クライアントがSSHサーバに接続を要求すると、サーバはクライアントの認証情報を要求します。ここで、パスワードや公開鍵による認証を行います。
2. セッションの確立: 認証が成功すると、SSHサーバはセッションを確立し、クライアントとの間で暗号化された通信チャネルを開きます。このセッションは、クライアントがログアウトするまで継続します。
3. データの転送: セッションが確立されると、ユーザが入力したコマンドやファイルが安全に転送されます。データは暗号化されて送信され、受信した際に復号されます。
4. セッションの終了: ユーザがログアウトするか、接続がタイムアウトした場合、SSHセッションは終了されます。セッションが終了すると、暗号化された通信チャネルも切断されます。

Hello classmates, for this topic, I have researched ”2. Secure Shell (SSH)" and I will share my findings.
SSH (Secure Shell) is a protocol and toolset for securely connecting to remote machines over a network.SSH provides encrypted communication and allows users to perform secure operations on remote machines.
The following is a survey based on RFC 4254 "The Secure Shell (SSH) Connection Protocol".

Technical overview
SSH has the following four technical features

1. Encryption: SSH encrypts communications using cryptographic techniques such as public key cryptography and target key cryptography. This ensures security by preventing data from being intercepted.
2. Authentication: the SSH server uses password or public key authentication to ensure that the client is a legitimate user. This prevents unauthorized access.
3. Session management: SSH establishes and manages sessions while a user is connected to a remote machine. Within the session, commands and file transfers take place.
4. Port forwarding: SSH supports port forwarding between the local machine and the remote machine. This allows services to be accessed via a secure communication channel even when the remote machine cannot be accessed directly for security reasons.

Operation overview.
SSH uses the following flow to establish a connection.

1. Establishing a connection: when a client requests a connection to the SSH server, the server requests the client's authentication information. Authentication is carried out here using a password or public key.
2. Establishing a session: if the authentication is successful, the SSH server establishes a session and opens an encrypted communication channel with the client. This session continues until the client logs out.
3. Data transfer: once the session is established, any commands or files entered by the user are securely transferred. Data is sent encrypted and decrypted when received.
4. Session termination: the SSH session is terminated when the user logs out or the connection times out. When the session ends, the encrypted communication channel is also disconnected.

<https://tex2e.github.io/rfc-translater/html/rfc4254.html>

## Written Assignment

Nothing

## Learning Journal

This assignment will assess your proficiency on the impact of using DNS and need for MIME headers.
There are two parts to this assignment. And you are required to attempt both of them.

Part 1
John and Anthony are two branch managers of a financial organization. John has a message, M1, to be communicated to Anthony. For a secure communication, John wants to send message M2 to Anthony (without revealing M1 immediately) that can be used later to verify that John knew M1 at the time M2 was sent. During this later veriﬁcation, John may reveal M1 itself.  
a. Suppose John simply sends M2 = hash(M1). Explain how Anthony can quickly recover M1.
b. There are some possibilities of attacks when John uses a simple hash function. How can John construct M2 using a secure-hash function, avoiding the problem of those attacks? Hint: as part of the later veriﬁcation, John can supply additional information to Anthony.

a. ジョンがM2=hash(M1)をメッセージとして送信した場合、アンソニーがM1を素早く復元することは不可能です。なぜならば、ハッシュ関数は一方向関数であり、ハッシュ値から元のメッセージを復元することは実質的に不可能であるためです。
ただし、後日ジョンがM1をアンソニーに伝えた際に、アンソニーはジョンがM2の送信をした際にM1を知っていたことを確認することは可能です。これは、アンソニーがジョンから受け取ったM1をハッシュ関数に欠け、その結果がM2と一致するかを確認することで実施します。
b. 安全なハッシュ関数を利用するために、何らかの情報(例えばソルトや￥タイムスタンプ)を加えることが可能です。例えば、ジョンはメッセージM1に対してソルトを加えてハッシュ化することでM2を生成することが可能です。アンソニーが検証を行う際に、ジョンはM1とソルトの両方を提供します。アンソニーは提供されたM1とソルトを使ってハッシュ値を計算し、ジョンから受信したM2と比較することで当初からM1を知っていたことを確認できます。これにより、レインボーテーブル攻撃や衝突攻撃のリスクを提言することができます。

Part 2
While working as an IT security manager.

1. Identify and explain the appropriate error control mechanism used, if:
  a. The encoded data has some redundant information for recovering from the errors during communication.  
  b. The encoded data has some redundant information for detection of some corrupted blocks which needs to be retransmitted.  
2. Why should you prefix the MIME headers while sending the web pages?
3. You received complaints from a number of employees that some spam messages are being sent by an employee's computer and you found the complaints correct. What is the reason for this type of attack?
4. Voice over IP (VOIP) is used by your organization for the teleconferencing system by utilizing the UDP for data transmission. What will happen if the UDP Data grams are out of order?

ans

1. エラー制御メカニズムには、主にエラー検出とエラー訂正の二つのタイプが存在します。
(a) エンコードされたデータにエラーから回復するための冗長情報が含まれている場合、適切なメカニズムはフォワードエラーコレクション(FEC)です。FECは、受信側がエラーを検出し、元のデータを復元するための十分な情報を冗長データから得ることができるようにするものです。
(b) エンコードされたデータに破損したブロックを検出し、それらを再送信する必要がある冗長情報が含まれている場合、これは自動再送要求(ARQ)メカニズムに分類されます。ARQは、受信者がエラーを検出した場合に、送信者にデータの再送信を要求するプロセスです。
2. Webページを送信する際にMIMEヘッダーをプレフィックスする必要があるのは、受信側のシステムがコンテンツのタイプを正しく識別し、適切に処理できるようにするためです。MIMEヘッダーは、文書の形式・エンコーディング・言語など、送信されるコンテンツの性質に関する重要な情報を提供します。
3. 従業員のコンピュータからスパムメッセージが送信されており、従業員自身にスパムを送信した覚えがない場合、そのコンピュータがマルウェアやウィルスに感染していることが考えられます。このタイプの攻撃、攻撃者が悪意のあるソフトウェアを使ってコンピュータのコントロールを奪い、スパムメールを広範囲に渡って自動的に送信することを可能にします。
4. VoIP（Voice over IP）では、音声データをインターネットプロトコルを通じて送信します。このプロセスでUDP（User Datagram Protocol）を使用すると、データはより迅速に送信されることが多いですが、UDPは送信されたデータの到着を保証しないため、データグラム（データパケットの一種）が失われたり、順序が入れ替わることがあります。
UDPデータグラムが順不同で届いた場合、音声通話の質に影響が出る可能性があります。具体的には、以下のような問題が起こることがあります。
音声の断片化: 音声データが正しい順序で届かないと、会話が断片的に聞こえ、理解しにくくなります。
ジッター: データグラムの到着時間が不規則になると、音声の再生が不均一になり、聞きづらくなることがあります。これはジッターと呼ばれ、通信の質を下げる主要因の一つです。
遅延の増加: 送信されたデータグラムが適切な順序で再構築される必要がある場合、その処理には時間がかかるため、通話に遅延が生じる可能性があります。
