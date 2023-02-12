package com.example.spring_core.a_IC_DI_const_setter;

import com.example.spring_core.items_and_objects.Auto;
import com.example.spring_core.items_and_objects.Human;
import com.example.spring_core.items_and_objects.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Buy a dog ");
        System.out.println("2 Buy a cat");
        Pet pet;

        // Получить объект из Спринг контейнера (Application context)
        ClassPathXmlApplicationContext context = //Спринг контейнер  (Application Context)
                new ClassPathXmlApplicationContext("IC_DI_const_setter/applicationContext.xml");

        //Inversion of Control - спринг создает оъбект human и сам добавляет в него объект Pet
//        if (scanner.nextLine().equals("1")){
//            pet = context.getBean("petDog",Pet.class); //id объекта и его Тип
//        }else {
//             pet = context.getBean("petCat",Pet.class);
//        }
//        pet.say();

        //Dependensy injection спринг создает оъбект human в внедряет в него объект объект Pet
        //выбор животного идет через Application Context (файл конфигурации)

        //сейчас петс внедряется через сетер
        Human human = context.getBean("_human",Human.class);
        human.myPet();

        Auto auto = context.getBean("_auto",Auto.class);
        System.out.println(auto.getModel());
    }
}
