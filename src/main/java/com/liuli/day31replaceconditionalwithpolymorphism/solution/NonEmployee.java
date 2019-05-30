package com.liuli.day31replaceconditionalwithpolymorphism.solution;

public class NonEmployee extends Customer {

	@Override
	public double getDiscountPercent() {
		return 5;
	}

}
