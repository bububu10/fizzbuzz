# FizzBuzzをOOPに忠実に実装する

---

## Fizz Buzzの仕様

> プレイヤーは円状に座る。最初のプレイヤーは「1」と数字を発言する。次のプレイヤーは直前のプレイヤーの次の数字を発言していく。ただし、3で割り切れる場合は「Fizz」（Bizz Buzzの場合は「Bizz」）、5で割り切れる場合は「Buzz」、両者で割り切れる場合（すなわち15で割り切れる場合）は「Fizz Buzz」（Bizz Buzzの場合は「Bizz Buzz」）を数の代わりに発言しなければならない。発言を間違えた者や、ためらった者は脱落となる。

ref. https://ja.wikipedia.org/wiki/Fizz_Buzz

---?code=src/fizzbuzz/transactionscript/FizzBuzzGame.java
## Transaction Script（手続き的に書く）

---
