package ru.connor;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 29;

        System.out.printf("Name: %s. Age: %d", person.name, person.age);
    }
}