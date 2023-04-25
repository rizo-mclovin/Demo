package ru.connor;

@SuppressWarnings("all")
public class Dog extends Animals{
    int a;

    public void bark(){
        System.out.println("I can to bark..");
    }

    @Deprecated
    public void myAge(){
        System.out.println("My age is " + 3);
    }

    @Override
    public void sleep() {
        System.out.println("I wanna sleep..");
    }
}
