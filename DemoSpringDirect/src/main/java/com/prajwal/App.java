package com.prajwal;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        //user created object:
//        Developer obj=new Developer();
//        obj.build();

        //IOC container
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //Dev object with typecast
        //Dev obj = (Dev) context.getBean("dev");
        Dev obj = context.getBean(Dev.class);
        obj.build();
        //obj.age=10; //age is private
//        System.out.println("dev age="+obj.getAge());
    }
}
