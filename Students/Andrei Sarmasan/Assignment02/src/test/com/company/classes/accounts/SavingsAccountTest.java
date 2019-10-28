package com.company.classes.accounts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    private SavingsAccount savingsAccount;

    @Before
    public void setUp() {
        savingsAccount = new SavingsAccount(1, 10);
    }

    @Test
    public void addInterest_IsSuccessful() {
        final double accountBeforeInterest = savingsAccount.getBalance();
        savingsAccount.addInterest();
        final double accountAfterInterest = savingsAccount.getBalance();
        assertEquals(accountBeforeInterest + 10, accountAfterInterest);
    }

    @After
    public void tearDown() {
        savingsAccount = null;
    }

}