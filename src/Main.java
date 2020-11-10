import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABS-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WG-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate first = new RegistrationPlate("FI", "ABC-123");
        if(!finnish.contains(first)) {
            finnish.add(first);
        }

        System.out.println("Soome: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("Omanikud: ");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-321")));
    }
}