public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int startValue) {
        this.upperLimit = 59;
        this.value = startValue;
    }

    public void next() {
        if(this.value < this.upperLimit) {
            this.value++;
        }
        else {
            this.value = 0;
        }
    }

    public int getValue() {

        return this.value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public String toString() {
        if(this.value < 10) {
            return "0" + this.value;
        }
        else {
            return "" + this.value;
        }
    }
}
