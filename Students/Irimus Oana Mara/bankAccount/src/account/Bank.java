package account;

public class Bank {
	Account[] accounts = new Account[10];
	SavingsAccount[] savings = new SavingsAccount[10];
	CurrentAccount[] current = new CurrentAccount[10];
	
	private int accIdx = 0;
	private int savIdx = 0;
	private int curIdx = 0;
	
	public void addAccount(int type) {
		
		if(type ==  0) {	
			Account acc = new Account(accIdx);
			accounts[accIdx++] = acc;
		}
		
		if(type == 1) {
			SavingsAccount sav = new SavingsAccount(savIdx+10, 0.02);
			savings[savIdx++] = sav;
		}
		
		if(type == 2) {
			CurrentAccount cur = new CurrentAccount(curIdx+20, 500);
			current[curIdx++] = cur;
		}
	}
	

}
