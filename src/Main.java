import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sonad = new ArrayList<String>();
        sonad.add("Hallo");
        sonad.add("Hello");
        sonad.add("Ciao");
        System.out.println("Nimekirjas on " + countItems(sonad) + " elementi.");
    }

    public static int countItems(ArrayList<String> list) {
        int i = 0;
        for (String items : list) {
            i++;
        }
        return i;
    }
}