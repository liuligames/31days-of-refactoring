package com.liuli.day2movemethod.solution;


public class AccountInterest {

    private BankAccount bankAccount;

    public AccountInterest(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getInterestRate() {
        return this.calculateInterestRate();
    }

    public boolean isIntroductoryRate() {
        return this.calculateInterestRate() < 0.05;
    }

    public double calculateInterestRate() {
        if (bankAccount.getCreditStore() > 800) {
            return 0.02;
        }
        if (bankAccount.getCreditStore() > 10) {
            return 0.03;
        }
        return 0.05;
    }
}
