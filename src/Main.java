import dictionary.MindfulDictionary;

public class Main {
    public static void main(String[] args)  throws Exception {

        MindfulDictionary dict = new MindfulDictionary();
        dict.add("ahv", "monkey");
        dict.add("banaan", "banana");
        dict.add("ahv", "apfe");

        System.out.println(dict.translate("ahv"));
        System.out.println(dict.translate("monkey"));
        System.out.println(dict.translate("programming"));
        System.out.println(dict.translate("banana"));
    }
}