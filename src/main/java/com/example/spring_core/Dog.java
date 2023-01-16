package com.example.spring_core;

public class Dog implements Pet {

    public Dog() {
        System.out.println("start constructor class dog");
    }

    @Override
    public void say(){
        System.out.println("Ppppp i am dog");
    }

    public void init(){
        System.out.println("Dog init");

    }

    public void destroy(){
        System.out.println("Dog destroy");
    }

}
