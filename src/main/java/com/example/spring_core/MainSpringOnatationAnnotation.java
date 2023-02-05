package com.example.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringOnatationAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
            Tigr tigre = context.getBean("tigr", Tigr.class);
            tigre.say();
            context.close();
    }
}
