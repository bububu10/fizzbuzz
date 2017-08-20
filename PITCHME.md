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

```text
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 fizzbuzz 31 32 fizz 34 buzz fizz 37 38 fizz buzz 41 fizz 43 44 fizzbuzz 46 47 fizz 49 buzz fizz 52 53 fizz buzz 56 fizz 58 59 fizzbuzz 61 62 fizz 64 buzz fizz 67 68 fizz buzz 71 fizz 73 74 fizzbuzz 76 77 fizz 79 buzz fizz 82 83 fizz buzz 86 fizz 88 89 fizzbuzz 91 92 fizz 94 buzz fizz 97 98 fizz buzz
```

1から100までの連続した自然数の数列を処理した場合、
上記のような結果がコンソールに出力される。

---

## まずは手続き的に実装（Transaction Script）

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java&lang=java
手続きの実装
@[5-18]
---?code=src/Main.java&lang=java
手続きの呼び出しとプログラムの実行
@[6,7,9,11,13,15]

---
END
