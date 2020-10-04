
public class Main {

    public static void main(String[] args) {

        double vastus = average(4, 3, 6, 1);
        System.out.println("Arvude keskmine on " + vastus);

    }

    public static int summa(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static double average(int number1, int number2, int number3, int number4){
        int kokku = summa(number1, number2, number3, number4);
        return (double) kokku / 4;
    }

}