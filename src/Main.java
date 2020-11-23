import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;
import moving.domain.Box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("pass", 2));
        things.add(new Item("hambahari", 1));
        things.add(new Item("raamat", 4));
        things.add(new Item("ketassaag", 8));

        Packer packer = new Packer(10);

        List<Box> boxes = packer.packThings(things);

        System.out.println("Kastide arv: " + boxes.size());

        for(Box box : boxes) {
            System.out.println("  asjade maht kastis: " + box.getVolume() + " dm^3");
        }
    }
}