package com.example.spring_core;

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
