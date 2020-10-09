import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arvud = new ArrayList<Integer>();

        arvud.add(3);
        arvud.add(2);
        arvud.add(7);
        arvud.add(2);
        System.out.println("Summa on: " + sum(arvud));
        System.out.println("Keskmine on: " + average(arvud));
    }

    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        for (int arv : list) {
            i += arv;
        }
        return i;
    }

    public static double average(ArrayList<Integer> list) {
        double keskmine= (double) sum(list) / list.size();
        return keskmine;
    }
}