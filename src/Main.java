import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta oma nimi: ");
        String sisend = scanner.nextLine();

        if (sisend.length() > 2) {
            System.out.println("1. täht on " + sisend.charAt(0));
            System.out.println("2. täht on " + sisend.charAt(1));
            System.out.println("3. täht on " + sisend.charAt(2));
        }
        else {
            System.out.println();
        }
    }
}