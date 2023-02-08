package ru.connor;


import java.util.Scanner;

/**
 * @author John
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();

        if (numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2){
            System.out.println("Зима");
        } else if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) {
            System.out.println("Весна");
        } else if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8) {
            System.out.println("Лето");
        }else if (numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11){
            System.out.println("Осень");
        }else {
            System.out.println("Error");
        }

        switch (numberOfMonth){
            case  12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Лето");
                break;
            case 6, 7, 8:
                System.out.println("Весна");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Error");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

        while (true){
            if (numberOfMonth == 0){
                break;
            }
            numberOfMonth ++;
            System.out.println(numberOfMonth);
        }
    }

}
