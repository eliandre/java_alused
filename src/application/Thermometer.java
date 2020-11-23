package application;

public class Thermometer implements Sensor {

    private boolean state;

    public Thermometer() {
        this.state = true;
    }

    public boolean isOn() {
        return this.state;
    }

    public int measure() {
        if(!isOn()) {
            throw new IllegalStateException("Termomeeter on välja lülitatud!");
        }
        else return (int) (Math.random() * (30 - (-30)) + (-30));
    }

    public void on() {

    }

    public void off() {

    }
}
