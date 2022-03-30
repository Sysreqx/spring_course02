package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithJava {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Person person = context.getBean("personBean", Person.class);

        person.sayHello();
        System.out.println(person.getName());
    }
}
