package com.liuli.day19extractfactoryclass.problem;


public class PoliceCarController {

    public PoliceCar createPoliceCar(int mileage, boolean serviceRequired) {
        PoliceCar car = new PoliceCar();
        car.setMileage(mileage);
        car.setServiceRequired(serviceRequired);
        return car;
    }
}
