package ru.connor;

import java.sql.Date;
import java.time.Instant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
        // while(<условие>){
        //     <инструкция1>
        // }


        int i = 0;

//        while (i < 10){
//
//            i = i + 1;
//            System.out.println(i);
//
//        }

        do {
            i = i + 1;
            System.out.println(i);

        }while (i < 10);


        System.out.println(Date.from(Instant.now()));
    }
}
