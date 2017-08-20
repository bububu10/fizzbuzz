package fizzbuzz.oop.model;

public class LastTerm {
    Integer value;

    public LastTerm(Integer value) {
        if (value <= 0) throw new IllegalArgumentException("自然数しか受け付けません。");
        this.value = value;
    }
}
