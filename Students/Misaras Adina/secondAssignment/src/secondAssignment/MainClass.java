package secondAssignment;

public class MainClass {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Account firstAccount = new Account(1);
		Account secondAccount = new SavingsAccount(2, 250.7);
		Account thirdAccount = new CurrentAccount(3, 300.4);

		bank.openAccount(firstAccount);
		bank.openAccount(secondAccount);
		bank.openAccount(thirdAccount);

		bank.print();
	}
}
