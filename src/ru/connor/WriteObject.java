package ru.connor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
        new Person(2, "Tim")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);


            oos.writeInt(people.length);
            for (Person person: people
                 ) {
                oos.writeObject(person);

            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
