package assignment2;
import Account.Account;
import Account.Bank;
import Account.CurrentAccount;
import Account.SavingsAccount;

public class MainClass {

	public static void main(String[] args) {
		int size = 0;
		Bank bank = new Bank();
		
		Account account0 = bank.openAccount(size, "Savings");
		size++;
		Account account1 = bank.openAccount(size, "Regular");
		size++;
		Account account2 = bank.openAccount(size, "Current");
		size++;
		Account account3 = bank.openAccount(size, "Savings");
		size++;
		Account account4 = bank.openAccount(size, "Current");
		size++;
		
		bank.printAllAccounts(size);
		System.out.print("\n\n");
		
		account0.deposit(200);
		account1.deposit(100);
		((SavingsAccount)account3).addInterest(50);
		((CurrentAccount)account2).setOverdraftLimit(200);
		account3.deposit(100);
		account3.withdraw(150);
		((CurrentAccount)account4).setOverdraftLimit(150);
		account4.withdraw(400);
		
		bank.printAllAccounts(size);
		System.out.print("\n\n");
		
		bank.closeAccount(2); //will close account 1 (starting from index 0)
		size--;
		bank.closeAccount(4); //will close account 3 (starting from index 0)
		size--;
		
		bank.printAllAccounts(size);
		System.out.print("\n\n");
		
		bank.payDividend(size, 40);
		bank.updateAccount(1, size, 20);
		bank.updateAccount(3, size, 10);
		
		bank.printAllAccounts(size);
		System.out.print("\n\n");
		
	}

}
