package BDD_Task1;

public class ATM {
    private int cashDispensed;

    public void dispense(int amount) {
        this.cashDispensed = amount;
    }

    public int getCashDispensed() {
        return cashDispensed;
    }
}
