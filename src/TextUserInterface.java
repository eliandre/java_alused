import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {

    private Scanner scanner;
    private Dictionary dictionary;
    HashMap<String, String> sonad = new HashMap<String, String>();

    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("\t add - adds a word pair to the dictionary");
        System.out.println("\t translate - asks a word and prints its translation");
        System.out.println("\t quit - quits the text user interface");

        while(true) {
            System.out.println("Statement: ");
            String command = this.scanner.nextLine();

            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")) {
                System.out.print("Eesti keeles: ");
                String sõna = this.scanner.nextLine();
                System.out.print("Tõlge: ");
                String tõlge = this.scanner.nextLine();
                dictionary.add(sõna, tõlge);
            }
            else if(command.equals("translate")) {
                System.out.println("Tõlgitav sõna: ");
                String sõna = this.scanner.nextLine();
                System.out.println("Tõlge: ");
                translate(sõna);

            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }

    public HashMap<String, String> add(String key, String value) {
        //HashMap<String, String> sonad = new HashMap<String, String>();
        sonad.put(key, value);
        return sonad;
    }

    public String translate(String sisestus) {
        if(this.sonad.containsKey(sisestus)) {
            return sonad.get(sisestus);
        }
        else return null;
    }
}
