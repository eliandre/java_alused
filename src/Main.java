import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Millise arvuni numbrid välja prindin?");
        int algne = 1;
        int arv = Integer.parseInt(scanner.nextLine());
        while (algne <= arv) {
            System.out.println(algne);
            algne++;
        }
    }
}
