package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    public boolean isOn() {
        for(Sensor sensor : this.sensors) {
            if(!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void on() {
        for(Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    public void off() {
        for(Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    public int measure() {
        if(!this.isOn() || sensors.isEmpty()) {
            throw new IllegalArgumentException("Sensorid on välja lülitatud või neid pole lisatud");
        }

        int sum = 0;
        for(Sensor sensor : this.sensors) {
            sum += sensor.measure();
        }
        int average = sum / this.sensors.size();
        return average;
    }
}
