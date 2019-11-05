package com.company.main;

import com.company.classes.accounts.CurrentAccount;
import com.company.classes.accounts.SavingsAccount;
import com.company.classes.bank.Bank;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1, 10);
        CurrentAccount currentAccount = new CurrentAccount(2, 10);

        Bank bank = new Bank();

        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);

        bank.depositOnAccount(savingsAccount, 100);
        bank.withdrawFromAccount(currentAccount, 10);

        bank.updateBankAccounts();

        bank.closeAccount(currentAccount);

        bank.updateBankAccounts();

    }
}
