package fizzbuzz.oop;

import fizzbuzz.oop.model.FirstTerm;
import fizzbuzz.oop.model.LastTerm;
import fizzbuzz.oop.model.SequenceOfNaturalNumber;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {
    private final FirstTerm firstTerm;
    private final LastTerm lastTerm;

    public FizzBuzzGame(Integer firstTerm, Integer lastTerm) {
        this.firstTerm = new FirstTerm(firstTerm);
        this.lastTerm = new LastTerm(lastTerm);
    }

    public void start() {
        SequenceOfNaturalNumber sequenceOfNaturalNumber = new SequenceOfNaturalNumber(firstTerm, lastTerm);
        ConsoleView view = new ConsoleView();
        view.show(sequenceOfNaturalNumber.asOutputText());
    }
}
