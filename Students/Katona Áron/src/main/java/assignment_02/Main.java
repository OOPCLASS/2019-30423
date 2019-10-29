package assignment_02;

import assignment_02.bank.Account;
import assignment_02.bank.Bank;
import assignment_02.bank.CurrentAccount;
import assignment_02.bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account(1);
        Account a2 = new SavingsAccount(2, 1.4);
        Account a3 = new CurrentAccount(3, 25);
        Account a4 = new CurrentAccount(4, 30);
        Account a5 = new SavingsAccount(5, 20);
        a4.deposit(60);
        bank.openAccount(a1);
        bank.openAccount(a2);
        bank.openAccount(a3);
        bank.openAccount(a4);
        bank.openAccount(a5);
        System.out.println(bank);

        bank.update();
        System.out.println(bank);

        bank.closeAccount(3);
        System.out.println(bank);

        bank.payDividend(100);
        System.out.println(bank);
    }
}
