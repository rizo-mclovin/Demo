package ru.connor.group;


import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
//        Animals animals = new Animals();
//        Animals dog = new Dog();
//        Animals cat = new Cat();

//        test(animals);
//        test(dog);
//        test(cat);

//        // Восходящее преобразование Upcasting
//        Dog dog = new Dog();
//        Animals animals = dog;
//
//        // нисходящее преобразование Downcasting
//        Dog dog1 = (Dog) animals;
//        dog1.bark();
//
//        Animals animals1 = new Animals();
//        Dog dog2 = (Dog) animals1;
        List<String> list = new ArrayList<>();
        list.add("32");
        list.add("true");
        list.add("HElO");


        for (String str: list
             ) {
            System.out.println(str);
        }

        String str = list.get(2);

        System.out.println(str);
    }
    public static void test(Animals animals){
        animals.eat();
    }
}
