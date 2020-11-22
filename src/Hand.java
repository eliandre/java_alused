import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void sortAgainstSuit() {
        this.hand.sort(new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.cardsValue() - hand.cardsValue();
    }

    public int cardsValue() {
        int sum = 0;
        for(Card card : this.hand) {
            sum += card.getNumber();
        }

        return sum;
    }

    public void print() {
        for(Card card : hand) {
            System.out.println(card);
        }
    }
}
