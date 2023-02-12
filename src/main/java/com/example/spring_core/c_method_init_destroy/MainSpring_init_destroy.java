package com.example.spring_core.c_method_init_destroy;

import com.example.spring_core.items_and_objects.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring_init_destroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("method_init_destroy/applicationContextInitDestroy.xml");

        Dog dog = context.getBean("petDog",Dog.class);
        dog.say();
        context.close();
    }
}
