package com.liuli.day2movemethod.problem;

import lombok.Data;

@Data
public class BankAccount {

    private int accountAge;

    private int creditStore;

    public double calculateInterestRate() {
        if (creditStore > 800) {
            return 0.02;
        }
        if (creditStore > 10) {
            return 0.03;
        }
        return 0.05;
    }
}