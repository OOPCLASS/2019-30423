
public class MainClass {

	public static void main(String[] args) {
		String[] types = {"Current", "Current", "Savings"};
		int[] numbers = {1, 2, 3};
		
		Bank bank = new Bank(3, types, numbers);
		
		for(int i = 0 ; i < bank.nrAccounts; i++) {
			if(bank.accounts[i] instanceof CurrentAccount) {
				CurrentAccount temp = (CurrentAccount) bank.accounts[i];
				
				temp.deposit(100 * (i + 1));
			}
			if(bank.accounts[i] instanceof SavingsAccount) {
				SavingsAccount temp = (SavingsAccount) bank.accounts[i];
				
				temp.setInterest((i + 1) * 10);
			}
		}
		
		
		bank.createNewAccount("Savings", 4);
		if(bank.accounts[bank.nrAccounts - 1] instanceof SavingsAccount) {
			SavingsAccount temp = (SavingsAccount) bank.accounts[bank.nrAccounts - 1];
			
			temp.setInterest(5);
		}
		/*
		bank.createNewAccount("Savings", 5);
		if(bank.accounts[bank.nrAccounts - 1] instanceof SavingsAccount) {
			SavingsAccount temp = (SavingsAccount) bank.accounts[bank.nrAccounts - 1];
			
			temp.setInterest(12);
		}
		
		bank.createNewAccount("Current", 6);
		if(bank.accounts[bank.nrAccounts - 1] instanceof CurrentAccount) {
			CurrentAccount temp = (CurrentAccount) bank.accounts[bank.nrAccounts - 1];
			
			temp.setOverdraftLimit(150);
		}
		*/
		bank.printAccounts();
		
		System.out.println("end");
	}

}
