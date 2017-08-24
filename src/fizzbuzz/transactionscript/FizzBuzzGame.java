package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        // 引数チェック：両方とも自然数か？
        if (start <= 0 && end <= 0) throw new IllegalArgumentException("1以上の整数しか受け付けません。");
        // 引数チェック：末項と初項の関係は正しいか？
        if (start > end) throw new IllegalArgumentException("末項が初項より大きいです。");

        // startからendまで、naturalNumberを1ずつ増やして変換しながらコンソール出力する
        for (int naturalNumber = start; naturalNumber <= end; naturalNumber++) {
            if (naturalNumber % 3 == 0 && naturalNumber % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (naturalNumber % 3 == 0) {
                System.out.print("Fizz");
            } else if (naturalNumber % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(naturalNumber);
            }
            // 項と項の間はスペース区切り、最後の項には次の項がないのでスペースを出力しない
            if (naturalNumber != end) System.out.print(" ");
        }
    }
}
