
public class Bank extends Account{
	SavingsAccount bankSavingsAccounts[] = new SavingsAccount[20];
	CurrentAccount bankCurrentAccounts[] = new CurrentAccount[20];

	public Bank(int number) {
		super(number);
		SavingsAccount mySavingsAccount = new SavingsAccount(1);
		bankSavingsAccounts[1] = mySavingsAccount;
		CurrentAccount myCurrentAccount = new CurrentAccount(1);
		bankCurrentAccounts[1] = myCurrentAccount;
	}
	
	public void depositSavings(int accountNumber, double sum) {
		this.bankSavingsAccounts[accountNumber].deposit(sum);
	}
	
	public void depositCurrent(int accountNumber, double sum) {
		bankCurrentAccounts[accountNumber].deposit(sum);
	}
	
	public void getUpdateSavings(int accountNumber) {
		double balance = this.bankSavingsAccounts[accountNumber].getBalance();
		this.bankSavingsAccounts[accountNumber].deposit(balance * this.bankSavingsAccounts[accountNumber].interest);	
	}
	
	public void getUpdateCurrent(int accountNumber) {
		boolean overdraft = this.bankCurrentAccounts[accountNumber].overdraft();
		if(overdraft == true) {
			System.err.println("Your current account overdraft limit was reached. Please deposit a sum of money!");
		}
	}
}
