package ru.connor;

public class Animals {
    private int id;

    public Animals(int id) {
        this.id = id;
    }

    public Animals(){}

    public void sleep(){
        System.out.println("I'm sleeping!");
    }

    @Override
    public String toString() {
        return "I am Animal. My id is: " + id;
    }
}
