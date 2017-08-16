package fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzGame {

    private Integer limit;

    public FizzBuzzGame(Integer limit) {
        this.limit = limit;
    }

    public void start() {
        IntStream.range(1, limit)
                .mapToObj(OutputString::new)
                .forEach(this::outputConsole);
    }

    private void outputConsole(OutputString outputString) {
        System.out.println(outputString.asText());
    }
}
