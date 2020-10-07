import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta tekst: ");
        String sisend = scanner.nextLine();
        System.out.println("Ümber pööratult: " + reverse(sisend));
    }

    public static String reverse(String tekst) {
        String abi = "";
        int x = 0;
        int pikkus = tekst.length();
        int algnePikkus = tekst.length();

        while (x < algnePikkus) {
            char taht = tekst.charAt(pikkus - 1);
            abi += taht;
            x++;
            pikkus--;
        }
        return abi;
    }
}