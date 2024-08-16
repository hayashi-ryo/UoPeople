# unit8

- Command Shell
- Command Line Interface
- Bash
- コマンドシェル
- コマンドラインインタフェース
- バッシュ

## Goal

- By the end of this Unit, you will be able to:
  - Discuss the features of different command shells.
  - Perform Bash scripting on a command shell.
- ja
  - 様々なコマンドシェルの機能について説明する。
  - コマンドシェルでBashスクリプトを実行する。

## Task

- [x] Reading assignment
- [x] Peer Assessment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

1. Guide for Apple IT: Introduction to Mac scripting. (2020, January 14). Kandji. <https://blog.kandji.io/guide-for-apple-it-introduction-to-mac-scripting#:~:text=Shells%20are%20command%20line%20interpreters,shell%20or%20command%2Dline%20interpreter>
  Read this resource on Mac shells.
2. hananyajacobson, sdwheeler, & shawnkoon. (2022, May 18). What is PowerShell? Microsoft Docs. <https://docs.microsoft.com/en-us/powershell/scripting/overview?view=powershell-7.2>
  Read this resource on PowerShell.
3. Klein, M. (2022, March 1). What is bash used for? Codecademy News. <https://www.codecademy.com/resources/blog/what-is-bash-used-for/>
  Read this resource to understand what bash is used for.
4. Reynolds, L. (2022, February 12). Bash Scripting Tutorial. LinuxConfig. <https://linuxconfig.org/bash-scripting-tutorial>
  Learn bash scripting through this tutorial.

## Discussion Forum

Read through the entry on command shells at: <https://www.thegeekdiary.com/unix-linux-what-is-a-shell-what-are-different-shells/> and then discuss which command shell(s) you would personally use and why you might change what shell you utilize for specific instances.
In your responses to your peers, compare and contrast your answer to those of your peers.

Reference
Admin. (n.d.). UNIX / linux : What is a shell? What are different shells? The Geek Diary. <https://www.thegeekdiary.com/unix-linux-what-is-a-shell-what-are-different-shells/>

Your Discussion should be a minimum of 200 words in length and not more than 500 words. Please include a word count.

次のリンク先のコマンドシェルに関する記事を読んでください: [https://www.thegeekdiary.com/unix-linux-what-is-a-shell-what-are-different-shells/]。その後、どのコマンドシェルを個人的に使用するか、また特定の状況でシェルを変更する理由について議論してください。

同級生への返信では、あなたの回答と同級生の回答を比較・対照してください。

参考文献:
Admin. (n.d.). UNIX / linux : What is a shell? What are different shells? The Geek Diary. [https://www.thegeekdiary.com/unix-linux-what-is-a-shell-what-are-different-shells/]

ディスカッションは200語以上500語以内である必要があります。語数を記載してください。

### Japanese Discussion

## Learning Journal

For this entry, you will go to the link <https://linuxconfig.org/bash-scripting-tutorial-for-beginners> and follow through the tutorial on Bash scripting either in a Linux OS installed system or in the virtual Linux OS installed earlier in your system through VirtualBox. Once in, you will complete until the Functions section of the tutorial and then take a picture of your screen showing that you have completed the tutorial. You then will write a short description of what you did and state any issues you may have faced during the tutorial.

References
Rendek, L. (2020, May 28). Bash scripting tutorial for beginners. LinuxConfig. <https://linuxconfig.org/bash-scripting-tutorial-for-beginners>

The Learning Journal entry should be a minimum of 500 words and not more than 750 words. Use APA citations and references if you use ideas from the readings or other sources.

このエントリーでは、リンク<https://linuxconfig.org/bash-scripting-tutorial-for-beginners>にアクセスし、Linux OSがインストールされたシステム、またはVirtualBoxを通してシステムに先にインストールされた仮想Linux OSのいずれかで、Bashスクリプトのチュートリアルに従います。チュートリアルに入ったら、チュートリアルの「機能」セクションまで完了し、チュートリアルを完了したことを示す画面の写真を撮ります。その後、あなたが行ったことの簡単な説明と、チュートリアル中に直面した可能性のある問題を記述します。

参考文献
Rendek, L. (2020, May 28). 初心者のための Bash スクリプティングチュートリアル。LinuxConfig. <https://linuxconfig.org/bash-scripting-tutorial-for-beginners>

ラーニングジャーナルのエントリーは、最低500ワード、750ワード以内で作成してください。リーディングや他のソースからのアイデアを使用する場合は、APAの引用と参照を使用してください。

### Japanese Learning Journal

この学習ジャーナルでは、Bashスクリプトの基本を学ぶために、LinuxConfig.orgのBashスクリプトチュートリアルを利用し、その過程で学んだ内容と直面した課題について報告します。特に、スクリプトの作成と実行、ファイル名とパーミッション、変数の使用方法、そして関数の定義と利用について詳しく取り上げます。これにより、Bashスクリプトの基礎知識を深め、今後のシェルスクリプト作成に活かすための知見を得ることができました。

1. What is Bash
私の環境におけるbashスクリプトが具体的にどのような定義となっているかを確認します。`echo $SHELL`

画像

この結果から、私の環境におけるbashスクリプトが、実際には`/bin/bash`を利用しており、kornシェルやCシェルなどではないことが確認できました。また、task.shを作成し、その実行結果を確認します。

画像

この結果から、dateコマンドとlsコマンドの結果をtask.shの実行結果として一まとめに取得することができました。

2. File Names and Permissions

"What is Bash"にてtask.shを実行可能にするために`chmod 777 task.sh`というコマンドを実行しました。これは、デフォルトで作成されたファイルは、ファイル拡張子によらず実行できないため、実行可能とするために実施しています。ここで、`file`コマンドは、ファイルの種類を識別することができます。これによって、拡張子自体ではなくファイルの内容がどのようなものになっているのかを確認することができます。

画像

3. Script Execution

`./task.sh`という形式でファイルの実行を行いましたが、これはshebangがファイルの先頭に付与されているために実行できるものになっています。ファイルの先頭にshebangが付与されていないものは以下の画像のように実行することができません。

画像

この例では、明示的にbashインタープリターをしているする方法と、chmodコマンドで実行可能なファイルとする方法の二つの手段でファイルの実行を行っています。

4. Variables

変数はプログラミングにおいて非常に重要な要素です。シェルにおいては、他のコマンドの実行結果を格納したり、データの保存・変更を行うことができます。`welcome.sh`を作成して、その動作の確認を行いました。

画像

この`welcome.sh`では`greeting` `user` `day`の3つの変数に対してコマンドの実行結果や文字列を保存しています。この保存された文字列をechoコマンドの中で呼び出すことで、利用しています。これらの変数はどのような場合に用いられるのかを考えると私自身の実体験に基づくもので説明ができます。例えば、日付を跨ぐような処理を実装している場合、dateコマンドの結果を変数に保存していないと処理の最初と最後でdateコマンドの結果が全く異なるものになってしまいます。これでは、求めた結果を得ることができません。このような場合に、dateコマンドの結果をあらかじめ変数として保持し、その結果を利用することで実行タイミングによらない値を取得することができます。

5. Functions

関数は、特定のコードをまとめて再利用することができるためスクリプト全体の読みやすさが向上します。関数は利用を避けて、全量記述することも可能ですが、結果としてコードの可読性が低くメンテナンスが難解なものとなる可能性が高くなります。
シェルスクリプトにおいて関数は、functionキーワードを使用して定義され、その後に中括弧で囲まれた関す本体が続きます。今回は特定のディレクトリをバックアップする機能を持つシェルを作成し、その動作を確認します。

画像

このシェルスクリプトでは、`total_files`と`total_directories`の二つの関数を定義し利用しています。それぞれの関数では以下の処理を行っています。
`total_files`: 関数呼び出し中に指定されたディレクトリ内に存在するファイル数を取得する
`total_directories`: 関数呼び出し中に指定されたディレクトリ内に存在するディレクトリ数を取得する

結論

今回のチュートリアルを通じて、Bashスクリプトの基礎を理解し、スクリプトの作成から実行までの流れを実際に体験することができました。特に、ファイルパーミッションの設定や、変数と関数を使用したスクリプトの作成が、Bashスクリプトの柔軟性と強力さを実感する機会となりました。今後、これらの知識を応用して、より複雑なスクリプトを作成し、効率的にシステム管理タスクを自動化することが目指せるようになると感じています。
