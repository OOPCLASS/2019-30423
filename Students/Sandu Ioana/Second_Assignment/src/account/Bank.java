package account;

public class Bank {
	private final int MAX_DIVIDENT = 200;
	public Account[] accounts = new Account[100];
	public int size = 0;
	int accnumber = 0;
	
	public void createAccount(int type) {
		switch(type) {
			case 1: accounts[size++] = new Account(accnumber++);
					break;
			case 2: accounts[size++] = new SavingsAccount(accnumber++, randomInterest());
					break;
			case 3: accounts[size++] = new CurrentAccount(accnumber++, randomOverdraft());
					break;
			default: System.out.println("Wrong account type.");
		}
	}
	
	public void closeAccount(int number) {
		int index = -1;
		for(int i = 0 ; i < size ; i++)
			if(number == accounts[i].getAccountNumber())
				index = i;
		if(index < 0)
			System.out.println("The account "+ number +" doesn't exist.");
		else {
			System.arraycopy(accounts, index+1, accounts, index, size-index-1);
			System.out.println("The account " + number + " has been closed.");
			size--;
		}
	}
	
	public void update() {
		for(int i = 0 ; i < size ; i++) {
			if(accounts[i] instanceof SavingsAccount)
				((SavingsAccount)accounts[i]).addInterest();
			if(accounts[i] instanceof CurrentAccount)
				if(((CurrentAccount)accounts[i]).hasOverdraft())
					((CurrentAccount)accounts[i]).sendLetter();
					
		}
	}
	
	public void addDivident() {
		if(size > 0)
			for(int i = 0 ; i < size ; i++)
				accounts[i].deposit(MAX_DIVIDENT / size);
		else
			System.out.println("No accounts to add divident to.");
	}
	
	
	public double randomInterest() {
		double randI = Math.random() * 11 + 0.05;
		return randI;
	}
	
	public double randomOverdraft() {
		double randO = (Math.random() * 801) + 50;
		return randO;
	}
	public double randomBalance() {
		double randO = (Math.random() * 501) + 50;
		return randO;
	}
}
