# unit5

- eCommerce applications
- Online payments
- Secure practices with eCommerce applications

## Goal

By the end of this Unit, you will be able to:

- Demonstrate the ability to install eCommerce application.
- Demonstrate the ability to configure and operate an eCommerce application.
- List practices to secure eCommerce applications.

ja

- eコマースアプリケーションのインストール能力を実証する。
- eコマースアプリケーションの設定および操作能力を実証する。
- eコマースアプリケーションを保護するための対策を列挙する。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal

## Reading Assignment

Watson, R. T., Berthon, T., Pitt, L. F., & Zinkhan, G. M. (n.d.). Electronic commerce: The strategic perspective. Retrieved from <https://opentextbc.ca/electroniccommerce/chapter/electronic-commerce-technology/>

電子商取引技術の導入: 組織は、ステークホルダーと新たな方法でやり取りするために、技術を活用して変革を行う必要があります。

TCP/IPとインターネット技術: コンピュータはTCP/IPなどの共通プロトコルを通じて通信します。TCP/IPは、データ転送、ルーティング、およびアドレス指定の基盤を提供し、インターネットのパケットスイッチングにより帯域幅を効率的に利用します。

インフラストラクチャの層: 電子商取引は、いくつかの層から成り立つインフラストラクチャの上に構築されています。これらの層には次のものが含まれます。

国家情報インフラ (NII): テレビ、ラジオ、電話ネットワーク、インターネットなど、すべての通信ネットワークで構成される電子商取引の基盤です。
メッセージ配信インフラ: メール、EDI、HTTPなど、メッセージを送受信するためのソフトウェアです。
電子出版インフラ: HTMLやURLなどを用いてコンテンツを配信するための技術です。
ビジネスサービスインフラ: 安全な支払い処理や暗号化をサポートし、電子資金移動を可能にします。
HTMLとPDFの比較: HTMLとPDFの2つの一般的な電子出版フォーマットを比較しています。HTMLは読者にカスタマイズ性を提供し、PDFは元のレイアウトと構造を保持するため、特定のレイアウトが重要な文書に適しています。

セキュリティと認証: セキュリティは電子商取引の中心的な課題であり、暗号化、ファイアウォール、公開鍵暗号化などが保護手段として使用されています。認証には、パスワードやIPアドレスの検証などさまざまな方法が用いられています。

電子マネー: 電子資金移動、デジタルキャッシュ、エキャッシュ、クレジットカードの4つの電子決済方法について説明しています。それぞれがセキュリティ、認証、匿名性、分割可能性に対して異なる効果を持っています。

安全な取引のためのSETとSSL: クレジットカード決済などの電子取引を保護するために、SET（Secure Electronic Transactions）とSSL（Secure Sockets Layer）について説明されています。

クッキー: ウェブアプリケーションでユーザーの活動を追跡し、個人情報を保存するための手段としてクッキーが利用されています。クッキーは、カスタマイズやマーケティング、より良いユーザー体験を提供するために役立ちます。

## Discussion Forum

Now that you have learned about ecommerce, answer the questions below:

1. What are the best security practices online when accepting electronic payments?
2. How can ecommerce website administrators stay up to date with electronic payment regulations and laws as they change?
3. What are some security measures that an ecommerce website administrator implement to ensure that an online payment site is being protected from hackers, phishing, and malware?

Your response should be at least 250 words in length.
When you’re done, read, rate, and comment on at least three of your classmates’ posts. Your responses should be at least 150 words each and advance the discussion of the topic.

### Japanese Discussion Question

質問文の日本語訳は以下の通りです：

1. 電子決済を受け入れる際に、オンラインでの最良のセキュリティ対策は何ですか？
2. 電子決済に関する規制や法律が変わる際に、eコマースのウェブサイト管理者はどのようにして最新の情報を把握し続けることができますか？
3. eコマースのウェブサイト管理者が、オンライン決済サイトをハッカー、フィッシング、マルウェアから保護するために実施できるセキュリティ対策にはどのようなものがありますか？

### Japanese Discussion

1. 電子決済を受け入れる際の最良のセキュリティ対策（オンライン）
電子決済は現代のeコマースにおいて不可欠な要素である一方で、セキュリティリスクも増加しています。そのため、電子決済を安全に行うためには、いくつかの重要なセキュリティ対策を実施することが必要です。まず、暗号化技術の利用が最も基本的な対策です。SSL（Secure Sockets Layer）やTLS（Transport Layer Security）を使用することで、顧客のクレジットカード情報や個人データを暗号化し、ハッカーや不正アクセスから守ります。これにより、データがインターネットを介して送信される際に盗まれるリスクが低減します（Watson et al., n.d.）。

次に、トークン化技術を導入することも重要です。これは、実際のクレジットカード番号を保存せず、代わりに一時的なトークンを発行して決済を行う方法であり、万が一データが盗まれても、トークンは再利用できないため安全です。また、**多要素認証（MFA）**の実装も有効です。MFAでは、顧客がオンライン決済を行う際に、パスワード以外にも認証手段（例: SMSコード、バイオメトリクス）を要求するため、不正アクセスをさらに防ぐことができます。

最後に、eコマースサイトは**PCI-DSS（Payment Card Industry Data Security Standard）**の準拠が必要です。この基準は、カード情報を取り扱う全ての企業に対して厳格なセキュリティ要件を定めており、これに従うことでセキュリティリスクを最小限に抑えることができます（Watson et al., n.d.）。

2. 電子決済に関する規制や法律の最新情報の把握方法
eコマースにおける電子決済は、各国の規制や法律に従う必要があり、その変化に対応することが重要です。これを実現するための方法として、まず業界団体や法的通知サービスを活用することが挙げられます。例えば、決済業界の規制を監視している団体に登録することで、最新の変更に関する通知を迅速に受け取ることが可能です。また、法律に関する専門的なアドバイザーやコンサルタントと連携することも有効です。

さらに、セミナーやウェビナーに定期的に参加することが、変化する規制に適応するための実践的な手段です。これらのトレーニングプログラムは、法改正や新しい規制に関する最新の情報を提供し、eコマース運営者が適切に対応できるようサポートします。加えて、政府機関や規制当局の公式リソースを定期的に確認することも、最新情報を得るための重要な手段です。これにより、法的コンプライアンスを維持しながら、最新の規制に対応することが可能になります（Watson et al., n.d.）。

3. ハッカー、フィッシング、マルウェアからの保護策
ハッカーやフィッシング、マルウェアなどの脅威からeコマースサイトを守るためには、多層的なセキュリティ対策が求められます。まず、基本的な対策としてファイアウォールを導入し、外部からの不正なアクセスをブロックすることが重要です。ファイアウォールは、インターネットと内部ネットワーク間の通信を監視・制御する役割を果たし、不正アクセスを防ぐための第一の防衛線です（Watson et al., n.d.）。

次に、定期的な脆弱性スキャンとペネトレーションテストを実施することで、システムの脆弱性を特定し、セキュリティホールがないかを確認します。また、eコマースサイトではマルウェア対策ソフトの導入も必須です。これにより、マルウェアやウイルスによる攻撃からサイトを守ることができ、定期的にソフトウェアを更新することで、最新の脅威にも対応できます。

さらに、フィッシング攻撃に対抗するために、顧客教育を行うことが重要です。顧客に対して、フィッシングメールの見分け方や、正当な取引方法についての情報を提供することで、攻撃からの防御力を高めることができます。これらの対策を組み合わせることで、eコマースサイトをより強固なセキュリティで保護することが可能です（Watson et al., n.d.）。

## Programming Assignment

In this assignment, you will create a working ecommerce website, utilizing a chosen ecommerce system.

Instructions:

Imagine that you are a newly graduated programmer, who would like to set up an ecommerce website for your programming services.

You are to choose one of the following ecommerce websites:

<https://www.mozello.com/create-online-store/>
<https://www.myonlinestore.com/selling-online/free-online-store>
<https://www.miiduu.com/>

After you have chosen your ecommerce website platform, create an account and create a simple ecommerce website.

Your ecommerce website should include the following information:

- A description of your services that you provide
- Sample prices for your services
- Images about your services (do not use actual real-life images, simply use generic images such as of computers or laptops etc)
- Your business name
- Accepted payments information
After you have created your site, copy and paste the URL of your site into a word processing document. Save the file as Ecommerce Site and upload it to the assignments area.

### Japanese Programming Assignment

この課題では、選択したeコマースシステムを使用して、動作するeコマースウェブサイトを作成します。

指示：

あなたは、新卒のプログラマーであり、プログラミングサービスを提供するためのeコマースウェブサイトを立ち上げたいと考えていると想像してください。

次のeコマースウェブサイトのいずれかを選択してください。

<https://www.mozello.com/create-online-store/>
<https://www.myonlinestore.com/selling-online/free-online-store>
<https://www.miiduu.com/>
eコマースウェブサイトのプラットフォームを選択した後、アカウントを作成し、シンプルなeコマースウェブサイトを作成してください。

あなたのeコマースウェブサイトには以下の情報を含める必要があります。

あなたが提供するサービスの説明
サービスのサンプル価格
サービスに関連する画像（実際の画像は使用せず、パソコンやノートパソコンなどの一般的な画像を使用してください）
ビジネス名
支払い方法に関する情報
ウェブサイトを作成した後、ウェブサイトのURLをワードプロセッシングソフトにコピー＆ペーストし、ファイル名を「Ecommerce Site」として保存してください。そのファイルを課題エリアにアップロードしてください。

## Learning Journal

A guide for writing a “reflective journal:”

Who will read the journal?

The contents of your journal will be only visible to the instructor.  Unlike discussion forums or blogs, the journal is an area for reflection without a wide audience.

Why do it?

Maintaining a journal serves several purposes:

1. A means of communication, conversation (e.g., between material and yourself, yourself and instructors).

2. Provides regular feedback between you and the instructors and helps to match expectations.

3. Platform for synthesis of knowledge and ideas

4. Help develop critical thinking

5. Helps to elicit topics of interest, challenging topics that need improvement, etc.

What to write?

First write a brief summary of the contents of a lecture, lab activity, group discussion or reading material. Then reflect upon these activities. Record your own thoughts, ideas, responses and reactions to any of the above activities. Make notes about concepts, questions you have, and any confusion that may arise. Use the journal to explore possible solutions to problems being raised in class or alternative activities to the ones presented in class. Record new insights and problem solving strategies realized during discussions with fellow students and instructors. The journal reflects your own thoughts and ideas. Be as original and critical (constructive) as you can.

Some additional ideas:

Describe any feedback you received or any specific interactions you had.

Discuss how they were helpful Describe your feelings and attitudes What surprised me or caused me to wonder?

What happened that felt particularly challenging? Why was it challenging to me?

What skills and knowledge do I recognize that I am gaining?

What am I realizing about myself as a learner?

In what ways am I able to apply the ideas and concepts gained to my own experience?

What not to do:

Do not copy and paste any material from the discussion forum, your own assignment, or any other source.  The entries in the journal must be your own words.

When do I use the journal?

You are expected to use the journal for each week of the course.

How will it be graded?

Each weekly journal must be at least 200 words long.  Please use proper grammar and keep your writing on the class topic.  Deductions from a full credit on this assignment would be taken if you copy and paste content.  As long as you write down your own reflection about the learning activities, deductions will not be taken.  You will receive a single grade for each week and the grades will count toward your final grade in the course.

### Japanese Learning Journal Question

### Japanese Learning Journal

プロンプト用雑記

今週学習した内容

- eコマースアプリケーションのインストール能力を実証する。
- eコマースアプリケーションの設定および操作能力を実証する。
- eコマースアプリケーションを保護するための対策を列挙する。

今週学習した内容について感じたこと

- 簡単な例ではあるが、実際にEコマースサイトを作成することで、具体的な設定や操作について初めて知ることができた。
- Eコマースサイトで発生しうるセキュリティインシデントに対して、どのような対策が行われているのかを知ることができた。

来週学習する内容

- 組織、開発者、ユーザーにとってのCMSシステムの利点を定義する。
- Joomla CMSのインストールができることを実証する。
- Joomla CMSの設定とウェブページの作成ができることを実証する。
- 新しいJoomlaモジュールの追加ができることを実証する。

1. 今週の概要
今週は、eコマースアプリケーションのインストールと設定に重点を置きました。具体的には、eコマースアプリケーションのインストールと操作能力を実証し、さらにセキュリティ対策に焦点を当てました。これにより、実際にアプリケーションを使用しているユーザーに対する保護がどのように行われるのかを理解することができました。

2. 自分の感想
今週は初めてeコマースサイトを自分で作成する体験ができ、設定や操作の基本的な部分を学ぶ良い機会となりました。簡単な例ではありましたが、インストール手順やサイト運営の裏側を具体的に理解することができました。また、セキュリティインシデントがどのように発生するか、その対策がどう構築されるかについても学び、非常に興味深く感じました。特に、個人情報や決済情報の保護がどれほど重要であるかを実感しました。

3. 特に深く学習したこと
今週は特に、eコマースサイトにおけるセキュリティ対策について深く学ぶ機会がありました。eコマースサイトは、顧客の個人情報や決済データを扱うため、これらのデータがどれほど脆弱であり、適切なセキュリティ対策が欠かせないという現実を改めて理解しました。実際にサイトの設定を行いながら、特に重要だと感じたのは、SSL証明書の導入です。SSL証明書は、通信内容を暗号化し、外部からのデータの盗聴や改ざんを防ぐ役割を果たします。これにより、顧客が安心して取引を行える環境が提供されることを実感しました。
さらに、eコマースサイトでは、アカウントやパスワードに対する攻撃リスクが高いため、多要素認証（MFA）の導入が推奨されます。MFAを導入することで、たとえパスワードが漏洩したとしても、追加の認証ステップを必要とするため、不正アクセスを大幅に防止できます。これらのセキュリティ対策を実際に学び、実装することで、どれほど重要な役割を果たしているかを強く実感しました。
加えて、セキュリティ対策には技術的な側面だけでなく、運営側の方針や定期的なメンテナンスの重要性も学びました。セキュリティ対策は一度設定すれば終わりというものではなく、継続的な監視とアップデートが求められます。例えば、プラグインやシステム全体の脆弱性に対するパッチの適用を怠ると、それが大きなセキュリティリスクに繋がることを理解しました。これらの知識を踏まえ、今後のサイト運営における保守管理の重要性も学びの一環として認識しています。

4. 今後の課題と来週に向けて
来週は、CMS（コンテンツ管理システム）について学習する予定です。特に、組織や開発者、ユーザーにとってのCMSシステムの利点を理解し、Joomla CMSのインストールや設定、さらにはウェブページの作成まで実証することが目標です。また、新しいJoomlaモジュールを追加する能力を身につけ、さらなる実践的なスキルを高めていきたいと考えています。
