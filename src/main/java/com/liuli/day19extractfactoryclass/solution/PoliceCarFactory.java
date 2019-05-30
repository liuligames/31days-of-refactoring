package com.liuli.day19extractfactoryclass.solution;


public interface PoliceCarFactory {

    PoliceCar create(int mileage, boolean serviceRequired);

}
