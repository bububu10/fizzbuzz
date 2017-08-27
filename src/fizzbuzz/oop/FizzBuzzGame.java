package fizzbuzz.oop;

import fizzbuzz.oop.model.SequenceOfNaturalNumbers;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {
    private final int start;
    private final int end;
    private final ConsoleView consoleView = new ConsoleView();

    public FizzBuzzGame(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void start() {
        SequenceOfNaturalNumbers sequenceOfNaturalNumbers = new SequenceOfNaturalNumbers(start, end);
        consoleView.show(sequenceOfNaturalNumbers.asFizzBuzzText());
    }
}
