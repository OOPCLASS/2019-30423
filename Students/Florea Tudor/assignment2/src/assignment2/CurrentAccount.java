package assignment2;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public CurrentAccount(int number, double overdraftLimit) {
		super(number);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public boolean overdrafCheck() {
		return (this.getOverdraftLimit() > this.getBalance()) ? true : false;
	}

	// @Override here
	public String toString() {
		return super.toString() + " overdraft limit =" + overdraftLimit;
	}

}
