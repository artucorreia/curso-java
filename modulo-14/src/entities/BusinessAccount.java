package entities;

public final class BusinessAccount extends Account{

    private Double loanLimit;
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit && amount > 0) {
            balance += amount - 10.00;
        }
    }

    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
