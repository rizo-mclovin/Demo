package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

//        queue.add(new Person(4));
//        queue.add(new Person(3));
//        queue.add(new Person(1));
//        queue.add(new Person(2));

        System.out.println(queue.element());
        for (Person person: queue
             ) {
            System.out.println(person);
        }

    }

}

class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
