import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;

public class Main {
    public static void main(String[] args) throws Exception {

        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Praegune duplikaatide arv: " + remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Praegune duplikaatide arv: " + remover.getNumberOfDetectedDuplicates());
        System.out.println("Unikaalsed sõned: " + remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Praegune duplikaatide arv: " + remover.getNumberOfDetectedDuplicates());
        System.out.println("Unikaalsed sõned: " + remover.getUniqueCharacterStrings());
    }
}