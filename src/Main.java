import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String parool = "eesel";

        while(true) {
            System.out.print("Sisesta parool: ");
            String sisend = scanner.nextLine();
            if(sisend.equals(parool)){
                System.out.println("Õige parool!");
                System.out.println("Salasõna on yjdka sadd");
                break;
            }
        }
    }
}