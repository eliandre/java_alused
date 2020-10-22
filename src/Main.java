import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Nimi: ");
            String name = scanner.nextLine();
            if(name.equals("")) {
                break;
            }
            System.out.print("Õpilase number: ");
            String number = scanner.nextLine();
            list.add(new Student(name, number));

        }
        for(Student student : list) {
            System.out.println(student);
        }

        System.out.print("Sisesta otsingusõne: ");
        String sone = scanner.nextLine();
        System.out.println("Tulemused:");

        for(Student student : list) {
            if(student.getName().contains(sone)) {
                System.out.println(student);
            }
        }

    }
}