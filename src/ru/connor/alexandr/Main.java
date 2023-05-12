package ru.connor.alexandr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        test(treeMap);
    }

    public static void test(Map<Integer, String> map){
        map.put(5, "Tom");
        map.put(1, "Bob");
        map.put(4, "Alex");
        map.put(3, "Mike");
        map.put(2, "John");

        for (Map.Entry<Integer, String> entry: map.entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
