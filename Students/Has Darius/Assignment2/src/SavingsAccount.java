public class SavingsAccount extends Account {

	private Integer interest;

	public SavingsAccount(int number) {
		super(number);
		this.interest = 0;
	}

	public Integer getInterest() {
		return this.interest;
	}

	public void setInterest(Integer interest) {
		if (interest <= 25) {
			this.interest = interest;
		}
	}

	@Override
	public void deposit(double sum) {
		if (sum > 0) {
			super.deposit(sum);
			super.deposit(interest/100+getBalance());
		} else {
			System.err.println("Account.deposit(...): cannot deposit negative amount.");
		}
	}

	public String toString() {
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ", interest= " + interest;
	}
}
