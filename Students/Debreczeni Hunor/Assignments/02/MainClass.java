public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1, 10000);
        CurrentAccount currentAccount = new CurrentAccount(2, 100);

        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);

        bank.deposit(currentAccount, 100);
        bank.withdraw(currentAccount, 300);

        bank.print(currentAccount);

        bank.updateAccounts();

        bank.payDivident(150);
        bank.print(currentAccount);
        bank.updateAccounts();
    }
}
