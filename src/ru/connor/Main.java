package ru.connor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int, boolean, float, double, long - примитивные типы
        // String, Integer, Boolean, Float, Double - ссылочные типы

        // <название типа данных> <название переменной> = <значение>;
//        String string = "Hello";
//        int number1 = 43;
//        int number2 = 51;
//        String str2 = "Hello";
//        boolean b = 43 > 51;
//        boolean b2 = false;
//
//        System.out.println(b);

        // Целочисленный тип данных:
//        Integer a = new Integer(34);
//        int b = 34;

//        Создание вещественных чисел:
//        float num = 324.34f;
//        double num2 = 324.34;
//        System.out.println(num);


        // + - * / %


        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//
//        System.out.println(number1 + number2);
//        System.out.println(number1 - number2);
//        System.out.println(number1 * number2);
//        System.out.println(number1 / number2);
//        System.out.println(number1 % number2);

        String name = scanner.next();
        System.out.println("Hello, " + name);



    }
}
