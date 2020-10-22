public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconimical(double cashGiven) {
        double economicalPrice = 2.50;
        if(cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        }
        else return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        double guormetPrice = 4.00;
        if(cashGiven >= guormetPrice) {
            this.cashInRegister += guormetPrice;
            this.gourmetSold++;
            return cashGiven - guormetPrice;
        }
        else return cashGiven;
    }

    public String toString() {
        return "Raha on kassas " + cashInRegister + ", ökonoomseid lõunaid on müüdud " + economicalSold +
                ", gurmeelõunaid on müüdud " + gourmetSold;
    }
}
