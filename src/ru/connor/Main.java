package ru.connor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //
        int[] numbers = {1, 3, 5, 6, 7};
        numbers[0] = 12;
        numbers[2] = 44;

        for (int number : numbers) {
            System.out.println(number);
        }

        //

        int[][] numbers2 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                System.out.printf("%d ", numbers2[i][j]);
            }
            System.out.println();
        }
    }
}
