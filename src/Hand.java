import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void print() {
        for(Card card : hand) {
            System.out.println(card);
        }
    }
}
