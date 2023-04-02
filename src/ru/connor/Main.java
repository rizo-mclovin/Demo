package ru.connor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+separator+"dora"+separator+"Desktop"+separator+"file.txt";
        File file = new File(path);

        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello");
        pw.println("world!");
        pw.close();
    }
}
