package ru.connor;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.age = 23;

        person.personInfo();
        person.calculateBirthYear();


    }
}


