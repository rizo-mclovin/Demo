package ru.connor;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        person.setAge(23);
        System.out.println(person.personInfo(person.getName(), person.getAge()));
        System.out.println(person.calculateBirthYear(person.getAge()));

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){}

    public String personInfo(String name, int birthYear){
        return "My name is " + name + ". Age: " + birthYear;
    }


    public int calculateBirthYear(int age){
        int currentYear = Integer.parseInt(Year.now().toString());

        return currentYear - age;
    }


}
