import java.util.HashMap;

public class Card implements Comparable<Card> {

    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    private int number;
    private int suit;

    public Card(int number, int suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return this.number;
    }

    public int getSuit() {
        return this.suit;
    }

    public String toString() {
        HashMap<Integer, String> suitMap = new HashMap<Integer, String>();
        suitMap.put(0, "Spades");
        suitMap.put(1, "Diamonds");
        suitMap.put(2, "Hearts");
        suitMap.put(3, "Clubs");
        
        HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
        numberMap.put(11, "J");
        numberMap.put(12, "Q");
        numberMap.put(13, "K");
        numberMap.put(14, "A");

        String cardValue = "" + this.number;

        if(this.number == 11) {
            cardValue = numberMap.get(11);
        }
        if(this.number == 12) {
            cardValue = numberMap.get(12);
        }
        if(this.number == 13) {
            cardValue = numberMap.get(13);
        }
        if(this.number == 14) {
            cardValue = numberMap.get(14);
        }

        if(this.suit == 0) {
            return cardValue + " of " + suitMap.get(0);
        }
        else if (this.suit == 1) {
            return cardValue + " of " + suitMap.get(1);
        }
        else if (this.suit == 2) {
            return cardValue + " of " + suitMap.get(2);
        }
        else return cardValue + " of " + suitMap.get(3);
    }

    @Override
    public int compareTo(Card card) {
        if(this.number == card.getNumber()) {
            return this.suit - card.getSuit();
        }
        return this.number - card.getNumber();
    }
}
