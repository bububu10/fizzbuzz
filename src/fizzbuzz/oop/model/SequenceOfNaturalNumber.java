package fizzbuzz.oop.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceOfNaturalNumber {
    List<NaturalNumber> values;

    public SequenceOfNaturalNumber(Integer start, Integer end) {
        this.values = IntStream.rangeClosed(start, end)
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
