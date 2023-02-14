package com.example.spring_core.items_and_objects.annotaion;

import com.example.spring_core.items_and_objects.Pet;
import org.springframework.stereotype.Component;

@Component
public class Tigr implements Pet {
    @Override
    public void say() {
        System.out.println("tigre");
    }
}
