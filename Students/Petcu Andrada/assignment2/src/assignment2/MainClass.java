package assignment2;

public class MainClass {
	public static void main(String[] args) {
		SavingsAccount acc1 = new SavingsAccount("Aaa");
		SavingsAccount acc2 = new SavingsAccount("Bbb");
		SavingsAccount acc3 = new SavingsAccount("Ccc");
		CurrentAccount acc4 = new CurrentAccount("Ddd");
		Bank myBank = new Bank();
		acc1.deposit(200.0);
		acc1.withdraw(200000);
		acc1.printUpdates();
		acc4.withdraw(20000);

		myBank.addSavingsAccount(acc3);
		myBank.addSavingsAccount(acc2);
		myBank.addSavingsAccount(acc1);
		myBank.addCurrentAccount(acc4);
		myBank.update();
		
	}
}
