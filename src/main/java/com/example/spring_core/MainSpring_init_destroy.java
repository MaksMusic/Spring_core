package com.example.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring_init_destroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        Dog dog = context.getBean("petDog",Dog.class);
        dog.say();
        context.close();
    }
}
