package com.liuli.day19extractfactoryclass.solution;

public class PoliceCarFactoryImpl implements PoliceCarFactory {

    @Override
    public PoliceCar create(int mileage, boolean serviceRequired) {
        PoliceCar car = new PoliceCar();
        car.setMileage(mileage);
        car.setServiceRequired(serviceRequired);
        return car;
    }

}
