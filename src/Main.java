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
    }
}