package fizzbuzz.transactionscript;

public class FizzBuzzGame {

    public static void start(int limit) {

        for (int number = 1; number <= limit; number++) {
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
