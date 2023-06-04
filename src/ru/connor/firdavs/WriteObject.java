package ru.connor.firdavs;

import java.io.*;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {
                new Person(1, "Mike"),
                new Person(2, "Jordan"),
                new Person(3, "Bob")
        };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("File not found ☹️!");
        }
    }
}
