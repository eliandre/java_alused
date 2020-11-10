
public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }

        if(getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if(!this.country.equals(compared.getCountry())) {
            return false;
        }

        if(this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if(this.regCode == null) {
            return 13;
        }
        return this.regCode.hashCode();
    }

    public String toString() {
        return country + " " + regCode;
    }
}
