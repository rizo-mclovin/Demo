package ru.connor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Tom"),
                new Person(2, "Alex"), new Person(3, "John")};


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){


            int peopleCount = people.length;
            oos.writeInt(peopleCount);

            for (Person person : people
            ) {
                oos.writeObject(person);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
