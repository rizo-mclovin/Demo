package ru.connor;

public class Main {
    public static void main(String[] args) {
        Country country = Country.USA;


        switch (country){
            case RUSSIA:
                System.out.println("It's Russia");
                break;
            case USA:
                System.out.println("It's USA");
                break;
            case CHINA:
                System.out.println("It's China");
                break;
            default:
                System.out.println("It's not a biggest country");

        }
    }
}
