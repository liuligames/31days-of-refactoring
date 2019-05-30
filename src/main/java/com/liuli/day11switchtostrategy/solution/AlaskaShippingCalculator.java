package com.liuli.day11switchtostrategy.solution;

public class AlaskaShippingCalculator implements ShippingCalculatorStrategy {

	@Override
	public int calculate() {
		return 15;
	}
}
