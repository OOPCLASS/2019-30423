package accounts;

public class SavingsAccount extends Account{

    private Double interestRate = 0.0;

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interestRate=interest;
    }

    public void setInterest(Double interestAdded) {
        if(interestAdded > 0) {
            this.interestRate = interestAdded;
        }
        else {
            System.err.println("Cannot set negative interest");
        }
    }

    protected void addInterest() {
        this.deposit(this.getBalance() * (interestRate/100) );
    }
    public String toString() {
        return "SavingsAccount{" + "interest = " + interestRate + ", " + super.toString() + "} ";
    }
}