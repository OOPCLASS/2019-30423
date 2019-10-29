package bank;

public class Bank {

	protected int recentAccount = 0;
	private final int Divident_Val = 65;
	private final int ValueChange = 500;
	
	Account[] accounts = new Account[100];
	
	
	public void openAccount(int typeAcc)
	{
		switch(typeAcc) {
		
		case 1:
				
				accounts[recentAccount++] = new Account(recentAccount - 1);
				break;
		
		case 2:
			
				accounts[recentAccount++] = new SavingAccount(recentAccount - 1, 50);
				break;
				
		case 3:
			
				accounts[recentAccount++] = new CurrentAccount(recentAccount - 1);
				break;
		
		}
		
	}
	
	public void updateBank()
	{
		
		for(int i = 0; i < recentAccount; i++)
		{
			if(accounts[i] instanceof SavingAccount)
			{
				((SavingAccount)accounts[i]).addInterest();
			}
			
			else if(accounts[i] instanceof CurrentAccount)
				if(((CurrentAccount)accounts[i]).checkOverdraft())
				{
					System.out.println( "Text message sent to user " + accounts[i].getAccountNumber() + ", surpassed overdraft limit ");
				}
			
		}
	}
	
	public void printAccounts()
	{
		
		if (recentAccount == 0)
		{
			System.out.println("There is no account in the bank");
		}
		
		for(int i = 0; i < recentAccount; i++)
		{
			accounts[i].print();
		}
	}
	
	public void payDivid()
	{
		System.out.println("\n The bank has payed the dividents \n");
		
		for(int i =0; i < recentAccount; i++)
		{
			accounts[i].deposit(Divident_Val);
		}
	}
	
	public void closeAccounts(int AccountNumber)
	{
		int j = ValueChange;
		
		for(int i = 0; i < recentAccount; i++)
		{
			if(accounts[i].getAccountNumber() == AccountNumber)
			{
				j = i;
				break;
			}
			
		}
		
		for(int i = j; i < recentAccount; i++)
		{
			if(accounts[i + 1] != null)
			{
				accounts[i] = accounts[i + 1];
			}
			
		}
		
		if(j != ValueChange)
		{
			recentAccount--;
		}
		else
		{
			System.err.println("Account is not in out system ");
		}
		
		
	}
	
	public void setInterest(double interest, Account wantedAccount)
	{
		if(wantedAccount instanceof SavingAccount)
		{
			((SavingAccount) wantedAccount).setInterest(interest);
			
		}
		else
		{
			System.out.println("Requested account with number " + (int) wantedAccount.getAccountNumber() + "is not a Savings account");
		}
		
		
	}
	
	public void setOverdraft(int overdraft, Account wantedAccount)
	{
		if (wantedAccount instanceof CurrentAccount)
		{
			((CurrentAccount)wantedAccount).setOverdraft(overdraft);
		}
		else
		{
			System.out.println("Requested account number " + (int) wantedAccount.getAccountNumber() + " is not a Current Account");
		}
	}
	
}
