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
@[7,9,11,13,15](「変換ルール」の「割り切れる」という概念がjavaの文法の中に隠れている)
@[8,10,12,14](「判断->変換」と「コンソール出力」の２つの関心事が強く結合している)
@[16](「各項を半角スペース区切りで出力する」という意図が分かりにくい)
@[5-18](forループの中でif文分岐、というネストは読むのがめんどう)

---

## オブジェクト指向に忠実に実装(OOP)

---

パッケージ構成

```text
├── FizzBuzzGame.java
├── model
│   ├── NaturalNumber.java
│   └── SequenceOfNaturalNumber.java
└── view
    └── ConsoleView.java
```

* 「自然数」「連続した自然数の数列」という重要な概念（ドメインモデル）をmodelパッケージとしてまとめ、明示的にクラスにする。
* 「半角スペース区切りでコンソールに出力する」というのはFizzBuzzゲームの本質的な関心事ではないが重要な要件。それを明示的に表現するためにviewパッケージを作る。
* これでFizzBuzzGameから「変換ルール」と「出力」に関する役割を追い出すことができる。

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java&lang=java
@[7,8,10-13]
@[7,8,15]

---?code=src/fizzbuzz/transactionscript/model/SequenceOfNaturalNumber.java&lang=java
@[8-14]
@[16-21]

---?code=src/fizzbuzz/transactionscript/model/NaturalNumber.java&lang=java
@[4-6]
@[4,10-15]
@[4,17]

---?code=src/fizzbuzz/transactionscript/view/ConsoleView.java&lang=java

---
END
