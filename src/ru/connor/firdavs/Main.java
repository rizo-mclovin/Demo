package ru.connor.firdavs;
import java.util.*;


class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Alex");
        Person person2 = new Person(1, "Alex");
        Person emptyPerson = new Person();

        person1.equals(emptyPerson);
        Map<Person, String> map = new HashMap<>();
        map.put(person1, "Alex");
        map.put(person2, "Bob");

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);


    }
}



class Person extends Object{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}