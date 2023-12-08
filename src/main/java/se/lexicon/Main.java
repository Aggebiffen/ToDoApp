package se.lexicon;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Person august = new Person(1,"august", "Brusbäck", "hej123@gmail.com");
        System.out.println(august.getSummary());
        Person daniel = new Person(2,"Daniel", "Carlsson","hej1234@gmail.com");
    }
}