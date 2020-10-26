import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        copied[0] = 99;

        System.out.println("Originaal: " + Arrays.toString(original));
        System.out.println("Kopeeritud: " + Arrays.toString(copied));
        System.out.println("Tagurpidi: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] uus = new int[array.length];
        for(int i = 0; i < uus.length; i++) {
            uus[i] = array[i];
        }
        return uus;
    }

    public static int[] reverseCopy(int[] array) {
        int[] uus = new int[array.length];
        int j = 0;
        for(int i = array.length; i > 0; i--, j++) {
            uus[j] = array[i-1];
        }
        return uus;
    }
}