package com.example.spring_core.x_items_and_objects.xmlConfigItems;

import com.example.spring_core.x_items_and_objects.annotaion.Pet;


public class Dog implements Pet {

    public Dog() {
        System.out.println("start constructor class dog");
    }

    @Override
    public void say(){
        System.out.println("dog");
    }

    public void init(){
        System.out.println("Dog init");

    }

    public void destroy(){
        System.out.println("Dog destroy");
    }

}
