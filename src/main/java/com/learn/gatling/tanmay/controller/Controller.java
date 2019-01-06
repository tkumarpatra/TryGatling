package com.learn.gatling.tanmay.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/welcome")
    @ResponseBody
    public String controller1(){
        return "Hello Gatling";
    }

    @GetMapping("/error")
    public String controllerError(){
        return "Error in Gatling";
    }
}
