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

        fizzbuzz.transactionscript.FizzBuzzGame game =
                new fizzbuzz.transactionscript.FizzBuzzGame(1, 100);
        game.start();

        System.out.print("\n");
        logger.end();
    }

    private static void executeTransactionScriptRefactored() {
        ConsoleLogger logger = new ConsoleLogger("fizzbuzz.transactionscript.FizzBuzzGameRefactored");
        logger.start();

        fizzbuzz.transactionscript.FizzBuzzGameRefactored game =
                new fizzbuzz.transactionscript.FizzBuzzGameRefactored(1, 100);
        game.start();

        System.out.print("\n");
        logger.end();
    }

    private static void executeOOP() {
        ConsoleLogger logger = new ConsoleLogger("fizzbuzz.oop.FizzBuzzGame");
        logger.start();

        fizzbuzz.oop.FizzBuzzGame oopFizzBuzzGame =
                new fizzbuzz.oop.FizzBuzzGame(1, 100);
        oopFizzBuzzGame.start();

        logger.end();
    }

}
