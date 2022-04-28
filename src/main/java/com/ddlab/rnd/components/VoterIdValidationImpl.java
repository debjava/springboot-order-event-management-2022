package com.ddlab.rnd.components;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class VoterIdValidationImpl implements Validation {
    @Override
    public String validate() {
        return "Sucess";
    }
}
