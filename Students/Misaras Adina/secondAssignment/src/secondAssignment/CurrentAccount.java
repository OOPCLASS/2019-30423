package secondAssignment;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public CurrentAccount(int nr, double overdraftLimit) {
		super(nr);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	// Override
	public String toString() {
		return super.toString() + " Overdraft limit is " + overdraftLimit;
	}

}
