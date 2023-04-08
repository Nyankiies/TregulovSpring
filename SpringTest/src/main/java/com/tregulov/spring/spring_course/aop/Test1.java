package com.tregulov.spring.spring_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        context.close();
    }
}
