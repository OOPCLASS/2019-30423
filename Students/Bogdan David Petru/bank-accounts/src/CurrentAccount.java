//import sun.nio.cs.ext.TIS_620;

public class CurrentAccount extends Account{

	public double overDraftLimit;
	public double overDraft;
	private int withdrawControl=0;
	public CurrentAccount(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	public void setOverDraftLimit(double number) {
		this.overDraftLimit=number;
		this.overDraft=overDraftLimit;
	}
	public double getOverDraftLimit() {
		return this.overDraftLimit;
	}
	public double getOverDraft() {
		return this.overDraft;
	}
	public void deposit(double sum) {
	    if (sum > 0) {
	    	if(withdrawControl==1) {
	    		if(overDraft+sum>overDraftLimit) {
	    			super.deposit(overDraft+sum-overDraftLimit);
	    			overDraft=overDraftLimit;
	    			withdrawControl=0;
	    		}
	    		else {
	    			overDraft+=sum;
	    		}
	    	}
	    	else {
	    		super.deposit(sum);
	    	}
	    } else {
	      System.err.println("Account.deposit(...): cannot deposit negative amount.");
	    }
	  }
	public void withdraw(double sum) {
	    if (sum > 0) {
	    	if(withdrawControl==1) {
	    		overDraft-=sum;
	    	}
	    	else {
	    		if(this.getBalance()-sum<=0) {
		    		withdrawControl=1;
		    		overDraft-=sum-this.getBalance();
		    		super.withdraw(this.getBalance());
		    		}
	    		else {
	    			super.withdraw(sum);
	    		}
	    		}
	    } else {
	      System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
	    }
	  }

	public String toString() {
		 return "Account " + this.getAccountNumber() + ": " + "balance = " + this.getBalance() + " remaining overdraft = " + overDraft;
	}
}
