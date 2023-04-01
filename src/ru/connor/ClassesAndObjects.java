package ru.connor;

import java.time.Year;



public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.sayHello());
        System.out.println(person.calculateAge(1983));
        System.out.println(person);

    }

    public void sayHello(){
        System.out.println("HEllo");
    }
}

class Person{
    /**
     * 1. Поля (Данные)
     * 2. Методы (Действия)
     */
    String name;
    int birthYear;

   // <модификатор доступа> <Название класса>(<тип> <название переменной>, int age){
    //    this.name = name;
    // }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // <модификатор доступа> <тип возврощаемого значения> <Название метода>(<тип> <название переменной>, int age){
    //        <действие>
    //        return <результат>;
    // }

    public String sayHello(){
        return "Hello " + name;
    }

    public int calculateAge(int birthYear){
        int age = Integer.parseInt(Year.now().toString()) - birthYear;
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}