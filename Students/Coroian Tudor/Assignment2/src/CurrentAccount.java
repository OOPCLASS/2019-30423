
public class CurrentAccount extends Account
{
	private double overdraftLimit;

	public CurrentAccount(int number, double overdraftLimit) 
	{
		super(number);
		this.overdraftLimit = overdraftLimit;
	}
	public double getOverdraft()
	{
		return overdraftLimit;
	}
	@Override
	public String toString() 
	{
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + " and overdraftLimit: " + overdraftLimit;
	}

}
