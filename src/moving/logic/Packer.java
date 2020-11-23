package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.List;

public class Packer {

    private int boxesVolume;
    private List<Box> boxes;
    private Box box;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        for(Thing thing : things) {
            this.boxes.add(box);
        }
        return boxes;
    }
}
