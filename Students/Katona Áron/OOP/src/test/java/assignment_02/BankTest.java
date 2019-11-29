package assignment_02;

import assignment_02.bank.Account;
import assignment_02.bank.Bank;
import assignment_02.bank.CurrentAccount;
import assignment_02.bank.SavingsAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class BankTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void openAccount() {
        Bank bank = new Bank();
        Account account = new Account(1);

        Assertions.assertEquals("Bank:", bank.toString());
        bank.openAccount(account);
        Assertions.assertEquals("Bank:\n\tAccount 1: balance = 0.0", bank.toString());
    }

    @Test
    void closeAccount() {
        Bank bank = new Bank();
        Account account1 = new Account(1);
        Account account2 = new Account(2);

        bank.openAccount(account1);
        bank.openAccount(account2);
        Assertions.assertEquals("Bank:\n\tAccount 1: balance = 0.0\n\tAccount 2: balance = 0.0", bank.toString());
        bank.closeAccount(1);
        Assertions.assertEquals("Bank:\n\tAccount 2: balance = 0.0", bank.toString());
        bank.closeAccount(2);
        Assertions.assertEquals("Bank:", bank.toString());
    }

    @Test
    void update() {
        SavingsAccount savingsAccount = new SavingsAccount(1, 10);
        CurrentAccount currentAccount = new CurrentAccount(2, 10);
        Bank bank = new Bank(List.of(savingsAccount, currentAccount));

        bank.update();
        Assertions.assertEquals(10, savingsAccount.getBalance());
        Assertions.assertEquals("Account 2 is in overdraft\r\n", outContent.toString());

        outContent.reset();
        currentAccount.deposit(10);
        bank.update();
        Assertions.assertEquals(20, savingsAccount.getBalance());
        Assertions.assertEquals("", outContent.toString());
    }

    @Test
    void payDividend() {
        Account account1 = new SavingsAccount(1, 10);
        Account account2 = new CurrentAccount(2, 10);
        Account account3 = new Account(3);
        Bank bank = new Bank(List.of(account1, account2));

        bank.payDividend(10);
        Assertions.assertEquals(5, account1.getBalance());
        Assertions.assertEquals(5, account2.getBalance());
        Assertions.assertEquals(0, account3.getBalance());

        bank.openAccount(account3);
        bank.payDividend(12);
        Assertions.assertEquals(9, account1.getBalance());
        Assertions.assertEquals(9, account2.getBalance());
        Assertions.assertEquals(4, account3.getBalance());
    }
}