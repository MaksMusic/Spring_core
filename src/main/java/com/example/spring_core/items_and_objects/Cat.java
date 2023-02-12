package com.example.spring_core.items_and_objects;

public class Cat implements Pet{

    public Cat() {
        System.out.println("start constructor class cat");
    }

    @Override
    public void say() {
        System.out.println("cat");
    }
}
