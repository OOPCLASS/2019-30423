package Accounts;

public class SavingsAccount extends Account{

	private Double interestRate = 0.0; //private so that no malicious outside input can modify it

	public SavingsAccount(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public void setInterest(Double interestAdded) { //setter method
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
	
}
