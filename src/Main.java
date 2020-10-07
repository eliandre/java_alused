import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta sõna: ");
        String sisend = scanner.nextLine();
        System.out.print("Sisesta sõnaosa pikkus: ");
        int pikkus = Integer.parseInt(scanner.nextLine());

        System.out.println("Tulemus: " + sisend.substring(0, pikkus));
    }
}