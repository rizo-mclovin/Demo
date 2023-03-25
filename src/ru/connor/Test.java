package ru.connor;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int res = 0;
//
//        for (int i = 0; i < b; i++) {
//            res  += a;
//        }
//        System.out.println(res);

        // Задача 2
//        int a = scanner.nextInt();
//        int res = 0;
//
//        for (int i = 0; i <= a; i++) {
//            res += i;
//        }
//        System.out.println(res);
        // Задача 3

        int number = scanner.nextInt();
        int b = 0;

//        for (int i = 0; i <= number; i++) {
//            System.out.println(i);
//        }

        while (b < number){
            b++;
            System.out.println(b*2);
        }
    }
}
