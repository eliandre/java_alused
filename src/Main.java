import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int juhuslik = (int) Math.round(Math.random() * 100);
        int korrad = 1;

        while (true) {
            System.out.print("Arva arv ära: ");
            int arv = Integer.parseInt(scanner.nextLine());
            if (juhuslik < arv) {
                System.out.println("Arv on väiksem. Arvatud kordi: " + korrad);
                korrad++;
            }
            else if (juhuslik > arv) {
                System.out.println("Arv on suurem. Arvatud kordi: " + korrad);
                korrad++;
            }
            else {
                System.out.println("Tubli! Arvasidki ära.");
                break;
            }
        }

    }
}