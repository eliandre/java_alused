public class Main {
    public static void main(String[] args) {

        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1,3, 1955);

        System.out.println(steve.getName() + " vanus on " + steve.age() + " aastat.");
        System.out.println(pekka.getName() + " vanus on " + pekka.age() + " aastat.");

    }
}