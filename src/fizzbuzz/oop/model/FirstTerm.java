package fizzbuzz.oop.model;

public class FirstTerm {
    NaturalNumber naturalNumber;

    public FirstTerm(Integer value) {
        this.naturalNumber = new NaturalNumber(value);
    }

    boolean isBiggerThan(LastTerm lastTerm) {
        return lastTerm.naturalNumber.value < this.naturalNumber.value;
    }

    Integer asNumeric() {
        return naturalNumber.value;
    }
}
