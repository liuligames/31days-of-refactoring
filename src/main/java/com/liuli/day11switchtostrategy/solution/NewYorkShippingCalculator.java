package com.liuli.day11switchtostrategy.solution;

public class NewYorkShippingCalculator implements ShippingCalculatorStrategy {

	@Override
	public int calculate() {
		return 10;
	}

}
