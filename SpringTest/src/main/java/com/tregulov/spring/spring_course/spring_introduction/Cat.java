package com.tregulov.spring.spring_course.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("myCat")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
