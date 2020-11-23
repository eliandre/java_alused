import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;

public class Main {
    public static void main(String[] args) {

        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("Temperatuur Kumpulas on " + kumpula.measure() + " kraadi.");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("Temperatuur Helsinki piirkonnas on " + helsinkiArea.measure() + " kraadi.");
    }
}