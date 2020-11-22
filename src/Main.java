import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Storehouse store = new Storehouse();
        store.addProduct("kohv", 5, 10);
        store.addProduct("piim", 3, 20);
        store.addProduct("pett", 2, 55);
        store.addProduct("leib", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}