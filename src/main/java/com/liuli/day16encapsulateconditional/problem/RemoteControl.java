package com.liuli.day16encapsulateconditional.problem;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RemoteControl {
    private String[] functions;
    private String name;
    private int year;

    public String performCoolFunction(String buttonPressed) {
        if (functions.length > 1 && name.compareTo("RCA") == 0 && year == LocalDateTime.now().getYear() - 1) {
            return "do something";
        }
        return "Error!";
    }
}
