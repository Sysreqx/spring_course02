package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.sayHello();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();

    }
}
