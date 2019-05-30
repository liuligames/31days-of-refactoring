package com.liuli.day22breakmethod.problem;

import java.util.List;

public class CashRegister {
    private static final double tax = 0.06;

    private double subTotal = 0;

    public void acceptPayment(Customer customer, List<Product> products, double payment) {
        subTotal = 0;
        products.forEach(product -> subTotal += product.getPrice());

        products.forEach(product -> subTotal -= product.getPrice());
        double grandTotal = subTotal + subTotal * tax;
        customer.deductFromCustomerBalance(grandTotal);

    }
}
