
public class CurrentAccount extends Account{

	private int number;
	private double balance;
	private double overdraftLimit;
	public CurrentAccount(int number) {
		super(number);
		this.overdraftLimit = 0.0;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraft(double overdraft) {
		overdraftLimit = overdraft;
	}
	@Override
	 public String toString() {
		    return "CurrentAccount " + getAccountNumber() + ": " + "balance = " + getBalance();
	}

}
