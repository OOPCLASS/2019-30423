package account;

public class main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccount(0);
		bank.addAccount(1);
		bank.addAccount(2);
		bank.addAccount(0);
		
		bank.accounts[0].deposit(2000);
		System.out.println(bank.accounts[0].getBalance());
		bank.accounts[1].deposit(2000);
		System.out.println(bank.accounts[1].getBalance());
		
		bank.savings[0].deposit(300);
		bank.savings[0].AddInterest();
		System.out.println(bank.savings[0].getBalance());
		
		bank.current[0].deposit(5000);
		System.out.println(bank.current[0].getBalance());
		bank.current[0].isOverdrafted();
		bank.current[0].withdraw(6000);
		System.out.println(bank.current[0].getBalance());
		bank.current[0].isOverdrafted();
		bank.current[0].deposit(600);
		System.out.println(bank.current[0].getBalance());
		bank.current[0].isOverdrafted();
		bank.current[0].deposit(600);
		System.out.println(bank.current[0].getBalance());
		bank.current[0].isOverdrafted();
	}

}
