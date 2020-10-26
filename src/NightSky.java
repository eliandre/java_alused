import java.util.Random;

public class NightSky {

    private double density;
    private double width;
    private double height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random rand = new Random();
        for(int i = 0; i < this.width; i++) {
            if(rand.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else System.out.print(" ");
        }
        System.out.println();
    }

    public void print() {
        for(int i = 0; i < this.height; i++) {
            this.printLine();
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
