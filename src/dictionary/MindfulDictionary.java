package dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MindfulDictionary {

    private HashMap<String, String> estEng;
    private HashMap<String, String> engEst;
    private File file;
    private Writer writer;

    public MindfulDictionary() {
        this.estEng = new HashMap<>();
        this.engEst = new HashMap<>();
    }

    public MindfulDictionary(String file) throws IOException {
        this();
        this.file = new File(file);
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

    public boolean load() {
        try {
            Scanner scanner = new Scanner(this.file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.estEng.put(parts[0], parts[1]);
                this.engEst.put(parts[1], parts[0]);
            }

            return true;
        }

        catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean save() {
        try {
            writer = new FileWriter(this.file);
            for(String key : this.estEng.keySet()) {
                writer.write(key + ":" + this.estEng.get(key) + "\n");
            }
            writer.close();
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }

}
