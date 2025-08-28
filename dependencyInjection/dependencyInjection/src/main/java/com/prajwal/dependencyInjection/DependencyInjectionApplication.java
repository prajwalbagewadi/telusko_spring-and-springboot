package com.prajwal.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

        ApplicationContext context;
		context=SpringApplication.run(DependencyInjectionApplication.class, args); //IOC Container

        //without Dependency Injection
        //System.out.println("User created object:");
        //Developer dev1=new Developer();//creating the object yourself. before spring
        //dev1.build();

        //Implementing Depending injection
        System.out.println("Spring created object:");
        Developer dev2=context.getBean(Developer.class);
        dev2.build();
	}

}
