package ru.connor.firdavs;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Jordan");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);


            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("File not found ☹️!");
        }
    }
}
