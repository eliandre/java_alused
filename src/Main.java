public class Main {
    public static void main(String[] args) {

        PasswordRandomizer randomizer = new PasswordRandomizer(50);

        System.out.println("Parool: " + randomizer.createPassword());
        System.out.println("Parool: " + randomizer.createPassword());
        System.out.println("Parool: " + randomizer.createPassword());
        System.out.println("Parool: " + randomizer.createPassword());

    }
}