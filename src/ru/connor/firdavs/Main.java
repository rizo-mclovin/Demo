package ru.connor.firdavs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Main{
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); // Динамический массив
        List<Integer> linkedList = new LinkedList<>(); // Связанный список

        measureTime(arrayList);
        measureTime(linkedList);
    }

    private static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        // 0 1 2 3 4 5 - indexes
        // 8 7 6 5 4 3

        // linkedlist - head -> [5]-> [1]-> [2]->[3]->[4]

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

