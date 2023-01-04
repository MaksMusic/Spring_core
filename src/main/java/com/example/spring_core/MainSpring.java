package com.example.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Buy a dog ");
        System.out.println("2 Buy a cat");
        Pet pet;

        //�������� ������ �� ������ ���������� (Application context)
        ClassPathXmlApplicationContext context = //������ ���������  (Application Context)
                new ClassPathXmlApplicationContext("applicationContext.xml");

        if (scanner.nextLine().equals("1")){
            pet = context.getBean("petDog",Pet.class); //id ������� � ��� ���
        }else {
             pet = context.getBean("petCat",Pet.class);
        }
        pet.say();

    }
}
