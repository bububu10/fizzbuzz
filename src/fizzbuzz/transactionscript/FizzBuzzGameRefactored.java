package fizzbuzz.transactionscript;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGameRefactored {

    public static void start(int start, int end) {
        showConsole(join(toFizzBuzzes(start, end)));
    }

    private static List<String> toFizzBuzzes(int start, int end) {
        return IntStream
                .rangeClosed(start, end)
                .mapToObj(FizzBuzzGameRefactored::toFizzBuzz)
                .collect(Collectors.toList());
    }

    private static String toFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }

    private static String join(List<String> fizzBuzzTextList) {
        return String.join(" ", fizzBuzzTextList);
    }

    private static void showConsole(String outputText) {
        System.out.print(outputText);
    }
}
