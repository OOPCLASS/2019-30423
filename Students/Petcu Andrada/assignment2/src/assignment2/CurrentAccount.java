package assignment2;

public class CurrentAccount extends Account {
	private double overdraft = 2000.00;
	private double lastWithdraw = 0.0;
	
	public CurrentAccount(String accountOwner) {
		super(accountOwner);
	}
	
	protected void sendLetter()
	{
		System.out.println(String.format(this.owner + ", you have exceeded overdraft!"));
	}
	
	public double getLastWithdraw()
	{
		return lastWithdraw;
	}
	public double getOverdraft()
	{
		return overdraft;
	}
	@Override
	public Double withdraw(double moneyWithdraw) {
		lastWithdraw = moneyWithdraw;
		if(moneyWithdraw > overdraft)
		{
			return 0.0;
		}
		if(money > moneyWithdraw)
		{
			money = money - moneyWithdraw;
			return money;
		}
		else
		{
			System.out.println("Not enough funds!");
			return 1.0;
		}
		
	}

}
