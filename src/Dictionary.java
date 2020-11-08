import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String,String> words;

    public Dictionary() {
        this.words = new HashMap<String,String>();
    }

    public String translate(String word) {
        if(!this.words.containsKey(word)) {
            return null;
        }
        else return words.get(word);
    }

    public int amountOfWords() {
        return this.words.size();
    }

    public ArrayList<String> translationLists() {
        return new ArrayList<String>(this.words.values());

    }

    public void add(String word, String translation) {
        this.words.put(word, translation);
    }

}
