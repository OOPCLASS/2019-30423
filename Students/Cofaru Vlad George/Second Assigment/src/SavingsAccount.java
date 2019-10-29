
public class SavingsAccount extends Account {

	public double interes;

	public SavingsAccount(int number, double interes) {
		super(number);
		this.interes = interes;

	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void addInteres() {

		this.deposit(this.getBalance() * (interes / 100));
	}

	@Override
	public String toString() {
		return " Account Saving " + (int) getAccountNumber() + " interes= " + interes + ", Balance = " + getBalance();
	}

}
