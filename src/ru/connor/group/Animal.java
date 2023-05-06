package ru.connor.group;

public class Animal implements Info{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public Animal(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String info() {
        return "I am animal, my ID is " + id;
    }
}
