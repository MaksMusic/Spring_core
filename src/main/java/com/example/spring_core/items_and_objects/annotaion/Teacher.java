package com.example.spring_core.items_and_objects.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Teacher {
    @Value("Teacher Kenny")
    private String name;

    public void printHello(){
        System.out.println("I am teacher,my name is "+name);
    }
}
