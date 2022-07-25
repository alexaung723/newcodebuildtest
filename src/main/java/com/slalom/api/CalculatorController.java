package com.slalom.api;


import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {


/*
    @GetMapping("/calculator")
    //test this via http://localhost:8080/calculator
    public Greeting greeting(@RequestParam(value = "number1", defaultValue = "World") int x1 , @RequestParam
            (value = "number2", defaultValue = "0") int x2) {
       return "";
    }


 */

    @GetMapping("/calculator")
    //test this via http://localhost:8080/greeting and http://localhost:8080/greeting?name=Kesha
    public int calculate(@RequestParam(value = "number1", defaultValue = "World") int x1 , @RequestParam
            (value = "number2", defaultValue = "0") int x2) {
        return x1 + x2;
    }
}
