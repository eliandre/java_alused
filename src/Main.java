
public class Main {

    public static void main(String[] args) {
        printStars(3);
        printStars(5);
        printStars(9);
        System.out.println();
        printSquare(6);
        System.out.println();
        printRectangle(17, 3);
        System.out.println();
        printTriangle(4);
    }

    public static void printStars(int kogus) {
        int i = 0;
        while (i < kogus) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int kyljePikkus) {
        int i = 0;
        while (i < kyljePikkus) {
            printStars(kyljePikkus);
            i++;
        }
    }

    public static void printRectangle(int laius, int korgus) {
        int i = 0;
        while (i < korgus) {
            printStars(laius);
            i++;
        }
    }

    public static void printTriangle(int suurus) {
        int i = 0;
        int y = 1;
        while (i < suurus) {
            printStars(y);
            i++;
            y++;
        }
    }
}
