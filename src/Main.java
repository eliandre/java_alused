import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Burger chicken = new Burger("Chicken Burger", "kanaliha", "valge sai", 3.99);
        Burger old = new Burger("Old Fashioned Cheesburger", "loomaliha", "valge sai", 2.99);
        Burger newYork = new Burger("New York Burger", "sealiha", 3.50);

        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        double kokku = 0;

        while(true) {
            System.out.println("Vali burger: 1 - Chicken Burger, 2 - Old Fashioned Cheeseburger, 3 - New York Burger");
            int valik = scanner.nextInt();
            if(valik == 1) {
                System.out.println(chicken);
                chicken.lisaLisandid();
                kokku += chicken.koostaBurger();
                System.out.println("Burgeri hind: " + chicken.koostaBurger());
                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }

            }
            else if(valik == 2) {
                System.out.println(old);
                old.lisaLisandid();
                kokku += old.koostaBurger();
                System.out.println("Burgeri hind: " + old.koostaBurger());
                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else if(valik == 3) {
                System.out.println(newYork);
                newYork.lisaLisandid();
                kokku += newYork.koostaBurger();
                System.out.println("Burgeri hind: " + newYork.koostaBurger());
                System.out.println("Kas soovid veel burgereid?  (jah/ei)");
                String veelBurgereid = reader.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else break;
        }
        System.out.println("Hind kokku on " + kokku + " €.");
    }
}