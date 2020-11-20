
public class Main {
    public static void main(String[] args) {

        Purchase purchase = new Purchase("piim", 4, 2);

        System.out.println("Nelja piima kogusumma on " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);

        ShoppingBasket basket = new ShoppingBasket();
        basket.add("piim", 3);
        basket.add("pett", 2);
        basket.add("juust", 5);
        System.out.println("Ostukorvi hind: " + basket.price());
        basket.add("Arvuti", 899);
        System.out.println("Ostukorvi hind: " + basket.price());
        System.out.println("Ostukorvis on: ");
        basket.print();
    }
}