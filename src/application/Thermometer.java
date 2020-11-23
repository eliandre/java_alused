package application;

public class Thermometer implements Sensor {

    public boolean isOn() {
        return false;
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
