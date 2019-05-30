package com.liuli.day28renamebooleanmethod.solution;

public class BankAccount {
    public void CreateAccountWithChecking(Customer customer) {
        CreateAccount(customer, true, false);
    }

    public void CreateAccountWithCheckingAndSavings(Customer customer) {
        CreateAccount(customer, true, true);
    }

    private void CreateAccount(Customer customer, boolean withChecking, boolean withSavings) {
    }
}
