package com.example.spring_core;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("my my");
    }
}