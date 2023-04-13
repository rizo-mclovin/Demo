package ru.connor;

/**
 * <h2>Одномерные массивы</h2>
 */

public class Arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[5]; // 0 0 0 0 0
//        int numbers2[] = new int[5];
//        numbers[2] = 93;
//        numbers[0] = 12;

        int[] numbers3 = {1, 2, 3, 4, 5};
//        int[] numbers4 = new int[]{32, 45, 62, 64};
//
//        for (int number : numbers3){
//            System.out.println(number);
//        }

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }
    }
}


/**
 * <h2>Многомерные массивы</h2>
 */
class Arrays2{
    public static void main(String[] args) {
//        int[][] numbers = new int[3][4];
        /*
                0 0 0 0
                0 0 0 0
                0 0 0 0
         */

        int[][] numbers = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11}};

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.printf("%s, ", numbers[i][j]);
//            }
//            System.out.println();
//        }

        String name = "John";
        int age = 23;
        System.out.printf("Hello, my name is %s. Age: %d", name, age);

    }
}

