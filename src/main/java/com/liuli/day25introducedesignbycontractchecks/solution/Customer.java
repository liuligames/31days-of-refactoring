package com.liuli.day25introducedesignbycontractchecks.solution;

import lombok.Data;

@Data
public class Customer {

    private String name;

    private double balance;

    public void addBalance(double amount) {
        balance += amount;
    }

}
