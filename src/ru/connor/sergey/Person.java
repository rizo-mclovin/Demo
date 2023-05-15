package ru.connor.sergey;


public class Person {
    private int id;
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }



    public Person(){}

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void sayHello(String name){
        System.out.println("Hello, " + name);
    }

    public void personInfo() {
        System.out.printf("My name is %s. Age: %d", name, birthYear);
        System.out.println();
    }

    public int calculateAgeYear(int birthYear) {
        int currentYear = 2023;
        return currentYear - this.birthYear;
    }



}

