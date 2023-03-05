package com.example.spring_core.j_Java_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.spring_core.x_items_and_objects.annotaion.*;

public class MainAnnatationJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        StudentsJavaConfigAnnatation student = context.getBean("studentConfig",StudentsJavaConfigAnnatation.class);
        System.out.println(student.getName());
        student.infoStudent();

    }
}
