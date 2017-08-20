package fizzbuzz.oop.model;

public class FirstTerm {
    Integer value;

    public FirstTerm(Integer value) {
        if (value <= 0) throw new IllegalArgumentException("自然数しか受け付けません。");
        this.value = value;
    }

    boolean isBiggerThan(LastTerm lastTerm) {
        return lastTerm.value < this.value;
    }

}
