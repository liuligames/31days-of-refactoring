package com.liuli.day10extractmethod.solution;

import java.util.List;

public class Receipt {
    private List<Float> discounts;
    private List<Float> itemTotals;

    public float CalculateGrandTotal() {
        float subTotal = 0f;
        subTotal = addItemTotals(itemTotals);
        subTotal = minuteDiscounts(itemTotals);
        subTotal = calcTax(subTotal);
        return subTotal;
    }

    float addItemTotals(List<Float> itemTotals) {

        float subTotal = 0f;
        for (Float itemTotal : itemTotals) {
            subTotal += itemTotal;
        }
        return subTotal;
    }

    float minuteDiscounts(List<Float> discounts) {
        float subTotal = 0f;
        if (discounts.size() > 0) {
            for (Float discount : discounts) {
                subTotal -= discount;
            }
        }
        return subTotal;
    }

    float calcTax(float subTotal) {
        float tax = subTotal * 0.065f;
        subTotal += tax;
        return subTotal;
    }

}
