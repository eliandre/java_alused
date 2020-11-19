
public class Main {
    public static void main(String[] args) {

        Raamat raamat1 = new Raamat("Fedor Dostojevski", "Crime and Punishment", 2);
        Raamat raamat2 = new Raamat("Robert Martin", "Clean Code", 1);
        Raamat raamat3 = new Raamat("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(raamat1);
        System.out.println(raamat2);
        System.out.println(raamat3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(10);

        box.add(raamat1);
        box.add(raamat2);
        box.add(raamat3);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);

        Box box1 = new Box(20);
        box1.add(new Raamat("Oskar Luts", "Kevade", 2));
        box1.add(new Raamat("Lev Tolstoi", "Sõda ja rahu", 7));
        System.out.println(box1);
        box1.add(box);
        System.out.println(box1);
    }
}