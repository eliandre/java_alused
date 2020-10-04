import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta arv: ");
        int arv = Integer.parseInt(scanner.nextLine());

        if(arv > 0) {
            System.out.println("Arv on positiivne.");
        }
        else if(arv == 0) {
            System.out.println("Arv on 0.");
        }
        else {
            System.out.println("Arv on negatiivne");
        }
    }
}