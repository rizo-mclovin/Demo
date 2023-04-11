package ru.connor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 32;
        person.say_hello();
        person.calculateBirthYear();

        System.out.println();

        Person person1 = new Person();
        person1.name = "Alex";
        person.age = 43;
        person1.say_hello();
        person1.calculateBirthYear();
    }
}
