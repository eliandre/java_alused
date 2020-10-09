import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sonad = new ArrayList<String>();

        while(true) {
            System.out.print("Sisesta sõna: ");
            String sona = scanner.nextLine();
            if(sona.isEmpty()){
                break;
            }
            sonad.add(sona);
        }

        Collections.sort(sonad);

        System.out.println("Sa sisestasid sõnad: ");
        for(String sona : sonad){
            System.out.println(sona);
        }
    }
}