import log.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        executeTransactionScript();
        executeTransactionScriptRefactored();
        executeOOP();
    }

    private static void executeTransactionScript() {
        ConsoleLogger logger = new ConsoleLogger("fizzbuzz.transactionscript.FizzBuzzGame");
        logger.start();
        fizzbuzz.transactionscript.FizzBuzzGame.start(1, 100);
        System.out.print("\n");
        logger.end();
    }

    private static void executeTransactionScriptRefactored() {
        ConsoleLogger logger = new ConsoleLogger("fizzbuzz.transactionscript.FizzBuzzGameRefactored");
        logger.start();
        fizzbuzz.transactionscript.FizzBuzzGameRefactored.start(1, 100);
        System.out.print("\n");
        logger.end();
    }

    private static void executeOOP() {
        ConsoleLogger logger = new ConsoleLogger("fizzbuzz.oop.FizzBuzzGame");
        logger.start();
        fizzbuzz.oop.FizzBuzzGame oopFizzBuzzGame = new fizzbuzz.oop.FizzBuzzGame();
        oopFizzBuzzGame.start(1, 100);
        logger.end();
    }

}
