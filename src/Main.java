
public class Main {

    public static void main(String[] args) {

        int vastus = least(10, 7);
        System.out.println("Väiksem on " + vastus);
    }

    public static int least(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        }
        else if (number1 < number2) {
            return number1;
        }
        else return number1;
    }

}