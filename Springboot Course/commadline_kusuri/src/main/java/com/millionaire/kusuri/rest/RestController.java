package com.millionaire.kusuri.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //inject properties for: dheeraj.kusuri and millionaire.kusuri

    @Value("${dheeraj.kusuri}")
    private String dheerajKusuri;

    @Value("${millionaire.kusuri}")
    private String millionaireKusuri;


    // Expose new endpoint for the "Millionaire"

    @GetMapping("/millionaires")
    public String millionsInfo(){
        return "I am " + dheerajKusuri + " who is " + millionaireKusuri;
    }

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
