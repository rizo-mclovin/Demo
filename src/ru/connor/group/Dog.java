package ru.connor.group;

public class Dog extends Animals {
    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }

    public void bark(){
        System.out.println("Dog is barking..");
    }
}
