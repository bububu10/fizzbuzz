# FizzBuzzをOOPに忠実に実装する

---

## 今回実装するFizzBuzzの仕様

* プログラムには1から順番に整数（半角数字）を与え、以下のルールで変換される文字列をコンソールに出力する。
* なお、各文字列は半角スペース区切りで表示する。
* 変換ルール
  * 与えられた整数が3で割り切れるなら「Fizz」と表示する
  * 与えられた整数が5で割り切れるなら「Buzz」と表示する
  * 与えられた整数が両方で割り切れるなら「FizzBuzz」と表示する。

ref. FizzBuzz問題の概要については右を参照 https://ja.wikipedia.org/wiki/Fizz_Buzz

---

## まずは手続き的に実装（Transaction Script）

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java

---
