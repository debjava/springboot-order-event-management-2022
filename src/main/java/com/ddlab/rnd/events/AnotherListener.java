package com.ddlab.rnd.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherListener {

    @EventListener(condition = "")
    public void onMyEvent (CustomSpringEvent event) {
        System.out.print("event received: " + event.getMessage());
    }
}
