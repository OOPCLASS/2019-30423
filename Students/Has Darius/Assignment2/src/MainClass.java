public class MainClass {

	public static void main(String[] args) {
		
		CurrentAccount account1 = new CurrentAccount(1);
		Integer nrOfAccounts;
		account1.setOverdraftLimit(300);
		account1.deposit(10);
		account1.withdraw(129);
		account1.getOverdraftLimit();
		
		SavingsAccount account2 =  new SavingsAccount(2);
		account2.setInterest(10);
		account2.deposit(120);
		account2.deposit(120);

		Bank BCR = new Bank(10);
		BCR.openAccount(account1);
		BCR.openAccount(account2);
		nrOfAccounts = BCR.getNrOfAccounts();
		for(Integer i=0;i<nrOfAccounts;i++)
			BCR.account[i].print();
		BCR.updateBank(12);
		account2.setInterest(15);
		BCR.closeAccount(1);
		nrOfAccounts = BCR.getNrOfAccounts();
		for(Integer i=0;i<nrOfAccounts;i++)
			BCR.account[i].print();
	}

}