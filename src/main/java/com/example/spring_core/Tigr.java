package com.example.spring_core;

import org.springframework.stereotype.Component;

@Component
public class Tigr implements Pet{
    @Override
    public void say() {
        System.out.println("tigre");
    }
}
