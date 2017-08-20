package fizzbuzz.oop;

public class FizzBuzzGame {
    InputIntegers inputIntegers;

    public FizzBuzzGame(Integer start, Integer end) {
        this.inputIntegers = new InputIntegers(start, end);
    }

    public void start() {
        this.outputConsole(inputIntegers.asOutputText());
    }

    private void outputConsole(String outputText) {
        System.out.println(outputText);
    }
}
