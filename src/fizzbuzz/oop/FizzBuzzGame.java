package fizzbuzz.oop;

import fizzbuzz.oop.model.SequenceOfNaturalNumber;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {
    SequenceOfNaturalNumber sequenceOfNaturalNumber;
    ConsoleView consoleView;

    public FizzBuzzGame(Integer start, Integer end) {
        this.sequenceOfNaturalNumber = new SequenceOfNaturalNumber(start, end);
        this.consoleView = new ConsoleView();
    }

    public void start() {
        consoleView.show(sequenceOfNaturalNumber.asOutputText());
    }
}
