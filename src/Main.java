import application.ConstantSensor;
import application.Thermometer;

public class Main {
    public static void main(String[] args) {

        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println(ten.measure());
        System.out.println(minusFive.measure());

        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn());

        Thermometer termo = new Thermometer();
        termo.isOn();
        System.out.println(termo.measure());
    }
}