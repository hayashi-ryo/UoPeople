# unit1

- Nature and purpose of database systems
- The entity-relationship model
- The relational data model,

## Goal

main

- By the end of this Unit, you will be able to:
- Identify and describe the components of major data models
- Identify and classify database system concepts

ja

- このユニットの終わりには、以下のことができるようになります：
- 主要なデータモデルのコンポーネントを特定し、説明する
- データベースシステムの概念の識別と分類

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Chapter 1, 2, and 3 of Database System Concepts, Volume 1, Fourth Edition by Silberschatz−Korth−Sudarshan. The book is available from: Database System Concepts 4th Edition By Silberschatz-Korth-Sudarshan.pdf <https://my.uopeople.edu/pluginfile.php/1893712/mod_book/chapter/526887/Database%20System%20Concepts%204th%20Edition%20By%20Silberschatz-Korth-Sudarshan.pdf>

Chapter 1 (Database System Concepts): Overview
Provides a general overview of the nature and purpose of database systems. We explain how the concept of a database system has developed, what the common features of database systems are, what a database system does for the user, and how a database system interfaces with operating systems. We also introduce an example database application: a banking enterprise consisting of multiple bank branches. This example is used as a running example throughout the book. This chapter is motivational, historical, and explanatory in nature.

Chapter 2 (Database System Concepts) : Overview
Presents the entity-relationship model. This model provides a high-level view of the issues in database design and of the problems that we encounter in capturing the semantics of realistic applications within the constraints of a data model.

Chapter 3 (Database System Concepts): Overview
Focuses on the relational data model, covering the relevant relational algebra and relational calculus.

And More..
Websites: (Register for each of these sites prior to the Unit 1 assignment)

- [x] TechRepublic: <http://www.techrepublic.com/whitepapers>
- [x] BitPipe: <http://www.bitpipe.com/>
- [x] SearchCloudComputing: <http://www.SearchCloudComputing.com>
- [x] Light Reading: <http://www.lightreading.com>
- [x] SANS: <https://www.sans.org/jp_ja/>

## Discussion Forum

In Unit 1, we are introduced to the concepts of Database systems.
For your discussion assignment: Explain the major differences between two-tier and three-tier database architectures.
You must post your initial response (with references) before being able to review other student’s responses.Once you have made your first response, you will be able to reply to other student’s posts.You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ディスカッション課題として、2層アーキテクチャと3層アーキテクチャの主な違いを説明してください。最初の回答を投稿（参考文献を含む）するまでは、他の学生の回答を閲覧することができません。最初の回答を行った後、他の学生の投稿に返信できるようになります。同級生の投稿に対して最低3回の返信を行うことが求められています。

### Japanese Discussion

データベースアーキテクチャは、データ管理システムの設計において重要な役割を果たしています。異なるアーキテクチャは、システムのスケーラビリティ、パフォーマンス、セキュリティに影響を与えるため、適切な選択が求められます。特に、2層と3層アーキテクチャは、クライアントとサーバー間のデータ通信の構造に関する主要な選択肢です。本稿では、それぞれの特徴と相違点を明らかにします。

2層アーキテクチャの説明
2層アーキテクチャ（クライアント-サーバーモデル）は、クライアントとデータベースサーバー間の直接的な通信を特徴としています。クライアント側はユーザーインターフェースを提供し、データベースサーバーがデータの管理と処理を担当します。このシンプルな構造は、ローカルネットワーク内でデータを効率的に処理するのに適しています。

利点
2層アーキテクチャの利点は、比較的シンプルで開発コストが低いことです。小規模なシステムや単純なデータ処理を行う環境においては、高速かつ効率的な通信が可能です。

欠点
一方で、2層アーキテクチャはスケーラビリティに課題があり、ユーザー数やデータ量が増加するにつれてパフォーマンスが低下することがあります。また、ビジネスロジックがクライアントに依存するため、セキュリティリスクが高まります（Silberschatz et al., 2002）。

3層アーキテクチャの説明
3層アーキテクチャは、プレゼンテーション層、ビジネスロジック層、データ層の3つの層に分かれた設計です。各層が独立して機能し、異なるサーバーで実行されることが一般的です。このモデルは、分散システムやウェブベースのアプリケーションに適しています。

プレゼンテーション層
プレゼンテーション層は、ユーザーとシステムの間のインターフェースを提供します。これは、ユーザーがデータにアクセスし、操作するための画面やアプリケーションを指します。

ビジネスロジック層
ビジネスロジック層は、システムの業務ルールを実行します。データ処理のロジックをサーバー側で処理するため、クライアントに負荷をかけることなく効率的に動作します。

データ層
データ層は、データの保存と管理を担当します。データベースサーバーがデータを効率的に処理し、他の層からのリクエストに応答します。

利点
3層アーキテクチャは、スケーラビリティとセキュリティが強化されている点が大きな利点です。ビジネスロジックがクライアントとは独立してサーバー側で実行されるため、大規模な分散システムやインターネット経由でアクセスするシステムに適しています。

欠点
一方で、3層アーキテクチャは設計と実装が複雑であり、開発コストが高くなることがあります（Silberschatz et al., 2002）。

2層アーキテクチャと3層アーキテクチャの比較
2層アーキテクチャと3層アーキテクチャの主な違いは、システムの複雑さ、スケーラビリティ、セキュリティにあります。2層アーキテクチャは、小規模なシステムやシンプルなデータ処理に適している一方で、大規模なシステムではパフォーマンスやセキュリティに制限があります。これに対して、3層アーキテクチャは大規模なシステムに適しており、スケーラビリティとセキュリティが向上しています。

結論
システムの選択は、その使用ケースに応じて行うべきです。2層アーキテクチャは、小規模でシンプルなシステムに適しており、コストが低い一方で、3層アーキテクチャは大規模な分散システムにおいて高いセキュリティとスケーラビリティを提供します。ビジネスのニーズやシステムの成長に応じて、適切なアーキテクチャを選択することが重要です。

## Written Assignment

In Unit 1, we are introduced to database systems.
For your written assignment: Construct an E-R diagram for a car-insurance company whose customers own one or more cars each.Each car has associated with it zero to any number of recorded accidents.
Your response must be complete and in your own words with conclusion and title page.

### Written Assignment Question

ユニット1では、データベースシステムについて紹介されています。
今回の課題では、車を所有している顧客を持つ自動車保険会社のためのE-R図を作成してください。各顧客は1台以上の車を所有しており、各車両には0件以上の事故記録が関連付けられています。
回答は完全に自分の言葉で書かれ、結論とタイトルページを含めてください。

この質問に基づいて、どのような回答を準備したいかを教えていただければ、具体的に文章をお手伝いします。

### Japanese Written Assignment

データベースは、組織が情報を効率的に管理し、使用するための重要なツールです。特にE-R図（エンティティ・リレーションシップ図）は、エンティティ間の関係を視覚的に表現し、データベース設計において重要な役割を果たします。この課題では、車両を所有する顧客を持つ自動車保険会社のためのE-R図を作成し、顧客、車両、および事故記録の間の関係をモデル化します。このE-R図は、保険会社が顧客や車両の情報を効果的に管理するためのデータベース設計を提供することを目的としています。
また、今回作成するE-R図はテキスト(Silberschatz, A., Korth, H.F., & Sudarshan, S. (2001).)を参照して作成します。

問題の定義

この課題では、顧客が1台以上の車を所有し、それぞれの車に0件以上の事故が関連付けられている自動車保険会社のデータモデルを設計します。顧客、車両、事故はそれぞれ独立したエンティティであり、これらのエンティティ間には明確なリレーションシップが存在します。顧客は1台以上の車を所有し、各車両は0件以上の事故記録を持つ可能性があります。このモデルに基づいて、データベース設計を行います。

E-R図の作成
このE-R図では、3つの主要なエンティティ「顧客（Customer）」、「車（Car）」、「事故（Accident）」を定義し、それぞれのエンティティ間のリレーションシップを明示します。

- 顧客（Customer）: 顧客の情報を管理します。主な属性としては、「顧客ID（CustomerID）」、「名前（Name）」、「住所（Address）」「電話番号(Phone Number)」があります。顧客は1台以上の車を所有しています。
- 車（Car）: 車両の情報を管理します。主な属性としては、「車両ID（CarID）」、「メーカー（Make）」、「モデル（Model）」、「年式（Year）」などがあります。各車両には0件以上の事故記録が関連付けられています。
- 事故（Accident）: 事故の情報を管理します。主な属性としては、「事故ID（AccidentID）」、「事故日（Date of Accident）」、「損傷の程度（Damage）」などがあります。

これらのエンティティ間のリレーションシップは次のように定義されます。

- 顧客と車両のリレーションシップ（1対多）: 各顧客は1台以上の車を所有しているため、顧客と車両の間には「1対多」のリレーションシップが存在します。これは、1人の顧客に対して複数の車両が関連付けられることを意味します。
- 車両と事故のリレーションシップ（0対多）: 各車両は0件以上の事故に関連付けられている可能性があるため、車両と事故の間には「0対多」のリレーションシップがあります。これは、車両が事故に遭わない場合もあれば、複数回の事故記録が存在することもあります。

これらの情報から作成したE-R図は以下となります。作成したE-R図について説明します。

1. 顧客（Customer）: 「顧客ID（CustomerID）」は主キーであり、顧客の識別に使用されます。他の属性として、「名前（Name）」、「住所（Address）」「電話番号(Phone Number)」があります。
2. 車（Car）: 「車両ID（CarID）」が主キーであり、各車両を一意に識別します。その他の属性には、「メーカー（Make）」、「モデル（Model）」、「年式（Year）」などがあります。
3. 事故（Accident）: 「事故ID（AccidentID）」が主キーであり、各事故を識別します。「事故日（Date of Accident）」や「損傷の程度（Damage）」などの属性が事故の詳細を提供します。

各リレーションシップは、顧客が複数の車両を所有し、車両が複数の事故に関連する可能性を表します。これにより、自動車保険会社は顧客や車両、事故に関するデータを効果的に管理できます。

結論
このE-R図は、自動車保険会社のデータ管理における基本的な構造を提供し、顧客、車両、および事故の関係を適切にモデル化しています。このモデルを基に、保険会社は効率的なデータベースを設計し、顧客情報や事故記録の管理をスムーズに行うことが可能です。さらに、このデータモデルは将来的なシステムの拡張にも対応でき、例えば、新しい保険契約や事故記録の追加などが容易に行える設計になっています。

## Learning Journal

For this assignment, you will apply what you have learned in this unit about database systems and answer the following questions.

1.

(a) Design an entity-relationship data model using DIA software for a car-insurance company whose customers own one or more cars each. There are zero to any number of accidents recorded for each car.
(b) Provide an example of each of the following three concepts within your model:

- Primary key
- Composite attribute
- Multi-valued attribute

(c) Follow these instructions for downloading and using Dia Diagramming Editor to create your entity relationship diagram.

2.

(a) Using the concepts of relational databases, develop a set of tables with several entries in each table from the model designed in question 1.(a).
(b) Using these tables, provide an example of each of the following:

- A left join
- A right join
- A full outer-join

3.

(a) Give examples for each of the following four mapping cardinalities:

- one-to-one
- many-to-one
- one-to-many
- many-to-many

(b) Explain why the cardinality is appropriate for the relationship in each example.

- one-to-one
- many-to-one
- one-to-many
- many-to-many
- many-to-many

Submission instructions

- Write the questions before the answer.
- Edit for spelling and grammar errors.
- Use APA citations and references if you use ideas from the readings or other sources. For assistance with APA formatting, view the Learning Resource Center: Academic Writing.
- Make sure you submit both files i.e., one word file (containing ER diagram along with its explanation) and the other with DIA as an attachment in your assignment.

### Learning Journal Question

この課題では、このユニットで学んだデータベースシステムに関する知識を適用し、次の質問に回答してください。

1.

(a) 顧客が1台以上の車を所有しており、各車両に対して0件から任意の数の事故が記録される自動車保険会社のエンティティ・リレーションシップ（ER）データモデルを、DIAソフトウェアを使用して設計してください。
(b) モデル内で次の3つの概念のそれぞれの例を提示してください。

主キー（Primary key）
複合属性（Composite attribute）
多値属性（Multi-valued attribute）
(c) Dia Diagramming Editor をダウンロードして使用し、エンティティ・リレーションシップ図を作成するための指示に従ってください。

2.

(a) リレーショナルデータベースの概念を使用して、1.(a)で設計したモデルから、各テーブルにいくつかのエントリを含むテーブルのセットを作成してください。
(b) これらのテーブルを使用して、次の各操作の例を提示してください。

左外部結合（Left join）
右外部結合（Right join）
全外部結合（Full outer join）

3.

(a) 次の4つのマッピングのカーディナリティに対する例を提示してください。

1対1（One-to-one）
多対1（Many-to-one）
1対多（One-to-many）
多対多（Many-to-many）
(b) 各例におけるリレーションシップにおいて、なぜそのカーディナリティが適切であるかを説明してください。

提出の指示：

質問を回答の前に書いてください。
スペルや文法の誤りがないように編集してください。
読んだ資料や他の情報源からのアイデアを使用する場合は、APA形式で引用し、参考文献を記載してください。APA形式についてのサポートは、ラーニングリソースセンターの「学術的なライティング」を参照してください。
提出ファイルは2つ、つまりER図とその説明を含むWordファイルとDIAファイルを添付して提出することを確認してください。

### Japanese Learning Journal

1. 私の環境(M1 MacBook Air)ではDIAソフトウェアが動作しないため、ブラウザ上で軽量かつ迅速にER図を作成できるMermaid.jsを利用しました。このツールはWebベースで動作し、ブラウザ上で容易にERデータモデルを視覚化することが可能です。
(a)このE-R図では、3つの主要なエンティティ「顧客（Customer）」、「車（Car）」、「事故（Accident）」を定義し、それぞれのエンティティ間のリレーションシップを明示します。

- 顧客（Customer）: 顧客の情報を管理します。主な属性としては、「顧客ID（CustomerID）」、「名前（Name）」、「住所（Address）」「電話番号(Phone Number)」があります。顧客は1台以上の車を所有しています。
- 車（Car）: 車両の情報を管理します。主な属性としては、「車両ID（CarID）」、「メーカー（Make）」、「モデル（Model）」、「年式（Year）」などがあります。各車両には0件以上の事故記録が関連付けられています。
- 事故（Accident）: 事故の情報を管理します。主な属性としては、「事故ID（AccidentID）」、「事故日（Date of Accident）」、「損傷の程度（Damage）」などがあります。

これらのエンティティ間のリレーションシップは次のように定義されます。

- 顧客と車両のリレーションシップ（1対多）: 各顧客は1台以上の車を所有しているため、顧客と車両の間には「1対多」のリレーションシップが存在します。これは、1人の顧客に対して複数の車両が関連付けられることを意味します。
- 車両と事故のリレーションシップ（0対多）: 各車両は0件以上の事故に関連付けられている可能性があるため、車両と事故の間には「0対多」のリレーションシップがあります。これは、車両が事故に遭わない場合もあれば、複数回の事故記録が存在することもあります。

これらの情報から作成したE-R図は以下となります。作成したE-R図について説明します。

ER Figure

(b)今回作成したモデルにおける3つの概念について説明します。

主キー（Primary Key）: 「顧客」エンティティの「顧客ID」や「車両」エンティティの「車両ID」が主キーです。これらはエンティティ内で各レコードを一意に識別します。
複合属性（Composite Attribute）: 「顧客」エンティティの「名前」は、名と姓など複数の要素に分割できるため、複合属性の例となります。
多値属性（Multi-valued Attribute）: 「車両」エンティティの「事故」は、多値属性の一例です。1台の車に複数の事故が関連する可能性があるためです。

2. テーブル情報を以下と設定した上で、それぞれのSQLの実行結果について考察します。
Customerテーブル

| CustomerID | Name       | Phone-Number  | Address        |
|------------|------------|---------------|----------------|
| 1          | John Smith | 123-4567-8910 | 123 Main St    |
| 2          | Jane Doe   | 098-7654-3210 | 456 Oak Ave    |
| 3          | Ryo Haya   | 111-2222-3333 | 876 Ota vil    |

Carテーブル

| CarID | CustomerID | Model      | RegistrationNumber |
|-------|------------|------------|--------------------|
| 101   | 1          | Toyota Camry  | ABC123          |
| 102   | 2          | Honda Civic   | XYZ456          |

Accidentテーブル

| AccidentID | CarID | Date       | Description             |
|------------|-------|------------|-------------------------|
| 1001       | 101   | 2024-01-15 | Rear-end collision       |
| 1002       | 101   | 2024-02-20 | Minor fender bender      |
| 1003       | 102   | 2024-03-30 | Parking lot accident     |

- Left Join
Customerテーブルのすべてのレコードと、Carテーブルの対応するレコードを結合します。Customerテーブルに存在し、Carテーブルに対応する車両がない場合でも、Customerのデータが含まれます。

SELECT Customer.Name, Customer.Phone-Number, Car.Model
FROM Customer
LEFT JOIN Car
ON Customer.CustomerID = Car.CustomerID;

結果

| Name       | Phone-Number  | Model         |
|------------|---------------|---------------|
| John Smith | 123-4567-8910 | Toyota Camry  |
| Jane Doe   | 098-7654-3210 | Honda Civic   |
| Ryo Haya   | 111-2222-3333 | NULL          |

- Right Join
Carテーブルのすべてのレコードと、Customerテーブルの対応するレコードを結合します。Customerテーブルに存在し、Carテーブルに対応する車両がない場合でも、Customerのデータが含まれます。例えば、Ryo Hayaのように車両を持っていない顧客のデータがNULLとして返されます。

SQL
SELECT Customer.Name, Customer.Phone-Number, Car.Model
FROM Car
RIGHT JOIN Customer
ON Customer.CustomerID = Car.CustomerID;

結果

| Name       | Phone-Number  | Model         |
|------------|---------------|---------------|
| John Smith | 123-4567-8910 | Toyota Camry  |
| Jane Doe   | 098-7654-3210 | Honda Civic   |
| Ryo Haya   | 111-2222-3333 | NULL          |

- Full Outer Join
Full Outer Joinは、両方のテーブルからすべてのレコードを返し、一方にしか存在しないレコードはNULLとして表示されます。これにより、両方のテーブルの完全なデータが取得され、片方のテーブルに対応するレコードが存在しない場合でも情報を保持することが可能です。

SQL

SELECT Customer.Name, Customer.Phone-Number, Car.Model
FROM Customer
FULL OUTER JOIN Car
ON Customer.CustomerID = Car.CustomerID;

結果

| Name       | Phone-Number  | Model         |
|------------|---------------|---------------|
| John Smith | 123-4567-8910 | Toyota Camry  |
| Jane Doe   | 098-7654-3210 | Honda Civic   |
| Ryo Haya   | 111-2222-3333 | NULL          |

3. 4つのマッピングにおけるカーディナリティにおける例と、各例においてなぜそのカーディナリティが適切であるかを説明します。

- One-to-one
  例: 運転免許証と運転者
  一人の運転者には1つの運転免許証しか発行されません。また、1つの運転免許証は一人の運転者にしか発行されないため、1対1の関係です。
- Many-to-one
  例: 車とメーカー
  複数の車両が一つのメーカーによって製造されます。よって、車から見てメーカーは多対1の関係です。
- One-to-many
  例: 顧客と車両
  一人の顧客は複数の車両と所有することができます。そのため、顧客から見て車は1対多の関係です。
- Many-to-many
  例: 車と事故
  1台の車は複数の事故に関与する可能性があります。また、1つの事故に対して複数の車が関与する可能性があります。したがって、車と事故の関係は多対多の関係です。また、多対多（Many-to-many）の関係は、データベースで表現する際に中間テーブルを用いることが一般的です。例えば、車と事故の多対多の関係では、Car_Accidentという中間テーブルを設けて、どの車がどの事故に関与しているかを記録することで、この関係を効果的に管理できます。
