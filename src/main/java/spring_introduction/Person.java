package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private String name;

    private int age;

    private Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean: constructor with Pet pet parameter");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Person bean: setter");
        this.pet = pet;
    }

    public void sayHello() {
        System.out.println("Hello my pet");
        pet.sayPet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Person class: setName method");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person class: setAge method");
        this.age = age;
    }

}
