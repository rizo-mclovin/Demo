package ru.connor.firdavs;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
//        String path = separator + "Users" + separator + "john" +separator+ "Desktop" +separator+ "file.java";
        String path = "file.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }
}

















