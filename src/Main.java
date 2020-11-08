import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        dictionary.add("ahv", "monkey");
        dictionary.add("banaan", "banana");
        dictionary.add("klavessiiv", "harpsichord");

        System.out.println(dictionary.translate("ahv"));
        System.out.println(dictionary.translate("lammas"));
        System.out.println(dictionary.amountOfWords());

        dictionary.add("aken", "window");
        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationLists();
        for (String translation : translations) {
            System.out.println(translation);
        }

        Scanner scanner = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(scanner, dict);
        ui.start();
    }
}