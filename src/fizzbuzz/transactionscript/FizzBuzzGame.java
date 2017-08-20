package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (number % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
            } else if (number % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
