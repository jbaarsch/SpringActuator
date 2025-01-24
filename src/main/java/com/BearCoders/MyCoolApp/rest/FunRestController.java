package com.BearCoders.MyCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


    @GetMapping("/workout")
    public String getWorkout() {
        return "Run a 5k!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Good times are heading your way!";
    }


}
