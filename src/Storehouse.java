import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> toodeteHinnad;
    private Map<String, Integer> toodeteKogus;

    public Storehouse() {
        toodeteHinnad = new HashMap<>();
        toodeteKogus = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        toodeteHinnad.put(product,price);
        toodeteKogus.put(product,stock);
    }

    public int price(String product) {
        if(toodeteHinnad.containsKey(product)) {
            return toodeteHinnad.get(product);
        }
        else return -99;
    }

    public int stock(String product) {
        if(toodeteKogus.containsKey(product)) {
            return toodeteKogus.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if(toodeteKogus.containsKey(product) && toodeteKogus.get(product) > 0) {
            toodeteKogus.put(product, toodeteKogus.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return toodeteKogus.keySet();
    }
}
