package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> characterSet;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.characterSet = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterString) {
        if(this.characterSet.contains(characterString)) {
            this.duplicates++;
        }
        this.characterSet.add(characterString);
    }

    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    public Set<String> getUniqueCharacterStrings() {
        return this.characterSet;
    }

    public void empty() {
        this.duplicates = 0;
        this.characterSet.clear();
    }

}
