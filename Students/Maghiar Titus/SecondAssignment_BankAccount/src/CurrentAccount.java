
public class CurrentAccount extends Account {

	public CurrentAccount(int number) {
		super(number);
	}

	private int overdraft_limit;
	public boolean status_overdraft=false;


	public int getOverdraft_limit() {
		return overdraft_limit;
	}

	public void setOverdraft_limit(int overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}

	public void withdraw(double sum) {
		if (sum > 0) {
			balance -= sum;
		} else if ((sum - balance) > overdraft_limit)
		{
			System.err.println("Account.withdraw(...):exceeds the overdraft limit.");
			status_overdraft=true;
		}
		else {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}
}
