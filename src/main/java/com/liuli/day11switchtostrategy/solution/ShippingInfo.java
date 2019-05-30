package com.liuli.day11switchtostrategy.solution;


import java.util.HashMap;
import java.util.Map;

public class ShippingInfo {
	private Map<State, ShippingCalculatorStrategy> shippingCalculations;
	
	public ShippingInfo(){
		shippingCalculations = new HashMap<>();
		shippingCalculations.put(State.Alaska, new AlaskaShippingCalculator());
		shippingCalculations.put(State.NewYork, new NewYorkShippingCalculator());
		shippingCalculations.put(State.Florida, new FloridaShippingCalculator());
	}
	
	public int calculateShippingCost(State state){
		return shippingCalculations.get(state).calculate();
	}
}
