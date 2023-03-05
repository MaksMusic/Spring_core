package com.example.spring_core.x_items_and_objects.annotaion;

import org.springframework.stereotype.Component;

@Component
public class AutoAnnotation {
    private String model = "Auto Sport Car";


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
