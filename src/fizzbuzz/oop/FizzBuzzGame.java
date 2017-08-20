package fizzbuzz.oop;

import java.util.stream.IntStream;

public class FizzBuzzGame {

    private Integer limit;

    public FizzBuzzGame(Integer limit) {
        this.limit = limit;
    }

    public void start() {
        // TODO streamはプログラマ的にはわかりやすいし、参照透過ではあるが。。。
        IntStream.rangeClosed(1, limit)
                .mapToObj(InputInteger::new)
                .map(InputInteger::asFizzBuzzText)
                .forEach(this::outputConsole);
    }

    private void outputConsole(String outputText) {
        System.out.println(outputText);
    }
}
