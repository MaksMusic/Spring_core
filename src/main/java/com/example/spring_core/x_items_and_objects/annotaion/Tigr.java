package com.example.spring_core.x_items_and_objects.annotaion;

import org.springframework.stereotype.Component;

@Component("tigr")
public class Tigr implements Pet {
    @Override
    public void say() {
        System.out.println("tigre");
    }
}
