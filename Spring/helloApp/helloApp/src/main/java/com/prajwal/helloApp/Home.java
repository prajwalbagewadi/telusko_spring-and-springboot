package com.prajwal.helloApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/") //maps to homepage or root
    public String greet(){
        System.out.println("Hello world spring app live:8080."); //shows msg in terminal
        return "Hello world spring app live:8080.";
    }
}
