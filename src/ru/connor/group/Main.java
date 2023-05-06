package ru.connor.group;


public class Main {
    public static void main(String[] args) {
        Info info1 = new Animal();
        Info info2 = new Person();

        System.out.println(info1.info());
        System.out.println(info2.info());
    }

    public static void test(Info info){
        System.out.println(info.info());
    }
}
