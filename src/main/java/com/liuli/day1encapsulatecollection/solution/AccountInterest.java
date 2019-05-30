package com.liuli.day1encapsulatecollection.solution;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountInterest {

    private List<BankAccount> bankAccountList;

    public AccountInterest() {
        bankAccountList = new ArrayList<>();
    }

    public List<BankAccount> getBankAccountList() {
        return Collections.unmodifiableList(bankAccountList);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public void removeBankAccount(BankAccount bankAccount) {
        if (bankAccountList.contains(bankAccount)) {
            bankAccountList.remove(bankAccount);
        }
    }

    public int getBankAccountTotal() {
        return bankAccountList.size();
    }
}
