
public class MainClass 
{
	public static void main(String[] args) 
	{
		Bank BT = new Bank();
		
		BT.createAccount(1);
		BT.createAccount(1);
		BT.createAccount(2);
		BT.createAccount(2);
		BT.createAccount(3);
		BT.createAccount(3);
		
		BT.createAccount(4);
		BT.createAccount(-6);
		
		BT.accounts[0].deposit(18);
		BT.accounts[1].deposit(25);
		BT.accounts[2].deposit(10523);
		BT.accounts[3].deposit(125);
		BT.accounts[4].deposit(13);
		BT.accounts[5].deposit(85);
		
		System.out.println(BT.accounts[0].toString());
		System.out.println(BT.accounts[1].toString());
		System.out.println(BT.accounts[2].toString());
		System.out.println(BT.accounts[3].toString());
		System.out.println(BT.accounts[4].toString());
		System.out.println(BT.accounts[5].toString());
		
		BT.update();
		BT.update();
		
		System.out.println(BT.accounts[0].toString());
		System.out.println(BT.accounts[1].toString());
		System.out.println(BT.accounts[2].toString());
		System.out.println(BT.accounts[3].toString());
		System.out.println(BT.accounts[4].toString());
		System.out.println(BT.accounts[5].toString());
		
		BT.accounts[4].withdraw(20);
		BT.accounts[5].withdraw(20);

		BT.update();
		
		System.out.println(BT.accounts[4].toString());
		System.out.println(BT.accounts[5].toString());
	}

}
