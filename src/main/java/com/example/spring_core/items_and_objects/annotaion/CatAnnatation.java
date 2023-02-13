package com.example.spring_core.items_and_objects.annotaion;

import com.example.spring_core.items_and_objects.Pet;
import org.springframework.stereotype.Component;


public class CatAnnatation implements Pet {
    private String name = "Cat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println(name);
    }
}
