package ru.connor.sergey;

//@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 2020);
        person.personInfo();

//        person.setName("Alex");
////      person.birthYear = 2020;
//        person.setBirthYear(2020);
//        person.sayHello("John");
        System.out.println(person.calculateAgeYear(person.getBirthYear()));
        System.out.println(person.getName());
        System.out.println(person.getBirthYear());
    }
}
