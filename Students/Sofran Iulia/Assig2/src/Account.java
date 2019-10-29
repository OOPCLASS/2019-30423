/**
 * A class for bank accounts. This class provides the basic functionality of
 * accounts. It allows deposits and withdrawals but not overdraft limits or
 * interest rates.
 */

public class Account
{
	protected int number;		//I changed from private to protected because I didn't know how else I can set the accountNumber for a 
	protected double balance;	//a SavingsAccount or a Current Account, considering I don't have an accountNumber setter in this class.
								//This way, I can use the number and balance fields in the constructors of SavingsAccount and CurrentAccount.
	
	public Account(){}	//I added this because otherwise I received the error:
						//"Implicit super constructor Account() is undefined. Must explicitly invoke another constructor", because
						//(I guess) the only other constructor here receives a parameter. I didn't know how to solve the error differently.
	
	
	public Account(int number)
	{
		this.number = number;
		this.balance = 0.0;
	}

	
	public void deposit(double sum)
	{
		if (sum > 0)
		{
			balance += sum;
		}
		else
		{
			System.err.println("Account.deposit(...): cannot deposit negative amount.");
		}
	}

	
	public void withdraw(double sum)
	{
		if (sum > 0)
		{
			balance -= sum;
		}
		else
		{
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}

	
	public double getBalance()
	{
		return balance;
	}

	
	public int getAccountNumber()	//I changed this to int, not double, because accountNumber is int.
	{
		return number;
	}

	
	public String toString()
	{
		return "Account " + number + ": " + "balance = " + balance;
	}

	
	public final void print()
	{
		// Don't override this, override the toString method
		System.out.println(toString());
	}

}