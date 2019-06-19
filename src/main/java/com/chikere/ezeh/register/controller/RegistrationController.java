package com.chikere.ezeh.register.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("/test")
    public String testMapping(){
        return "Test passed";
    }
}
