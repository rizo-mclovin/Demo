package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args){
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person = new Person(1, "Tom");
        Person person2 = new Person(1, "Tom");

        map.put(person, "one");
        map.put(person2, "two");

        set.add(person);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);

        person.equals(person2);
        System.out.println(Integer.MAX_VALUE);

    }
}


class Person{
    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {}



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
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    /* Контракт hashcode() equals():
        1) hashcode() -> разные результаты - и объекты разные.
        2) если одинаковые хэши -> equals()
        3) equals - точный ответ.
     */

}







