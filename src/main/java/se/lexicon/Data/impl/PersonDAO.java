package se.lexicon.Data.impl;

import se.lexicon.model.Person;

import java.util.Collection;

public interface PersonDAO {

    Person create(Person person);
    Collection<Person> findAll();
    Person findById(int id);
    Collection<Person> findByName(String name);

    void remove(int id);

    Person update(Person person);
    boolean deleteById(int id);
}
