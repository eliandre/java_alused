import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("Sisesta summa: ");
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 0) {
                break;
            }
            sum += input;
            System.out.println("Summa on hetkel " + sum);
        }

        System.out.println("Summa on kokku " + sum);
    }
}
