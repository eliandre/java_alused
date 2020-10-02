import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mitu numbrit kokku liidan alates number ühest?");
        int summa = 0;
        int algne = 1;
        int arv = Integer.parseInt(scanner.nextLine());
        while (algne <= arv) {
            summa += algne;
            algne++;
        }
        System.out.println("Summa on " + summa);
    }
}
