package secondAssignment;

public class SavingsAccount extends Account {

	private double interest;

	public SavingsAccount(int nr, double interest) {
		super(nr);
		this.interest = interest;
	}

	public void addInterest() {
		this.deposit(interest);
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	// Override
	public String toString() {
		return super.toString() + " Interest is " + interest;
	}

}
