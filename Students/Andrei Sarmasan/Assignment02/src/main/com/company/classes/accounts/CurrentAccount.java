package com.company.classes.accounts;

public class CurrentAccount extends Account {

    private double overdrawLimit;

    public void overDrawLimitReached() {
        final double currentBalance = super.getBalance();
        if (currentBalance <= 0 && -currentBalance >= overdrawLimit) {
            System.err.println("CurrentAccount.overDrawLimitReached(...): sending letter");
        }
    }

    public CurrentAccount(int number, int overdrawLimit) {
        super(number);
        this.overdrawLimit = overdrawLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdrawLimit = " + overdrawLimit + ", " +
                super.toString() + "} ";
    }
}
