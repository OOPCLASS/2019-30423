
public class MaineClass {

	public static void main(String[] args) {
		Bank minecraftBank = new Bank(1);
		minecraftBank.depositCurrent(1, 500);
		minecraftBank.depositSavings(1, 200);
		minecraftBank.bankCurrentAccounts[1].withdraw(400);
		minecraftBank.getUpdateCurrent(1);
		minecraftBank.getUpdateSavings(1);
		minecraftBank.bankSavingsAccounts[1].print();
		minecraftBank.bankCurrentAccounts[1].print();
	}
}
