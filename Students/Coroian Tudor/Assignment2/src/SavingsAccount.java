
public class SavingsAccount extends Account 
{
	private double interest; //in %
	
	public SavingsAccount(int number, double interest) 
	{
		super(number);
		this.interest = interest; 
	}
	
	public void addInterest()
	{
		deposit(getBalance() * (interest / 100));
	}
	@Override
	public String toString() 
	{
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + " and interest: " + interest;
	}

}
