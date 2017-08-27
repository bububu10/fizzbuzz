package fizzbuzz.transactionscript;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGameRefactored {
    private final int start;
    private final int end;

    public FizzBuzzGameRefactored(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void start() {
        String outputText = join(toFizzBuzzes(start, end));
        showConsole(outputText);
    }

    private List<String> toFizzBuzzes(int start, int end) {
        // startからendまでの連続した数をfizzbuzzのルールに基いて変換した文字列のリストを返す
        return IntStream
                .rangeClosed(start, end)
                .mapToObj(this::toFizzBuzz)
                .collect(Collectors.toList());
    }

    private String toFizzBuzz(int number) {
        // 1つの数をfizzbuzzのルールに基いて変換して文字列として返す
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }

    private String join(List<String> fizzBuzzTextList) {
        // リストをスペース区切りで連結して１つの文字列にする
        return String.join(" ", fizzBuzzTextList);
    }

    private void showConsole(String outputText) {
        // コンソールへ文字列を出力する
        System.out.print(outputText);
    }
}
