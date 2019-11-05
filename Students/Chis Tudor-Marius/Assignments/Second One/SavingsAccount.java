package com.accounts;

public class SavingsAccount extends Account {

	private double interest;

	public SavingsAccount(int number) {
		super(number);
		this.interest = 10;
	}

	public void setInterest(double percentage) {
		if (percentage > 0) {
			this.interest = percentage;
		} else {
			System.err.println("Cannot set negative interest to an account!");
		}
	}

	public void addInterest() {
		deposit(getBalance() * (this.interest / 100));
	}

	@Override
	public String toString() {
		return "SavingsAccount " + getAccountNumber() + ": " + "balance = " + getBalance();
	}

}
