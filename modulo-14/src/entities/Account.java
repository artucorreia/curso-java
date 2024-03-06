package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if(amount < balance && amount > 0) {
            balance -= amount + 5.0;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
}
