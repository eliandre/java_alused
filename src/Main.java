import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta aastaarv: ");
        int aastaarv = Integer.parseInt(scanner.nextLine());

        if(aastaarv % 4 == 0){
            if(aastaarv % 100 == 0) {
                if(aastaarv % 400 == 0) {
                    System.out.println("Tegu on liigaastaga.");
                } else {
                    System.out.println("Tegu pole liigaastaga.");
                }
            }
            else {
                System.out.println("Tegu on liigaastaga.");
            }
        }
        else {
            System.out.println("Tegu pole liigaastaga.");
        }
    }
}