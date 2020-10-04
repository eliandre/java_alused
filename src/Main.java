import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta oma vanus: ");
        int vanus = Integer.parseInt(scanner.nextLine());

        if(vanus > 0 && vanus < 120) {
            System.out.println("Hea teada.");
        }
        else {
            System.out.println("Võimatu!");
        }
    }
}