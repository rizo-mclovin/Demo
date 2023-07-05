package ru.connor.firdavs;
import java.util.*;


class Main{
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке пары(ключ, значения) были добавлены
        Map<Integer, String> treeMap = new TreeMap<>(); // пары сортируются по ключу (естественный порядок)

        test(hashMap);

        System.out.println();
        System.out.println();
        System.out.println();

        test(linkedHashMap);

        System.out.println();
        System.out.println();
        System.out.println();

        test(treeMap);
    }

    public static void test(Map<Integer, String> elements){
        elements.put(56, "One");
        elements.put(0, "Two");
        elements.put(32, "kjwer");
        elements.put(-21, "ffasf");
        elements.put(4, "kljadsf");

        for (Map.Entry<Integer, String> map : elements.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }
}

