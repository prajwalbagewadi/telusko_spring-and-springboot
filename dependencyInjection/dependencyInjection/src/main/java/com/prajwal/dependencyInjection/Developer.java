package com.prajwal.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//simple class and method
@Component
public class Developer {

    @Autowired //Field Injection
    @Qualifier("desktop")
    //private Laptop mac;
    private Computer comp;

    // Constructor injection
//    public Developer(Laptop lappy){
//        System.out.println("Dev class object:");
//        this.mac=lappy;
//    }

    //Setter Injection
//    @Autowired
//    public void setLaptop(Laptop lappy){
//        this.mac=lappy;
//    }

    public void build(){
        comp.compiler();
        System.out.println("dev coding...");
    }
}
