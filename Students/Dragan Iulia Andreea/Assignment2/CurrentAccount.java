package assignment2;

public class CurrentAccount extends Account {

	private double overdraftLimit = 500.0;
	
	public CurrentAccount(int number) {
		super(number);
	}
	
	public double getOverdraft() {
		return this.overdraftLimit;
	}
	
	public boolean checkOverdraft() {
		if(this.getBalance() < 0 && this.getBalance() + this.overdraftLimit > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Current account " + getAccountNumber() + ": " + "balance = " + getBalance(); 
	}

	@Override
	public void withdraw(double sum) {
	      if (this.getBalance() - sum + this.overdraftLimit >= 0) {
	    	  super.withdraw(sum);
	      }
	      else {
	    	  System.err.println("Account.withdraw(...): overdraft limit reached.");
	      }
	  }
}
