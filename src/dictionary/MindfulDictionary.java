package dictionary;

import java.util.HashMap;

public class MindfulDictionary {

    private HashMap<String, String> estEng;
    private HashMap<String, String> engEst;

    public MindfulDictionary() {
        this.estEng = new HashMap<>();
        this.engEst = new HashMap<>();
    }

    public void add(String word, String translation) {
        if(!this.estEng.containsKey(word)) {
            this.estEng.put(word, translation);
        }

        if(!this.engEst.containsKey(word)) {
            this.engEst.put(word, translation);
        }
    }

    public String translate(String word) {
        if(this.estEng.containsKey(word)) {
            return this.estEng.get(word);
        }

        if(this.engEst.containsKey(word)) {
            return this.engEst.get(word);
        }

        return null;
    }
}
