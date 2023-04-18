package ru.connor;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;

        for (int i = number; i > 0; i--) {
            result*=i;
        }
        System.out.printf("%d! = %d", number, result);
    }
}
