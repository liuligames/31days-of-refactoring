package com.liuli.day20extractsubclass.solution;

import lombok.Data;

@Data
public class NonRegistration extends Registration {

    private NonRegistrationAction action;

    private String notes;

}
