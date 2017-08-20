public class Main {
    public static void main(String[] args) {

        System.out.println("------ fizzbuzz.transactionscript.FizzBuzzGame#start ------");
        fizzbuzz.transactionscript.FizzBuzzGame.start(100);
        System.out.println("------ end ------");

        System.out.println("------ fizzbuzz.oop.FizzBuzzGame#start ------");
        fizzbuzz.oop.FizzBuzzGame oopFizzBuzzGame = new fizzbuzz.oop.FizzBuzzGame(100);
        oopFizzBuzzGame.start();
        System.out.println("------ end ------");
    }
}
