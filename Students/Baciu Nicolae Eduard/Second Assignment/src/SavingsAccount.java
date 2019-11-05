
public class SavingsAccount extends Account {
	
	private double interest;
	
	public SavingsAccount(int number) {
		super(number);
		this.interest = 0.0;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public void addInterest() {
		deposit(getBalance() * interest / 100);
	}
	
	public double getInterest() {
		return interest;
	}
}
