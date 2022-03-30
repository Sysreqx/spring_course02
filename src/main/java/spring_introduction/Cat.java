package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    @Override
    public void sayPet() {
        System.out.println("Meow");
    }

    public void init() {
        System.out.println("Cat bean: init method");
    }

    public void destroy() {
        System.out.println("Cat bean: destroy method");
    }
}
