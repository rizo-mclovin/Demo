package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();  // никакого порядка
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(); // порядок по добавления
        Map<Integer,String> treeMap = new TreeMap<>();  //

        test(hashMap);
        System.out.println("########################");
        test(linkedHashMap);
        System.out.println("########################");
        test(treeMap);

        // aa < ab

//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//
//        map.put(3, "hello");
//
//        String a = "hello";
//
//
//        for (Map.Entry<Integer, String> entry: map.entrySet()) {
//            System.out.printf("%d : %s", entry.getKey(), entry.getValue());
//            System.out.println();
//        }
    }

    public static void test(Map<Integer, String> map){
        map.put(8, "eight");
        map.put(1,"one");
        map.put(3, "three");
        map.put(6, "three");
        map.put(5, "two");
        map.put(4,"one");
        map.put(2, "two");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(7, "three");


        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.printf("%d : %s", entry.getKey(), entry.getValue());
            System.out.println();
        }

    }


}
