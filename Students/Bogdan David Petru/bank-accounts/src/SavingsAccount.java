


public class SavingsAccount extends Account{
	
	public int interest;
	private int interestRate=3;
	public SavingsAccount(int number) {
		super(number);
		interest=0;
		// TODO Auto-generated constructor stub
	}
	public void addInterest(int interest) {
		if(interest<=20)
			this.interest=interest;
	}
	 public void deposit(double sum) {
		    if (sum > 0) {
		    	super.deposit(interestRate/100 * this.getBalance());
		      super.deposit(sum);
		    } else {
		      System.err.println("Account.deposit(...): cannot deposit negative amount.");
		    }
		  }
	 
	public int getInterest() {
		return this.interest;
	}

	//@Override
	
	public String toString() {
		 return "Account " + this.getAccountNumber() + ": " + "balance = " + this.getBalance() + " interest = " + interest;
	}
}
