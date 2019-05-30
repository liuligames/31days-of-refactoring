package com.liuli.day26removedoublenegative.solution;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean isFlagged() {
        return balance <= 30.0;
    }

}
