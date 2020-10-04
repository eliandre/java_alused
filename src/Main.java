import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta ringi raadius: ");
        int raadius = Integer.parseInt(scanner.nextLine());

        System.out.println("Ringi ümbermõõt on " + 2 * Math.PI * raadius);
    }
}