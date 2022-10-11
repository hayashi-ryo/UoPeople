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
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
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
