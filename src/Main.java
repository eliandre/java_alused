import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta arv: ");
        int arv = Integer.parseInt(scanner.nextLine());

        if(arv % 2 == 0) {
            System.out.println("Arv on paaris.");
        }
        else {
            System.out.println("Arv on paaritu.");
        }
    }
}