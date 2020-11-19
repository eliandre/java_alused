
public class Main {
    public static void main(String[] args) {

        CivilService uus = new CivilService();
        System.out.println(uus.getDaysLeft());
        uus.work();
        uus.work();
        System.out.println(uus.getDaysLeft());

        MilitaryService uus1 = new MilitaryService(100);
        System.out.println(uus1.getDaysLeft());
        uus1.work();
        uus1.work();
        System.out.println(uus1.getDaysLeft());
    }
}