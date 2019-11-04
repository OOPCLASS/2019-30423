package Bank;

public class SavingsAccount extends Account{
	
	private double interestRate = 0.02;
		
	public SavingsAccount(int number, int interestRate) {
		
		super(number);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		
		this.deposit(getBalance() * interestRate);
	}
}
