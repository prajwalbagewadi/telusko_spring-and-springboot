package com.prajwal.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    @Override
    public void compiler(){
        System.out.println("Laptop class method.");
        System.out.println("Compiler running...");
    }
}
