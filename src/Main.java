import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta numbrid (-1 katkestab): ");

        while(true) {
            int number = scanner.nextInt();
            if(number == -1) {
                break;
            }
            else {
                sum.addNumber(number);
                if(number % 2 == 0) {
                    even.addNumber(number);
                }
                else {
                    odd.addNumber(number);
                }
            }
        }

        System.out.println("Summa kokku: " + sum.sum());
        System.out.println("Paarisnumbrite summa: " + even.sum());
        System.out.println("Paaritute numbrite summa: " + odd.sum());
    }
}