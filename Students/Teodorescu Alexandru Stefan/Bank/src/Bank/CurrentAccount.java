package Bank;

public class CurrentAccount extends Account {
	
	private int overDraftLimit;
	
	public CurrentAccount(int number, int overDraftLimit) {
		
		super(number);
		this.overDraftLimit = overDraftLimit;
	}
	
	public void overDraft() {
		
		if (this.getBalance() + overDraftLimit < 0) {
			
			System.out.println("Sending Letter...............");
		}
	}
}
