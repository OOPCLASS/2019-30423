package bank;

import java.lang.IllegalArgumentException;

public class CurrentAccount extends Account {

    private double overdraftLimit = -500;


    public CurrentAccount(int number) {
        super(number);
    }

    public CurrentAccount(int number, double overdraftLimit) throws IllegalArgumentException {
        super(number);
        if (overdraftLimit > 0) {
            throw new IllegalArgumentException("overdraftLimit must be <= 0");
        }
        this.overdraftLimit = overdraftLimit;
    }


    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit < 0)
            this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }


    public boolean isOverdrawn() {

        return super.getBalance() < 0;
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0 && super.getBalance() - sum >= overdraftLimit) {
            super.withdraw(sum);
        }
    }

    @Override
    public String toString() {
        return "Current Account " + super.getAccountNumber() + ": balance = " + super.getBalance() +
                ": overdraftLimit = " + overdraftLimit;
    }
}
