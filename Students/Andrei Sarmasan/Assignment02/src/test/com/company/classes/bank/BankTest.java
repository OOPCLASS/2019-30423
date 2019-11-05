package com.company.classes.bank;

import com.company.classes.accounts.Account;
import com.company.classes.accounts.CurrentAccount;
import com.company.classes.accounts.SavingsAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {

    private Bank bank;

    @Before
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void openAccount_Successful() {
        final Account account = new Account(10);
        final int numberOfAccountBeforeOperation = bank.getAccounts().size();
        bank.openAccount(account);
        final int numberOfAccountAfterOperation = bank.getAccounts().size();
        assertEquals(numberOfAccountBeforeOperation + 1, numberOfAccountAfterOperation);
    }

    @Test
    public void closeAccount_Successful() {
        final Account account = new Account(10);
        bank.openAccount(account);
        final int numberOfAccountBeforeOperation = bank.getAccounts().size();
        bank.closeAccount(account);
        final int numberOfAccountAfterOperation = bank.getAccounts().size();
        assertEquals(numberOfAccountBeforeOperation - 1, numberOfAccountAfterOperation);
    }

    @Test
    public void depositOnAccount_AccountNotFound() {
        final Account accountFromCurrentBank = new Account(10);
        bank.openAccount(accountFromCurrentBank);
        final Account accountFromAnotherBank = new Account(20);
        final double balanceOfTestedAccountBeforeOperation = accountFromAnotherBank.getBalance();
        bank.depositOnAccount(accountFromAnotherBank, 10);
        final double balanceOfTestedAccountAfterOperation = accountFromAnotherBank.getBalance();
        assertEquals(balanceOfTestedAccountBeforeOperation, balanceOfTestedAccountAfterOperation);
    }

    @Test
    public void depositOnAccount_AccountFound() {
        final Account accountFromCurrentBank = new Account(10);
        bank.openAccount(accountFromCurrentBank);
        final double balanceOfTestedAccountBeforeOperation = accountFromCurrentBank.getBalance();
        bank.depositOnAccount(accountFromCurrentBank, 10);
        final double balanceOfTestedAccountAfterOperation = accountFromCurrentBank.getBalance();
        assertEquals(balanceOfTestedAccountBeforeOperation + 10, balanceOfTestedAccountAfterOperation);
    }

    @Test
    public void withdrawFromAccount_AccountNotFound() {
        final Account accountFromCurrentBank = new Account(10);
        bank.openAccount(accountFromCurrentBank);
        final Account accountFromAnotherBank = new Account(20);
        final double balanceOfTestedAccountBeforeOperation = accountFromAnotherBank.getBalance();
        bank.withdrawFromAccount(accountFromAnotherBank, 10);
        final double balanceOfTestedAccountAfterOperation = accountFromAnotherBank.getBalance();
        assertEquals(balanceOfTestedAccountBeforeOperation, balanceOfTestedAccountAfterOperation);
    }

    @Test
    public void withdrawFromAccount_AccountFound() {
        final Account accountFromCurrentBank = new Account(10);
        bank.openAccount(accountFromCurrentBank);
        final double balanceOfTestedAccountBeforeOperation = accountFromCurrentBank.getBalance();
        bank.withdrawFromAccount(accountFromCurrentBank, 10);
        final double balanceOfTestedAccountAfterOperation = accountFromCurrentBank.getBalance();
        assertEquals(balanceOfTestedAccountBeforeOperation - 10, balanceOfTestedAccountAfterOperation);
    }


    @Test
    public void updateBankAccounts_UpdateSavingsAccount() {
        final Account savingsAccount = new SavingsAccount(10, 10);
        final double accountBalanceBeforeOperation = savingsAccount.getBalance();
        bank.openAccount(savingsAccount);
        bank.updateBankAccounts();
        final double accountBalanceAfterOperation = savingsAccount.getBalance();
        assertEquals(accountBalanceBeforeOperation + 10, accountBalanceAfterOperation);
    }

    @Test
    public void updateBankAccounts_UpdateCurrentAccount() {
        final Account currentAccount = new CurrentAccount(10, 10);
        bank.openAccount(currentAccount);
        bank.updateBankAccounts();
    }

    @After
    public void tearDown() {
        bank = null;
    }

}