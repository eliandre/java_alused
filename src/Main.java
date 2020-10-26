
public class Main {
    public static void main(String[] args) {

        NightSky NightSky = new NightSky(8, 4);

        NightSky.print();
        System.out.println("Tähtede arv: " + NightSky.starsInLastPrint());
        System.out.println();

        NightSky.print();
        System.out.println("Tähtede arv: " + NightSky.starsInLastPrint());

    }
}