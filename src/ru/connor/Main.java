package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        treeSet.add("Tom");
        treeSet.add("Alex");
        treeSet.add("John");
        treeSet.add("Bob");
        treeSet.add("Tim");

        for(String name : treeSet){
            System.out.println(name);
        }
        System.out.println(treeSet.contains("Tim"));





    }

}


class Person{
    private int age;


    public Person(int age) {
        this.age = age;
    }
}