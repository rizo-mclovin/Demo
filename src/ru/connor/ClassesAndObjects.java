package ru.connor;

import java.time.Year;

public class ClassesAndObjects{

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.birthYear = 2006;

        person.sayHello();

        Person person2 = new Person();
        person2.name = "Alice";
        person2.birthYear = 2003;

        person2.sayHello();


    }
}

class Person {
    /**
     * 1. Поля (Данные)
     * 2. Методы (Действия)
     */

    // public, protected, private, default
    public String name;
    public int birthYear;

    // <модификатор доступа> void <название метода>(){
    //      <Действия>
    // }

    public void sayHello(){
        System.out.println("My name is " + name + ". Me " + calculateAge() + " y.o.");
    }

    // <модификатор доступа> <тип> <название метода>(){
    //      <Действия>
    //      return <результат>
    // }

//    public void calculateAge(){
//        int age = 2023 - birthYear;
//        System.out.println(age);
//    }

    public int calculateAge(){
        int age = Integer.parseInt(Year.now().toString()) - birthYear;
        return age;
    }
}