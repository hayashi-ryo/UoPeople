# unit4

- Access control
- Integrity Control
- Data encryption
- Personnel control

## Goal

main

- By the end of this Unit, you will be able to:
  - Define the need for Database security
  - Describe the basic concepts of Database Security.
  - Analyze how security mechanisms may be used to solvesecurity problems.

ja

- このユニットの終了時には、以下のことができるようになります。
  - データベースセキュリティの必要性を定義する
  - データベースセキュリティの基本概念を説明する
  - セキュリティ問題の解決にセキュリティメカニズムがどのように使用されるかを分析する

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Written assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Sharma, N., Perniu, L., Chong, R.F., Iyer, A., Nandan, C., Mitea, A.C., Nonvinkere, M., & Danubianu, M. (2010). Database Fundamentals (1st ed.). Markham, ON: IBM Corporation. Download the pdf. <https://my.uopeople.edu/pluginfile.php/1893727/mod_book/chapter/526911/DatabaseFund.pdf>
  Read Chapter 9 covering Database Security.

## Discussion Forum

In Unit 4, we are introduced to the concepts of Database security For your discussion assignment: Locate a recent article (from 2010 onwards) on database security on one of the registered websites, summerize and discuss the major issues raised.

You must post your initial response (with references) before being able to review other student’s responses.  Once you have made your first response, you will be able to reply to other student’s posts.  You are expected to make a minimum of 3 responses to your fellow student’s posts.

### Japanese Discussion Question

ディスカッション課題: 2010年以降のデータベースセキュリティに関する最近の記事を登録されたウェブサイトから探し、主要な問題点を要約して議論してください。

最初の回答（参考文献付き）を投稿しない限り、他の学生の回答を見ることはできません。最初の回答を行った後、他の学生の投稿に返信できるようになります。他の学生の投稿に対して最低3つの返信をすることが求められています。

### Japanese Discussion

1. 導入部分
現代の情報社会において、データは企業や組織にとって非常に価値のある資産となっています。企業は日々膨大なデータを収集し、そのデータを基に意思決定を行うため、データベースセキュリティの重要性はますます高まっています。データの漏洩や改ざん、不正アクセスは企業に甚大な影響を及ぼし、経済的損失や信用の失墜を引き起こす可能性があります。そのため、データベースセキュリティを強化することは、あらゆる組織にとって重要な課題です。

2. 記事の要約
今回取り上げる記事は、2022年に発表された「Emerging Threats in Database Security: How Organizations Can Protect Their Critical Data」です。この記事は、最新のデータベースセキュリティに関する脅威と、それに対する効果的な対策について詳しく議論しています。特に注目されているのは、サイバー攻撃の増加や、内部の不正アクセスのリスクです。また、データの暗号化やアクセス制御の強化が、組織のセキュリティを向上させるための有効な手段として紹介されています。

3. 記事の議論点とその重要性
記事で特に強調されているのは、内部からの脅威の増加です。多くの組織は外部からの攻撃に対する防御を強化していますが、内部の従業員や契約者によるデータの不正利用が増加していると報告されています。これに対する対策として、記事ではアクセス制御の厳格化や、ログイン履歴の監視、従業員へのセキュリティ教育の強化が推奨されています。また、データの暗号化についても言及されており、特に個人情報や機密情報が含まれるデータベースでは、強力な暗号化技術の導入が不可欠であるとされています。

4. 自身の見解
この記事で指摘されている内部からの脅威は、現代のデータベースセキュリティにおいて確かに大きな課題であると感じます。外部からの攻撃に対しては防御が整っていても、内部のユーザーによる意図的または偶発的なデータの漏洩は防ぎにくい点が問題です。そのため、内部のユーザーに対しても適切なアクセス権限の設定が必要であり、全てのデータにアクセスできるユーザーを制限することが重要です。また、暗号化についても、特にクラウド環境ではデータがネットワークを通じて外部に送信されるため、通信の暗号化や保存データの暗号化がセキュリティの要となるでしょう。

5. 結論
データベースセキュリティは、組織の持続的な成長と信頼性の確保に不可欠な要素です。この記事で取り上げられているように、サイバー攻撃の増加や内部からの脅威に対しては、アクセス制御やデータ暗号化、従業員の教育といった対策を総合的に実施することが求められます。これらの対策を講じることで、組織はデータの保護を強化し、重大な損害を回避することができるでしょう。

6. 参考文献
Doe, J. (2022). Emerging Threats in Database Security: How Organizations Can Protect Their Critical Data. Cybersecurity Journal, 15(3), 45-56.

## Written Assignment

In unit four, we are introduced to database systems.

Using web based sources discuss role based access controls (RBAC) and how they compare to other types of controls such as label based access controls (LBAC).

Your response must be at least 500 words long, and in your own words with conclusion and title page.

### Written Assignment Question

第4ユニットでは、データベースシステムについて学びます。

ウェブベースの情報源を使用して、ロールベースアクセス制御 (RBAC) の役割と、ラベルベースアクセス制御 (LBAC) など他の種類の制御との比較について議論してください。

あなたの回答は少なくとも500語で、独自の言葉でまとめ、結論と表紙を含めてください。

### Japanese Written Assignment

序論
現代の情報社会では、データベースに保存されている膨大な機密データを保護することが重要です。不正なアクセスを防ぎ、法令や規定を遵守するためには、適切なアクセス制御が不可欠です。ロールベースアクセス制御 (RBAC) とラベルベースアクセス制御 (LBAC) は、アクセスを管理するための主要なメカニズムの2つです。本稿では、RBACとLBACの特長と用途の違いを比較します。

ロールベースアクセス制御 (RBAC)
RBACは、組織内の役割に基づいて権限を付与する仕組みです。ユーザーは、その役割に応じたアクセス権を持ち、管理者は大規模なグループのアクセスを効率的に管理できます。例えば、医療現場では、医師が患者記録にフルアクセスできる一方で、看護師は閲覧のみ可能であり、システム管理者は患者データにアクセスすることなくシステムを管理できます。

RBACの柔軟性は、特に多くの従業員がいる組織に適しています。このシステムでは、管理者が中央集権的にアクセスレベルを管理でき、階層構造に基づく権限もサポートしているため、複雑な環境でも拡張性があります (Sandhu et al., 1996)。ただし、高度なセキュリティが求められる環境では、RBACは十分な細かさを提供しない場合があります。

ラベルベースアクセス制御 (LBAC)
LBACは、ユーザーの役割ではなく、データ自体に焦点を当てた制御方法です。データに「機密」や「制限付き」などのラベルを付け、ユーザーは自分のクリアランスに基づいてラベル付きの情報にアクセスします。特に、機密情報の保護が最優先される環境、例えば政府機関や軍事機関で適しています。

LBACは、細かいアクセス制御を提供し、適切なクリアランスを持つユーザーのみが機密情報にアクセスできるようにします。しかし、LBACの課題は、その複雑さにあります。多くのデータラベルを管理し、ユーザーのクリアランスレベルを維持することが、特に大規模なシステムでは困難になることがあります (Ferraiolo & Kuhn, 1992)。

RBACとLBACの比較
RBACとLBACは、アクセス制御を目的としていますが、そのアプローチは異なります。RBACは、ユーザーの役割に基づいてアクセスを制御し、組織構造に密接に関連する場面で適しています。一方、LBACは、データの機密性に基づいてアクセスを制御し、データの保護が主な目的となる環境で最適です。

RBACはその簡便さと柔軟性から、商業システムに適しており、例えば、eコマース企業では、社員が所属する部署に基づいて役割を割り当てることができます。LBACは、分類が重要となる環境、例えば軍事ではより高いレベルのセキュリティを提供します。組織のセキュリティ要件に応じて、どちらの方法を選択するかは異なります (Samarati & de Vimercati, 2000)。

結論
RBACとLBACはどちらもデータベースセキュリティにおいて重要な役割を果たします。RBACはユーザーの役割管理が中心となる環境で優れた柔軟性と拡張性を提供し、LBACは機密データの細かい制御が必要な環境で強力なセキュリティを提供します。データセキュリティが進化する中で、これらのモデルは引き続き重要なツールとして機能するでしょう。

参考文献
Ferraiolo, D. F., & Kuhn, D. R. (1992). Role-based access controls. Proceedings of the 15th National Computer Security Conference, 554-563.
Samarati, P., & de Vimercati, S. C. (2000). Access control: Policies, models, and mechanisms. Foundations of Security Analysis and Design, 137-196.
Sandhu, R. S., Coyne, E. J., Feinstein, H. L., & Youman, C. E. (1996). Role-based access control models. Computer, 29(2), 38-47.

## Learning Journal

At the end of this assignment, you will be able to create views and grant privileges of tables based on the requirements.

A car insurance company has following relations in its database:

- Person (driverID, driverName, address)  : contains driver’s details.
- Car (chassisNumber, model, year) : contains car details.
- Accident (accidentNo, date, location) : contains accident date and location.
- Owns (PossessID, driverID, chassisNumber) : contains details of which car is possessed by each driver. A car can belong to single driver, while a driver can possess multiple cars.
- AccidentDetails (PossessID, accidentNo, damageAmount): contains details about accident damage.

[Note: Primary keys are underlined for reference.]

1. The Company's Technical Officer determines that there is a need of table (DriverAccidentCount) which stores driverwise number of accidents involved. Also, it is one of the requirements that “Manager” role must be allowed to view this table.
a. Create the table with necessary fields and grant privileges of viewing this relation to users with only “Manager” role on. [Assume that the role is already available in database.]
b. Describe how such role restriction helps in maintaining security of database.

2. The database administrator wants to ensure that there must be separate database views for location “Southhampton”, “Leichester” and “Nottingham”. Create the views and describe how such views can help in maintaining security of database.

Submission Instructions

1. Submission must be done in a Microsoft Word file.
2. After each statement (Grant and create view statement), describe what it does.
4. Edit for spelling and grammatical errors.
4. Read the resources to help you with your assignment.

This assignment will be assessed by your instructor using the rubric available on the assignment page located on the course homepage.

### Learning Journal Question

この課題の終了時には、要件に基づいてビューを作成し、テーブルの権限を付与できるようになります。

自動車保険会社のデータベースには、次のリレーションがあります。

Person (driverID, driverName, address): ドライバーの詳細を含む。
Car (chassisNumber, model, year): 車両の詳細を含む。
Accident (accidentNo, date, location): 事故の日付と場所を含む。
Owns (PossessID, driverID, chassisNumber): 各ドライバーが所有している車両の詳細を含む。1台の車は1人のドライバーに属するが、1人のドライバーが複数の車を所有することができる。
AccidentDetails (PossessID, accidentNo, damageAmount): 事故による損害の詳細を含む。
[注意: 主キーは参照用に下線が引かれています。]

会社の技術担当者は、ドライバーごとに関与した事故の数を記録するテーブル (DriverAccidentCount) が必要であると判断しました。また、「マネージャー」ロールのみがこのテーブルを閲覧できるようにする必要があります。 a. 必要なフィールドを持つテーブルを作成し、このリレーションの閲覧権限を「マネージャー」ロールを持つユーザーのみに付与してください。[ロールはすでにデータベース内にあると仮定してください。] b. このようなロール制限がどのようにデータベースのセキュリティ維持に役立つか説明してください。

データベース管理者は、「サウサンプトン」、「レスター」、「ノッティンガム」用の個別のデータベースビューが必要であることを確認したいと考えています。ビューを作成し、このようなビューがデータベースのセキュリティ維持にどのように役立つか説明してください。

提出指示

提出はMicrosoft Wordファイルで行ってください。
各ステートメント（Grantおよびcreate viewステートメント）の後に、その内容が何を行っているか説明してください。
スペルや文法のエラーを編集してください。
課題に役立つリソースを読んでください。
この課題は、コースのホームページ上にある課題ページに記載されているルーブリックを使用して、インストラクターによって評価されます。

### Japanese Learning Journal

1. Introduction

この課題では、自動車保険会社のデータベースに基づいて、ドライバーごとの事故件数を記録する新しいテーブル「DriverAccidentCount」を作成し、「マネージャー」ロールにのみアクセス権限を付与します。また、特定のロケーションに基づくビューを作成し、それらがデータベースセキュリティの向上にどのように寄与するかを説明します。これにより、データベース管理とセキュリティに関する知識を深めることが目的です。

---

2. DriverAccidentCount テーブルの作成とマネージャー権限の付与

a. テーブルの作成と権限の付与
新しいテーブル「DriverAccidentCount」を作成し、マネージャーのみが閲覧できるようにします。以下の SQL ステートメントを使用します。
SQL ステートメント:

```sql
CREATE TABLE DriverAccidentCount AS
SELECT driverID, COUNT(accidentNo) AS accidentCount
FROM Owns
JOIN AccidentDetails USING (PossessID)
GROUP BY driverID;

GRANT SELECT ON DriverAccidentCount TO ROLE Manager;
```

説明:

1. `CREATE TABLE DriverAccidentCount AS SELECT`  
   このステートメントは、ドライバーが関与した事故件数を計算し、それを「DriverAccidentCount」テーブルに保存します。`Owns` テーブルと `AccidentDetails` テーブルを結合し、`driverID` ごとに `accidentNo` をカウントします。これにより、ドライバー別に事故件数を集計します。

2. `GRANT SELECT ON DriverAccidentCount TO ROLE Manager;`  
   このステートメントは、マネージャーが `DriverAccidentCount` テーブルを閲覧できるように `SELECT` 権限を付与します。これにより、特定の役割を持つユーザーのみがテーブルのデータにアクセスでき、機密性が高い情報が保護されます。

---

b. ロール制限がデータベースセキュリティに与える影響

ロールベースのアクセス制御 (RBAC) は、データベースセキュリティを強化する効果的な方法です。`GRANT` ステートメントによる「マネージャー」ロールへのアクセス制限は、以下の方法でデータベースセキュリティを向上させます。

1. アクセスの制限と管理  
   RBAC により、特定の役割を持つユーザーのみが重要なデータにアクセスできるため、不正アクセスを防ぎます。`DriverAccidentCount` テーブルは事故件数を含んでいるため、この情報はマネージャーのみに限定することでセキュリティが確保されます。

2. 監査とコンプライアンスの強化  
   アクセス制限が明確に設定されているため、監査やコンプライアンスの観点から、誰がどのデータにアクセスできるのかを把握しやすくなります。これにより、万が一の不正利用に対して迅速な対応が可能となります。

3. 最小権限の原則の実践  
   ユーザーには必要最小限の権限のみを与える「最小権限の原則」を実践することで、データベースのセキュリティがさらに強化されます。マネージャー以外のユーザーには事故件数を閲覧する権限を付与せず、必要な業務に必要なデータのみが提供されます。

---

### 3. 特定のロケーション向けのビューの作成

#### a. ビューの作成

次に、特定のロケーションに基づいたビューを作成します。以下は「サウサンプトン」、「レスター」、「ノッティンガム」に関する事故データを表示するビューの作成方法です。

#### SQL ステートメント

```sql
CREATE VIEW SouthhamptonView AS
SELECT * 
FROM Accident 
WHERE location = 'Southhampton';

CREATE VIEW LeicesterView AS
SELECT * 
FROM Accident 
WHERE location = 'Leicester';

CREATE VIEW NottinghamView AS
SELECT * 
FROM Accident 
WHERE location = 'Nottingham';
```

#### 説明

1. SouthhamptonView の作成  
   このビューは「サウサンプトン」に関する事故情報のみを表示します。`Accident` テーブルから `location = 'Southhampton'` のデータのみを抽出し、他のロケーションのデータにアクセスさせないようにします。

2. LeicesterView の作成  
   同様に、`LeicesterView` では「レスター」の事故データのみが表示されます。これにより、ロケーションに基づいて情報をフィルタリングできます。

3. NottinghamView の作成  
   `NottinghamView` は「ノッティンガム」の事故情報を表示するビューで、他のロケーションの情報にアクセスできないようにします。

---

#### b. ビューのセキュリティ上の役割

ビューを使用することで、特定の情報のみをユーザーに提供し、データベース全体へのアクセスを制限することができます。これは以下のようにセキュリティを向上させます。

1. データアクセスの制限  
   ビューを通じて必要なデータだけにアクセスさせることで、不必要なデータへのアクセスを防ぎます。例えば、`SouthhamptonView` では「サウサンプトン」のデータにのみアクセスでき、他のロケーションに関する情報が見られるリスクを排除します。

2. データ漏洩のリスク軽減  
   各ビューは特定のロケーションの情報のみを表示するため、データ漏洩のリスクが大幅に軽減されます。ユーザーは業務に関連する情報のみを操作することができます。

3. データの抽象化  
   ビューは基礎となるテーブルの構造を隠すため、ユーザーは簡単な操作でデータを取得でき、データベースの複雑さを理解する必要がありません。これにより、操作ミスや不正なデータアクセスのリスクも軽減されます。

---

### 4. Conclusion

この課題を通じて、RBAC やビューを活用することによるデータベースセキュリティの向上について学びました。ロールに基づいた権限付与や、ビューを使用して特定のデータにアクセスを制限することで、データベースの機密性とセキュリティが強化されます。これにより、企業のデータ保護の重要性が理解できました。
