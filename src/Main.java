
public class Main {
    public static void main(String[] args) {

        int n = 10;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i > j) {
                    System.out.print(n - 1 - i);
                }
                else System.out.print(n - 1 - j);
            }
            System.out.println();
        }
    }
}