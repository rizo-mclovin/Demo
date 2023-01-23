package ru.connor;
import java.util.*;
/**
 * @author John
 */

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // sout,


        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Welcome!");
        } else if (age < 18) {
            System.out.println("Вам еще рано!");
        } else {
            System.out.println("ERROR");
        }

//        int i = 0;
//        while(true){
//            i++;
//
//            if (i == 10){
//                break;
//            }System.out.println(i);
//
//        }

//        for (int i = 0; i < 10; i++) {
//            if (!(i % 2 == 0)){
//                continue;
//            }
//            System.out.println("Нечетные числа: " +i);
//        }

    }
}

