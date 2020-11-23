import moving.domain.Item;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("pass", 2));
        items.add(new Item("hambahari", 1));
        items.add(new Item("ketassaag", 100));

        Collections.sort(items);
        System.out.println(items);
    }
}