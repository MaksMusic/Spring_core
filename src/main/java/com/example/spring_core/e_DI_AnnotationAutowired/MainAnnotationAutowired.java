package com.example.spring_core.e_DI_AnnotationAutowired;

import com.example.spring_core.items_and_objects.annotaion.HumanAnnotation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotationAutowired {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DI_AnnotationAutowired/applicationContextAutowired.xml");

        HumanAnnotation human = context.getBean("HumanAnnotation", HumanAnnotation.class);
        human.getPet().say();

    }
}
