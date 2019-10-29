package com.company.classes.accounts;


public class SavingsAccount extends Account {

    private double interest;

    public void addInterest() {
        this.deposit(interest);
    }

    public SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interest = " + interest + ", " +
                 super.toString() + "} ";
    }
}
