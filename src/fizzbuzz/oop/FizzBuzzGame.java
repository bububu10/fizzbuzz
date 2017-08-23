package fizzbuzz.oop;

import fizzbuzz.oop.model.FirstTerm;
import fizzbuzz.oop.model.LastTerm;
import fizzbuzz.oop.model.SequenceOfNaturalNumber;
import fizzbuzz.oop.view.ConsoleView;

public class FizzBuzzGame {

    public void start(Integer firstTerm, Integer lastTerm) {
        SequenceOfNaturalNumber sequenceOfNaturalNumber =
                new SequenceOfNaturalNumber(new FirstTerm(firstTerm), new LastTerm(lastTerm));
        ConsoleView view = new ConsoleView();
        view.show(sequenceOfNaturalNumber.asOutputText());
    }
}
