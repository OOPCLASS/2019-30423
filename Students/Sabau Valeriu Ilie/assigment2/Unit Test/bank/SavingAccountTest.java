package bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingAccountTest {
    private final double epsilon = 0.00001;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addInterestToBalancePositiveTest() {
        double sum = 10;
        SavingAccount account = new SavingAccount(0);
        account.deposit(sum);
        Assertions.assertEquals(account.getBalance(), sum, epsilon);
        account.addInterestToBalance();
        Assertions.assertEquals(account.getBalance(), sum + sum * account.getInterest(), epsilon);
    }

    @Test
    void addInterestToBalanceNegativeTest() {
        SavingAccount account = new SavingAccount(0);
        account.withdraw(10);
        Assertions.assertEquals(account.getBalance(), -10.0, epsilon);
    }
}