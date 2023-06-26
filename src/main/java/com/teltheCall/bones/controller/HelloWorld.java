package com.teltheCall.bones.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class HelloWorld {


    @GetMapping("/hello")
    public String helloMethod(){

        return "Service is up";
    }

}
