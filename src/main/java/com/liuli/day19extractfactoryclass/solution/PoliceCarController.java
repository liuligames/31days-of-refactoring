package com.liuli.day19extractfactoryclass.solution;

public class PoliceCarController {

    private PoliceCarFactory policeCarFactory;
	
    public PoliceCarController(PoliceCarFactory policeCarFactory) {
        this.policeCarFactory = policeCarFactory;
    }

    public PoliceCar createPoliceCar(int mileage, boolean serviceRequired) {
        return policeCarFactory.create(mileage, serviceRequired);
    }

}
