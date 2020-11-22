import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Card esimene = new Card(2, Card.DIAMONDS);
        Card teine = new Card(14, Card.CLUBS);
        Card kolmas = new Card(12, Card.HEARTS);
        Card neljas = new Card(2, Card.CLUBS);

        System.out.println(esimene);
        System.out.println(teine);
        System.out.println(kolmas);
        System.out.println(neljas);

        List<Card> cards = new ArrayList<Card>();
        cards.add(esimene);
        cards.add(teine);
        cards.add(kolmas);
        cards.add(neljas);
        Collections.sort(cards);
        System.out.println(cards);
    }
}