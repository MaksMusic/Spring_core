package com.example.spring_core.items_and_objects;

import com.example.spring_core.items_and_objects.annotaion.AutoAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HumanAnnotation")
public class HumanAnnotation {

    private Pet pet;

    @Autowired
    public HumanAnnotation(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
