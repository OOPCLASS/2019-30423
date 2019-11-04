
public class CurrentAccount extends Account{
	public boolean overdraftLimit;
	
	public CurrentAccount(int number) {
		super(number);
		this.overdraftLimit = false;
	}
	
	public boolean overdraft() {
		this.overdraftLimit = false;
		if(this.getBalance() < 0) {
			this.overdraftLimit = true;
		}
		return this.overdraftLimit;
	}
	
}
