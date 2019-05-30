package com.liuli.day26removedoublenegative.problem;

import java.util.List;

public class Order {
	public void checkout(List<Product> products, Customer customer){
		if(!customer.isNotFlagged()){
			return;
		}
	}

}
