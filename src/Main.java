public class Main {
    public static void main(String[] args) {

        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("Nimi: " + pekka.getName());
        System.out.println("Õpilase number: " + pekka.getStudentNumber());
        System.out.println(pekka);
    }
}