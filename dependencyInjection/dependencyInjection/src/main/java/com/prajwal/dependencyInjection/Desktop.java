package com.prajwal.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compiler(){
        System.out.println("Desktop class method.");
        System.out.println("Compiler running...");
    }
}
