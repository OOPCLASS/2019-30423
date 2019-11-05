
public class CurrentAccount extends Account {
	
	private double overdraftLimit;
	
	private boolean overdraftFlag;
	
	public CurrentAccount(int number) {
		super(number);
		this.overdraftLimit = 100;
		overdraftFlag = false;
	}
	
	public boolean getOverdraftFlag() {
		return overdraftFlag;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		
		if(getBalance() < overdraftLimit)
			overdraftFlag = true;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
}
