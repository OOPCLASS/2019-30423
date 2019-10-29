
public class SavingsAccount extends Account
{
	private double interest;

	
	public SavingsAccount(int number)
	{
		this.interest = 0.0;
		this.number = number;
		this.balance = 0.0;
	}	
	
	
	public void addInterest(double sum)
	{
		if (sum > 0)
		{
			interest += sum;
		}
		else
		{
			System.err.println("SavingsAccount.addInterest(...): cannot add negative interest value.");
		}
	}
	
	
	public double getInterest()
	{
		return interest;
	}
	
	
	@Override
	public String toString()
	{
		return "Account " + getAccountNumber() + ": " + "balance = " + getBalance() + ",\tinterest = " + getInterest();	
	}

}