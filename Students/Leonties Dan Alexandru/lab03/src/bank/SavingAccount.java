package bank;

public class SavingAccount extends Account {
	
	private double interest;
	 
	
	
	public void addInterest()
	 {
		 this.deposit(interest) ;
	 }

	 
	public SavingAccount(int number, double interest)
	{
		
		super(number);
		this.interest = interest;
	
	}
	 
	@Override
	public String toString()
	{
		
		return "SavingAccount{" + "interest = " + interest + ", " + super.toString() + "} ";
		
		
	}
}
