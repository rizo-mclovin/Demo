package ru.connor.alexandr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.add(""));
        System.out.println(queue.add(""));

    }


class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()){
            return 1;
        }else if (this.name.length() < o.getName().length()){
            return -1;
        }else return 0;
    }

    /* Контракт hashcode() equals()
        1) У двух проверяемых объектов вызываем метод hashCode()
            если у объектов хэши разные -> false
        2) если hashcode -> true
        вызываем метод equals() -> выдает точный ответ
     */

}
}
