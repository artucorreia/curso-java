package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder) {
        this.number = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double initialDeposit) {
        this.number = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() { return number; }

    public String getHolder() { return holder; }

    public void setHolder(String holder) { this.holder = holder; }

    public double getBalance() { return balance; }

    public void deposit(double depositValue) {
        balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        balance -= (withdrawValue + 5.00);
    }

    public String toString() {
        return "Account " +
                number +
                ", Holder: " +
                holder +
                ", Balance: $ " +
                String.format("%.2f", balance);
    }
}
