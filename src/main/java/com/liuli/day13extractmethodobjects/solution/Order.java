package com.liuli.day13extractmethodobjects.solution;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private List<OrderLineItem> orderLineItems = new ArrayList<>();
    private List<Double> discounts = new ArrayList<>();
    private double tax;

    public double calculate() {
        return new OrderTotalCalculator(this).calculate();
    }
}
