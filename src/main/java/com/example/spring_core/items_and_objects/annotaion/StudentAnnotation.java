package com.example.spring_core.items_and_objects.annotaion;

import com.example.spring_core.items_and_objects.Pet;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class StudentAnnotation {

   // @Value("Tomas")
   @Value("Tomas")
    private String name;
    private final Pet pet;
    private final Pet pet2;

    public StudentAnnotation(@Qualifier("tigr") Pet pet,@Qualifier("cat") Pet pet2) {
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
