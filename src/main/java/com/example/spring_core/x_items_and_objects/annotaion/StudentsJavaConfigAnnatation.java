package com.example.spring_core.x_items_and_objects.annotaion;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentConfig")
public class StudentsJavaConfigAnnatation {

    @Value("Tomas")
    private String name;
    private final Pet pet;
    private final Pet pet2;

    public StudentsJavaConfigAnnatation(@Qualifier("tigr") Pet pet, @Qualifier("cat") Pet pet2) {
        this.pet = pet;
        this.pet2 = pet2;
    }

    public void infoStudent(){
        System.out.print("Hello I m stdentd , my pets one ");
        pet.say();
        System.out.print("my pets two ");
        pet2.say();
    }

    public String getName() {
        return "My name " + name;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("init method");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy method");
    }
}
