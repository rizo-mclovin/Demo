package ru.connor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Animals> animalsList = new ArrayList<>();
//        animalsList.add(new Animals(1));
//        animalsList.add(new Animals(2));
//        animalsList.add(new Animals(3));
//        test(animalsList);
//
//        List<Dog> dogList = new ArrayList<>();
//        dogList.add(new Dog());
//        dogList.add(new Dog());
//        test(dogList);


        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        try{


            System.out.println(10/num);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        try {
////            int a = scanner.nextInt();
////            System.out.println(10/a);
//
//            int[] numbers = new int[2];
//            numbers[5] = 32;
//            for (int i : numbers){
//                System.out.println(i);
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    public static void test(List<? extends Animals> list) {
        for (Animals animals : list
        ) {
            animals.sleep();
        }
    }
}
