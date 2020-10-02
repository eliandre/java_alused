import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta numbreid (-1 katkestab programmi töö)");

        int summa = 0;
        int loendur = 0;
        int paaris = 0;
        int paaritu = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            summa += number;
            loendur++;

            if (number % 2 == 0) {
                paaris++;
            }
            else paaritu++;
        }

        double keskmine = (double) summa / loendur;

        System.out.println("Kohtume hiljem!");
        System.out.println("Summa on " + summa);
        System.out.println("Sisestati " + loendur + " numbrit.");
        System.out.println("Keskmine on " + keskmine);
        System.out.println("Paaris numbreid on " + paaris);
        System.out.println("Paarituid numbreid on " + paaritu);
    }
}
