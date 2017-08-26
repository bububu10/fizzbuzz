package fizzbuzz.oop;

import fizzbuzz.oop.model.SequenceOfNaturalNumbers;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {

    private final ConsoleView consoleView = new ConsoleView();

    public void start(int start, int end) {
        SequenceOfNaturalNumbers sequenceOfNaturalNumbers = SequenceOfNaturalNumbers.of(start, end);
        consoleView.show(sequenceOfNaturalNumbers.asFizzBuzzText());
    }
}
