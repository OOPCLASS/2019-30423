package Account;

public class SavingsAccount extends Account{
	private double interest;
	
	public SavingsAccount (int number) {
		this.interest = 0.0;
		this.number = number;
		this.balance = 0.0;
	}
	
	public double getInterest()
	{
		return interest;
	}
	
	public void addInterest (double interest) {
		if (interest > 0) {
			this.interest += interest;
		}	
		else {
			System.err.println("SavingsAccount.addInterest(...): cannot add negative interest.");
		}
	}
	
	@Override
	public String toString()
	{
		return "Account " + number + ": " + "balance = " + balance + ", interest = " + interest;
	}
}
