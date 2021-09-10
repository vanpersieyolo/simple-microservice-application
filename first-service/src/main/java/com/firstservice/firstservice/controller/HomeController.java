package com.firstservice.firstservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${service.instance.name}")
    private String instance;

    @RequestMapping(value = "/")
    public String welcome(){
        return "Hello " + instance;
    }
}
