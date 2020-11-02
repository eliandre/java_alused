import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> people = new HashMap<String, String>();

        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");

        System.out.println("Matti hüüdnimi on " + people.get("matti"));
    }
}