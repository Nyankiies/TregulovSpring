package com.tregulov.spring.spring_course.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("PersonBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String Surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        System.out.println("Calss Person: setSurname");
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Calss Person: setAge");
        this.age = age;
    }

    public Person() {
    }
//    @Autowired
    public Person(Pet pet) {
        System.out.println("construktor Person");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
