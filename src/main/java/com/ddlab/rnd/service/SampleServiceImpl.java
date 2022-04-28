package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.User;
import com.ddlab.rnd.events.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private CustomSpringEventPublisher publisher;

    public void createUser(User user) {
        publisher.publishCustomEvent("User Created successfully ...");
    }
}
