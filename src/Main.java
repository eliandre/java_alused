import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sonad = new ArrayList<String>();

        while(true){
            System.out.print("Sisesta sõna: ");
            String sona = scanner.nextLine();
            if(!sonad.contains(sona)) {
                sonad.add(sona);
            }
            else {
                System.out.println("Sa trükkisid sõna " + sona + " kaks korda.");
                break;
            }
        }
    }
}