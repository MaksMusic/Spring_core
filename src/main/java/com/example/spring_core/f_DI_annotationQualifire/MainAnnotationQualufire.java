package com.example.spring_core.f_DI_annotationQualifire;

import com.example.spring_core.items_and_objects.annotaion.HumanAnnotation;
import com.example.spring_core.items_and_objects.annotaion.StudentAnnotation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotationQualufire {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("DI_annotationQualifire/applicationContextQualifire.xml");

        StudentAnnotation student = context.getBean("student",StudentAnnotation.class);
        student.infoStudent();
        System.out.println(student.getName());

    }
}
