package ru.connor;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ROOT);

        double x = in.nextDouble();
        System.out.println(x>=3 && x<=8);

    }
}
