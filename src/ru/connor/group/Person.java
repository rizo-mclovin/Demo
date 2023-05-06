package ru.connor.group;

public class Person implements Info{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String info() {
        return "My name is " + name;
    }
}
