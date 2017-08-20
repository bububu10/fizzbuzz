package fizzbuzz.oop.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputIntegers {
    List<InputInteger> values;

    public InputIntegers(Integer start, Integer end) {
        this.values = IntStream.rangeClosed(start, end)
                .mapToObj(InputInteger::new)
                .collect(Collectors.toList());
    }

    public String asOutputText() {
        return String.join(" ",
                values.stream()
                        .map(InputInteger::asFizzBuzzText)
                        .collect(Collectors.toList()));
    }
}
