package com.liuli.day9extractinterface.problem;

public class RegistrationProcessor {

    public int processRegistration(ClassRegistration registration) {
        registration.create();
        return registration.getTotal();
    }
}
