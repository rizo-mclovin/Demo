package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        Set<Person> personSet = new HashSet<>();

        addElement(people);
        addElement(personSet);

        Collections.sort(people);
//        Collections.sort(personSet);


        System.out.println(people);
        System.out.println(personSet);


    }

    public static void addElement(Collection collection){
        collection.add(new Person(2, "Alex"));
        collection.add(new Person(1, "JoTomasdfahn"));
        collection.add(new Person(4, "Katy"));
        collection.add(new Person(3, ""));

    }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {}


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

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()){
            return 1;
        }else if (this.name.length() < o.getName().length()){
            return -1;
        }else return 0;
    }

    /* Контракт hashcode() equals():
        1) hashcode() -> разные результаты - и объекты разные.
        2) если одинаковые хэши -> equals()
        3) equals - точный ответ.
     */

}







