package com.spring.exercicio1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloWorld {

    @GetMapping("/")
    public String heloWorld() {
        return "Hello, World!";
    }
}
