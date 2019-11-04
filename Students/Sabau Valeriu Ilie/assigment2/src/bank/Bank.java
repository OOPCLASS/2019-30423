package bank;

public class Bank {

    private Account[] accounts;
    private int numberOfAccounts = 0;
    private final int sizeOfAccounts = 200;

    public Bank() {
        accounts = new Account[sizeOfAccounts];
    }

    public void openAccount(Account newAccount) {
        if (sizeOfAccounts > numberOfAccounts)
            accounts[numberOfAccounts++] = newAccount;
    }

    public void closeAccountByIndex(int index) {
        if (numberOfAccounts - 1 - index >= 0)
            System.arraycopy(accounts, index + 1, accounts, index, numberOfAccounts - 1 - index);
        numberOfAccounts--;
    }

    public void updateAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i] instanceof SavingAccount) {
                SavingAccount savingAccount = (SavingAccount) accounts[i];
                savingAccount.addInterestToBalance();
            }
            if (accounts[i] instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) accounts[i];
                if (currentAccount.isOverdrawn()) {
                    System.out.println("send message to currentAccount " + currentAccount.getAccountNumber());
                }
            }
        }
    }

    public void payDividends(int accountNumber, double sum) {
        for (Account account : accounts) {

            if (account != null && account.getAccountNumber() == accountNumber) {
                account.deposit(sum);
            }
        }
    }

    public void printAllAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public String getAccountString(int index) {
        if (index < numberOfAccounts) {
            return accounts[index].toString();
        } else return null;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
