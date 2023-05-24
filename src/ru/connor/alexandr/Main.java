package ru.connor.alexandr;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        test(treeMap);


        Map<Person, String> map = new HashMap<>();
        map.put(new Person(1, "Tom"), "123");
        map.put(new Person(1, "Tom"), "125");
        System.out.println(map);
        map.forEach((person, s) -> {
            System.out.println();
        });

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(1, "Tom"));
        personSet.add(new Person(1, "Tom"));
        System.out.println(personSet);

//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(2);
//        System.out.println(numbers);
    }
    public static void test(Map<Integer, String> map){
        map.put(5, "Tom");
        map.put(1, "Bob");
        map.put(4, "Alex");
        map.put(3, "Mike");
        map.put(2, "John");
        map.put(5, "John");

        for (Map.Entry<Integer, String> entry: map.entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


//        Set<Integer> set1 = new HashSet<>();
//        set1.add(0);
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        set1.add(5);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//        set2.add(7);
//        set2.add(8);
//
//        // union - обьединение множества
//        Set<Integer> union = new HashSet<>(set1);
//        union.addAll(set2);
//
//        System.out.println(union);
//
//        // intersection - пересечение
//        Set<Integer> intersection = new HashSet<>(set1);
//        intersection.retainAll(set2);
//
//        System.out.println(intersection);
//
//        // difference - разность
//        Set<Integer> difference = new HashSet<>(set1);
//        difference.removeAll(set2);
//        System.out.println(difference);
//
//
//        Set<Person> personSet = new HashSet<>();
//        personSet.add(new Person(1, "Tom"));
//        personSet.add(new Person(1, "Tom"));
//
//        System.out.println(personSet);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /* Контракт hashcode() equals()
        1) У двух проверяемых объектов вызываем метод hashCode()
            если у объектов хэши разные -> false
        2) если hashcode -> true
        вызываем метод equals() -> выдает точный ответ
     */

}
