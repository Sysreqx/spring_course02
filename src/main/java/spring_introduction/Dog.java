package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean: constructor without parameters");
    }

    @Override
    public void sayPet() {
        System.out.println("Woof");
    }
}
