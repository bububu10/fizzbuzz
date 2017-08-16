package fizzbuzz;

class InputInteger {
    Integer value;

    InputInteger(Integer value) {
        this.value = value;
    }

    String asFizzBuzzText() {
        if (this.isDivisibleBy(15)) return "fizzbuzz";
        if (this.isDivisibleBy(3)) return "fizz";
        if (this.isDivisibleBy(5)) return "buzz";
        return value.toString();
    }

    private boolean isDivisibleBy(Integer divisor) {
        return value % divisor == 0;
    }
}
