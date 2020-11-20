import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> ostud;

    public ShoppingBasket() {
        this.ostud = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if(this.ostud.containsKey(product)) {
            this.ostud.get(product).increaseAmount();
        }
        else {
            this.ostud.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int summa = 0;
        for(Purchase p : this.ostud.values()) {
            summa += p.price();
        }
        return summa;
    }

    public void print() {
        for(Purchase p : this.ostud.values()) {
            System.out.println(p);
        }
    }
}
