package fizzbuzz.oop.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 数列の範囲
 */
class SequenceRange {
    NaturalNumber firstTerm;
    NaturalNumber lastTerm;

    SequenceRange(NaturalNumber firstTerm, NaturalNumber lastTerm) {
        if (firstTerm.isBiggerThan(lastTerm)) throw new IllegalArgumentException("末項が初項より大きいです。");
        this.firstTerm = firstTerm;
        this.lastTerm = lastTerm;
    }

    List<NaturalNumber> asSequentialList() {
        List<NaturalNumber> list = IntStream
                .rangeClosed(firstTerm.asNumeric(), lastTerm.asNumeric())
                .mapToObj(NaturalNumber::new)
                .collect(Collectors.toList());
        return Collections.unmodifiableList(list);
    }
}
