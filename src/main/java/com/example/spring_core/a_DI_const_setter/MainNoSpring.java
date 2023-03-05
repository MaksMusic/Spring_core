package com.example.spring_core.a_DI_const_setter;

import com.example.spring_core.x_items_and_objects.xmlConfigItems.Cat;
import com.example.spring_core.x_items_and_objects.xmlConfigItems.Dog;
import com.example.spring_core.x_items_and_objects.annotaion.Pet;

import java.util.Scanner;

public class MainNoSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Buy a dog ");
        System.out.println("2 Buy a cat");
        Pet pet ;
        if (scanner.nextLine().equals("1")){
             pet = new Dog();
        }else {
             pet = new Cat();

        }
        pet.say();

    }
}
