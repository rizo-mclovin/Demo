package ru.connor.firdavs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Generics
        List<String> list = new ArrayList<>();
        list.add("32");
        list.add("true");
        list.add("Hello");

        String str = list.get(2);
        System.out.println(str);


        // Wildcards (Generics)

        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals(1));
        animalsList.add(new Animals(2));

        test(animalsList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

        test(dogList);

    }

    public static void test(List<? extends Animals> list){
        for (Animals animals : list) {
            animals.eat();
        }
        // list.forEach(System.out::println);

    }
}

















