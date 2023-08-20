package ru.connor;

import java.util.*;

public class ListsLesson{
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);

        // arraylist - [1][2][3][23][3]
        // [23][1][2][3][4]

//        arrayList.clear();

//        arrayList.add(3, 23);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        test(arrayList);
        test(linkedList);
    }


    // arraylist [5][4][3][2][1][6][4]
    // linkedlist head-> [5]->[1] -> [2] -> [3] -> [4] ->

    public static void test(List<Integer> list){

        long start = System.currentTimeMillis();

//        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
//        }



        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();


        System.out.println(end - start);

    }


}
