
public class SavingsAccount extends Account{

	private int number;
	private double balance;
	private double interest;
	
	public SavingsAccount(int number) {
		super(number);
		this.interest = 0.0;
	}
	
	public void setInterest(double percent) {
		if(percent > 0) {
			this.interest = percent;
		}
			
		else
			System.err.println("Cannot have negative interest !");
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void addInterestToBalance() {
		balance += balance * (interest / 100);
	}
	@Override
	 public String toString() {
		    return "SavingsAccount " + getAccountNumber() + ": " + "balance = " + getBalance();
	}
}
