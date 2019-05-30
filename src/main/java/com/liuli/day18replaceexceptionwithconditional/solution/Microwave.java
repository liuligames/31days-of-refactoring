package com.liuli.day18replaceexceptionwithconditional.solution;

public class Microwave {
    private MicrowaveMotor motor;

    public boolean cook(String dish) {
        if (motor.inUse()) {
            return false;
        } else {
            motor.cook(dish);
            return true;
        }
    }
}
