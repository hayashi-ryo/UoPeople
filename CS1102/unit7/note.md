# unit7

- Arrays
- For-Each Loops
- ArrayLists and Wrapper Classes
- Two-Dimensional Arrays

## Goal

- By the end of this Unit, you will be able to:
  - Explain the use of Java wrapper classes for parameterized types like ArrayList.
  - Write Java programs that display user-interface components and respond to button clicks.
  - Design user-interface components with titles, buttons, and text content.

## Task

- [x] Reading assignment
- [x] Discussion Forum
  - [x] first post
  - [x] reply classmates
- [x] Programming assignmet
- [x] Learning Journal
- [x] Take Self-Quiz

## Reading Assignment

- Section 3.8 - Introduction to Arrays
  - array型：格納されるものは全て同じ型である必要がある。
- Section 4.3.5 - Array Parameters
  - メソッドの引数にはarray型を定義することができる
- Section 4.3.6 - Command-line Arguments
  - main void(String[] args)もarray型の引数を与えていることを示している
- Section 5.1.4 - Arrays and Objects
- Chapter 7
  - Section 1 Array Details
  - Section 2: Array Processing
  - Section 3: ArrayList
    - Arraylistはプリミティブな方を値として取ることができない。そのため、Integerなどのラッパークラスを利用する
      - autoboxing
        - integer型が必要とされるコンテキストでint型を利用すると、自動的にIntegerオブジェクトにラップされること
      - unboxing
        - autoboxingの逆変換。Integer型のオブジェクトをint型に変換してくれる
      - このことは、Arraylistをプリミティブな型として扱うことを許容させてくれる。
  - Section 4: Records
    - 複数のパラメータを持つクラスを生成する
  - Section 5: Searching and Sorting
  - Section 6: Two-dimensional Arrays

## Discussion Forum

What are wrapper classes and why are they useful for ArrayLists? In your answer, include examples of autoboxing and unboxing.

今回の課題に回答するために、テキストから得られたArray、ArrayListそれぞれの特徴について説明します。
Array:
作成後は要素数の変更ができない、"静的な"配列である。
パラメータは全ての値を保持することができる。
ArrayList：
作成後も要素数の変更ができる、"動的な"配列である。
パラメータとしては、プリミティブな方は保持することができず、Object型のみとなる。

この特徴から、ArrayListにintやbooleanといったプリミティブな変数をそのまま扱うことができません。このような場合に、オブジェクトとして扱うことができるwrapper classが有用になります。例えば、intであればInteger型、booleanであればBoolean型が該当します。例として、1から3の整数をArrayListに格納し、それぞれの値を足し合わせたものを出力するプログラムを作成しました。

```java
package unit7;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) {
     ArrayList<Integer> list;
     list=new ArrayList<Integer>();
     
     Integer one=1;
     Integer two=2;
     int three=3;
     list.add(one);
     list.add(two);
     list.add(three);
     int sum=0;
     for(int i=0;i<list.size();i++) {
      sum+=list.get(i);
      System.out.println("type:"+list.get(i).getClass().getSimpleName());
     }
     System.out.println("sum="+sum);
    }
}

```

ここで、ArrayListを扱う上で有用なJavaの機能を活用しています。autoboxingとunboxingです。
まず、autoboxingは、プリミティブ型とその対応するラッパークラスの間で自動変換する機能です。ArrayListはobject型のみ許容するはずが、int型であるthreeを格納できていることからもわかります。それぞれの要素のclassを確認すると、以下のように全てInteger型に変換されていることがわかります。
unboxingはautoboxingの逆変換を行う機能です。サンプルプログラムでは、int型のsumに対してInteger型の要素を足し合わせることができていることからも様子が確認できます。

## Written Assignment

## Learning Journal

今週のユニットでは、ArrayやArrayListといった配列という概念について学びました。この概念について私の理解を説明します。
テキストによれば、配列は以下のように説明されます。
An array is a data structure in which the items are arranged as a numbered sequence, so that each individual item can be referred to by its position number.(Gallardo et al., 2016)
この配列という概念は、現実世界の大量の事象やものをデータとして扱うプログラムの世界では、非常に重要な概念です。Javaで扱う配列にはArrayとArrayList二つの種類があり、共通する事項やそれぞれの特徴について説明します。
まず、両方に共通する概念として"同じ型のデータしか格納できない"というものがあります。これは、int型とdouble型、String型など複数のデータ型を一つの配列で扱うことができないことを示しています。もし、複数のデータ型を利用したい場合は、Object型としてデータを定義し、そのオブジェクト自体を配列に格納することで利用することが可能です。
次に、Arrayという配列についてです。Arrayは私の理解では"静的な"配列です。特徴について以下に記載します。
・扱うことのできるデータ型はプリミティブ型のみである。Stringなどのオブジェクト型は利用できない。
・配列を作成した後で要素数を増減させることができない。増減させたい場合は新しい配列を再定義する必要がある。
最後に、ArrayListという配列についてです。ArrayListはArrayと異なり、"動的な"配列だと理解しています。特徴を以下に記載します。
・扱うことができるデータ型はオブジェクト型のみである。int型などのプリミティブな型は利用できない
・配列の要素数は自由に増減させることができる。最初はNULLで定義した上で、途中で要素を随時追加することが可能である。
・プリミティブなデータ型を利用したい場合は、intならばInteger型、booleanであればBoolean型といったラッパークラスを利用する。ラッパークラスは、プリミティブなクラスをオブジェクト型として扱うことができるようにあらかじめ定義されているクラスである。
これらの配列には、ソートや探索など、プログラムを実装する上で有用に活用できるメソッドがあらかじめ用意されています。プログラムを行う際には、マニュアルを確認しながらどのようなメソッドが提供されているのか、見つける能力も重要だと感じています。
私は以前、C言語やC++言語など、Javaよりもよりメモリ構造を意識する必要のあるプログラムを学んでいたため、ArrayとArrayyListがコンパイルの過程でどのように扱われるのかを意識することができたと考えています。プログラムのシンタックスは異なるものの、根本となるCPUやメモリに対して命令を行う、という点についてはほとんどのプログラムで共有の概念だと考えているため、今学んでいるJavaだけではなく、複数の言語を扱うことができるよう、学びを進めていきたいと思います。

References:
Gallardo, R., Hommel, S., Kannan, S., Gordon, J., and Zakhour, S.B. (2016). The Java tutorials. Oracle.
Retrieved from <https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html>
