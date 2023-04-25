package ru.connor;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals(1);
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.myAge();
        animals.sleep();
        cat.sleep();
        dog.sleep();

        System.out.println(animals);
    }
}
