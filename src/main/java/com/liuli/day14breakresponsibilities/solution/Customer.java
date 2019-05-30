package com.liuli.day14breakresponsibilities.solution;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private List<Double> lateFees = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    private double sum = 0;

    public void payFee(double fee) {

    }

    public double caclulateBalance(Customer customer) {
        sum = 0;
        List<Double> lateFees = customer.getLateFees();
        lateFees.forEach(lateFee -> sum += lateFee);
        return sum;
    }
}
