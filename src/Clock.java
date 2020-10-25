public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginnings, int minutesAtBeginnings, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginnings);
        this.minutes = new BoundedCounter(minutesAtBeginnings);
        this.seconds = new BoundedCounter(secondsAtBeginning);
    }

    public void tick() {
        if(this.seconds.getValue() == 59) {
            if(this.minutes.getValue() == 59) {
                if(this.hours.getValue() == 23) {
                    this.hours.setValue(0);
                }
                else {
                    this.hours.next();
                }
            }
            this.minutes.next();
            this.seconds.next();
        }
        else {
            this.seconds.next();
        }
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
