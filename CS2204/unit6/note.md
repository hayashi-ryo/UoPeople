# unit6

- Stop-and-Wait transport
- Sliding Windows
- User Datagram Protocol – UDP
- Quick UDP Internet Connections – QUIC
- Trivial File Transport Protocol – TFTP
- Fundamental Transport Issues
- Remote Procedure Call (RPC)
- ストップ＆ウェイ輸送
- スライディングウィンドウ
- ユーザーデータグラムプロトコル - UDP
- クイックUDPインターネット接続 - QUIC
- トリビアル・ファイル・トランスポート・プロトコル - TFTP
- トランスポートの基本問題
- リモート・プロシージャ・コール（RPC）

## Goal

- Anticipate the issues that arise with a simple Stop-and-Wait file transfer protocol
- Explain the problems associated with the Remote Procedure Call protocol
- Provide the justification for the existence of UDP (versus direct use raw IP)
- Identify QUIC’s performance advantage over TCP based web server access
- 単純なStop-and-Waitファイル転送プロトコルで発生する問題の予測
- リモートプロシージャコールプロトコルに関連する問題を説明する
- UDPの存在の正当性を説明する（生のIPの直接使用に対して）
- TCPベースのウェブ・サーバ・アクセスに対するQUICのパフォーマンス上の利点を特定する

## Task

- [ ] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

- Dordal, P. (2019). An introduction to computer networks. Download the pdf.<https://my.uopeople.edu/pluginfile.php/1827245/mod_book/chapter/484173/ComputerNetworksText.pdf>
  - Section 6 – Abstract Sliding Windows
    - Read the introduction
    - Read 6.1 Building Reliable Transport: Stop-and-Wait – 6.2 Sliding Windows
    - Optional reading: 6.3 Linear Bottlenecks – 6.4 Epilog
  - Section 11 – UDP Transport
    - Read the introduction
    - Read 11.1 User Datagram Protocol – 11.6 Epilog, but NOTE: subsections 11.1.3 UDP Simplex Talk and 11.1.4 netcat are optional readings

## Discussion Forum

質問:

Consider a simple application-level protocol built on top of UDP that allows a client to retrieve a file from a remote server residing at a well-known address. The client first sends a request with a file name, and the server responds with a sequence of data packets containing different parts of the requested file. To ensure reliability and sequenced delivery, client and server use a stop-and-wait protocol. Ignoring the obvious performance issue, do you see a problem with this protocol? Think carefully about the possibility of processes crashing.

回答:
ストップアンドウェイトプロトコルでは、データパケットが正常に受信されたことを確認するために、受信者から送信者に対して確認回答(ACK)が送信されます。ここで、クライアント・サーバのいずれかがクラッシュした場合、以下のような問題が発生する可能性があります。

1. サーバがクラッシュした場合: クライアントはファイルの残りのパケットを取得することができなくなります。サーバが復旧しても、クライアントとサーバ間の送信状態に関する情報が失われるため、ファイルの転送を再開することができません。
2. クライアントがクラッシュした場合: サーバはクライアントからの応答を受け取れず、送信プロセスが停止する可能性があります。クライアントが再起動したとしても、どのデータパケットが正常に受信されたか、まはたどのデータパケットを送信する必要があるかを確認することができません。
どちらのケースでも共通して、プロセスのクラッシュと再開に関する方法を定義することができていません。プロセスを完全なものにするためには、プロセスのクラッシュに関する対応策を考慮する必要があります。

## Written Assignment

1. Assuming standard 1500 byte Ethernet max payloads:  how many IPv4 fragments will be needed to transfer 2000 bytes of user data with a single UDP send? And, how do the 2000 bytes get split over the frags?
2. Despite its conceptual elegance, RPC (Remote Procedure Call) has a few problems. Discuss any 3 of those in brief.
3. Why is timestamping needed in real-time applications? This is in the context of Real-time Transport Protocol (RTP).
4. Why does UDP exist? Would it not have been enough to just let user processes send raw IP packets?
5. Explain how QUIC eliminates a couple of RTTs usually needed at the start of a secure web connection.

ans

1. 1500バイトのイーサネット最大ペイロードを前提とした場合、2000バイトのユーザーデータを1回のUDP送信で転送するには2つのIPv4フラグメントが必要です。UDPヘッダーは8バイト、IPv4ヘッダーは20バイトを占めるため、最初のフラグメントは1472バイト（1500-20-8）のユーザーデータを含み、残りの528バイト（2000-1472）が2つ目のフラグメントに分割されます。
2. RPCの問題点として挙げられる3つの例は以下の通りです。a) ネットワーク遅延: RPCコールはネットワークを介して行われるため、レイテンシーが発生し、パフォーマンスが低下する可能性があります。b) セキュリティリスク: リモートプロシージャの呼び出しはセキュリティ攻撃の対象となりうるため、適切な認証と暗号化が必要です。c) インターフェースの変更が困難: サーバー側のプロシージャが変更された場合、クライアント側のインターフェースも更新する必要があり、互換性の問題が発生することがあります。
3. 実時間アプリケーションでは、データパケットが生成された正確な時刻を知ることが重要です。これは、通信の順序を保証し、ジッター（パケット到着時間の変動）を補正し、同期を維持するために必要です。RTPでは、タイムスタンプを使用してメディアストリームの再生時に適切なタイミングと順序でデータを処理します。
4. UDPが存在する理由は、TCPや他の信頼性のあるトランスポート層プロトコルとは異なり、接続の設定、維持、終了のオーバーヘッドがなく、データグラム指向の軽量プロトコルが必要だったからです。このシンプルさにより、リアルタイムアプリケーション（例えば、ライブビデオストリーミングやオンラインゲーム）で遅延が重要な場合に理想的です。ユーザープロセスが生のIPパケットを送信するだけでなく、UDPを使用する理由は、エンドツーエンドの通信に最小限のメッセージ形式と機能（ポート番号による多重化/分離など）を提供し、アプリケーションがネットワーク層の上に直接構築できるようにするためです。生のIPパケットだけでは、これらの機能をアプリケーション自体が実装する必要があり、開発の複雑さが増します。
5. QUICは、安全なWeb接続の開始時に通常必要とされるいくつかの往復遅延（RTTs）を排除する方法として、いくつかの革新的な技術を採用しています。最初に、QUICはTLS（トランスポート層セキュリティ）ネゴシエーションをコネクションの設定フェーズに統合することで、暗号化された接続の開始に必要なRTT数を削減します。これにより、QUICは初回のハンドシェイク中にセキュリティパラメータを交渉し、同時に接続の確立を行うことができます。さらに、QUICは「0-RTT再接続」という機能をサポートしており、以前に確立された接続のセキュリティコンテキストを再利用して、新しいセッションを即座に開始することが可能です。これにより、従来のTCP+TLSベースの接続と比較して、セキュアな接続の開始に必要な時間が大幅に短縮されます。

## Learning Journal

1. In the TFTP protocol:

   - If the client changes its port number on a subsequent connection, but the server does not, what prevents an old-duplicate data packet sent by the server from being accepted by the new client?
   - If the server changes its port number on a subsequent connection, but the client does not, what prevents an old-duplicate data packet sent by the server from being accepted by the new client?

TFTPプロトコルでは、通信の特性上、各データパケットやACKには一意な識別子（例えば、シーケンス番号）が付与されます。このシステムにより、クライアントやサーバーがポート番号を変更した場合でも、以下のメカニズムが働きます：
クライアントがポート番号を変更しても、サーバーが変更しない場合、古い重複データパケットが新しいクライアント接続によって受け入れられない理由は、クライアントが新しい接続で使用するトランザクションID（またはシーケンス番号）が異なり、従って、古い接続からのパケットは無視されるためです。
サーバーがポート番号を変更しても、クライアントが変更しない場合、同じく、サーバー側で新しいトランザクションIDを使用するため、古いデータパケットが新しい接続で受け入れられることはありません。新しい接続では新しいトランザクションIDが期待され、古いパケットはトランザクションIDが一致しないため無視されます。

2. In an RPC-like protocol in which multiple requests can be outstanding, and replies can be sent in any order: Assume that requests are numbered and that ACK[N] acknowledges reply[N]. Should ACKs be cumulative? If not, what should happen if an ACK is lost?
RPCのようなプロトコルでは、複数のリクエストが保留中の状態で返信が任意の順序で送信され得るため、ACKは累積的である必要はありません。累積的ACKを使用すると、一部のACKが失われた場合には、失われたACKよりも前に受け取ったすべてのメッセージを再認識する必要が出てきます。しかし、累積的でない場合、各返信に対して個別のACKを送信し、ACKが失われた場合には、その特定のメッセージに対してのみ再送信を要求するシステムを設計することが可能です。これにより、効率的にネットワークトラフィックを管理し、リソースを節約しながら信頼性を高めることができます。もしACKが失われた場合、送信側はタイムアウトを検出し、該当するリクエストの再送または特定のACKの再要求を行うことで対応します。
