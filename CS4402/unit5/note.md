# unit5

- Overview of scripting languages
- Survey of scripting languages
- Introduction to Scripting
  - Unix scripting Language: Perl
  - Web centric scripting language: Python
  - Browser scripting language: JavaScript
- Regular expressions

## Goal

main

- Articulate the differences between programming and scripting
- Be able to Determine appropriate use cases of scripting versus programming
- Recognize characteristics of several popular scripting languages
- Develop simple scripts using pearl and python
- Understand regular expressions, the regular expression evaluator and how regular expressions are used within scripting languages

ja

- プログラミングとスクリプト言語の違いを明確に説明できる
- スクリプト言語とプログラミングの適切な使用例を判断できる
- いくつかの一般的なスクリプト言語の特徴を認識できる
- PerlとPythonを使用して簡単なスクリプトを作成できる
- 正規表現、正規表現評価器、およびスクリプト言語における正規表現の使用方法を理解している

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [ ] Exercise assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

Scripting: Higher Level Programming for the 21st Century by John K. Ousterhout: <http://www.stanford.edu/~ouster/cgi-bin/papers/scripting.pdf>

Competitors to Java: Scripting languages by Judith Bishop and Riaan Hurter, Computer Science Department, University of Pretoria: <https://my.uopeople.edu/pluginfile.php/1928135/mod_book/chapter/540323/CompetitorsToJava.pdf>

An overview of scripting languages by Alexander Kanavin, University of Technology, Finland:  <http://www.sensi.org/~ak/impit/studies/report.pdf>

## Discussion Forum

Conduct internet research on both PHP and JavaScript.  Compare and contrast these programming languages.  As part of your response, include a discussion on performance, portability, functionality, adoption, and the application areas for which each is best suited.
You are expected to make a minimum of 3 responses to your fellow student’s posts.

インターネットでPHPとJavaScriptについて調査し、これらのプログラミング言語を比較してください。回答には、パフォーマンス、移植性、機能性、採用率、およびそれぞれの言語が最適とされるアプリケーション領域について議論を含めてください。
さらに、クラスメートの投稿に最低3回は応答する必要があります。

### Japanese Discussion

PHPとJavaScriptの比較

1. 導入
PHPとJavaScriptは、どちらもWeb開発において広く利用されているプログラミング言語です。PHPは主にサーバーサイドでの処理を担当し、JavaScriptはフロントエンドでの動的な操作を実現します。それぞれ異なる特性を持ち、適切な場面で利用することで効果的なWebアプリケーションを構築できます。本回答では、パフォーマンス、移植性、機能性、採用率、および適用分野について両言語を比較し、それぞれの強みを明らかにします。

2. パフォーマンスの比較
PHPはサーバーサイドで動作し、効率的にデータベースやファイル操作を行うために最適化されています​。例えば、WordPressなどのCMSでは、PHPの高速な処理能力がWebサイトの安定した動作を支えています。一方、JavaScriptはクライアントサイドで実行され、非同期通信（Ajax）を通じてリアルタイムなデータ処理を可能にします​。これにより、ユーザー体験の向上が期待できます。

3. 移植性と採用率
PHPは、適切に設定されたサーバー環境（ApacheやNGINX）上で容易に動作し、多くのホスティングサービスで標準サポートされています。これに対し、JavaScriptはブラウザ内で動作するため、プラットフォームを問わず高い移植性を持っています​。
採用率に関しては、PHPはWordPressやDrupalを中心に広く使われており、中小規模のWebサイト開発において特に人気があります。一方、JavaScriptはそのフレームワーク（React、Vue、Angular）やNode.jsの登場により、フロントエンドとバックエンドの両方での利用が増加しており、より多様な開発ニーズに対応しています​。

4. 機能性とアプリケーション領域
PHPは、動的なWebページ生成やデータベース管理において強力な機能を提供します。例えば、データベースとの連携が簡単で、MySQLやPostgreSQLを効率的に操作するための多くのライブラリが利用可能です​。一方、JavaScriptはブラウザ上での動的な操作に特化し、アニメーションやリアルタイムデータの更新を容易に実現します。また、Node.jsを使用することで、JavaScriptをサーバーサイドでも活用できるため、フルスタック開発のニーズに応えることが可能です​。

5. 結論
PHPとJavaScriptは、それぞれ異なる強みを持つ言語であり、適切な場面で使い分けることで強力なWebアプリケーションを構築できます。PHPはバックエンドでのデータ処理に最適である一方、JavaScriptはフロントエンドでの動的な操作を得意としています。これらを補完的に活用することで、効率的かつ魅力的なユーザー体験を提供することができます。

参考文献
Kanavin, A. (2002). An overview of scripting languages. Lappeenranta University of Technology​
Ousterhout, J. K. (1998). Scripting: Higher-level programming for the 21st century. IEEE Computer​

## Exercise Assignment

### Unit 5 Exercise 1: Perl Script

In this exercise, we will develop and execute a simple Perl script.  We will use the IDEONE site as a development environment for our Perl script.

<http://ideone.com>

you can also use the codepad site at <http://codepad.org/>

Make sure that you select Perl for the language.   In this little script, we will demonstrate the use of an array, for loop, and the use of variables.  You will notice that since this is a Perl script, the location of the Perl interpreter is identified in the first line of the script.

```perl
#!/share/bin/perl
@Names = ("London", "Paris", "New York", "Mumbai", "Cairo", "Tokyo", "Sao Paulo", "Detroit");

# Several forms of for loop used to print the contents of the list
$size = @Names;
print "There are ", $size, " Cities:\n";
for($i=0;$i<$size;$i++) {
        print $Names[$i] , "\n";
}
```

When you execute the script, the following output is produced.

There are 8 Cities:
London
Paris
New York
Mumbai
Cairo
Tokyo
Sao Paulo
Detroit

Using IDEONE, copy this code an execute it; then experiment by changing the code. Perhaps you can modify the script to print the names of the cities in reverse order.  For additional information or reference on the Perl language see:

Beginner's Introduction to Perl By Doug Sheppard available online at <http://www.perl.com/pub/2000/10/begperl1.html>

The Perl programming language site available at <http://www.perl.org/>

### Unit 5 Exercise 2: Python Script

development environment for our Python script.

<http://ideone.com>

you can also use the codepad site at <http://codepad.org/>

Make sure that you select Python for the language.   In this little script, we will demonstrate the use of an array, for loop, and the use of variables.

```python
Names = ['London', 'Paris', 'New York', 'Mumbai', 'Cairo', 'Tokyo', 'Sao Paulo', 'Detroit']

i = len(Names)
print "There are "+str(i)+" Cities: "
for name in Names:
        print name
```

When you execute the script, the following output is produced.

There are 8 Cities:
London
Paris
New York
Mumbai
Cairo
Tokyo
Sao Paulo
Detroit

Using IDEONE, copy this code an execute it; then experiment by changing the code. Perhaps you can modify the script to print the names of the cities in reverse order.  For additional information or reference on the Python language see:

Instant Python by Magnus Lie Hetland available at <http://hetland.org/writing/instant-python.html>

### Unit 5 Exercise 3: JavaScript

In this exercise, we will develop and execute a simple JavaScript script.  We will be using the write code online site, which can be accessed at the following URL.

<http://writecodeonline.com/javascript/>

In this script, we will demonstrate the use of an array, for loop, and the use of variables.  You will notice that that javascript programs must run within a browser.  You will notice that in the write code online site, the begin and ending script tags are assumed to be included.  However, when writing a javascript program you must include the script within an HTML document which is why it must be enclosed within a `<script>` and `</script>` tags.

```javascript
<script>
   var Names=new Array("London","Paris","New York","Mumbai","Cairo","Tokyo","Sao Paulo","Detroit");
   var x=Names.length;
   var i=0;
   document.write("There are "+x+" Cities:<br>");
   for (i=0; i<x; i++)
   {
      document.write(Names[i]+"<br>");
   }
</script>
```

When you execute the script, the following output is produced.

There are 8 Cities:
London
Paris
New York
Mumbai
Cairo
Tokyo
Sao Paulo
Detroit

Using write code online, copy this code and execute it; then experiment by changing the code. Perhaps you can modify the script to print the names of the cities in reverse order.  For additional information or reference on the JavaScript language see:

Beginner's Guide to JavaScript by Richie Lai available online at <http://www.webdeveloper.com/javascript/javascript_beginners_guide.html>

Examples from JavaScript: The Definitive Guide By David Flanagan, Copyright © 1997-2000, O'Reilly & Associates available at <http://examples.oreilly.com/9781565922341/>

JavaScript Introduction: This site provides a good overview of the syntax and structure of the JavaScript language and is available at <http://csci.csusb.edu/dick/samples/javascript.html>

### Unit 5 Exercise 3: Regular expressions

Regular expressions are a powerful way to process text.  The capabilities and simplicity of regular expressions is one of the reasons that many other languages have integrated or implemented regular expressions as part of the capabilities of the language.

In this exercise, we will get a feel for the power of regular expressions for textual processing by using a regular expression testing web site. There are several such sites available within the internet, but we will be using the MyRegexTester site that is available at the following URL:

<http://www.myregextester.com/index.php#sourcetab>

Within the site to complete the exercises you must fish copy the source text below and paste into the ‘Source Text’ box displayed in the site.

Source Text

The Jabberwocky

'Twas brillig, and the slithy toves
Did gyre and gimble in the wabe;
All mimsy were the borogoves,
And the mome raths outgrabe.

"Beware the Jabberwock, my son
The jaws that bite, the claws that catch!
Beware the Jubjub bird, and shun
The frumious Bandersnatch!"

He took his vorpal sword in hand;
Long time the manxome foe he sought –
So rested he by the Tumtum tree,
And stood awhile in thought.

And, as in uffish thought he stood,
The Jabberwock, with eyes of flame,
Came whiffling through the tulgey wood,
And burbled as it came!

One, two! One, two! And through and through
The vorpal blade went snicker-snack!
He left it dead, and with its head
He went galumphing back.

"And hast thou slain the Jabberwock?
Come to my arms, my beamish boy!
O frabjous day! Callooh! Callay!"
He chortled in his joy.

'Twas brillig, and the slithy toves
Did gyre and gimble in the wabe;
All mimsy were the borogoves,
And the mome raths outgrabe.

Test 1:

As we have learned from the unit outline and reading assignments, regular expressions or Regex for short, are used to search for patterns within text.  Regex provides a syntax for specifying what it is that you want to find.   Regex goes way beyond searching for simple matches of strings and rather provides a rich set of rules that can adaptively match anything within the source text that maps to the set of provided search rules.

In the first test, we will demonstrate finding a specific word within the source text.  Enter Jabberwocky as the match pattern and submit. See how many matches are found in the source text.

Test 2:

While the ability to search for a specific word is important, this is not always what is required and further, there are many tools that can enable the searching of a specific string.  What happens if the word that we are searching for has multiple endings?  Consider the following words each has the same root but a different context Communicate, Communication, Communicating, Communicated, Communicates.  What if I wanted to find every instance of a word with a common communicate root?   This is something that regex has the ability to do for us.

In this next test, we will use potential character replacements to find all instances of a word similar to Jabberwocky.  Enter [J,j]abberwock. and submit.  See how many matches are found in the source text.

Spend some time experimenting with Regular Expressions to see other ways that you can create adaptive ways to search for text within a document.

Andy Williams Beginners Guide to Regular Expressions <http://www.andymatthews.net/read/2009/10/22/A-beginner%27s-guide-to-regular-expressions>

Regular Expressions for Beginners by Yasumasa Someya available at <http://www.someya-net.com/concordancer/eng-quick_regex.html>

## Learning Journal

The Learning Journal is a tool for self-reflection on the learning process. In addition to completing directed tasks, you should use the Learning Journal to document your activities, record problems you may have encountered and to draft answers for Discussion Forums and Assignments. The Learning Journal should be updated regularly (on a weekly basis), as the learning journals will be assessed by your instructor as part of your Final Grade.

Your learning journal entry must be a reflective statement that considers the following questions:

- Describe what you did. This does not mean that you copy and paste from what you have posted or the assignments you have prepared. You need to describe what you did and how you did it.
- Describe your reactions to what you did
- Describe any feedback you received or any specific interactions you had. Discuss how they were helpful
- Describe your feelings and attitudes
- Describe what you learned

Another set of questions to consider in your learning journal statement include:

- What surprised me or caused me to wonder?
- What happened that felt particularly challenging? Why was it challenging to me?
- What skills and knowledge do I recognize that I am gaining?
- What am I realizing about myself as a learner?
- In what ways am I able to apply the ideas and concepts gained to my own experience?
Finally, describe one important thing that you are thinking about in relation to the activity.

Answer all questions that apply, however, you are expected to complete the Learning Journal assignment in 400-600 words.

### Japanese Learning Journal
