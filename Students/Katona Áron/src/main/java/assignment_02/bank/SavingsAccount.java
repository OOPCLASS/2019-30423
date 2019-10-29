package assignment_02.bank;

/**
 * A class for savings accounts.
 * <p>
 * This class extends the Accounts class by being able to set an interest and to update the balance with it.
 */
public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * Increases the balance by the interest.
     */
    public void addInterest() {
        this.deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + " interest = " + interest;
    }
}
