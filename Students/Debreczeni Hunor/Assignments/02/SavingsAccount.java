public class SavingsAccount extends Account {
    private Double interest;

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public void addInterest() {
        this.deposit(interest);
    }

    @Override
    public String toString() {
        return "Savings Account " + this.getAccountNumber() + ": " + "balance = " + this.getBalance();
    }
}
