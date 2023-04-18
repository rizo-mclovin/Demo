package ru.connor;

import java.time.Year;

public class Person {
    // поля - данные
    // методы - действия
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Модификаторы доступа - public, private, protected, default
    public String say_hello(String name, int age){
        return "Hello! My name is:" +name+". Age:" + age;
    }

    public int calculateBirthYear(int age){
        System.out.println();
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        return currentYear - age;
    }


    // Getter - передавать

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // Setter - принимать


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Name: " + this.name + ". Age: " + age;
    }


}
