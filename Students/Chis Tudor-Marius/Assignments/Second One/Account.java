package com.accounts;

public class Account {

  private int number;
  private double balance;


  public Account(int number) {
    this.number = number;
    this.setBalance(0.0);
  }

  public void deposit(double sum) {
    if (sum > 0) {
      setBalance(getBalance() + sum);
    } else {
      System.err.println("Account.deposit(...): cannot deposit negative amount.");
    }
  }

  public void withdraw(double sum) {
    if (sum > 0) {
      setBalance(getBalance() - sum);
    } else {
      System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
    }
  }

  public double getBalance() {
    return balance;
  }

  public double getAccountNumber() {
    return number;
  }

  public String toString() {
    return "Account " + number + ": " + "balance = " + getBalance();
  }

  public final void print() {
    System.out.println(toString());
  }

public void setBalance(double balance) {
	this.balance = balance;
}
}
