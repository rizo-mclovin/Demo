package ru.connor;

public class Animals {
    private int id;

    public Animals(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Animals() {}

    public void sleep(){
        System.out.println("I can to sleep");
    }
}

interface TestSomeMethod{
    void sayHello();
}

class Test{
    public static void main(String[] args) {
        TestSomeMethod testSomeMethod = new TestSomeMethod() {
            @Override
            public void sayHello() {
                System.out.println("Hello, world!");
            }
        };
        testSomeMethod.sayHello();
    }
}