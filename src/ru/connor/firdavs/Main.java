package ru.connor.firdavs;

import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(2);
        numbers.add(1);
        numbers.add(0, 5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);

    }
}


//@SuppressWarnings("all")
//public class Main {
//    public static void main(String[] args) {
////        Dog dog = new Dog(1);
//
//        List<Animals> animals = new ArrayList<>();
//        animals.add(new Animals(1));
//        animals.add(new Animals(2));
//
//       List<Dog> dogList = new ArrayList<>();
//       dogList.add(new Dog(1));
//       dogList.add(new Dog(2));
//
//       List<String> str = new ArrayList<>();
//
//       test(animals);
//       test(dogList);
//
//    }
//
//    public static void test(List<? extends Animals> list){
//        for (Animals animals : list) {
//            System.out.println(animals);
//        }
//    }
//}
////  list1 - 1, 2, 3, 4, 5
//// list2 - 3, 4, 5, 6, 7, 8
////  list1.removeAll(list2) -> 1, 2
