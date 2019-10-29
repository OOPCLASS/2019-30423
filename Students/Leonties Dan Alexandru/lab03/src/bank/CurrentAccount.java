package bank;

public class CurrentAccount extends Account {
	
	public int overdraft;

	public CurrentAccount(int number) {
		super(number);
		this.overdraft = 500;
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double sum) {

		if (getBalance() + overdraft < sum) {
			System.out.println("Impossible transaction for account " + (int) this.getAccountNumber()
					+ ", overdraft limit reached");
		} else
			super.withdraw(sum);
	}

	@Override
	public String toString() {
		return " Account Current " + (int) getAccountNumber() + " overdraft limit = " + overdraft + ", Balance = "
				+ getBalance();
	}

	public boolean checkOverdraft() {
		if (this.getBalance() + overdraft > 0) {
			return false;
		} else {
			return true;
		}
	}

}