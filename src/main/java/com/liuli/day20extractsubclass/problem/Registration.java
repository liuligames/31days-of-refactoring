package com.liuli.day20extractsubclass.problem;

import lombok.Data;

import java.util.Date;

@Data
public class Registration {

    private NonRegistrationAction action;

    private int RegistrationTotal;

    private String notes;

    private String description;

    private Date RegistrationDate;
}
