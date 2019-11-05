package assignment2;

public class MainClass {

	public static void main(String[] args) {
		
		Bank myBank = new Bank();
		
		myBank.openAccount("Normal");
		myBank.openAccount("Savings");
		myBank.openAccount("Current");
		myBank.openAccount("Savings");
		
		for(int i = 0; i < 4; i++) {
			myBank.accounts[i].print();
		}
		
		for(int i = 0; i < 4; i++) {
			myBank.accounts[i].deposit(i * 420 + 23);
		}
		
		for(int i = 0; i < 4; i++) {
			myBank.accounts[i].print();
		}
		
		myBank.accounts[2].withdraw(890.0);
		myBank.update();
		
		myBank.accounts[2].withdraw(700.0);
		myBank.update();
		
		for(int i = 0; i < 4; i++) {
			myBank.accounts[i].print();
		}
		
		myBank.payDividend();
		
		for(int i = 0; i < 4; i++) {
			myBank.accounts[i].print();
		}
		
		myBank.closeAccount(3.0);
		
		for(int i = 0; i < 3; i++) {
			myBank.accounts[i].print();
		}
	}
}
