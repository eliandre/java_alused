import java.util.Scanner;

public class GuessingGame {

    private Scanner scanner;

    public GuessingGame() {
        this.scanner = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        int i = 0;
        while (i <= howManyTimesHalvable(upperLimit - lowerLimit)) {
            if(lowerLimit == upperLimit) {
                break;
            }

            if(this.isGreaterThan(this.average(upperLimit, lowerLimit))) {
                lowerLimit = this.average(lowerLimit, upperLimit);
            }
            else {
                upperLimit = this.average(lowerLimit, upperLimit);
            }
            i++;
        }
        System.out.println("Arv, millele mõtlesid on " + upperLimit + ".");
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Mõtle arvule vahemikus " + lowerLimit + "-" + upperLimit + ".");
        System.out.println("Luban, et suudan arvu ära arvata " + maxQuestions + " küsimusega.");
        System.out.println("");
        System.out.println("Esitan rea küsimusi. Vasta nendele ausalt.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Kas arv on suurem kui " + value + "? (y/n)");

        if(this.scanner.nextLine().equals("y")) {
            return true;
        }
        else return false;
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

}
