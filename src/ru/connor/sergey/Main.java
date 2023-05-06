package ru.connor.sergey;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.birthYear = 2000;
        person.calculateAgeYear();
        System.out.println(person.calculateAgeYear());

        System.out.println(person.calculateAgeYear() + 7);
    }
}
