package com.liuli.day11switchtostrategy.solution;


public class Client {

	public int calculateShipping() {
		ShippingInfo shippingInfo = new ShippingInfo();
		return shippingInfo.calculateShippingCost(State.Alaska);
	}
}
