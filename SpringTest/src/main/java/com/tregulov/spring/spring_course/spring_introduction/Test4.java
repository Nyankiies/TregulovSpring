package com.tregulov.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yorDog = context.getBean("myPet", Dog.class);
        Cat myCat = context.getBean("myCat", Cat.class);
        Cat yorCat = context.getBean("myCat", Cat.class);
        System.out.println(myDog);
        System.out.println(yorDog);
        System.out.println(myDog==yorDog);
        System.out.println(myCat);
        System.out.println(yorCat);
        System.out.println(myCat==yorCat);
    }
}
