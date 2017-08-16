package fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzGame {

    private Integer limit;

    public FizzBuzzGame(Integer limit) {
        this.limit = limit;
    }

    public void start() {
        IntStream.rangeClosed(1, limit)
                .mapToObj(InputInteger::new)
                .map(InputInteger::asFizzBuzzText)
                .forEach(this::outputConsole);
    }

    private void outputConsole(String outputText) {
        System.out.println(outputText);
    }
}
