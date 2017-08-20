# FizzBuzzをOOPに忠実に実装する

---

## FizzBuzzの仕様

---

* 連続した自然数の数列の各項を以下のルールで変換し、その結果を半角スペース区切りでコンソールに出力する。
* 変換ルール
  * 3で割り切れるなら「Fizz」と表示する
  * 5で割り切れるなら「Buzz」と表示する
  * 3と5の両方で割り切れるなら「FizzBuzz」と表示する。
  * いずれにも該当しない場合は、自然数をそのまま表示する。

ref. Fizz Buzz(wikipedia) https://ja.wikipedia.org/wiki/Fizz_Buzz

---

## 実行結果の例
---

1から100までの連続した自然数の数列を処理した場合、
以下のような結果がコンソールに出力される。

```text
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 fizzbuzz 31 32 fizz 34 buzz fizz 37 38 fizz buzz 41 fizz 43 44 fizzbuzz 46 47 fizz 49 buzz fizz 52 53 fizz buzz 56 fizz 58 59 fizzbuzz 61 62 fizz 64 buzz fizz 67 68 fizz buzz 71 fizz 73 74 fizzbuzz 76 77 fizz 79 buzz fizz 82 83 fizz buzz 86 fizz 88 89 fizzbuzz 91 92 fizz 94 buzz fizz 97 98 fizz buzz
```

---

## まずは手続き的に実装（Transaction Script）

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java&lang=java
@[6,17](「連続した自然数の数列」という重要な概念が繰り返し構文の中に隠れている)
@[7,9,11,13,15](「割り切れた場合」という意図がわかりにくい)
@[8,10,12,14](「判断->変換」と「コンソール出力」の２つの関心事が強く結合している)
@[16](「各項を半角スペース区切りで出力する」という意図がわかりにくい)
@[6-17](forループの中でif文分岐、というネストは読むのがめんどう)

---

## オブジェクト指向に忠実に実装(OOP)

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
@[3-7](「初項」「末項」「自然数」「連続した自然数の数列」という重要な概念を明示的に。)
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
@[4,18-20](このクラス内だけで使う「割り切れる」という概念を明示的に表現する説明的な関数)

---?code=src/fizzbuzz/oop/model/FirstTerm.java&lang=java
@[4-8](初期化：値を保持する)
@[10-12](末項との関係を検査する関数)

---?code=src/fizzbuzz/oop/model/LastTerm.java&lang=java
@[4-8](初期化：値を保持する)

---?code=src/fizzbuzz/oop/view/ConsoleView.java&lang=java
@[5-7](引数で受け取ったものをコンソールへ出力するだけ)

---

* OOPを真面目に適用するとやや大袈裟な感じはする
* でも、小さなプログラムでも「関心事」と「クラスの単一責任」を意識すると発見はある
  * 対象の「本質的あるいは重要な概念」というものがパッケージ構造を見ただけで概観できる
  * クラスを分割するとそのクラスが担保すべき整合性を発見しやすい
  * 何か新たな発見があったときに手を加えやすい

---
END
