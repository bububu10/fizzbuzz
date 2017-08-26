package fizzbuzz.oop.model;

/**
 * 自然数
 */
class NaturalNumber {
    Integer value;

    NaturalNumber(Integer value) {
        if (value <= 0) throw new IllegalArgumentException("1以上の整数しか受け付けません。");
        this.value = value;
    }

    String asFizzBuzzText() {
        if (this.isDivisibleBy(3) && this.isDivisibleBy(5)) return "FizzBuzz";
        if (this.isDivisibleBy(3)) return "Fizz";
        if (this.isDivisibleBy(5)) return "Buzz";
        return value.toString();
    }

    boolean isBiggerThan(NaturalNumber other) {
        return this.value > other.value;
    }

    Integer asNumeric() {
        return value;
    }

    private boolean isDivisibleBy(Integer divisor) {
        return value % divisor == 0;
    }
}
