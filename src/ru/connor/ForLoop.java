package ru.connor;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for (int i=0; i < 10;i++){
            <инструкция>
        }
         */
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }


//        if (5 < 10){
//            System.out.println("Hello!");
//        }else {
//            System.out.println("Bye!");
//        }
//
//        for (int i = 0; i <21; i++) {
//            if (i % 2 == 0){
//                System.out.println("Четные числа: " + i);
//            }
//        }


        /*
        if(<условие 1>){
            <инструкция1>
        }else if(условие 2){
            <инструкция2>
        }...
        else{
            <инструкция3>
        }
         */

        Scanner scanner = new Scanner(System.in);
//        int monthNumber = scanner.nextInt();

//        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
//            System.out.println("WINTER");
//        }else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
//            System.out.println("SPRING");
//        }else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
//            System.out.println("SUMMER");
//        }else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
//            System.out.println("FALL");
//        }else{
//            System.out.println("ERROR");
//        }

        // switch case
//
//        switch (monthNumber) {
//            case 12, 1, 2:
//                System.out.println("WINTER");
//                break;
//            case 3, 4, 5:
//                System.out.println("SPRING");
//                break;
//            case 6, 7, 8:
//                System.out.println("SUMMER");
//                break;
//            case 9, 10, 11:
//                System.out.println("FALL");
//                break;
//            default:
//                System.out.println("ERROR");
//        }

//        int counter = scanner.nextInt();
//        while (true){
//            counter++;
//            System.out.println(counter);
//            if (counter == 10){
//                break;
//            }
//
//        }

        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }

    }
}
