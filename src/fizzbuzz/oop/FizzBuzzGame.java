package fizzbuzz.oop;

import fizzbuzz.oop.model.InputIntegers;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {
    InputIntegers inputIntegers;
    ConsoleView consoleView;

    public FizzBuzzGame(Integer start, Integer end) {
        this.inputIntegers = new InputIntegers(start, end);
        this.consoleView = new ConsoleView();
    }

    public void start() {
        consoleView.show(inputIntegers.asOutputText());
    }
}
