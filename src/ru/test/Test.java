package ru.test;

import ru.connor.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 34;
        person.personInfo();
        person.calculateBirthYear();
    }
}
