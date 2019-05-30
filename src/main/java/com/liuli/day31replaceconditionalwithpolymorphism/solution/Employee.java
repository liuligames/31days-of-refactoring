package com.liuli.day31replaceconditionalwithpolymorphism.solution;

public class Employee extends Customer {

	@Override
	public double getDiscountPercent() {
		return 15;
	}

}
