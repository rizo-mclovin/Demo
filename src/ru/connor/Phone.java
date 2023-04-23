package ru.connor;

import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone phone = new Phone(1231231, "iPhone 13");
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void receiveCall(String receiverName){
        System.out.println("Звонит " + receiverName);
    }

    public void sendMessage(List<Integer> phoneNumbers){
        for (int number : phoneNumbers
                ) {
            System.out.println(number);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Phone phone1 = new Phone(894382348, "iPhone XS");
        System.out.println(phone1);
        phone1.receiveCall("Tom");

        Phone phone2 = new Phone(89585141, "Xiaomi Redmi 10T", 190);
        System.out.println(phone2);
        phone2.receiveCall("Alex");


        Phone phone3 = new Phone(895032839,"iPhone 14 Pro", 206);
        System.out.println(phone3);
        phone3.receiveCall("Bob");
    }
}
