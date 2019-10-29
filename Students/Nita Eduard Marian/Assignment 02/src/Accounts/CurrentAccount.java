package Accounts;

public class CurrentAccount extends Account{
	
	private double overdraftLimit = 100.0; //private so that no malicious outside input can modify it
	
	public CurrentAccount(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public void setOverdraft(double overdraft) { //setter method
		if(overdraft > 0) {
			this.overdraftLimit = overdraft;
		}else {
			System.err.println("Cannot set negative overdraft"); 
		}
	}
	
	@Override
	public void withdraw(double sum) { // method checks if transaction can be made if overdraftLimit not reached
		if(this.getBalance() - sum > -overdraftLimit) {
			super.withdraw(sum); //first checks if withdraw can be made under CurrentAccount rules, then calls basic function
		}
		else {
			System.out.println("Cannot withdraw money, overdraft limit reached");
		}
	}
	
	protected boolean checkOverdraft() { // consider overdraft as an account balance in the range of (-overdraftLimit, 0)
		if(this.getBalance() > -overdraftLimit && this.getBalance() < 0) { 
			return true;
		}else {
			return false;
		}
	}
	
	

}
