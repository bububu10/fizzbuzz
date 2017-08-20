package fizzbuzz.oop.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceOfNaturalNumber {
    List<NaturalNumber> values;

    public SequenceOfNaturalNumber(FirstTerm firstTerm, LastTerm lastTerm) {
        if (firstTerm.isBiggerThan(lastTerm)) throw new IllegalArgumentException("末項が初項より大きいです。");
        this.values = IntStream.rangeClosed(firstTerm.naturalNumber, lastTerm.naturalNumber)
                .mapToObj(NaturalNumber::new)
                .collect(Collectors.toList());
    }

    public String asOutputText() {
        return String.join(" ",
                values.stream()
                        .map(NaturalNumber::asFizzBuzzText)
                        .collect(Collectors.toList()));
    }
}
