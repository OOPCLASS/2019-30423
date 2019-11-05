package assignment2;

public class Account {
	protected String owner;
	protected Double money = 0.00;

	public Account(String accountOwner) {
		setOwner(accountOwner);
		System.out.println(String.format("%s", "New account created for " + owner));
	}
	public String getOwner() {
		return owner;
	}
	private void setOwner(String newOwner) {
		this.owner = newOwner;
	}
	public Double deposit(Double moneyDeposit) {
		return this.money = this.money +  moneyDeposit;
	}
	public Double withdraw(double moneyWithdraw) {
		if(money > moneyWithdraw)
		{
			money = money - moneyWithdraw;
			return money;
		}
		else
		{
			System.out.println("Not enough funds!");
			return 0.0;
		}
	}
	public void printUpdates() {
		System.out.println(String.format(owner + "'s account status after updates: " + money + " lei"));
	}
}
