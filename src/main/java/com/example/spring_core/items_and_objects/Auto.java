package com.example.spring_core.items_and_objects;

import org.springframework.beans.factory.annotation.Autowired;

public class Auto {
    private String model;


    public Auto(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
