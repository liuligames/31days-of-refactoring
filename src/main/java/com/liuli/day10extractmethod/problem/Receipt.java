package com.liuli.day10extractmethod.problem;

import java.util.List;

public class Receipt {

    private List<Float> discounts;
    private List<Float> itemTotals;

    public float Method1() {
        float subTotal = 0f;

        for (Float itemTotal : itemTotals) {
            subTotal += itemTotal;
        }

        if (discounts.size() > 0) {
            for (Float discount : discounts) {
                subTotal -= discount;
            }
        }

        float tax = subTotal * 0.065f;

        subTotal += tax;

        return subTotal;
    }
}
