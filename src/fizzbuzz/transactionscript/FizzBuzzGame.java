package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        for (int inputNumber = start; inputNumber <= end; inputNumber++) {
            if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
                System.out.print("fizzbuzz");
            } else if (inputNumber % 3 == 0) {
                System.out.print("fizz");
            } else if (inputNumber % 5 == 0) {
                System.out.print("buzz");
            } else {
                System.out.print(inputNumber);
            }
            if (inputNumber != end) System.out.print(" ");
        }
    }
}
