# unit3

- Actors, Goals and Sketchy use cases
- System boundary and subsystems
- Detailed use case specifications
- Use case points
- Basics of UML

## Goal

- By the end of this Unit, you will be able to:
  - Understand Use Cases and basics of UML
  - Identity various components of use cases like actors, goals etc. and their
  - roperties and usage
  - Create use cases for a given scenario
  - Create UML diagrams for a given scenario

## Task

- [x] Reading assignment
- [x] Peer assessment unit2
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Marsic, I. (2012). Software engineering. Rutgers Unversity.<https://www.ece.rutgers.edu/~marsic/books/SE/book-SE_marsic.pdf>
  - Read Chapter 2, Section 2.4 Use Case Modeling.
    - ユースケースは、ユーザがビジネスを達成するために計画したシステムをどのように利用するか記述したもの
      - A use case is a description of how a user will use the planned system to accomplish business goals.
    - 詳細化すると、アクターとシステムとの利用シナリオのこと
  - Read Chapter 4, section 4.2.1 Use case Points
- Ambler, S. (2003-2018). UML 2 Use Case Diagrams: An Agile Introduction. Agile Modeling. <http://www.agilemodeling.com/artifacts/useCaseDiagram.htm>

## Discussion Forum

What is the difference between a scenario and a use case? When do you use each construct? Explain with the help of 1-2 suitable examples.

Marsicによれば、ユースケースとはユーザがビジネスを達成するために計画したシステムをどのように利用するか記述したものを指します。すなわち対象システムを開発して解決したい課題に対する作業を明文化したものになります。
対して、シナリオは特定のアクションのことを指します.システムが特定のアクションに対してどのように反応するか、どのような変化を及ぼされるのかを段階的に示します。
例として、ECサイトでの買い物を考えます。ECサイトで商品を購入する場合には、「商品を選んでカートに入れる」「決済を行う」の二つのユースケースが発生します。この時、特定の商品の「色を選び」「数量を選択し」「カートに入れるボタンをクリックする」動作が一つのシナリオです。このユースケースについては、上限を超えてカートに入れようとする場合やサイズを選択する場合など、商品に応じたシナリオが発生する可能性があります。

## Programming Assignment

NOTE:  It is easy to copy the answer from internet and amend it to your need and submit , in order to get good grades, but it will not help you learn and understand the topic better. Please try to be honest with your submissions to these programming assignments as they will help you hone your skills and understanding of the respective topic , which you will be taking along in the real world after the end of the course. Scoring should be based on learning, not copying and pasting.

You are hired to develop a software system for motion detection and garage door control. The system should turn the garage door lights on automatically when it detects motion within a given perimeter. The garage door opener should be possible to control either by a remote radio transmitter or by a manual button switch. The opener should include the following safety feature. An “electric eye” sensor, which projects invisible infrared light beams, should be used to detect if someone or something passes under the garage door while it closes. If the beam is obstructed while the door is going down, the door should not close—the system should automatically stop and reverse the door movement.

The relevant hardware parts of the system are as follows (see Figure):

motion detector
external light bulb
motor for moving the garage door
“electric eye” sensor
remote control radio transmitter and receiver
manual opener button switch
Assume that all the hardware components are available and you only need to develop a software system that controls the hardware components.

Identify the actors for the system and their goals
Derive only the use cases relevant to the system objective and write brief or casual text description of each
Draw the use case diagram for the system
For the use case that deals with the remote-controlled garage door opening, write a fully dressed description
Draw the system sequence diagram(s) for the use case selected in (d)
Show the operation contracts for the operations of the use case selected in (d)

a. Identify the actors for the system and their goals

アクターは以下の通り
利用者 user
人感センサ motion detector
ライト external light bulb
ドアオープナ motor for moving the garage door
遠隔無線送信機 remote control radio transmitter and receiver
手動ボタン manual opener button switch

b. Derive only the use cases relevant to the system objective and write brief or casual text description of each

ユースケースは以下の6つが挙げられる。
遠隔操作でドアを開ける
手動ボタンによってドアを開ける
遠隔操作でドアを開ける
手動ボタンによってドアを開ける
ライトを自動的に点灯させる
人の動きを検知し、システムの停止及びドアの動作を反対にする

c. Draw the use case diagram for the system

d. For the use case that deals with the remote-controlled garage door opening, write a fully dressed description

1. ユーザが遠隔無線送信機のボタンを押す
2. 遠隔無線送信機が受信機に対して無線を送信する
3. 受信機が無線を受信する
4. 受信機がドアオーブナにドアを開ける指令を出す
5. ドアオープナがドアを開ける

   1. the user presses a button on the remote radio transmitter 2.
   2. the remote radio transmitter sends a radio transmission to the receiver 3. the receiver receives the radio transmission
   3. the receiver receives the radio signal 4. the receiver sends a command to the door oven to open the door
   4. The receiver sends a command to the door opener to open the door 5.
   5. the door opener opens the door

e. Draw the system sequence diagram(s) for the use case selected in (d)

f. Show the operation contracts for the operations of the use case selected in (d)

## Learning Journal

今週のユニットでは、ユースケースとUNLの基本概念について学び、具体的にどのような利用をするのか、利用するフェーズはいつなのか、について重点を置いて学びました。ユニットの内容を通して、個人的に一番難しいと感じたのは、想定されたシステム利用方法から「シナリオ」や「ユースケース」を作成する工程です。この工程では、システムの構成要素安テークホルダーを意識した上で、それらの要素がどのように相互作用するかを意識する必要があります、要素がどのように依存しているんかを判断することが難しく感じました。来週のユニットまでの復習事項として意識し、万全の状態でGraded Testにのぞみたいと思います。
