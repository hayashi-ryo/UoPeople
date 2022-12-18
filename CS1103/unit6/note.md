# unit6

- This unit will address the following topics:
  - Files and Networking
  - Advanced GUI Programming

## Goal

- Understand files: writing and reading
- Learn the basics of networking.
- Study more GUI programming topics, including images and resources, text, transparency, anti-aliasing, actions, and buttons.

## Task

- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [ ] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

## Reading Assignment

- Introduction
  - 入出力ファイルをパラメータとして読み込みストリームを作成するコンストラクタがある。
  - 扱うためには、カレントディレクトリ・相対・絶対ディレクトリについて知る必要がある。
- Section 11.2 Files
- Section 11.4: Networking
  - ソケットはプログラムが他のプログラムとの接続を確立させるために利用される。
  - サーバーソケットは、基本的に接続開始のための方式のために利用される。
  - 対して、ただの「ソケット」はクライアント側のクラスを指すことが多い
- Section 13.1: Images and Resources
- Section 13.2: Fancier Graphics
- Section 13.3: Actions and Buttons

## Discussion Forum

What are the differences of handling Socket and ServerSocket ?

テキストによれば、プログラムが他のプログラムと通信を行うためのに、ソケットが利用されます。javaでは、java.net.Socketクラスとして提供され、オブジェクトとして管理することができます。この概念について説明します。
ソケットを利用した通信を行うためには、ネットワーク接続を確立させることが重要です。そのために、あるプログラムは、別のソケットからの通信を受動的に待機するソケットを生成します。このソケットに対して他のプログラムが通信を行うことで、接続が確立します。この時、通信を待うけるソケットをサーバーソケットと呼び、通信を行うソケットをクライアントソケットと呼びます。また、通信をまち受けるプログラムは複数のクライアントからアクセスされることがあります。このような場合に備えて、JavaではServerSocketとSocketというオブジェクトを容易しています。それぞれどのように利用されるのか説明します。
まず、ServerSocketは、サーバ上で受動的に待機するソケットを生成します。このとき、要求を受け取った際には、ソケットを生成し、サーバとクライアント間のエンドポイントを生成します。その後、ServerSocketは引き続き他の要求を待機するのです。このように、通信を待機するオブジェクトと確立した通信を実際に行うオブジェクトを分離することによって複数のリクエストを処理できるよう設計を行うことが可能になります。
最後にまとめます。
ServerSocket：サーバ上でクライアントからの接続要求を待ち受ける。実際に通信が発生した場合は、サーバ側にSocketオブジェクトを生成し、実際の通信が行うことができるようにするもの。
Socket：サーバとクライアント間の通信のエンドポイントを示す。クライアントアプリケーションとサーバ側それぞれにオブジェクトが生成され、確立された通信を行う。
Eck, D. J. (2019). Introduction to programming using Java, version 8.1. Hobart and William Smith Colleges. <http://math.hws.edu/javanotes>

## Written Assignment

For this week’s assignment, you are required to provide a solution for Lab 10: “ArrayLists and Files in a GUI Application”.

## Learning Journal
