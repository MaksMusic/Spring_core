package com.example.spring_core.d_DI_annotation;

import com.example.spring_core.items_and_objects.annotaion.Tigr;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DI_annotation/applicationContextAnnotation.xml");
            Tigr tigre = context.getBean("tigr", Tigr.class);
            tigre.say();
            context.close();
    }
}
