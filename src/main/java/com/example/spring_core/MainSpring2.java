package com.example.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //Singleton (default)
        Cat cat = context.getBean("petCat", Cat.class);
        Cat cat2 = context.getBean("petCat", Cat.class);

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println("----------------");

        //Prototype
        Dog dog = context.getBean("petDog", Dog.class);
        Dog dog2 = context.getBean("petDog", Dog.class);

        System.out.println(dog);
        System.out.println(dog2);

    }
}
