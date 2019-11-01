package bankAccount;

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

	@Override
	public String toString() {
		return  "CurrentAccount " + getAccountNumber() + ": " + "balance = " + getBalance() + ", overdraftLimit: " + overdraftLimit;
	}

	

	public boolean checkOverdraft() {
		if(this.getBalance() + overdraftLimit > 0) {
			return true;
		}
		return false;
	}
	
	

}
