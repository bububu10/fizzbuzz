package log;

public class ConsoleLogger {
    String programName;
    long start;
    long end;

    public ConsoleLogger(String programName) {
        this.programName = programName;
    }

    public void start() {
        this.start = System.nanoTime();
        System.out.println(String.format("---- %s ----", programName));
    }

    public void end() {
        this.end = System.nanoTime();
        System.out.println(String.format("---- execute time: %s ms ----", (end - start) / 1000000f));
    }
}
