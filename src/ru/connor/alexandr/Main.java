package ru.connor.alexandr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);


        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    public static void addElements(Collection collection){
        collection.add(new Person(1, "Katy"));
        collection.add(new Person(3, "George"));
        collection.add(new Person(4, "To"));
        collection.add(new Person(2, "Bob"));
    }

}
//
//class MyMethodToSortList implements Comparator<String>{
//
//
//    /*
//       o1 < 02 -> 1
//       o1 > 02 -> -1
//       o1 == o2 -> 0
//     */
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1.length() > o2.length()){
//            return 1;
//        } else if (o1.length() < o2.length()) {
//            return -1;
//        }else return 0;
//    }
//}
//
//

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
