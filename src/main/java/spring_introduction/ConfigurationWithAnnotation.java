package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationWithAnnotation {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Cat cat = context.getBean("cat", Cat.class);
//        cat.sayPet();

        Person person = context.getBean("personBean", Person.class);
        person.sayHello();

        context.close();
    }
}
