package ru.connor.sergey;

import java.time.Year;

public class Person {
    String name;
    int birthYear;

    public void personInfo() {
        System.out.printf("My name is %s. Age: %d", name, birthYear);
        System.out.println();
    }



    public int calculateAgeYear() {
        int currentYear = Integer.parseInt(Year.now().toString());
        return currentYear - birthYear;
    }
}

