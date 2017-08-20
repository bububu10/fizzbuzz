# FizzBuzzをOOPに忠実に実装する

---

## FizzBuzzとは？

---

連続した自然数の数列の各項を次のルールで変換し、
その結果を半角スペース区切りでコンソールに出力する。

---

* 変換ルール
  * 3で割り切れるなら「Fizz」と表示する
  * 5で割り切れるなら「Buzz」と表示する
  * 3と5の両方で割り切れるなら「FizzBuzz」と表示する。
  * いずれにも該当しない場合は、自然数をそのまま表示する。

ref. Fizz Buzz(wikipedia) https://ja.wikipedia.org/wiki/Fizz_Buzz

---

実行結果の例

---

1から100までの連続した自然数の数列を処理すると

```text
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz
```

上記の結果が得られる。

--- 

## OOPとは？

---

オブジェクト指向プログラミング  
OOP(Object Oriented Programing)

---

* データとふるまいを持つ「オブジェクト」を組み合わせることによって、機能を実現する。
* オブジェクトはプログラムの「関心事」を表現し、「単一の責任」を果たす。

---

* 機能を実現するために「手続きを記述する」のではなく「関心事をオブジェクトモデル化する」という考え方をする。
* 「手続きを記述する」アプローチはTransaction Scriptと呼ばれる。気を抜くとこちらになりがち。

---

## 「実装する」とは？

---

「実装」という言葉は「仕様」とセット。

---

* 仕様
  * プログラムが実現すべき機能。ふつう自然言語や図表によって記述される。
* 実装
  * 仕様を満たすプログラムそのもの、またはプログラムを記述する行為のこと。

---

これまでのスライドでいうと、

---

* 「FizzBuzzとは？」
  * 「仕様」についての記述
* 「OOPとは？」
  * 「実装」のアプローチについての記述

---

今回はFizzBuzzという仕様を、Javaというプログラミング言語を使ってOOPアプローチで実装する。

---

## まずは手続き的に実装

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java&lang=java
@[6,17](「連続した自然数の数列」という重要な概念が繰り返し構文の中に隠れている)
@[7,9,11,13,15](「割り切れた場合」という意図がわかりにくい)
@[8,10,12,14](「判断->変換」と「コンソール出力」の２つの関心事が強く結合している)
@[16](「各項を半角スペース区切りで出力する」という意図がわかりにくい)
@[6-17](forループの中でif文分岐、というネストは読むのがめんどう)

---

## オブジェクト指向に忠実に実装

---

具体的な指針：オブジェクト指向エクササイズの9つのルール

---

すべてを厳格に適用する気はないが指針として次のルールを意識する。

---

1. １つのメソッドにつきインデントは１段階までにすること
2. else 句を使用しないこと
3. すべてのプリミティブ型と文字列型をラップすること
4. １行につきドットは１つまでにすること
5. 名前を省略しないこと
6. すべてのエンティティを小さくすること
7. １つのクラスにつきインスタンス変数は２つまでにすること
8. ファーストクラスコレクションを使用すること
9. Getter, Setter, プロパティを使用しないこと

ref. オブジェクト指向できていますか？(SlideShare) https://www.slideshare.net/MoriharuOhzu/ss-14083300

---

パッケージ構成

```text
.
├── FizzBuzzGame.java
├── model
│   ├── FirstTerm.java
│   ├── LastTerm.java
│   ├── NaturalNumber.java
│   └── SequenceOfNaturalNumber.java
└── view
    └── ConsoleView.java
```
@[3-7](「初項」「末項」「自然数」「連続した自然数の数列」という本質的な概念を明示的に。)
@[8-9](「コンソールに出力する」というのはFizzBuzzゲームの本質的な関心事ではないが「表示」の重要な要件。)
@[2](FizzBuzzGameは「modelを使ってviewへ出力する」ことだけに専念する。)

---?code=src/fizzbuzz/oop/FizzBuzzGame.java&lang=java
@[9-15](初期化：初項と末項を保持)
@[9,10,17-21](modelを使ってviewへ出力する)

---?code=src/fizzbuzz/oop/model/SequenceOfNaturalNumber.java&lang=java
@[8-15](初期化：初項と末項の整合性をチェック、初項と末項を元に自然数のリストを作って保持)
@[17-22](自身がviewへ出力される際のテキスト表現を返す)

---?code=src/fizzbuzz/oop/model/NaturalNumber.java&lang=java
@[4-9](初期化：自然数としての整合性チェック、値を保持する)
@[4,11-16](FizzBuzzの変換ルールに則ったテキスト表現を返す)
@[4,18-20](自身が引数で「割り切れる」か検査する)

---?code=src/fizzbuzz/oop/model/FirstTerm.java&lang=java
@[4-8](初期化：値を保持する)
@[10-12](末項との関係を検査する)
@[14-16](自身の数値表現を返す)

---?code=src/fizzbuzz/oop/model/LastTerm.java&lang=java
@[4-8](初期化：値を保持する)
@[10-12](自身の数値表現を返す)

---?code=src/fizzbuzz/oop/view/ConsoleView.java&lang=java
@[5-7](引数で受け取ったものをコンソールへ出力するだけ)

---

* OOPを真面目に適用するとやや大袈裟な感じはする
* でも、小さなプログラムでも「関心事の分離」と「クラスの単一責任」を意識すると発見はある
  * 対象の「本質的あるいは重要な概念」というものがパッケージ構造を見ただけで概観できる
  * クラスを分割するとそのクラスが担保すべき整合性を発見しやすい
  * 何か新たな発見があったときに手を加えやすい

---
END
