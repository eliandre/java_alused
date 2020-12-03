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

        if(!this.engEst.containsKey(translation)) {
            this.engEst.put(translation, word);
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

    public void remove(String word) {
        if(this.estEng.containsKey(word)) {
            String translation = this.estEng.get(word);
            this.estEng.remove(word);
            this.engEst.remove(translation);
        }

        if(this.engEst.containsKey(word)) {
            String translation = this.engEst.get(word);
            this.engEst.remove(word);
            this.estEng.remove(translation);
        }
    }
}
