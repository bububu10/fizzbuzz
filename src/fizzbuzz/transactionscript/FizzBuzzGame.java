package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        if (start <= 0 && end <= 0) throw new IllegalArgumentException("1以上の整数しか受け付けません。");
        if (start > end) throw new IllegalArgumentException("末項が初項より大きいです。");

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
            if (naturalNumber != end) System.out.print(" ");
        }
    }
}
