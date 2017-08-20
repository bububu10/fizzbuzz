package log;

public class ConsoleLogger {
    String format = "-------------- %s -------------";

    public void println(String logText) {
        System.out.println(String.format(format, logText));
    }
}
