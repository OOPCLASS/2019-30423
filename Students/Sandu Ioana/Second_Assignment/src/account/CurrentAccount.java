package account;

public class CurrentAccount extends Account{
	
	public double overdraft;
	
	public CurrentAccount(int number, double overdraft) {
		super(number);
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	
	public void setOverdraft(double overdraft){
		this.overdraft = overdraft;
	}
	
	public boolean hasOverdraft() {
		if(getBalance() < overdraft)
			return true;
		return false;
	}
	
	public void sendLetter() {
		System.out.println("Warning, overdraft exceded for account " + (int)getAccountNumber());
	}
	
	@Override
	public String toString() {
	    return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + " and overdraft = " + overdraft;
	}
}
 