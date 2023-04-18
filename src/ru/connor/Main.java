package ru.connor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.age = 24;

        System.out.println("My name is " + person.name +  ". Age: " + person.age);

        Person person1 = new Person();
        person1.name = "Will";
        person1.age = 53;
        System.out.println("My name is " + person1.name +  ". Age: " + person1.age);
    }
}


class Person{
    // поля - данные
    // методы - действия
    String name;
    int age;
}


