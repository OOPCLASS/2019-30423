package bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BankTest {

    @Test
    void openAccountTest() {

        Bank bank=new Bank();
        CurrentAccount currentAccount=new CurrentAccount(1,-40);
        bank.openAccount(currentAccount);
        Assertions.assertEquals(bank.getNumberOfAccounts(),1);
        Assertions.assertEquals(bank.getAccountString(0),currentAccount.toString());
    }

    @Test
    void closeAccountByIndexTest() {
        Bank bank=new Bank();
        CurrentAccount currentAccount=new CurrentAccount(1,-40);
        bank.openAccount(currentAccount);
        Assertions.assertEquals(bank.getNumberOfAccounts(),1);
        Assertions.assertEquals(bank.getAccountString(0),currentAccount.toString());

        bank.closeAccountByIndex(0);
        Assertions.assertNull(bank.getAccountString(0));
        Assertions.assertEquals(bank.getNumberOfAccounts(),0);
    }


}