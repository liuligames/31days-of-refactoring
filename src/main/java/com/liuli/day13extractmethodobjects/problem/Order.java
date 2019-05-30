package com.liuli.day13extractmethodobjects.problem;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private List<OrderLineItem> orderLineItems = new ArrayList<>();
    private List<Double> discounts = new ArrayList<>();
    private double tax = 0;
    private double netTax = 0;
    private double subtotal = 0;

    public double calculate() {
        orderLineItems.forEach(orderLineItem -> {
            subtotal += orderLineItem.getPrice();
        });
        discounts.forEach(discount -> {
            subtotal -= discount;
        });
        netTax = subtotal * tax;

        return subtotal + netTax;
    }
}
