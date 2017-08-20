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

## まずは手続き的に実装（Transaction Script）

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java&lang=java

---?code=src/Main.java&lang=java

