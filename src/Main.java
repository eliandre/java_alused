public class Main {
    public static void main(String[] args) {

        Counter uus = new Counter(2, false);

        System.out.println(uus.value());
        uus.decrease();
        uus.decrease();
        System.out.println(uus.value());
        uus.increase(10);
        System.out.println(uus.value());

        uus.decrease(11);
        System.out.println(uus.value());
    }
}