package com.anubha.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping({"/hello"})
    public String helloUser(){

        return "Hello World.";
    }
}
