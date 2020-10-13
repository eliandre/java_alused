import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta sõna: ");
        String tekst = scanner.nextLine();
        if(palindrome(tekst)) {
            System.out.println("Sõna on palindroom.");
        }
        else {
            System.out.println("Sõna pole palindroom.");
        }

    }

    public static boolean palindrome(String tekst) {
        String abi = "";
        boolean tulemus = false;
        int x = 0;
        int pikkus = tekst.length();
        int algnePikkus = tekst.length();

        while (x < algnePikkus) {
            char taht = tekst.charAt(pikkus - 1);
            abi += taht;
            x++;
            pikkus--;
        }
        if(tekst.equals(abi)){
            tulemus = true;
        }
        return tulemus;
    }
}