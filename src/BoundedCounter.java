public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if(this.value < upperLimit) {
            this.value++;
        }
        else {
            this.value = 0;
        }
    }

    public String toString() {
        if(this.value < 10) {
            return "Väärtus: 0" + this.value;
        }
        else {
            return "Väärtus: " + this.value;
        }
    }
}
