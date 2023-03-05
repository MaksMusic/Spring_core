package com.example.spring_core.x_items_and_objects.annotaion;

import org.springframework.stereotype.Component;

@Component("cat")
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
