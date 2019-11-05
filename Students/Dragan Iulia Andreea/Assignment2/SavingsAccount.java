package assignment2;

public class SavingsAccount extends Account {

	private double interest = 10.0; 
	
	public SavingsAccount(int number) {
		super(number);
	}
	
	public void addInterest() {
		deposit(getBalance() * interest / 100);
	}
	
	@Override
	public String toString() {
		return "Savings account " + getAccountNumber() + ": " + "balance = " + getBalance(); 
	}
	
}
