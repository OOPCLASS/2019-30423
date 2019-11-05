import accounts.*;
public class MainClass {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account normal_acc = new Account(0);

        SavingsAccount savings_acc = new SavingsAccount(1,100);
        savings_acc.deposit(20000);
        savings_acc.setInterest(1.0);

        CurrentAccount current_acc = new CurrentAccount(2,10);
        current_acc.deposit(100);

        bank.openAccount(savings_acc);
        bank.openAccount(current_acc);

        bank.depositOnAccount(savings_acc, 100);
        bank.withdrawFromAccount(current_acc, 10);

        bank.updateAccounts();

        bank.closeAccount(current_acc);

        bank.updateAccounts();

        normal_acc.deposit(500);
        bank.openAccount(normal_acc);
        normal_acc.print();


        savings_acc.print();
        bank.updateAccounts();
        savings_acc.print();

    }

}