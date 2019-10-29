
public class Main
{
	public static void main(String[] args)
	{
		int nrOfAccounts = 0;
		Bank bank = new Bank();
		
		Account account1 = bank.openAccount(nrOfAccounts, "savings");
		nrOfAccounts++;
		Account account2 = bank.openAccount(nrOfAccounts, "savings");
		nrOfAccounts++;
		Account account3 = bank.openAccount(nrOfAccounts, "current");
		nrOfAccounts++;
		Account account4 = bank.openAccount(nrOfAccounts, "current");
		nrOfAccounts++;
		Account account5 = bank.openAccount(nrOfAccounts, "simple");
		nrOfAccounts++;
		Account account6 = bank.openAccount(nrOfAccounts, "simple");
		nrOfAccounts++;
		
		account1.print();
		account1.deposit(200);
		account1.print();
		account1.withdraw(50);
		((SavingsAccount)account1).addInterest(10.0);
		
		account2.deposit(180);
		account2.withdraw(20);
		((SavingsAccount)account2).addInterest(45.0);
		
		((CurrentAccount)account3).setOverdraftLimit(300);
		account3.deposit(450);
		
		((CurrentAccount)account4).setOverdraftLimit(100);
		account4.deposit(210);
		account4.withdraw(400);
		
		account5.deposit(220);
		account5.withdraw(40);
		
		account6.deposit(370);
		account6.withdraw(50);
		
		bank.printAllAccounts(nrOfAccounts);
		
		System.out.print("\n\n");
		System.out.print("UPDATE:\n");
		bank.printAllAccounts(nrOfAccounts);
		bank.updateAccount(nrOfAccounts, 5.0);
		
		System.out.print("\n\n");
		System.out.print("PAY DIVIDENTS:\n");
		bank.payDivident(nrOfAccounts, 30.0);
		bank.printAllAccounts(nrOfAccounts);
		
		bank.closeAccount(account2);
		bank.closeAccount(account1);
	}
}
