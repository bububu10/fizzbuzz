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
        System.out.print("\n");

        logger.println("fizzbuzz.transactionscript.FizzBuzzGameRefactored#start");
        fizzbuzz.transactionscript.FizzBuzzGameRefactored.start(1, 100);
        System.out.print("\n");
    }

    private static void executeOOP() {
        logger.println("fizzbuzz.oop.FizzBuzzGame#start");
        fizzbuzz.oop.FizzBuzzGame oopFizzBuzzGame = new fizzbuzz.oop.FizzBuzzGame();
        oopFizzBuzzGame.start(1, 100);
    }

}
