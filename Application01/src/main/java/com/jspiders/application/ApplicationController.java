package com.jspiders.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ApplicationController {
    @GetMapping("/message")
    public String getMessage(){
        String message = "GET/Hello World";
        return message;
    }

    @PostMapping("/message")
    public String postMessage(){
        String message = "POST/Hello World";
        return message;
    }
}
