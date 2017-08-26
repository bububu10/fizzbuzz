package fizzbuzz.oop.model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 連続した自然数の数列
 */
public class SequenceOfNaturalNumbers {
    List<NaturalNumber> values;

    private SequenceOfNaturalNumbers(List<NaturalNumber> values) {
        this.values = values;
    }

    public static SequenceOfNaturalNumbers of(int start, int end) {
        SequenceRange range = new SequenceRange(new NaturalNumber(start), new NaturalNumber(end));
        return new SequenceOfNaturalNumbers(range.asSequentialList());
    }

    public String asFizzBuzzText() {
        return String.join(" ",
                values.stream()
                        .map(NaturalNumber::asFizzBuzzText)
                        .collect(Collectors.toList()));
    }
}
