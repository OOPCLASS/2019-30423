package bankAccount;

public class SavingsAccount extends Account {
	
	private double interest;
	
	public SavingsAccount(int number, double interest) {
		super(number);
		this.interest = interest;
	}


	
	public void addInterest() {
		this.deposit( this.getBalance()* (interest / 100) );
	}


	@Override
	public String toString() {
		return  "SavingsAccount " + getAccountNumber() + "interest= " + interest + " balance = " + getBalance();
	}



	public void setInterest(double interest2) {
		// TODO Auto-generated method stub
		this.interest = interest;
	}







}
