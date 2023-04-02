package ru.connor;

public class Dog extends Animals {
    public void bark(){
        System.out.println("I`m barking");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
