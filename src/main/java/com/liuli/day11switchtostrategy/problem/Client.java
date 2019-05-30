package com.liuli.day11switchtostrategy.problem;

public class Client {

	public int calculateShipping() {
		ShippingInfo shippingInfo = new ShippingInfo();
		return shippingInfo.calculateShippingAmount(State.Alaska);
	}
}
