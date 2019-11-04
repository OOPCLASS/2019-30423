
public class Bank {

	public Account[] accounts;
	private Integer indexCount;
	
	public Bank(int maxNrOfAccounts) {
		this.accounts = new Account[maxNrOfAccounts];
		indexCount = 0;
	}
	
	public void openAccount(Account account) {
		this.accounts[indexCount++]=account;
	}
	public void updateBank(int[] accountsInterest) {
		int interestsArrayIndex=0;;
		for(int i=0;i<indexCount;i++) {
			if(this.accounts[i].getClass().getSimpleName()=="SavingsAccount") {
				if(interestsArrayIndex<=accountsInterest.length) {
					((SavingsAccount) accounts[i]).addInterest(accountsInterest[interestsArrayIndex++]);
				}
			}
			if(this.accounts[i].getClass().getSimpleName()=="CurrentAccount") {
				if(accounts[i].getBalance()<=0) {
					if(((CurrentAccount) accounts[i]).getOverDraft()<0) {
						System.out.println("Warning!!Account : " + accounts[i].getAccountNumber() + " spent its money and its overdraft funds. We are going to apply some penalties!");
					}
					else
						System.out.println("Warning!Account : " + accounts[i].getAccountNumber() + " just entered overdraft. Be aware not to spend more than the overdraft limit which is: "+ ((CurrentAccount) accounts[i]).getOverDraftLimit());
				}
					
			}
		}
	}
	public double closeAccount(int nr) {
		int targetIndex=0;
		double targetSum;
		for(int i=0;i<indexCount;i++) {
			if(accounts[i].getAccountNumber()==nr) {
				targetIndex=i;
			}
		}
		targetSum=accounts[targetIndex].getBalance();
		for(int i=targetIndex;i<indexCount-1;i++) {
			accounts[i]=accounts[i+1];
		}
		indexCount--;
		return targetSum;
	}
	public void payDividend(int sum) {
		for(int i=0;i<indexCount;i++) {
			accounts[i].deposit(sum);
			}
		
	}
	public Integer getNrOfAccounts() {
		return indexCount;
	}
}
