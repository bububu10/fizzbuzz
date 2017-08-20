package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        for (int naturalNumber = start; naturalNumber <= end; naturalNumber++) {
            if (naturalNumber % 3 == 0 && naturalNumber % 5 == 0) {
                System.out.print("fizzbuzz");
            } else if (naturalNumber % 3 == 0) {
                System.out.print("fizz");
            } else if (naturalNumber % 5 == 0) {
                System.out.print("buzz");
            } else {
                System.out.print(naturalNumber);
            }
            if (naturalNumber != end) System.out.print(" ");
        }
    }
}
