package assignment_02.bank;

/**
 * A class for savings accounts.
 * <p>
 * This class extends the Accounts class by being able to set an overdraft limit and to check if the account is in overdraft.
 */
public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int number, double overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Checks if the account is in overdraft.
     *
     * @return true if the balance is smaller then the overdraft limit
     */
    public boolean isInOverdraft() {
        return this.getBalance() < this.getOverdraftLimit();
    }

    @Override
    public String toString() {
        return super.toString() + " overdraftLimit = " + overdraftLimit;
    }
}

