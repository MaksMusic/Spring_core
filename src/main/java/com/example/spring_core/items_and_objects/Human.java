package com.example.spring_core.items_and_objects;

public class Human {
    private String name;
    private  String surname;
    private int age;
    Pet pet;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void myPet(){
        System.out.println("My name is "+name +" "+ surname + " I'm "+age);
        System.out.print("it is my pet ");
        pet.say();
    }

}
