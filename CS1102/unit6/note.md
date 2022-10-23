# unit6

- User-Interface Components: Button, HBox, Scene, Label, etc.
- Events: Action Events, Mouse Events, and Key Events
- Event Handlers: ActionListener, MouseListener, and KeyCode

## Goal

- By the end of this Unit, you will be able to:
  - Examine graphical user interface components with titles, buttons, and text content.
  - Explain Java programs that respond to mouse, button, and keyboard events.

## Task

- [x] Reading assignment
- [x] Peer assess
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz
- [x] Take Graded-Quiz

## Reading Assignment

- Chapter 1, Section 6: The Modern User Interface
  - GUI(グラフィカル・ユーザ・インタフェース)によって操作ができるようになった。
- Chapter 6: Introduction to GUI Programming, Sections 1
  - Stageオブジェクト：ウィンドウを指す
  - sceneオブジェクト：ウィンドウ内部のエリアに表示する内容の編集を行う
  - Nodeオブジェクト：sceneオブジェクトの一部。ボタンやテキストなど
- Chapter 6: Introduction to GUI Programming, Sections 2
  - カラー
    - RGBシステムで表現する
- Chapter 6: Introduction to GUI Programming, Sections 3
  - マウスやキーボードの入力など、随時発生するイベントへの対応が必要だ
  - このイベントはオブジェクトとして表現される。
  - どのようにイベントを検知するのか？
    - イベントを待ち受けるインターフェースによって、さまざまな機能の処理を行う。
  - 発生するイベントごとにハンドラを用意して、それぞれどのような動きとなるのかを定義して処理の実装を行う。
  - ドラッグ操作は三つのイベントハンドラに分散して実装される。
    - 起動（mousepressd)・ドラッグ(mousedoragged)・離す(mousereleased)
- Chapter 6: Introduction to GUI Programming, Sections 6.

## Discussion Forum

Considering the Java program in section 6.3.3 “Dragging” of Eck (2019), describe what it does in response to specific operations of the mouse (mousePressed, mouseDragged, and mouseReleased), and how it does it.
You are encouraged to run the SimplePaint program for yourself to test its behavior. Then read through the program carefully to understand how that behavior arises.
Eck (2019) の 6.3.3 節「ドラッグ」の Java プログラムを考え、マウスの特定の操作（mousePressed, mouseDragged, mouseReleased）に応じて何を行い、どのようにそれを行っているかを説明しなさい。
SimplePaintのプログラムを自分で動かして、その動作をテストすることをお勧めします。そして、その動作がどのように発生するのかを理解するために、プログラムを注意深く読んでみてください。

クラスメイトの皆さんこんにちは、今回の課題に関する私の見解を説明します。
section 6.3.3 “Dragging” of Eck (2019)では表示されたウィンドウ上でドラッグの操作を行い、線を引くプログラムについて学びました。このプログラムにおいて「線を引く」動作は大きく分けて3つのプロセスで実装されているので、前提とそれぞれのプロセスでどのような処理を行なっているのかについて説明します。
前提
プログラムの前提として、インスタンスパラメータである「dragging」の要否の判断が随時行われます。このパラメータは、「線を引く」べきタイミングではTrue、それ以外の場合はFalseに設定されています。

1. マウスのクリックを検知する
キャンバス内でマウスクリックの動作が発生した場合、イベントハンドラ"setOnMousePressed"によってプログラムはイベントを検知します。この際、プログラムはいくつかの処理を行います
   1. パラメータdragging=Trueへの変更(もともとtrueの場合は処理を行わずreturnする)
   2. xy座標の取得
2. マウスのドラッグを検知する
クリックイベントが発生した後ドラッグ操作が行われると、イベントハンドラ"setOnMouseDragged"によってドラッグイベントを検知し、いくつかの処理を行います。
   1. 現在の座標の取得。この際、ウィンドウ外へのドラッグは行われた場合は補正処理を行います。
   2. 線を描画
   3. prevXおよびprevYへ現在座標を下苦悩する
3. クリックのリリースを検知する。
ドラッグが終了した場合、イベントハンドラ"setOnMouseReleased"によってリリースイベントを検知します。ここで、ドラッグの状況を管理するパラメータ"dragging"をfalseに変更します。

このように、ドラッグした線を描画する、などのGUIプログラミングを行う場合は、プログラムに対してどのようなイベントを契機に処理を実装すべきか考える必要のある非常に複雑なものだと考えています。

## Written Assignment

## Learning Journal

今週のユニットでは、GUIプログラミングの基本的な事項について学びました。この概念について、私の理解を説明します。

unit5までのプログラミングでは、与えらた値を処理する方法として、メソッドやインスタンス、継承の概念について学んできまいた。今週学んだGUIプログラミングは、それらを処理のベースとして持ちながらも、全く違った概念であると私は感じています。
GUIプログラミングの最も重要な概念は、テキストにもあるように「イベント駆動型」であるという点です。つまり、ボタンをクリックしたり、キーボードのキーをおしたり、スマートフォンをフリックで操作したいといった、ユーザのアクションがイベントを生成するため、これらのイベントに応答し、処理するプログラムを実装する必要があります。
このようなイベント駆動型のプログラミングの手法について、このコースではJavaFXというツールキットを利用してプログラムの作成を行いました。JavaFXは「マウスクリックの待受」「キーボードの入力」など基本的なユーザアクションについて定義されているツールです。このプログラムの集合を利用することによって、0から作成することが難しいプログラムの作成であっても、既に存在する資産を有効活用してプログラムを進めることができました。
しかし、GUIプログラミングを今回のユニットだけで全てを学ぶことができたとは思えていません。なぜなら、イベント駆動型のプログラミングを行うためには、ユーザアクションを詳細に分割し、それぞれのアクションでどのような操作をすると想定した動作とできるか、という点について理解することができていないためです。CS1102のコースでは、このユニット以降GUIプログラミングを扱わないと思いますが、個人的なスキル向上のために、イベント駆動型のプログラミングの基本について勉強したいと思います。
また、今回のユニットでは環境の作成に一番苦労しました。最初はテキストを元に環境の設定を行なったのですが、エラーを取り除くことができない状態となってしまいました。結局、全く異なる方法を利用して環境の構築を行うことで、正常にJavaFXを動作する環境を構築することができました。このように、開発環境の構築やサーバの導入は、非常につまづきやすい分野だと感じています。このような時には、今回対処したように、インターネットで同様の状況となってしまった人をさがし、その人がどのように対処したのか、ということを確認することで対処していきたいと思います。
最後に、今週のユニットはGraded-Quizがありました。ある程度の準備を進めていたので自信はあったものの満点を取ることができませんでした。Final-Quizでは満点をとることができるよう、残りのユニットの期間で復習を進めていきたいと思います。
