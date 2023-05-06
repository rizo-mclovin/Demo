package ru.connor.sergey;

import java.util.Scanner;


public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double x=0, x1=0, x2=0;
        double D = (b*b) - (4 * a * c);

        if (D  < 0){
            System.out.println("Нет корней");
        }else if(D == 0){
            x = -b/(2*a);
            System.out.println(x);
        }else {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.printf("x1= %S, x2=%S", x1, x2);
        }
    }
}


class FindX{

}