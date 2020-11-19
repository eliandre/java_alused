
public class CivilService implements NationalService {

    int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if(daysLeft > 1) {
            daysLeft--;
        }
    }
}
