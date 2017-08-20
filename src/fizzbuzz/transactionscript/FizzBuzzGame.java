package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        for (int inputNumber = start; inputNumber <= end; inputNumber++) {
            if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (inputNumber % 3 == 0) {
                System.out.println("fizz");
            } else if (inputNumber % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(inputNumber);
            }
        }
    }
}
