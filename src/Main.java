public class Main {
    public static void main(String[] args) {

        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconimical(10);
        System.out.println("Raha tagastati " + theChange);

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("Makse õnnestus: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("Makse õnnestus: " + succeeded);
        succeeded = unicafeExactum.payEconimical(cardOfJim);
        System.out.println("Makse õnnestus: " + succeeded);

        System.out.println(unicafeExactum);
    }
}