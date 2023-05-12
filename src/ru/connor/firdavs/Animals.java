package ru.connor.firdavs;

public class Animals {
    public int id;

    public Animals(int id) {
        this.id = id;
    }

    public Animals() {}

    public void eat(){
        System.out.println("Animal is eating..");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                '}';
    }
}
