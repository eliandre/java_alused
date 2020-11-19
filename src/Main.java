
public class Main {
    public static void main(String[] args) {

        Storehouse store = new Storehouse();

        store.addProduct("pett", 3, 10);
        store.addProduct("viin", 5, 7);

        System.out.println("Hinnad: ");
        System.out.println("Pett: " + store.price("pett"));
        System.out.println("Viin: " + store.price("viin"));
        System.out.println("Suhkur: " + store.price("suhkur"));

        Storehouse store1 = new Storehouse();
        store1.addProduct("kohv", 5, 1);

        System.out.println("Laos: ");
        System.out.println("Kohv: " + store1.stock("kohv"));
        System.out.println("Suhkur: " + store1.stock("suhkur"));

        System.out.println("Võtame kohvi: " + store1.take("kohv"));
        System.out.println("Võtame kohvi: " + store1.take("kohv"));
        System.out.println("Võtame suhkrut: " + store1.take("suhkur"));

        System.out.println("Laos:");
        System.out.println("Kohv: " + store1.stock("kohv"));
        System.out.println("Suhkur: " + store1.stock("suhkur"));
    }
}