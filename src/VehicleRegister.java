import java.util.HashMap;

public class VehicleRegister {

    HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = owners;
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if(owners.containsKey(plate)) {
            return false;
        }
        else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        if(owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if(owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for(RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {

    }
}
