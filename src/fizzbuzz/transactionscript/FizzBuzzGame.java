package fizzbuzz.transactionscript;

public class FizzBuzzGame {
    private final int start;
    private final int end;

    public FizzBuzzGame(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void start() {
        // startからendまで、numberを1ずつ増やして変換しながらコンソール出力する
        for (int number = start; number <= end; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.print("Fizz");
            } else if (number % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(number);
            }
            // 項と項の間はスペース区切り、最後の項には次の項がないのでスペースを出力しない
            if (number != end) System.out.print(" ");
        }
    }
}
