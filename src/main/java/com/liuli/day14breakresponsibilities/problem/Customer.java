package com.liuli.day14breakresponsibilities.problem;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {

    private List<Double> lateFees = new ArrayList<>();

    private List<Video> videos = new ArrayList<>();
}
