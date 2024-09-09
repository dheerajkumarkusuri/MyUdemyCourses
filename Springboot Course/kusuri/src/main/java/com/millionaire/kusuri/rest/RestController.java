package com.millionaire.kusuri.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world!!";
    }

    @GetMapping("/workout")
    public String jogging(){
        return "It was raining today!";
    }

    @GetMapping("/morning")
    public String greet(){
        return "It was raining today!";
    }

    @GetMapping("/values")
    public String value(){
        return "5*6 = 30";
    }

}
