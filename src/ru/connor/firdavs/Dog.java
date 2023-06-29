package ru.connor.firdavs;

public class Dog extends Animals{
    private int id;

    public Dog(int id) {
        this.id = id;
    }

    public Dog(){};

    @Override
    public String eat() {
        return "The dog cat eat";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                '}';
    }
}

