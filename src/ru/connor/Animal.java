package ru.connor;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    private String translation;

    Animal(){}
    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
