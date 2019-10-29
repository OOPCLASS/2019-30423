package com.company.classes.accounts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(1);
    }

    @Test
    public void deposit_noOperationWhenAddingNegativeValue() {
        final double valueBeforeDeposit = account.getBalance();
        account.deposit(-10);
        final double valueAfterDeposit = account.getBalance();
        assertEquals(valueBeforeDeposit, valueAfterDeposit);
    }

    @Test
    public void deposit_OperationSuccessful() {
        final double valueBeforeDeposit = account.getBalance();
        account.deposit(10);
        final double valueAfterDeposit = account.getBalance();
        assertEquals(valueBeforeDeposit + 10, valueAfterDeposit);
    }

    @Test
    public void withdraw_noOperationWhenAddingNegativeValue() {
        final double valueBeforeWithdrawal = account.getBalance();
        account.withdraw(-10);
        final double valueAfterWithdrawal = account.getBalance();
        assertEquals(valueBeforeWithdrawal, valueAfterWithdrawal);
    }

    @Test
    public void withdraw_OperationSuccessful() {
        final double valueBeforeWithdrawal = account.getBalance();
        account.withdraw(10);
        final double valueAfterWithdrawal = account.getBalance();
        assertEquals(valueBeforeWithdrawal - 10, valueAfterWithdrawal);
    }

    @After
    public void tearDown() {
        account = null;
    }

}