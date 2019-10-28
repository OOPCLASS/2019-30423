package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {
    private final double epsilon = 0.00001;

    @Test
    void withdrawNoOverdrawnTest()
    {
        CurrentAccount account=new CurrentAccount(3);
        account.deposit(30);
        Assertions.assertEquals(account.getBalance(),30.0,epsilon);
        account.withdraw(40);
        Assertions.assertEquals(account.getBalance(),-10.0,epsilon);
    }

    @Test
    void withdrawOverdrawnTest()
    {
        CurrentAccount account=new CurrentAccount(3);
        account.setOverdraftLimit(-50);
        account.withdraw(40);
        Assertions.assertEquals(account.getBalance(),-40.0,epsilon);
        account.withdraw(40);
        Assertions.assertEquals(account.getBalance(),-40.0,epsilon);
    }

}