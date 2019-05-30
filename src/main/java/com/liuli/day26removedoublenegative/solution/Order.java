package com.liuli.day26removedoublenegative.solution;

import java.util.List;

public class Order {
	public void checkout(List<Product> products, Customer customer){
		if(customer.isFlagged()){
			return;
		}
	}

}
