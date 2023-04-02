package ru.connor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTheFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+separator+"dora"+separator+"Desktop"+separator+"file.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] stringNumbers = line.split(" ");
        int[] numbers = new int[3];
        int count = 0;
        for (String number: stringNumbers
        ) {
            numbers[count++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
