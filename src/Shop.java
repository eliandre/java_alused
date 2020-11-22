import java.util.Scanner;

public class Shop {

    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Tere tulemast meie poodi, " + customer);
        System.out.println("Allpool näed meie sooduspakkumine:");

        for(String product : store.products()) {
            System.out.println(product);
        }

        while(true) {
            System.out.println("Mida osta soovid (vajuta maksmiseks enterit)?: ");
            String product = reader.nextLine();
            if(product.isEmpty()) {
                break;
            }
            if(store.stock(product) > 0) {
                store.take(product);
                basket.add(product, store.price(product));
            }
        }

        System.out.println("Sinu ostud:");
        basket.print();
        System.out.println("Ostukorvi hind:" + basket.price());
    }
}
