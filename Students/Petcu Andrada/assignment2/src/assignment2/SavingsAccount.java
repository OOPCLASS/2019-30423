package assignment2;

public class SavingsAccount extends Account {
	private Double interest = 0.0;
	
	public SavingsAccount(String accountOwner) {
		super(accountOwner);
	}
	
	protected void addInterest(Double interest)
	{
		this.interest = interest;
		this.money = this.money + this.money * this.interest / 100;
	}
	
	@Override
	public Double deposit(Double moneyDeposit) {
		this.money = this.money +  moneyDeposit;
		this.money = this.money + this.money * this.interest / 100;
		return this.money;
	}


}
