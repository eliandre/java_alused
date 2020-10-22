public class Main {
    public static void main(String[] args) {

        LyyraCard cardOfPekka = new LyyraCard(10);
        CashRegister unicafeExactum = new CashRegister();

        System.out.println("Raha kaardil: " + cardOfPekka.balance());
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("Raha võeti: " + succeeded);
        System.out.println("Raha kaardil: " + cardOfPekka.balance());
        succeeded = cardOfPekka.pay(4);
        System.out.println("Raha võeti: " + succeeded);
        System.out.println("Raha kaardil: " + cardOfPekka.balance());

        double theChange = unicafeExactum.payEconimical(10);
        System.out.println("Raha tagastati: " + theChange);
        theChange = unicafeExactum.payEconimical(5);
        System.out.println("Raha tagastati: " + theChange);
        theChange = unicafeExactum.payGourmet(4);
        System.out.println("Raha tagastati: " + theChange);

        System.out.println(unicafeExactum);
    }
}