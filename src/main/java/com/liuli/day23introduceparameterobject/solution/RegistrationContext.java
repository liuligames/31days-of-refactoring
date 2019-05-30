package com.liuli.day23introduceparameterobject.solution;

import lombok.Data;

import java.util.List;

@Data
public class RegistrationContext {

    private double amount;

    private Student student;

    private List<Course> courses;

    private double credits;

}
