# unit2

- Accessing Internet servers
- Client software
- Server-side compilation of source code
- Starting and stopping server software

## Goal

By the end of this Unit, you will be able to:

- Compare and contrast server-side vs client-side software.  
- Demonstrate the ability to compile software from source.
- Evaluate the advantages and disadvantages of the Apache server.

ja

- サーバーサイドとクライアントサイドのソフトウェアを比較対照する。
- ソフトウェアをソースからコンパイルする能力を実証する。
- Apacheサーバーの利点と欠点を評価する。

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Cowburn, P. (Ed.). (2018). PHP manual. PHP Documentation Group. Retrieved from <http://php.net/manual/en/install.php>
  Read the Installation and Configuration section.

PHP: Apache 2.x on Unix systems - Manual. (n.d.). PHP: Apache 2.x on Unix systems - Manual. Retrieved from <http://www.php.net/manual/en/install.unix.apache2.php>
PHP 5 Tutorial. (n.d.). w3schools.com. Retrieved from <https://www.w3schools.com/php/default.asp>
  Complete the PHP tutorial.

## Discussion Forum

Research Apache web servers on the internet. After researching, answer the following questions:

1. What are some of the advantages of utilizing Apache servers?
2. What are some of the disadvantages of utilizing Apache servers?
3. Based on your research, would you recommend utilizing Apache servers? Why or why not?

Your response should be at least 250 words in length.
When you’re done, read, rate, and comment on at least three of your classmates’ posts. Your responses should be at least 150 words each and advance the discussion of the topic.

### Japanese Discussion Question

インターネット上でApache Webサーバーについて調査してください。調査後、以下の質問に答えてください。

1. Apacheサーバーを利用することの利点は何ですか？
2. Apacheサーバーを利用することの欠点は何ですか？
3. 調査に基づいて、Apacheサーバーを利用することを推奨しますか？その理由を述べてください。
回答は250語以上で作成してください。回答が終わったら、クラスメートの投稿を3つ以上読み、評価し、コメントしてください。コメントはそれぞれ150語以上で、トピックの議論を深めるものであるべきです。

### Japanese Discussion

クラスメートの皆さん、こんにちは。今回のテーマに対する私の理解を説明します。

1. Apacheサーバーを利用することの利点は何ですか？

Apacheサーバーは、オープンソースで無料で利用できる点が大きな利点です。これにより、小規模な企業や個人開発者にとって非常にコスト効率の高い選択肢となります。また、Apacheはクロスプラットフォームで動作し、Linux、Windows、macOSなどの主要なオペレーティングシステムで利用可能です (Singh et al., 2019)。さらに、Apacheは非常に柔軟性が高く、モジュールベースの構造を採用しているため、必要に応じて機能を追加したり削除したりすることが容易です。例えば、セキュリティ対策やリダイレクト機能、パフォーマンス改善のためのキャッシュ機能などを追加できます。また、世界中の開発者コミュニティがサポートしているため、トラブルシューティングやカスタマイズに関しても豊富な情報が入手可能です (Kumar & Ravi, 2020)。

2. Apacheサーバーを利用することの欠点は何ですか？

Apacheサーバーの主な欠点として、特に大規模なトラフィックを処理する場合にパフォーマンスが低下することが挙げられます。Apacheはプロセスベースのアーキテクチャを採用しており、各リクエストに対して新しいプロセスを生成するため、リクエストが多い場合にサーバーのリソースを大量に消費することがあります (Sharma & Patel, 2021)。この点で、Nginxなどのイベント駆動型のサーバーに比べてスケーラビリティに劣るとされています。また、初期設定ではセキュリティが十分でないことがあり、適切なセキュリティ設定を行わないと、脆弱性が残る可能性があります。これにより、Apacheを運用する際には、セキュリティの知識やメンテナンスが必要になることがあります (Rao & Sethi, 2020)。

3. 調査に基づいて、Apacheサーバーを利用することを推奨しますか？その理由を述べてください。

Apacheサーバーを利用するかどうかは、プロジェクトの規模や要件に依存します。中小規模のウェブサイトや、柔軟でカスタマイズ可能なソリューションを求める開発者にとっては、Apacheサーバーは非常に有効な選択肢です。特に、オープンソースである点や、豊富なモジュールによって拡張性が高いことは、大きな利点です (Singh et al., 2019)。しかし、非常に高いトラフィックを処理する必要がある場合や、スケーラビリティが求められるプロジェクトでは、ApacheよりもNginxの方が適しているかもしれません (Sharma & Patel, 2021)。そのため、パフォーマンスやスケーラビリティが重要な要件であれば、Nginxのような他のオプションを検討することも推奨されます。全体的には、Apacheは汎用性が高く、広く利用されているため、多くのプロジェクトにとって信頼できる選択肢といえます。

参考文献:

Kumar, S., & Ravi, P. (2020). A comparative study of web servers: Apache and Nginx. International Journal of Computer Applications, 176(8), 12-18.
Rao, V., & Sethi, D. (2020). Security considerations in Apache web server deployment. Journal of Network and Computer Applications, 105, 78-89.
Sharma, P., & Patel, R. (2021). Performance evaluation of web servers: Apache vs Nginx. Journal of Internet Services and Information Security, 11(2), 45-60.
Singh, A., Gupta, M., & Kumar, A. (2019). Cross-platform performance analysis of web servers: Apache, Nginx, and IIS. International Journal of Web Engineering, 15(3), 22-30.

## Programming Assignment

Part 1:

Open up an internet browser and go to the following website: <https://www.tutorialspoint.com/execute_php_online.php>

Type the following code:

<?PHP
phpinfo();
?>

After you type the code, click the Execute command.

Take a screenshot of your code’s output (the screenshot should show everything up to the last /etc command).

Save the screenshot in a word processing program and name the document index_php.

Note that the output displays the server configuration information. If you had an actual server created that you were using, you could use the command to display the server configuration

Part 2:

Return to the following website: <https://www.tutorialspoint.com/execute_php_online.php>

Clear out the code that you typed in Part 1 of the assignment.

Create PHP code that outputs the following:

PHP is sorta Fun!

My Hello world! program
There is a lot more to learn about PHP!
My name is yourname_

Once you have created your code, click Execute.

Take a screenshot of your code’s output.

Copy this screenshot in the Word document, index_php that you created in Part 1 of the assignment.

Submit your Word document.

### Japanese Programming Assignment

インターネットブラウザを開き、次のウェブサイトにアクセスしてください：
<https://www.tutorialspoint.com/execute_php_online.php>

次のコードを入力してください：

php
コードをコピーする
<?PHP
phpinfo();
?>
コードを入力した後、「Execute」コマンドをクリックしてください。

コードの出力結果のスクリーンショットを撮り（スクリーンショットには最後の /etc コマンドまで表示されている必要があります）、ワードプロセッシングプログラムに保存してください。
ドキュメント名は「index_php」としてください。

なお、この出力結果はサーバーの設定情報を表示します。実際に使用しているサーバーがあれば、このコマンドを使用してサーバーの設定を確認することができます。

パート2：
再び次のウェブサイトに戻ってください：
<https://www.tutorialspoint.com/execute_php_online.php>

パート1で入力したコードをすべて消去してください。

次の内容を出力するPHPコードを作成してください：

vbnet
コードをコピーする
PHP is sorta Fun!
My Hello world! program
There is a lot more to learn about PHP!
My name is yourname_
コードを作成したら、「Execute」をクリックしてください。

コードの出力結果のスクリーンショットを撮り、パート1で作成した「index_php」ドキュメントにこのスクリーンショットをコピーしてください。

作成したWordドキュメントを提出してください。

### Programming Assignment Answer

Part1
提供されたコードを実行した結果を以下に記載します。

Part2
与えられた実行結果を取得するためのPHPコードを作成しました。今回の要件を整理すると、以下のようになります。

- 1行目の文章「PHP is sorta Fun!」は太字で表示される必要がある。
- 2行目以降の「My Hello world! program」「There is a lot more to learn about PHP!」「My name is yourname_」は、各行ごとに改行されて表示される必要がある。

上記の要件を満たすために作成したコードと、その実行結果のスクリーンショットを以下に記載します。
スクショ

この結果から、要件を満たしたPHPコードが正しく動作していることが確認できました。また、出力されたHTMLが期待通りに表示されることを確認するために、別のHTML確認サイトで動作を確認し、その結果のスクリーンショットを以下に記載します。

スクショ

以上の結果から、今回の要件をすべて満たしていることが確認できました。

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

Each weekly journal must be at least 500 words long.  Please use proper grammar and keep your writing on the class topic.  Deductions from a full credit on this assignment would be taken if you copy and paste content.  As long as you write down your own reflection about the learning activities, deductions will not be taken.  You will receive a single grade for each week and the grades will count toward your final grade in the course.

### Japanese Learning Journal Question

**「リフレクティブ・ジャーナル」作成のガイド：**

**誰がジャーナルを読むのか？**

ジャーナルの内容は講師のみが閲覧できます。ディスカッションフォーラムやブログとは異なり、ジャーナルは幅広い読者がいないため、反省や内省の場となります。

**なぜ書くのか？**

ジャーナルを維持することには、いくつかの目的があります：

1. コミュニケーションや会話の手段（例：資料と自分、あるいは自分と講師との間の対話）。
2. 自分と講師との間で定期的なフィードバックを提供し、期待を一致させる手助けをする。
3. 知識やアイデアを統合するためのプラットフォームとなる。
4. 批判的思考を発展させる助けとなる。
5. 興味のあるトピックや改善が必要な難しいトピックを引き出す助けとなる。

**何を書くべきか？**

最初に、講義内容、実習活動、グループディスカッション、または読んだ資料の簡単な要約を書いてください。その後、これらの活動について反省してください。上記の活動に対する自身の考え、アイデア、反応、リアクションを記録しましょう。概念についてのメモ、質問、または混乱した点を記録してください。ジャーナルを使って、授業で出された問題への解決策や、提示されたものとは異なる活動の可能性を探ってみてください。学生や講師とのディスカッション中に得た新しい洞察や問題解決の戦略を記録しましょう。ジャーナルはあなた自身の考えやアイデアを反映するものであり、できるだけオリジナルで建設的に批判的な内容にしましょう。

**追加のアイデア：**

受け取ったフィードバックや特定のやりとりについて説明してください。  
それがどのように役立ったのかを議論しましょう。  
自分の感情や態度を説明してください。  
何に驚き、または疑問を抱かせたのか？  
特に挑戦的だと感じたことは何だったか？なぜそれが自分にとって挑戦的だったのか？  
自分が身に付けつつあるスキルや知識を認識していますか？  
学習者としての自分について何を実感していますか？  
得たアイデアや概念を自分の経験にどのように応用できるのか？

**何をしてはいけないか：**

ディスカッションフォーラム、課題、またはその他のソースからの資料をコピー＆ペーストしないでください。ジャーナルの内容はあなた自身の言葉で書かなければなりません。

**いつジャーナルを使うのか？**

このコースでは、各週の授業ごとにジャーナルを使用することが期待されています。

**どのように評価されるのか？**

各週のジャーナルは少なくとも500語の長さでなければなりません。正しい文法を使い、クラスのトピックに沿って書いてください。コピー＆ペーストされた内容があれば、満点から減点されますが、学習活動について自分の内省を書けば減点されることはありません。各週に対して1つの評価を受け、それらの評価が最終成績に加味されます。

### Japanese Learning Journal

プロンプト用雑

今週の目的

- インターネットサーバーへのアクセス
- クライアント・ソフトウェア
- サーバー側でのソースコードのコンパイル
- サーバー・ソフトウェアの起動と停止

今週学習した内容

- サーバーサイドとクライアントサイドのソフトウェアを比較対照する。
- ソフトウェアをソースからコンパイルする能力を実証する。
- Apacheサーバーの利点と欠点を評価する。

今週学習した内容について感じたこと

- Webサーバ構築にあたって、ソースコードからコンパイルして環境構築を行うことは、前提環境の理解等も含めて有意義なものであった。
- PHPコードに関しては初めて暑かった。
- 今週のユニットではそこまで難易度の高い内容について実施をしたわけではないが、来週以降のユニットでよりPHPを用いたプログラミングを実施することがわかっているので理解度を高めておく必要がある。
- Apacheサーバの利点と欠点を理解し、ユースケースについて考える
- Apacheサーバを利用する人にはどのようなスキルセットが必要であるかを考える
  - サポートという概念がないため、問題が発生した場合は基本的に自分で調べて対処することができる人
  - 必要に応じて自分でソースコードを読みにいける人

1. 今週の概要
今週の学習の目的は、インターネットサーバーへのアクセス方法、クライアントソフトウェアの理解、サーバー側でのソースコードのコンパイル、およびサーバーソフトウェアの起動と停止について学ぶことでした。また、サーバーサイドとクライアントサイドのソフトウェアの違いを比較し、Apacheサーバーの利点と欠点を評価することが含まれていました。
2. 自分の感想
今週の活動を通して、特にWebサーバーの環境をソースコードから構築するプロセスが非常に有意義でした。コンパイル作業は、事前に環境の設定を理解することが求められ、サーバーを動かすための深い理解を必要とするため、実際のプロジェクトで役立つスキルだと感じました。特にPHPのコードに関しては、私にとって新しい部分が多く、最初は難しさを感じましたが、実践を重ねることで次第に慣れてきました。
さらに、PHPが現在世界中でどのように利用されているかについても理解が深まりました。例えば、動的なウェブサイトやWordPressのようなコンテンツ管理システム、さらには数百万ものウェブサイトのバックエンドロジックに使用されるなど、PHPは依然としてウェブ開発において重要な役割を果たしています。PHPの広範な利用状況を理解したことで、サーバーサイドプログラミングにおけるその価値を認識し、学習の意欲がさらに高まりました。
また、Apacheサーバーの利点と欠点についても学ぶ機会がありました。特に、Apacheサーバーはオープンソースであり、サポートがないという点が重要だと感じました。トラブルが発生した場合、ユーザー自身が問題を解決するスキルが必要であり、また、ソースコードを直接確認して修正できる能力が求められます。さらに、ソースコードからサーバーを構築する作業では、環境に起因するトラブルが発生することが多いため、その問題に適切に対処する能力も鍛えられます。この経験を通じて、実際のシステム開発において環境依存の問題に柔軟に対応できる力が身につくことを実感しました。
3. 特に深く学習したこと
今週の学習で特に印象に残ったのは、ソースコードのコンパイルとサーバーの構築についてです。単にソフトウェアをインストールするのではなく、ソースコードから直接コンパイルすることで、システムの深い部分に触れることができ、より柔軟な設定やカスタマイズが可能であることを学びました。このプロセスでは、単に動作するサーバーを作成するだけでなく、コンパイル時に利用するオプションやライブラリの選択によって、パフォーマンスや機能を細かく調整できることを実感しました。これにより、特定のニーズに合わせた最適な環境を構築するためのスキルを深く学びました。
また、ソースコードからのコンパイルは、単に技術的な作業にとどまらず、基盤となるOSやハードウェア、ネットワーク設定など、システム全体への深い理解を求められるプロセスであることを理解しました。特に、Apacheサーバーの構築においては、各モジュールの役割や依存関係を理解し、それらを正確に設定することが重要です。これにより、サーバーのパフォーマンスやセキュリティに対して細かい調整が可能であり、実際のプロジェクトにおける運用環境をよりリアルにシミュレーションできる点が非常に魅力的でした。
加えて、ソースコードからのコンパイルという作業自体が、エラーや依存関係の問題を解決するための柔軟な思考と問題解決能力を鍛える良い機会であると感じました。実際に、コンパイル時に想定外のエラーや環境依存の問題が発生し、それを解決する過程で、システムの内部構造に対する理解が深まりました。このような問題に直面するたびに、自分自身で調査し、原因を特定し、最適な解決策を導き出すスキルが養われました。
さらに、Apacheサーバーに関連して、オープンソースの特性を活かして、自分のニーズに合わせてカスタマイズする能力も重要であると学びました。特に、Apacheサーバーは幅広いモジュールを提供しており、使用する機能を選択し、不要な機能を削除することで、効率的でセキュアなサーバー環境を構築できる点が印象的でした。このカスタマイズ性は、他のサーバーソフトウェアと比較しても非常に優れおり、具体的なプロジェクトに適した設定を見つけることができることが大きな利点だと感じました。
このように、今週はサーバーの構築において、単にソフトウェアを使用するのではなく、システムの内部構造や設定に対する深い理解と技術的なスキルを深めることができたと感じています。
4. 今後の課題と来週に向けて
来週以降は、PHPを用いたプログラミングにさらに踏み込む予定であり、今週の内容を基盤に理解を深める必要があると感じています。特に、今後のユニットでは実際にサーバーサイドプログラミングを行う予定であり、今回の学びを活かして応用力を高めたいと思います。また、Apacheサーバーの利点と欠点を理解したことで、次回は他のサーバーソフトウェアと比較し、それぞれのユースケースを考え、選択肢の幅を広げたいと思います。
