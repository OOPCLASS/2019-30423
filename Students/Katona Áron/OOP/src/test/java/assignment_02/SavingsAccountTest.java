package assignment_02;

import assignment_02.bank.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

    @Test
    void addInterest() {
        SavingsAccount account = new SavingsAccount(1, 2);
        Assertions.assertEquals(0, account.getBalance());
        Assertions.assertEquals(2, account.getInterest());
        account.addInterest();
        Assertions.assertEquals(2, account.getBalance());
        account.setInterest(3);
        account.addInterest();
        Assertions.assertEquals(5, account.getBalance());
        Assertions.assertEquals(3, account.getInterest());
    }
}