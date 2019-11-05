
public class CurrentAccount extends Account
{
	private double overdraftLimit;
	
	
	public CurrentAccount(int number)
	{
		overdraftLimit = 0.0;
		this.number = number;
		this.balance = 0.0;
	}
	
	
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	
	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	
	
	@Override
	public String toString()
	{
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ",\toverdraft limit = " + getOverdraftLimit();	
	}
	
}
