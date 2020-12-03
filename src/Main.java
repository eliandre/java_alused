import dictionary.MindfulDictionary;

public class Main {
    public static void main(String[] args)  throws Exception {

        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println(dict.translate("ahv"));
        System.out.println(dict.translate("programmeerimine"));
        System.out.println(dict.translate("allpool"));
    }
}