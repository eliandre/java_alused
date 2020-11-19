
public class MilitaryService implements NationalService {

    int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if(daysLeft > 1) {
            daysLeft--;
        }
    }
}
