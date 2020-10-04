import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta esimene arv: ");
        int esimene = Integer.parseInt(reader.nextLine());
        System.out.print("Sisesta teine arv: ");
        int teine = Integer.parseInt(reader.nextLine());

        double jagatis = (double)esimene / teine;

        System.out.println("Jagamine: " + esimene + " / " + teine + " = " + jagatis);
    }
}