package com.example.spring_core;

public class Human {
    Pet pet;
    public Human(Pet pet) {
        this.pet = pet;
    }

    public void myPet(){
      pet.say();
    }


}
