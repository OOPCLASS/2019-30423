package assignment2;



public class MainClass {

	public static void main(String[] args) {
                Bank BT=new Bank();
                
                Account firstAccount = new Account(1);
                Account secondAccount = new Account(2);
                Account thirdAccount = new SavingsAccount(3,144.3);
                Account forthAccount = new SavingsAccount(4,14.5);
                Account fifthAccount = new CurrentAccount(5,66.4);
                Account sixthAccount = new CurrentAccount(6,63.4);
                
                BT.addAccout(firstAccount);
                BT.addAccout(secondAccount);
                BT.addAccout(thirdAccount);
                BT.addAccout(forthAccount);
                BT.addAccout(fifthAccount);
                BT.addAccout(sixthAccount);
                
                System.out.println(BT);
                
                
	}

}
