package bank;

public class SavingAccount extends Account {

    private double interest = 0.09;

    public SavingAccount(int number) {
        super(number);
    }

    public void addInterestToBalance() {
        if (super.getBalance() > 0) {
            super.deposit(super.getBalance() * interest);
        }
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Saving Account " + super.getAccountNumber() + ": balance = " + super.getBalance() + ": interest= " + interest;
    }
}
