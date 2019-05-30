package com.liuli.day16encapsulateconditional.solution;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RemoteControl {
    private String[] functions;
    private String name;
    private int year;

    private boolean hasExtraFunctions = functions.length > 1 && name.compareTo("RCA") == 0
            && year == LocalDateTime.now().getYear() - 1;

    public String performCoolFunction(String buttonPressed) {
        if (hasExtraFunctions){
            return "do something";
        }
        return "Error!";
    }
}
