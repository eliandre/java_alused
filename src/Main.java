public class Main {
    public static void main(String[] args) {

        CashRegister unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("Kaardil on raha " + cardOfJim.balance() + " eurot.");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("Makse õnnestus: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("Makse õnnestus: " + succeeded);

        System.out.println("Kaardil on raha " + cardOfJim.balance() + " eurot.");

        System.out.println(unicafeExactum);
    }
}