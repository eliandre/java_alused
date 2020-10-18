import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        Scanner scanner = new Scanner(System.in);

        System.out.print("sekundid: ");
        int s = Integer.parseInt(scanner.nextLine());
        System.out.print("minutid: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("tunnid: ");
        int h = Integer.parseInt(scanner.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            i++;
            if(seconds.getValue() == 0) {
                minutes.next();
                if(minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
}