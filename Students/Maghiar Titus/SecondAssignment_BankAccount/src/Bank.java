
public class Bank {
	public Account accounts[];
	private int number_of_accounts;
	public Bank(int number_of_accounts) {
		this.number_of_accounts=number_of_accounts;
		accounts = new Account[number_of_accounts];
		for (int i = 0; i < number_of_accounts; i++)
			accounts[i] = new Account(i);
	}
	public void openAccount()
	{
		accounts[this.number_of_accounts]= new Account (this.number_of_accounts);
		this.number_of_accounts++;
	}
	public void updateAccounts(int interest) {
		for (int i = 0; i < number_of_accounts; i++) {
			if (accounts[i].getClass().getSimpleName() == "SavingsAccount") {
				((SavingsAccount) accounts[i]).addInterest(interest);
			}
			if (this.accounts[i].getClass().getSimpleName() == "CurrentAccount") {
				if (((CurrentAccount) accounts[i]).status_overdraft == true)
					System.out.println("Account: " + accounts[i].getAccountNumber()
							+ " in overdraft state, please check the local bank services!");
			}
		}

	}
	public void closeAccount(int nr) {
        int index=0;
        for(int i=0;i<number_of_accounts;i++) {
            if(accounts[i].getAccountNumber()==nr) {
                index=i;
            }
        }
        for(int i=index;i<number_of_accounts-1;i++) {
            accounts[i]=accounts[i+1];
        }
        number_of_accounts--;
    }
	public void payDividend(int percentage, int account_number) {
        int index=0;
        for(int i=0;i<number_of_accounts;i++) {
            if(accounts[i].getAccountNumber()==account_number) {
            	index=i;
            }
        }
        accounts[index].deposit(percentage/100 * accounts[index].getBalance());
       
    }
}
