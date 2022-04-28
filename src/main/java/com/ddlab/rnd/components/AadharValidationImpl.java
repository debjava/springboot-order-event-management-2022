package com.ddlab.rnd.components;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AadharValidationImpl implements Validation {

    @Override
    public String validate() {
        return "Sucess";
    }
}
