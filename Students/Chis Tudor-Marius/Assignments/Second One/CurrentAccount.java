package com.accounts;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public CurrentAccount(int number) {
		super(number);
		overdraftLimit = 200;
	}
	
	public void setOverdraft(double overdraftValue) {
		overdraftLimit = overdraftValue;
	}
	
	public double getOverdraft() {
		return overdraftLimit;
	}
	@Override
	public String toString() {
	    return "CurrentAccount " + getAccountNumber() + ": " + "balance = " + getBalance();
	  }
}
