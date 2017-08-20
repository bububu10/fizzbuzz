package fizzbuzz.oop.model;

class NaturalNumber {
    Integer value;

    NaturalNumber(Integer value) {
        if (value <= 0) throw new IllegalArgumentException("自然数しか受け付けません。");
        this.value = value;
    }

    String asFizzBuzzText() {
        if (this.isDivisibleBy(3) && this.isDivisibleBy(5)) return "fizzbuzz";
        if (this.isDivisibleBy(3)) return "fizz";
        if (this.isDivisibleBy(5)) return "buzz";
        return value.toString();
    }

    private boolean isDivisibleBy(Integer divisor) {
        return value % divisor == 0;
    }
}
