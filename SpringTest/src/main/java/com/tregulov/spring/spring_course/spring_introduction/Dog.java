package com.tregulov.spring.spring_course.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow-wow");
    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Dog: init method");
//    }
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
}
