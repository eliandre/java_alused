
public class Main {
    public static void main(String[] args) {

        Storehouse store = new Storehouse();

        store.addProduct("piim", 3, 10);
        store.addProduct("kohv", 5, 6);
        store.addProduct("pett", 2, 20);
        store.addProduct("jogurt", 2, 30);

        System.out.println("Tooted:");
        for(String product : store.products()) {
            System.out.println(product);
        }
    }
}