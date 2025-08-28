package com.prajwal.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller //converts the normal class to a controller.
@RestController //converts the class to RestApi controller to only send data.
public class HomeController {
    @RequestMapping("/") //maps method to home page or root
    //@ResponseBody //returns only data called body
    public String greet(){
        System.out.println("called greet()");
        return "welcome to prajwal.";
    }
}
