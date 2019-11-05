
public class Bank
{
	public Account[] bankAccounts = new Account[1000];

	
	public Account openAccount(int nrOfAccounts, String type)
	{
		nrOfAccounts++;
		if (type.equals("savings"))
		{
			bankAccounts[nrOfAccounts] = new SavingsAccount(100 + nrOfAccounts);
		}
		else if (type.equals("current"))
		{
			bankAccounts[nrOfAccounts] = new CurrentAccount(100 + nrOfAccounts);
		}
		else if (type.equals("simple"))
		{
			bankAccounts[nrOfAccounts] = new Account(100 + nrOfAccounts);
		}
		else
		{
			System.err.println("Account.openAccount(...): invalid account type for account " + (100+nrOfAccounts) + ".");
		}
		return bankAccounts[nrOfAccounts];
	}

	
	public void closeAccount(Account accountToDelete) 	//I am not sure this works because I think I can't verify it by calling
	{													//printAllAccounts(), because this print function does have a reference to the  
		accountToDelete = null; 						//deleted account and so the garbage collector doesn't actually delete the object.
		System.gc();
	}

	
	public void payDivident(int nrOfAccounts, double divident)
	{
		for (int i = 1; i <= nrOfAccounts; i++)
		{
			bankAccounts[i].deposit(divident);
		}
	}

	
	public void updateAccount(int nrOfAccounts, double interestToAdd)
	{
		for (int i = 1; i <= nrOfAccounts; i++)
		{
			if (bankAccounts[i] instanceof SavingsAccount)
			{
				((SavingsAccount) bankAccounts[i]).addInterest(interestToAdd);
			}
			else if (bankAccounts[i] instanceof CurrentAccount)
			{
				if (bankAccounts[i].getBalance() < -((CurrentAccount) bankAccounts[i]).getOverdraftLimit())
				{
					System.out.print("The account " + bankAccounts[i].getAccountNumber() + " is in overdraft.\n");
				}
				else
				{
					System.out.print("The account " + bankAccounts[i].getAccountNumber() + " is not in overdraft.\n");
				}
			}
		}
	}
	
	
	public void printAllAccounts(int nrOfAccounts)
	{
		for (int i = 1; i <= nrOfAccounts; i++)
		{
			bankAccounts[i].print();
		}
	}

}
