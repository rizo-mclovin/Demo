package ru.connor;

import java.io.Serializable;

public class Person implements Serializable {

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
