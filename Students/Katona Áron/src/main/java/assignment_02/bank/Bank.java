package assignment_02.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * A Bank class that contains multiple bank accounts.
 * <p>
 * This class provides the basic functionality of a bank. It allows account creations, account closures. It allows to
 * pay a dividend and to update the accounts.
 */
public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Bank(List<Account> accounts) {
        this.accounts = new ArrayList<>(accounts);
    }

    /**
     * Adds the account to the bank.
     *
     * @param account account to be added
     */
    public void openAccount(Account account) {
        this.accounts.add(account);
    }

    /**
     * Deletes an account from the bank given by the account number.
     *
     * @param accountNumber the identifying number of the account
     */
    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    /**
     * Updates the accounts.
     * <p>
     * The SavingsAccounts will have their balanced increased by the interest.
     * The CurrentAccounts will be alerted (printed) if they are in the overdraft limit.
     */
    public void update() {
        accounts.stream()
                .filter(account -> account instanceof SavingsAccount)
                .forEach(account -> ((SavingsAccount) account).addInterest());
        accounts.stream()
                .filter(account -> account instanceof CurrentAccount)
                .filter(account -> ((CurrentAccount) account).isInOverdraft())
                .forEach(account -> System.out.println("Account " + (int) account.getAccountNumber() + " is in overdraft"));
    }

    /**
     * Pays a sum evenly between all the accounts.
     *
     * @param sum sum to be paid
     */
    public void payDividend(double sum) {
        double dividend = sum / accounts.size();
        accounts.forEach(account -> account.deposit(dividend));
    }

    @Override
    public String toString() {
        return "Bank:" +
                accounts.stream()
                        .map(account -> "\n\t" + account)
                        .reduce((string1, string2) -> string1 + string2)
                        .orElse("");
    }
}
