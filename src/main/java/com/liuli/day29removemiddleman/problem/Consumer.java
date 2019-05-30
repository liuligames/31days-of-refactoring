package com.liuli.day29removemiddleman.problem;


public class Consumer {
    private AccountManager accountManager;

    public Consumer(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public Account get(int id) {
        return accountManager.getAccount(id);
    }
}
