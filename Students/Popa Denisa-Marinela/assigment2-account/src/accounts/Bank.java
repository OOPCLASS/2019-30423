package accounts;
import accounts.Account;
import accounts.CurrentAccount;
import accounts.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account.getClass() == SavingsAccount.class){
                ((SavingsAccount) account).addInterest();
            }
            else if(account.getClass() == CurrentAccount. class){
                ((CurrentAccount) account).overDrawLimitR();
            }
        }
    }
    public void depositOnAccount(Account account, double sum) {
        if(accounts.contains(account)) {
            account.deposit(sum);
        }
        else {
            System.out.println("The requested account is not part of this bank");
        }
    }

    public void withdrawFromAccount(Account account, double sum) {
        if(accounts.contains(account)) {
            account.withdraw(sum);
        }
        else {
            System.out.println("The requested account is not part of this bank");
        }
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}