package com.example.spring_core.x_items_and_objects.xmlConfigItems;

import com.example.spring_core.x_items_and_objects.annotaion.Pet;


public class Cat implements Pet {

    public Cat() {
        System.out.println("start constructor class cat");
    }

    @Override
    public void say() {
        System.out.println("cat");
    }
}
