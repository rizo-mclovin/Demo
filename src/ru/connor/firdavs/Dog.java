package ru.connor.firdavs;

public class Dog extends Animals{

    public void bark(){
        System.out.println("Dog is barking..");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");;
    }
}
