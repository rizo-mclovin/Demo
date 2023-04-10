package ru.connor;

import java.util.Scanner;

/**
 * <h2>Одномерные массивы</h2>
 */
public class Arrays1 {
    public static void main(String[] args) {

        //  1
//        int[] numbers = new int[5]; // 0 0 0 0 0
        //  2
//        int numbers[] = new int[5];
        //  3
//        int[] numbers;
//        numbers = new int[4];
        // 4
//        int[] numbers = new int[]{12, 3, 4, 54};
        // 5
        int[] numbers = {12, 43, 21};

//        for (int number: numbers) {
//            System.out.println(number);
//        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/**
 * <h2>Многомерные массивы</h2>
 */
class Arrays2{
    public static void main(String[] args) {
//        int[][] numbers = new int[3][4];
        int[][] numbers = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }


    }
}