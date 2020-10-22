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

    public boolean payEconimical(LyyraCard card) {
        double economicalPrice = 2.50;
        if(card.balance() >= economicalPrice) {
            card.pay(economicalPrice);
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double guormetPrice = 4.00;
        if(card.balance() >= guormetPrice) {
            card.pay(guormetPrice);
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Raha on kassas " + cashInRegister + ", ökonoomseid lõunaid on müüdud " + economicalSold +
                ", gurmeelõunaid on müüdud " + gourmetSold;
    }
}
