public class Main {
    public static void main(String[] args) throws Exception {

        NumberStatistics stats = new NumberStatistics();

        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);

        System.out.println("Kogus: " + stats.amountOfNumbers());
        System.out.println("Summa: " + stats.sum());
        System.out.println("Keskmine: " + stats.average());
    }
}