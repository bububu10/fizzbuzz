package fizzbuzz.oop;

import fizzbuzz.oop.model.SequenceOfNaturalNumber;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {
    private final Integer start;
    private final Integer end;

    public FizzBuzzGame(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public void start() {
        SequenceOfNaturalNumber sequenceOfNaturalNumber = new SequenceOfNaturalNumber(start, end);
        ConsoleView view = new ConsoleView();
        view.show(sequenceOfNaturalNumber.asOutputText());
    }
}
