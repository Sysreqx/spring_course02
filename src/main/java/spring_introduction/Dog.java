package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean: constructor without parameters");
    }

    @Override
    public void sayPet() {
        System.out.println("Woof");
    }
}
