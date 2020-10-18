import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();

    }

    public String createPassword() {
        int i = 0;
        String parool = "";
        while(i < this.length) {
            int arv = this.random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(arv);
            parool += symbol;
            i++;
        }
        return parool;
    }
}
