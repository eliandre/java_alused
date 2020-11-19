import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> list;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;

        for(ToBeStored kaal : list) {
            weight += kaal.weight();
        }

        return weight;
    }

    public void add(ToBeStored object) {
        if(object.weight() + weight() < maxWeight) {
            list.add(object);
        }
    }

    public String toString() {
        return "Kast: " + list.size() + " eset, " + "kogukaal on " + this.weight() + " kg";
    }
}
