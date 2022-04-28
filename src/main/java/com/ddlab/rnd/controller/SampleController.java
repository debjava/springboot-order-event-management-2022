package com.ddlab.rnd.controller;

import com.ddlab.rnd.entity.User;
import com.ddlab.rnd.events.CustomSpringEvent;
import com.ddlab.rnd.events.CustomSpringEventPublisher;
import com.ddlab.rnd.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService service;

    @PostMapping(path = "/user")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        service.createUser(user);
        return new ResponseEntity<>("User Creation Successful", HttpStatus.CREATED);
    }
}
