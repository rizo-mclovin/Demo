package ru.connor.alexandr;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5); // first in - first out
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);

//        System.out.println(queue.element());

        Stack<Integer> stack = new Stack<>(); // first in - last out
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);


        stack.pop();

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }

    // backend - frontend

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
