package com.prajwal;
//simple class and method
public class Dev {
//    private int age;

//    private Laptop laptop;

    private Computer com;

    //getter method
//    public int getAge() {
//        return age;
//    }

    //setter method <injection>
//    public void setAge(int agevar){
//        this.age=agevar;
//    }

    //setter injection ref
//    public void setLaptop(Laptop lappy){
//        this.laptop=lappy;
//    }

    //getter ref
//    public Laptop getLaptop(){
//        return laptop;
//    }

    //constructor injection
//    public Dev(Laptop lappy){
//        this.laptop=lappy;
//    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    //constructor method injection
//    public Dev(int agevar){
//        System.out.println("Dev Constructor for injecting.");
//        this.age=agevar;
//    }

    //getter setter for com
    public Computer getCom(){
        return com;
    }

    public void setCom(Computer com){
        this.com=com;
    }

    public void build(){
        com.compile();
        System.out.println("working on code.");
    }
}
