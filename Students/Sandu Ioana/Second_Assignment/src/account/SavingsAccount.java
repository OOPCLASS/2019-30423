package account;

public class SavingsAccount extends Account {
	
	public double interest;
	
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
	
	public void addInterest() {
		deposit(getBalance() * (interest/100));
	}
	
	@Override
	public String toString() {
	    return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + " and interest = " + interest;
	} 
	
}