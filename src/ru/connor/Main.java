package ru.connor;


import java.util.*;

/**
 * <h1>Map</h1>
 */
public class Main {
    public static void main(String[] args){
        Stack<String> str = new Stack<>();

        str.push("blin1");
        str.push("blin2");
        str.push("blin3");
        str.push("blin4");

//        System.out.println(str.pop());
//        System.out.println(str.pop());
//        System.out.println(str.pop());
//        System.out.println(str.pop());
//        System.out.println(str.pop());

        while (!str.isEmpty()){
            System.out.println(str.pop());
        }

        test();

    }


    public static void test(){
        System.out.println("Hello");
    }
}


