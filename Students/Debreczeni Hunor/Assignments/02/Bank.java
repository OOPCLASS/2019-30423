import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList = new ArrayList<>();

    public void updateAccounts() {
        for (Account account : accountList) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CurrentAccount) {
                ((CurrentAccount) account).checkOverDraft();
            }
        }
    }

    public void openAccount(Account account) {
        accountList.add(account);
    }

    public void closeAccount(Account account) {
        accountList.remove(account);
    }

    public void payDivident(double amount) {
        for (Account account : accountList) {
            account.deposit(amount);
        }
    }

    public void deposit(Account account, double amount) {
        if (accountList.contains(account)) {
            account.deposit(amount);
        }
    }

    public void withdraw(Account account, double amount) {
        if (accountList.contains(account)) {
            account.withdraw(amount);
        }
    }

    public void print(@NotNull Account account){
        account.print();
    }
}
