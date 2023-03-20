package ru.connor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // <тип массива>[] <название массива> = new <тип массива>[<кол-во значений>]
        // <тип массива> <название массива>[] = new <тип массива>[<кол-во значений>]


//        int[] numbers = new int[4];
//        numbers[2] = 43;
//        numbers[0] = 3;
//        numbers[5] = 32;



//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
        int[] numbers = {3, 4, 1, 53, 1};
        numbers[2] = 32;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // for (<создаем переменную i>; <условие, до каких пор будет выполняться программа>; <операция>){
        //      <инструкция>
        //}
//
//        int number = scanner.nextInt();
//
//
//
//        for (int i=0; i < 10; i++) {
//            if ((i % 2 == 0)){
//                continue;
//            }
//            System.out.println("Hello world. " + i);
//        }
//        if (number == 12 || number == 1 || number == 2){
//            System.out.println("A");
//        } else if (number == 3 || number == 4 || number == 5) {
//            System.out.println("B");
//        }
//        else if (number == 6 || number == 7 || number == 8) {
//            System.out.println("C");
//
//        } else if (number == 9 || number == 10 || number == 11) {
//            System.out.println("D");
//
//        } else {
//            System.out.println("ERROR");
//        }
//         switch(number){
//            case 12, 1, 2:
//                System.out.println("A");
//                break;
//            case 3, 4 ,5:
//                 System.out.println("B");
//                 break;
//            case 6, 7, 8:
//                 System.out.println("C");
//                 break;
//            case 9, 10, 11:
//                 System.out.println("D");
//                 break;
//             default:
//                 System.out.println("ERROR");
//         }
//
//        while (true){
//            number ++;
//            if (number >= 10){
//                break;
//            }
//            System.out.println(number);
//        }

    }
}


