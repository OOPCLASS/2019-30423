package assignment2;

import java.util.Vector;

public class Bank {
	public String bankName = "State-owned Bank";
	Vector<SavingsAccount> v1 = new Vector<SavingsAccount>();
	Vector<CurrentAccount> v2 = new Vector<CurrentAccount>();
	private double interest = 1.75;
	
	public Bank() {
	}
	
	public void addSavingsAccount(SavingsAccount myAcc)
	{
		v1.add(myAcc);
	}
	public void addCurrentAccount(CurrentAccount myAcc)
	{
		v2.add(myAcc);
	}
	public void update()
	{
		for(int i=0; i<v1.size(); i++)
		{
			var account = v1.get(i);
			account.addInterest(this.interest);
		}
		for(int i=0; i<v2.size(); i++)
		{
			var account = v2.get(i);
			var lastWithdraw = account.getLastWithdraw();
			var overdraft = account.getOverdraft();
			if(lastWithdraw > overdraft)
			{
				account.sendLetter();
			}
		}
	}
}
