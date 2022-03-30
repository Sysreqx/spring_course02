package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
@Scope("singleton")
public class Cat implements Pet{

    @Override
    public void sayPet() {
        System.out.println("Meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Cat bean: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat bean: destroy method");
    }
}
