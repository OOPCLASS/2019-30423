package com.company.classes.accounts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CurrentAccountTest {

    private CurrentAccount currentAccount;

    @Before
    public void setUp() {
        currentAccount = new CurrentAccount(1, 10);
    }

    @Test
    public void overDrawLimitReached_MessageIsSent() {
        currentAccount.withdraw(50);
        currentAccount.overDrawLimitReached();
    }

    @After
    public void tearDown() {
        currentAccount = null;
    }


}