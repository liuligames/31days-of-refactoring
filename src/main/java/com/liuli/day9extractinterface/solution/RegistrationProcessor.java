package com.liuli.day9extractinterface.solution;


public class RegistrationProcessor {

	public int processRegistration(ClassRegistration registration){
		registration.create();
		return registration.getTotal();
	}
}
