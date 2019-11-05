package main_package;

import account.Bank;

public class Main_Class {
	public static void main(final String[] args) {
		Bank B1 = new Bank();
		
		B1.createAccount(1);
		B1.createAccount(2);
		B1.createAccount(3);
		B1.createAccount(4);
		B1.createAccount(1);
		B1.createAccount(2);
		B1.createAccount(3);
		
		B1.closeAccount(3);
		B1.closeAccount(8);
		B1.closeAccount(-1);
		
		RandomDeposit(B1);
		printAccounts(B1);
		B1.update();
		printAccounts(B1);
		
	}
	public static void printAccounts(Bank B1) {
		for(int i = 0 ; i < B1.size ; i++) 
			B1.accounts[i].print();
	}
	public static void RandomDeposit(Bank B1) {
		for(int i = 0 ; i < B1.size ; i++) 
			B1.accounts[i].deposit(B1.randomBalance());
	}
}
