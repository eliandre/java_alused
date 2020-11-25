import application.AverageSensor;
import application.Sensor;
import application.Thermometer;

public class Main {
    public static void main(String[] args) {

        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("Temperatuur Helsinki piirkonnas on " + helsinkiArea.measure() + " kraadi.");
        System.out.println("Temperatuur Helsinki piirkonnas on " + helsinkiArea.measure() + " kraadi.");
        System.out.println("Temperatuur Helsinki piirkonnas on " + helsinkiArea.measure() + " kraadi.");

        System.out.println("Näidud: " + helsinkiArea.readings());
    }
}