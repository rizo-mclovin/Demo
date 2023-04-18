package ru.connor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Tom", 32);
//        person.setName("Stephany");
//        System.out.println(person.say_hello(person.getName(), person.getAge()));
//        System.out.println(person.calculateBirthYear(person.getAge()));

        System.out.println(person);

        Person person1 = new Person("Alex", 43);
//        person1.setAge(24);
//        System.out.println(person1.say_hello(person1.getName(), person1.getAge()));
//        System.out.println(person1.calculateBirthYear(person1.getAge()));
        System.out.println(person1);
    }
}
