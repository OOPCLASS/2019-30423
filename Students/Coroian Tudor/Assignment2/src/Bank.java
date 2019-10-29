
public class Bank 
{
	public Account accounts[] = new Account[50];
	int size = 0;
	int accountNumber = 1;
	double dividentToAdd = 200.0;
	public Account emptyAccount = new Account(0);
	
	public void createAccount(int type) 
	{
		//1 => regular
		//2 => savings
		//3 => current
		
		switch(type)
		{
		case 1 : accounts[size ++] = new Account(accountNumber ++); break;
		case 2 : accounts[size ++] = new SavingsAccount(accountNumber ++, 1.0); break;
		case 3 : accounts[size ++] = new CurrentAccount(accountNumber ++, 0.0); break;
		default : System.err.println("No account of type requested."); break;
		}
	}
	
	public void closeAccount(int accountNumber)
	{
		int indexAccount = -1;
		for (int i = 0; i < size; i ++)
		{
			if (accounts[i].getAccountNumber() == accountNumber)
			{
				indexAccount = i;
				break;
			}
		}
		accounts[indexAccount] = emptyAccount;
	}
	
	public void update()
	{
		for(int i = 0; i < size; i ++)
		{
			if (accounts[i] instanceof SavingsAccount)
			{
				((SavingsAccount)accounts[i]).addInterest();
			}
			if (accounts[i] instanceof CurrentAccount)
			{
				if (((CurrentAccount)accounts[i]).getBalance() < ((CurrentAccount)accounts[i]).getOverdraft())
				{
					System.out.println("Hey there, I know you had a tough time last week, but i need to inform you that you overreached your overdraft...");
				}
			}
		}
	}
	
	public void divident()
	{
		for (int i = 0; i < size; i ++)
		{
			if (accounts[i].getAccountNumber() != 0)
			{
				accounts[i].deposit(dividentToAdd);
			}
		}
	}
	
	
}
