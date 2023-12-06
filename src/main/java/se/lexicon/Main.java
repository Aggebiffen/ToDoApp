package se.lexicon;

public class Main {
    public static void main(String[] args) {
    Person august = new Person(1,"august", "brusbäck","hej123@gmail.com");
        System.out.println(august.getPersonInfo());
        Person daniel = new Person(2,"Daniel", "Carlsson","hej1234@gmail.com");
        System.out.println(daniel.getPersonInfo());
    }
}