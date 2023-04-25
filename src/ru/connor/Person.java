package ru.connor;

import java.time.Year;

public class Person {
    // поля - данные
    // методы - действия
    public String name;
    public int age;

    /*
    void <название метода>(){
        <тело подпрограммы - действие>
    }
     */


    // style - camelcase
    public void personInfo() {
        System.out.printf("My name is %s. Age: %d", name, age);
        System.out.println();
    }

    public void calculateBirthYear() {
        int currentYear = Integer.parseInt(Year.now().toString());
        int birthYear = currentYear - age;
        System.out.println(birthYear);
    }

}
