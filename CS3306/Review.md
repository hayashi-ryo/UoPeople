# Review Quiz

Review-Quizで気になった箇所をメモしていく。

## memo

- オブジェクト指向データモデル
カプセル化、メソッド、オブジェクトの識別が基本要素となる。

- Group commit technique
複数のトランザクション処理をまとめてコミットすることで、ストレージに書き込まれるブロック効率を安定させる方法。

- トランザクション処理モニター
分散トランザクションを支援するためのMWとして機能する。

- メインメモリデータベース
全てのデータがメインメモリ内で保持されるため、通常はバッファページの書き換えは行われない。

- Skew
並列処理の効率に悪影響を与える要因の一つ。データや計算負荷が不均等に分散されることを指し、これによって各プロセッサ間の処理負荷が異なり、全体の性能に影響を与える。

- denormalized relation
非正規化されたリレーションのこと。データベースの性能向上のために、あえて詳細な正規化を行わないことがある。

- conflict equivalent
データベースにおけるスケジュール(複数のトランザクションの実行順序)が、他のスケジュールと同じ結果をもたらすかどうかを判断するための概念。

- IDREF
IDREF属性は、XMLなどのデータ構造で他の要素のIDを参照するために使用される。

- heterongeneous distributed database system
異なるスキーマやDBMSを使用している複数のDBをリンクして構築された分散型DB。

- CORBA
異なるプラットフォームや言語間での通信を可能にするMW規格。

- XSLT
XMLをHTMLに変換する変換言語

- transaction identifier
トランザクションを一意に識別するために利用する。特定のトランザクションが行った操作を区別するために利用される。

- Greedy Algorithm
貪欲法。DBの木の構築を行う
