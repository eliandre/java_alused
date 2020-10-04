
public class Main {

    public static void main(String[] args) {

        int paevad = 365;
        int tunnid = 24;
        int minutid = 60;
        int sekundid = 60;
        int sekundidAastas = paevad*tunnid*minutid*sekundid;

        System.out.println("Aastas on " + sekundidAastas + " sekundit.");
    }

}