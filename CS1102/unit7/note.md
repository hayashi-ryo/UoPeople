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
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

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
