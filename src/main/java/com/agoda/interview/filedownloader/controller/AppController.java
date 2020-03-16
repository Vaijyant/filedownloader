package com.agoda.interview.filedownloader.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}