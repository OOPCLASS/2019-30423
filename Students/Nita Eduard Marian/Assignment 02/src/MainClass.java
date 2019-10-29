import Accounts.*;
public class MainClass {

	public static void main(String[] args) {
		Bank brd = new Bank();
		
		Account normal1 = new Account(0);
		
		SavingsAccount savings1 = new SavingsAccount(1);
		savings1.deposit(20000);
		savings1.setInterest(1.0);
		
		CurrentAccount current1 = new CurrentAccount(2);
		current1.deposit(100);

		brd.openAccount(savings1);
		brd.openAccount(current1);
		
		normal1.deposit(500);
		brd.openAccount(normal1);
		normal1.print(); // Account 0: balance = 500.0

		
		savings1.print(); // Account 1: balance = 20000.0
		brd.update();
		savings1.print(); // Account 1: balance = 20200.0

		current1.print(); // Account 2: balance = 100.0
		current1.withdraw(150); 
		current1.print(); // Account 2: balance = -50.0

		brd.closeAccount(savings1);
		brd.update(); // Letter sent to account 2, surpassed overdraft limit
		current1.withdraw(150); //Cannot withdraw money, overdraft limit reached
		
		brd.closeAccount(current1);
		
		brd.openAccount(savings1);

		savings1.print(); // Account 1: balance = 20200.0
		brd.update();
		savings1.print(); // Account 1: balance = 20402.0
		
		brd.openAccount(current1);
		
		brd.payDividends();
		normal1.print();
		savings1.print();
		current1.print();

	}

}
