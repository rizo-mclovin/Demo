package ru.connor.firdavs;

public class Animals {
    private int id;

    public Animals(int id) {
        this.id = id;
    }

    public Animals() {}

    public String eat(){
        return "Animals can eat";
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                '}';
    }
}
