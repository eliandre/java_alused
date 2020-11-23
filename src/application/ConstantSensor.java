package application;

public class ConstantSensor implements Sensor {

    private int temperature;

    public ConstantSensor(int temperature) {
        this.temperature = temperature;
    }

    public boolean isOn() {
        return true;
    }

    public void on() {

    }

    public void off() {

    }

    public int measure() {
        return this.temperature;
    }
}
