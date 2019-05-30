package com.liuli.day13extractmethodobjects.solution;

import java.util.ArrayList;
import java.util.List;

public class OrderTotalCalculator {
    private List<OrderLineItem> orderLineItems = new ArrayList<>();
    private List<Double> discounts = new ArrayList<>();
    private double tax;
    private double subtotal = 0;
    private double netTax = 0;

    public OrderTotalCalculator(Order order) {
        this.orderLineItems = order.getOrderLineItems();
        this.discounts = order.getDiscounts();
        this.tax = order.getTax();
    }

    public double calculate() {
        calculateTotal();
        subtractDiscounts();
        calculateTax();
        return subtotal + netTax;
    }

    public void calculateTotal() {
        orderLineItems.forEach(orderLineItem -> {
            subtotal += orderLineItem.getPrice();
        });
    }

    public void subtractDiscounts() {
        discounts.forEach(discount -> {
            subtotal -= discount;
        });
    }

    public void calculateTax() {
        netTax = subtotal * tax;
    }

}
