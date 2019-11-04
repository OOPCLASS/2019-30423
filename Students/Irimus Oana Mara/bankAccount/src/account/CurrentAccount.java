package account;

public class CurrentAccount extends Account {
	public int overdraftLimit;
	
	public CurrentAccount(int number, int overdraftLimit) {
		super(number);
		this.overdraftLimit = overdraftLimit;		
	}
	
	public void isOverdrafted() {
		if (this.getBalance() + overdraftLimit < 0) {
			System.out.println("Overdrafted");
		}
		else {
			System.out.println("Not overdrafted");
		}
	}
	
	
}
