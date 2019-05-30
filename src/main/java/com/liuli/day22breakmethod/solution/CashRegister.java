package com.liuli.day22breakmethod.solution;

import java.util.List;

public class CashRegister {
    private static final double tax = 0.06;

    private double subTotal = 0;

    public void acceptPayment(Customer customer, List<Product> products, double payment) {
        double subTotal = calculateSubTotal(products);
        subTotal = subtractDiscounts(products);
        double grandTotal = addTax(subTotal);
        subtractFromCustomerBalance(customer, grandTotal);
    }

    private double calculateSubTotal(List<Product> products) {
        subTotal = 0;
        products.forEach(product -> subTotal += product.getPrice());
        return subTotal;
    }

    private double subtractDiscounts(List<Product> products) {
        subTotal = 0;
        products.forEach(product -> subTotal -= product.getPrice());
        return subTotal;
    }

    private double addTax(double subTotal) {
        return subTotal + subTotal * tax;
    }

    private void subtractFromCustomerBalance(Customer customer, double amount) {
        customer.deductFromCustomerBalance(amount);
    }
}
