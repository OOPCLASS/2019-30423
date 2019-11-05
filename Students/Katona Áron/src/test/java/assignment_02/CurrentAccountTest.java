package assignment_02;

import assignment_02.bank.CurrentAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CurrentAccountTest {

    @Test
    void isInOverdraft() {
        CurrentAccount account = new CurrentAccount(1, 10);
        Assertions.assertTrue(account.isInOverdraft());
        account.deposit(10);
        Assertions.assertFalse(account.isInOverdraft());
        account.withdraw(1);
        Assertions.assertTrue(account.isInOverdraft());
        account.deposit(2);
        Assertions.assertFalse(account.isInOverdraft());
    }
}