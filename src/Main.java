public class Main {
    public static void main(String[] args) {

        BoundedCounter counter = new BoundedCounter(14);

        System.out.println("Väärtus alguses: " + counter);

        int i = 0;
        while (i < 16) {
            counter.next();
            System.out.println("Väärtus: " + counter);
            i++;
        }
    }
}