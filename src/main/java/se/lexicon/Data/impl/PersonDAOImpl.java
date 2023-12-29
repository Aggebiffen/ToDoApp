package se.lexicon.Data.impl;

import se.lexicon.model.Person;

import java.util.Collection;


public interface PersonDAOImpl {
    public Person persist(Person person);
    public Person findById(int id);
    public Person findByEmail(String email);
    public Collection<Person> findAll();
    public void remove(int id);
}
