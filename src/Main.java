import dictionary.MindfulDictionary;

public class Main {
    public static void main(String[] args)  throws Exception {

        MindfulDictionary dict = new MindfulDictionary();
        dict.add("ahv", "monkey");
        dict.add("banaan", "banana");
        dict.add("programmeerimine", "programming");
        dict.remove("ahv");
        dict.remove("banana");

        System.out.println( dict.translate("ahv") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("banana") );
        System.out.println( dict.translate("banaan") );
        System.out.println( dict.translate("programmeerimine") );
    }
}