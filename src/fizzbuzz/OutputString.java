package fizzbuzz;

class OutputString {
    String value = "";

    OutputString(Integer source) {
        if (source % 3 == 0) this.value = "fizz";
        if (source % 5 == 0) this.value = this.value + "buzz";
        if (this.value.isEmpty()) this.value = source.toString();
    }
}
