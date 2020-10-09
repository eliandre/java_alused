import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sonad = new ArrayList<String>();
        sonad.add("Hallo");
        sonad.add("Hello");
        sonad.add("Ciao");
        sonad.add("Tere");
        System.out.println("Nimekirjas on");
        System.out.println(sonad);
        removeLast(sonad);
        System.out.println(sonad);
    }

    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }
}