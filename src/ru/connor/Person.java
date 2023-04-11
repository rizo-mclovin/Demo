package ru.connor;

import java.time.Year;

public class Person {
    // поля - данные
    // методы - действия
    String name="John";
    int age = 20;

    // Модификаторы доступа - public, private, protected, default
    public void say_hello(){
        System.out.printf("Hello! My name is: %s. Age: %d", name, age);
    }

    public void calculateBirthYear(){
        System.out.println();
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        System.out.println(currentYear - age);
    }
}
