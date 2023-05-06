package ru.connor.firdavs;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animals);
        test(dog);
        test(cat);
    }
    public static void test(Animals animals){
        animals.eat();
    }
}
