package bank;

public class MainClass {
	
	
	public static void main(String[] args)
	{
		
		final int Account = 1;
		final int Saving = 2;
		final int Current = 3;
		
		Bank StudentBank = new Bank();
		StudentBank.printAccounts();
		
		
		for(int i = 0; i < 5; i++)
		{
			if(i < 2)
			{
				StudentBank.openAccount(Saving);
			}
			else
			{
				StudentBank.openAccount(Current);
			}
		}
		
		StudentBank.printAccounts();
		
		
		
	}

}
