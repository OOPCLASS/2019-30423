package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Account> accountList;

	public Bank() {
		accountList = new ArrayList<>();
	}

	public Bank(List<Account> accountList) {
		this.accountList = new ArrayList<>(accountList);
	}

	public void addAccout(Account acc) {
		this.accountList.add(acc);
	}

	public void deleteAccout(Account acc) {
		this.accountList.remove(acc);
	}

	public void update() {
		accountList.stream().filter(acc -> acc instanceof SavingsAccount)
				.forEach(acc -> ((SavingsAccount) acc).addInterest());
		accountList.stream().filter(acc -> acc instanceof CurrentAccount)
				.filter(acc -> ((CurrentAccount) acc).overdrafCheck())
				.forEach(acc -> System.out.println((int) acc.getAccountNumber() + "in overdraft"));

	}

	public void pay(double amount) {
		accountList.forEach(acc -> acc.deposit(amount / accountList.size()));
	}

	public String toString() {
		return accountList.stream().map(account -> account+"\n").reduce((string1, string2) -> string1 + string2)
				.orElse("");
	}

}
