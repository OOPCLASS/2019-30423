
public class CurrentAccount extends Account {

	private double overdraft;

	public CurrentAccount(int number) {
		super(number);
		this.overdraft = 1000;
	}

	public void setOverdraftLimit(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraftLimit() {
		return overdraft;
	}

	public void withdraw(double sum) {
		double newBalance = this.getBalance();
		if (sum > 0) {
			if (newBalance + overdraft > 0) {
				if(newBalance>0) {
					super.withdraw(newBalance);
				}
				newBalance -= sum;
				if (newBalance <= 0) {
					overdraft += newBalance;
					newBalance = 0;

				} else {
					super.deposit(newBalance);
				}
			} else {
				System.err.println("Account.withdraw(...): cannot withdraw as you've exceeded your overdraft limit.");
			}
		} else {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}

	public void deposit(double sum) {
		double newBalance = this.getBalance();
		if (sum > 0) {
			if (newBalance == 0) {
				overdraft += sum;
				if (overdraft > getOverdraftLimit()) {
					newBalance = overdraft - getOverdraftLimit();
					super.deposit(newBalance);
					overdraft = getOverdraftLimit();
				}
			} else {
				newBalance =this.getBalance()+ sum;
				super.deposit(newBalance);
			}

		} else {
			System.err.println("Account.deposit(...): cannot deposit negative amount.");
		}
	}
	
	 public String toString() {
		 return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ", overdraft= " + overdraft;
		  }
}
