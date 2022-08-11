# unit8

- Reading and writing files
- Format operator
- Filenames and paths
- Catching exceptions

## Goal

- By the end of this Unit, you will be able to:
  - Create Python programs the read from and write to text files.
  - Create Python programs that convert lines of text into dictionaries and convert dictionaries into lines of text.
  - Utilize exception handling to deal with Python file errors.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
  - [x] unit7 peer-assess
- [x] Learning Journal
- [x] Take Self-Quiz

### Reading Assignment

- [Think Python](file:///Users/hayashir/work/Github/UoPeople/CS1101/text/TEXT%20-%20Think%20Python%202e.pdf)
  - Chapter9:Case study: word play, Section 1
  - Chapter14:Files section 1-5

### Discussion Forum

- Question
  - Describe how catching exceptions can help with file errors. Write three Python examples that actually generate file errors on your computer and catch the errors with try: except: blocks. Include the code and output for each example in your post.
  - Describe how you might deal with each error if you were writing a large production program. These descriptions should be general ideas in English, not actual Python code.
- In Japanese
  - 例外をキャッチすることが、ファイルエラーにどのように役立つかを説明しなさい。あなたのコンピュータで実際にファイルエラーを発生させ、 try: except: ブロックでエラーをキャッチする Python の例を3つ書いてください。それぞれの例のコードと出力をあなたの投稿に含めてください。
  - あなたが大規模な生産プログラムを書いている場合、それぞれのエラーにどのように対処する可能性があるかを記述してください。これらの記述は、実際の Python コードではなく、英語での一般的なアイデアであるべきです。
- Answer
  - 処理に関する例外は多数存在し、それら全てを考慮したプログラムを作成することは困難です、try-except構文は、このような例外を全て定義するのではなく、エラーが発生した時に対処できるようにすることが可能です。このように、小さく実装して発生したエラーに対する実装を行なっていく方法は、インクルメント開発に通じるものがあります。
  - 私の今回のunitの学習中に発生したエラーとその対処を記載します。
    - Example1:ファイルオープンエラー
      - 存在しないファイルをオープンを試行した場合に発生します
    - Example2:ファイル書き込みエラー
      - 書き込みを行えない場合に発生します。
    - Example3:フォーマットエラー
      - int型を直接書き込むことができないため発生します。
  - また、大規模なプロジェクトの開発中に例示したエラーが発生した場合はそれぞれ以下のように対処します。
    - Example1/Example2：モジュールの実行において必要な条件を明確に設計します。このディレクトリにあるこのファイルが実行には必要だ、このディレクトリにアウトプットファイルを出力する、といったことを明確に定義すれば対処可能と考えます。
    - Example3:このエラーについては、発生及び対処が完了した時点でプロジェクトのコーディング規約への取り込みを行います。プロジェクトには多数のメンバーが参画するため、一定の基準を設けるために規約が存在します。規約として定義することで、他のメンバーが同様のエラーを発生させないよう対処します。

### Learning Journal

### Programming Assignment

- Question
  - Modify your program from Learning Journal Unit 7 to read dictionary items from a file and write the inverted dictionary to a file. You will need to decide on the following:
    - How to format each dictionary item as a text string in the input file.
    - How to covert each input string into a dictionary item.
    - How to format each item of your inverted dictionary as a text string in the output file.
  - Create an input file with your original three-or-more items and add at least three new items, for a total of at least six items.
  - Include the following in your Learning Journal submission:
    - The input file for your original dictionary (with at least six items).
    - The Python program to read from a file, invert the dictionary, and write to a different file.
    - The output file for your inverted dictionary.
    - A description of how you chose to encode the original dictionary and the inverted dictionary in text files.
- In Japanese
  - 学習日誌ユニット7のプログラムを改造して、ファイルから辞書項目を読み込み、反転した辞書をファイルに書き込むようにしなさい。以下のことを決めておく必要がある。
    - 入力ファイルのテキスト文字列として各辞書項目をどのようにフォーマットするか。
    - 各入力文字列をどのように辞書項目に変換するか。
    - 出力ファイルで、反転した辞書の各項目をテキスト文字列としてどのようにフォーマットするか。
  - 元の3つ以上の項目で入力ファイルを作成し、少なくとも3つの新しい項目を追加し、合計で少なくとも6つの項目を作成する。
  - ラーニング・ジャーナルの提出には、以下を含めること。
    - オリジナルの辞書の入力ファイル(少なくとも6つの項目を含む)。
    - ファイルから読み込み、辞書を反転させ、別のファイルに書き込むPythonプログラム。
    - 反転された辞書の出力ファイル。
    - 元の辞書と反転した辞書をどのようにテキストファイルでエンコードすることにしたかの説明。

- Answer
  - Learning Journal unit7:original dictionary
  unit7のラーニングジャーナルで提出した辞書に要素を二つ追加したものを入力ファイル(lj_input.txt)として用意します。

  この辞書を反転した辞書の出力を行うためのプログラムの実装を以下のように定める。
    入力ファイルの読み込み(read_dicFile)
      辞書ファイルは全ての要素が文字列なので、文字列としてフォーマットし入力する
      フォーマットする際は不要な文字は削除する
    出力ファイルへの書き出し(write_dicFile)
      key : value-listの形式でにフォーマットして書き込みを行う
  
  これらの設計に基づいて作成したプログラム(lj.py)とそのアウトプット(lj_output.txt)を提出する。

  プログラムを実行した結果を以下に記載する。
