package com.example.spring_core.j_Java_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // говорит о том что этот файл конфигурации для AnnotationConfigApplicationContext
@ComponentScan("com.example.spring_core") //пусть к пакету для скана


public class MyConfig {

}
