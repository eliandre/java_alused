import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta punktisumma (0-60): ");
        int punktid = Integer.parseInt(scanner.nextLine());

        if(punktid < 30) {
            System.out.println("Läbikukkumine.");
        }
        else if(punktid < 35) {
            System.out.println("Hinne: 1.");
        }
        else if(punktid < 40) {
            System.out.println("Hinne: 2.");
        }
        else if(punktid < 45) {
            System.out.println("Hinne: 3.");
        }
        else if(punktid < 50) {
            System.out.println("Hinne: 4.");
        }
        else {
            System.out.println("Hinne: 5.");
        }
    }
}