package fizzbuzz.oop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class InputIntegers {
    List<InputInteger> values;

    InputIntegers(Integer start, Integer end) {
        this.values = IntStream.rangeClosed(start, end)
                .mapToObj(InputInteger::new)
                .collect(Collectors.toList());
    }

    String asOutputText() {
        return String.join("\n",
                values.stream()
                        .map(InputInteger::asFizzBuzzText)
                        .collect(Collectors.toList()));
    }
}
