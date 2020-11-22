
public class Main {
    public static void main(String[] args) {

        Hand hand1 = new Hand();
        hand1.add(new Card(2, Card.SPADES));
        hand1.add(new Card(14, Card.CLUBS));
        hand1.add(new Card(12, Card.HEARTS));
        hand1.add(new Card(2, Card.CLUBS));

        Hand hand2 = new Hand();
        hand2.add(new Card(11, Card.DIAMONDS));
        hand2.add(new Card(11, Card.CLUBS));
        hand2.add(new Card(11, Card.HEARTS));

        int comparsion = hand1.compareTo(hand2);

        if(comparsion < 0) {
            System.out.println("Väärtuslikeim käsi sisaldab kaarte:");
            hand2.print();
        }
        else if (comparsion > 0) {
            System.out.println("Väärtuslikeim käsi sisaldab kaarte:");
            hand1.print();
        }
        else System.out.println("Käed on sama väärtusega.");
    }
}