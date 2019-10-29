
public class MainClass {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1);
		Integer nrOfAccounts;
		int[] interestArray= {5,10,15};
		acc1.deposit(10);
		//System.out.println("Account nr " + acc1.getAccountNumber() + " Account balance:  " + acc1.getBalance());
		acc1.withdraw(3.5);
	//	System.out.println(acc1.getBalance());
		
		SavingsAccount acc2 =  new SavingsAccount(2);
		acc2.addInterest(10);
		
		CurrentAccount acc3 = new CurrentAccount(3);
		acc3.setOverDraftLimit(100);
		acc3.print();
		acc3.deposit(13);
		SavingsAccount acc4 =  new SavingsAccount(4);
		
		Bank bancaTransilvania = new Bank(100);
		bancaTransilvania.openAccount(acc1);
		bancaTransilvania.openAccount(acc2);
		bancaTransilvania.openAccount(acc3);
		bancaTransilvania.openAccount(acc4);
		nrOfAccounts = bancaTransilvania.getNrOfAccounts();
		for(Integer i=0;i<nrOfAccounts;i++)
			bancaTransilvania.accounts[i].print();
		acc3.withdraw(100);
		bancaTransilvania.updateBank(interestArray);
		for(Integer i=0;i<nrOfAccounts;i++)
			bancaTransilvania.accounts[i].print();
		acc3.withdraw(50);
		bancaTransilvania.updateBank(interestArray);
		bancaTransilvania.closeAccount(2);
		nrOfAccounts = bancaTransilvania.getNrOfAccounts();
		for(Integer i=0;i<nrOfAccounts;i++)
			bancaTransilvania.accounts[i].print();
	}

}
