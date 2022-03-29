package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void sayHello() {
        System.out.println("Hello my pet");
        pet.sayPet();
    }
}
