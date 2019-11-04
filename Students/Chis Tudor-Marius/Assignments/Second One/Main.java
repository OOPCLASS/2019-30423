package com.accounts;

public class Main {
		static Bank bank = new Bank();
		
		public static void main(String[] args) {
			
			Bank.account[1].withdraw(25);
			System.out.println(Bank.account[1]);
			
			((SavingsAccount)Bank.account[7]).addInterest();
			System.out.println(Bank.account[7]);
			
			Bank.account[11].withdraw(1000);
			Bank.update(10);
			
			Bank.openAccount(2);
			Bank.account[16].withdraw(237);
			System.out.println(Bank.account[16]);
			
			Bank.payDividentAccount(50);
			System.out.println(Bank.account[16]);
			
			Bank.closeAccount(16);
			System.out.println(Bank.account[16]);

		}
}



