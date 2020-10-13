import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arvud = new ArrayList<Integer>();

        arvud.add(3);
        arvud.add(2);
        arvud.add(7);
        arvud.add(2);
        System.out.println("Suurim arv on: " + greatest(arvud));
    }

    public static int greatest(ArrayList<Integer> list) {
        int suurim = 0;
        for( int number : list){
            if(number > suurim){
                suurim = number;
            }
        }
        return suurim;
    }
}