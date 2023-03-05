package com.example.spring_core.x_items_and_objects.annotaion;

//@Component("HumanAnnotation")
public class HumanAnnotation {

    private Pet pet;

 //   @Autowired
    public HumanAnnotation(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
