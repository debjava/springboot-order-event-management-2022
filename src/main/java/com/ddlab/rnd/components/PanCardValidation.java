package com.ddlab.rnd.components;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PanCardValidation implements Validation {

    @Override
    public String validate() {
        return "Success";
    }
}
