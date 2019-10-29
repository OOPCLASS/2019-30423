public class CurrentAccount extends Account {

    public Double overdraftLimit;

    public CurrentAccount(int number, double overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverDraft() {
        double currentBalance = this.getBalance();
        if (currentBalance < (overdraftLimit * -1)) {
            System.out.println("OverDraft Limit reached on account " + this.getAccountNumber() + " with " + (currentBalance + overdraftLimit));
        }
    }

    @Override
    public String toString() {
        return "Savings Account " + this.getAccountNumber() + ": " + "Balance = " + this.getBalance();
    }
}
