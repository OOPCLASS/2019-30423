package account;

public class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(int number, double interestRate) {
		super(number);
		this.interestRate = interestRate;
	}
	
	public void AddInterest() {
		this.deposit(this.getBalance() * this.interestRate);
	}
}
