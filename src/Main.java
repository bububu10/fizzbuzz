import log.ConsoleLogger;

public class Main {
    private final static ConsoleLogger logger = new ConsoleLogger();

    public static void main(String[] args) {
        executeTransactionScript();
        executeOOP();
    }

    private static void executeTransactionScript() {
        logger.println("fizzbuzz.transactionscript.FizzBuzzGame#start");
        fizzbuzz.transactionscript.FizzBuzzGame.start(1, 100);
        logger.println("transactionscript end");
    }

    private static void executeOOP() {
        logger.println("fizzbuzz.oop.FizzBuzzGame#start");
        fizzbuzz.oop.FizzBuzzGame oopFizzBuzzGame = new fizzbuzz.oop.FizzBuzzGame(1, 100);
        oopFizzBuzzGame.start();
        logger.println("oop end");
    }

}
