package ru.connor.firdavs;

public class Dog extends Animals{
    public void bark(){
        System.out.println("Dog is bark..");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
