import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    ArrayList<Integer> list = new ArrayList<Integer>();

    public NumberStatistics() {
    }

    public void addNumber(int number) {
        list.add(number);
    }

    public int amountOfNumbers() {
        this.amountOfNumbers = list.size();
        return this.amountOfNumbers;
    }

    public int sum() {
        int i = 0;
        for(int number : list) {
            i += number;
        }
        return i;
    }

    public double average() {
        return sum() / (double) amountOfNumbers();
    }
}
