package ru.connor;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){

            int peopleCount = ois.readInt();
            Person[] people = new Person[peopleCount];

            for (int i = 0; i < peopleCount; i++) {
                people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
