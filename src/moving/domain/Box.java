package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> itemList;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        this.itemList = new ArrayList<Thing>();
        if(this.getVolume() > thing.getVolume()) {
            this.itemList.add(thing);
            return true;
        }
        return false;
    }

    public int getVolume() {
        int totalVolume = 0;
        for(Thing thing : this.itemList) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }
}
