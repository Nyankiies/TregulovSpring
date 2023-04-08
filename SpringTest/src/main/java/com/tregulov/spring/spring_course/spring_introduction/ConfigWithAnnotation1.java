package com.tregulov.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("myCat", Cat.class);
        myCat.say();
        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        context.close();
    }
}
