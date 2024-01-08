package com.example.cloudy_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @GetMapping({"/hello"})
    public String sayHello()
    {
        System.out.println("Hello");
        return "Hello!";
    }
}
